package net.droidlabs.robobindingdemo.viewmodels;

import org.robobinding.itempresentationmodel.ItemContext;
import org.robobinding.itempresentationmodel.ItemPresentationModel;

public class StringItemPresentationModel implements ItemPresentationModel<String>
{
    private String value;

    @Override
    public void updateData(String bean, ItemContext itemContext)
    {
        value = bean;
    }

    public String getValue()
    {
        return value;
    }

}