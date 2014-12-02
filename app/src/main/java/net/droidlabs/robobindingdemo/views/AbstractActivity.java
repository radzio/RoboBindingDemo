package net.droidlabs.robobindingdemo.views;


import android.app.Activity;
import android.view.View;
import net.droidlabs.robobindingdemo.DemoApplication;
import org.robobinding.ViewBinder;
import org.robobinding.binder.BinderFactory;

public abstract class AbstractActivity extends Activity
{
    public void initializeContentView(int layoutId, Object presentationModel)
    {
        ViewBinder viewBinder = createViewBinder();
        View rootView = viewBinder.inflateAndBind(layoutId, presentationModel);
        setContentView(rootView);
    }

    protected ViewBinder createViewBinder()
    {
        BinderFactory binderFactory = getDemoApplication().getReusableBinderFactory();
        return binderFactory.createViewBinder(this);
    }

    private DemoApplication getDemoApplication()
    {
        return (DemoApplication) getApplicationContext();
    }
}
