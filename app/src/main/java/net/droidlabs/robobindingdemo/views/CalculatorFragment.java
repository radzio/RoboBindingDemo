package net.droidlabs.robobindingdemo.views;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import net.droidlabs.robobindingdemo.DemoApplication;
import net.droidlabs.robobindingdemo.R;
import net.droidlabs.robobindingdemo.viewmodels.CalculatorViewModel;
import org.robobinding.ViewBinder;
import org.robobinding.binder.BinderFactory;


public class CalculatorFragment extends Fragment implements ICalculatorView
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        ViewBinder viewBinder = createViewBinder();
        CalculatorViewModel presentationModel = new CalculatorViewModel(this);
        View rootView = viewBinder.inflateAndBindWithoutAttachingToRoot(R.layout.fragment_calculator, presentationModel, container);

        return rootView;
    }

    protected ViewBinder createViewBinder()
    {
        BinderFactory binderFactory = getReusableBinderFactory();
        return binderFactory.createViewBinder(getActivity());
    }

    private BinderFactory getReusableBinderFactory()
    {
        BinderFactory binderFactory = getApp().getReusableBinderFactory();
        return binderFactory;
    }

    private DemoApplication getApp()
    {
        return (DemoApplication) getActivity().getApplicationContext();
    }


}
