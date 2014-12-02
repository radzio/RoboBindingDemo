package net.droidlabs.robobindingdemo;

import android.app.Application;
import android.widget.EditText;
import android.widget.TextView;
import net.droidlabs.robobindingdemo.bindings.ExtendedEditTextViewBinding;
import net.droidlabs.robobindingdemo.bindings.ExtendedTextViewBinding;
import org.robobinding.binder.BinderFactory;
import org.robobinding.binder.BinderFactoryBuilder;

public class DemoApplication extends Application
{
    private BinderFactory reusableBinderFactory;
    @Override
    public void onCreate()
    {
        super.onCreate();
        reusableBinderFactory = new BinderFactoryBuilder()
                .mapView(TextView.class, new ExtendedTextViewBinding())
                .mapView(EditText.class, new ExtendedEditTextViewBinding())
                .build();
    }

    public BinderFactory getReusableBinderFactory()
    {
        return reusableBinderFactory;
    }
}
