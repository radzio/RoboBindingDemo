package net.droidlabs.robobindingdemo.bindings;

import android.widget.EditText;
import net.droidlabs.robobindingdemo.bindings.attributes.TwoWayEditTextViewDoubleAttribute;
import org.robobinding.viewattribute.BindingAttributeMappings;
import org.robobinding.widget.edittext.EditTextBinding;

/**
 * Created by radoslaw.piekarz on 2014-12-02.
 */
public class ExtendedEditTextViewBinding extends  EditTextBinding
{
    @Override
    public void mapBindingAttributes(BindingAttributeMappings<EditText> mappings)
    {
        super.mapBindingAttributes(mappings);
        mappings.mapProperty(TwoWayEditTextViewDoubleAttribute.class, TwoWayEditTextViewDoubleAttribute.ATTRIBUTE_NAME);
    }
}

