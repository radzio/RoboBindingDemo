package net.droidlabs.robobindingdemo.viewmodels;

import net.droidlabs.robobindingdemo.repositories.InMemoryTextRepository;
import net.droidlabs.robobindingdemo.views.IMainView;
import org.robobinding.annotation.ItemPresentationModel;
import org.robobinding.annotation.PresentationModel;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@PresentationModel
public class MainActivityViewModel extends PresentationViewModelAbstract
{
    private final IMainView mainView;
    private InMemoryTextRepository textRepository;
    private String helloMessage;


    @ItemPresentationModel(value=StringItemPresentationModel.class)
    public List<String> getTexts()
    {
        // probably we don't want to query all items each time ;-)
        return textRepository.getAll();
    }

    public MainActivityViewModel(IMainView mainView, InMemoryTextRepository textRepository)
    {
        this.mainView = mainView;
        this.textRepository = textRepository;
    }

    public String getHelloMessage()
    {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage)
    {
        this.helloMessage = helloMessage;
        this.raisePropertyChanded("helloMessage");
    }

    public void addNextValue()
    {
        this.setHelloMessage("Added new text to the repository");
        this.textRepository.add(new Date().toString());
        this.raisePropertyChanded("texts");
    }

    public void sayHello()
    {
        setHelloMessage("Hello Droidcon!");
    }

    public void showAlert()
    {
        this.mainView.showAlert();
    }
}
