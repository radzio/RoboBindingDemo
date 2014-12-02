package net.droidlabs.robobindingdemo.bindings.attributes;

import android.widget.TextView;
import org.robobinding.viewattribute.property.PropertyViewAttribute;

public class TextViewDoubleAttribute implements PropertyViewAttribute<TextView, Double>
{
    public static final String ATTRIBUTE_NAME = "double";

    @Override
    public void updateView(TextView view, Double newValue)
    {
        view.setText(Double.toString(newValue));
    }
}

