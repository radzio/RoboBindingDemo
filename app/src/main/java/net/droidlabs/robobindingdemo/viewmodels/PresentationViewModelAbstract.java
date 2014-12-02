package net.droidlabs.robobindingdemo.viewmodels;

import org.robobinding.presentationmodel.HasPresentationModelChangeSupport;
import org.robobinding.presentationmodel.PresentationModelChangeSupport;

public class PresentationViewModelAbstract implements HasPresentationModelChangeSupport
{
    private PresentationModelChangeSupport presentationModelChangeSupport;

    public PresentationViewModelAbstract()
    {
        this.presentationModelChangeSupport = new PresentationModelChangeSupport(this);
    }

    @Override
    public PresentationModelChangeSupport getPresentationModelChangeSupport()
    {
        return presentationModelChangeSupport;
    }

    public void raisePropertyChanded(String propertyName)
    {
        getPresentationModelChangeSupport().firePropertyChange(propertyName);
    }

}
