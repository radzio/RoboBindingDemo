package net.droidlabs.robobindingdemo.bindings.attributes;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import org.robobinding.property.ValueModel;
import org.robobinding.viewattribute.property.TwoWayPropertyViewAttribute;
import org.robobinding.widget.edittext.ValueCommitMode;

public class TwoWayEditTextViewDoubleAttribute implements TwoWayPropertyViewAttribute<EditText, Double>
{
    public static final String ATTRIBUTE_NAME = "double";
    private ValueCommitMode valueCommitMode = ValueCommitMode.ON_CHANGE;

    @Override
    public void updateView(EditText view, Double newValue)
    {
        view.setText(Double.toString(newValue));
    }

    @Override
    public void observeChangesOnTheView(final EditText view, final ValueModel<Double> valueModel)
    {
        if (valueCommitMode == ValueCommitMode.ON_FOCUS_LOST)
        {
            view.setOnFocusChangeListener(new View.OnFocusChangeListener()
            {
                @Override
                public void onFocusChange(View v, boolean hasFocus)
                {
                    if (!hasFocus)
                    {
                        updateValueModel(valueModel, view.getText());
                    }
                }
            });
        }
        else
        {
            view.addTextChangedListener(new TextWatcher()
            {
                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count)
                {
                    updateValueModel(valueModel, s);
                }

                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after)
                {
                }

                @Override
                public void afterTextChanged(Editable s)
                {
                }
            });
        }
    }

    protected void updateValueModel(ValueModel<Double> valueModel, CharSequence charSequence)
    {
        valueModel.setValue(Double.parseDouble(charSequence.toString()));
    }
}