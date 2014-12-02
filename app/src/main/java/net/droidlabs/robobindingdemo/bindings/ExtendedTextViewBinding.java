package net.droidlabs.robobindingdemo.bindings;


import android.widget.TextView;
import net.droidlabs.robobindingdemo.bindings.attributes.TextViewDoubleAttribute;
import org.robobinding.viewattribute.BindingAttributeMappings;
import org.robobinding.widget.textview.TextViewBinding;

public class ExtendedTextViewBinding extends TextViewBinding
{
    @Override
    public void mapBindingAttributes(BindingAttributeMappings<TextView> mappings)
    {
        super.mapBindingAttributes(mappings);
        mappings.mapProperty(TextViewDoubleAttribute.class, TextViewDoubleAttribute.ATTRIBUTE_NAME);
    }
}
