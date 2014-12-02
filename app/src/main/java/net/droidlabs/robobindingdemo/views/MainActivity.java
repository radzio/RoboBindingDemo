package net.droidlabs.robobindingdemo.views;

import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import net.droidlabs.robobindingdemo.R;
import net.droidlabs.robobindingdemo.repositories.InMemoryTextRepository;
import net.droidlabs.robobindingdemo.viewmodels.MainActivityViewModel;


public class MainActivity extends AbstractActivity implements IMainView
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        MainActivityViewModel presentationModel = new MainActivityViewModel(this, new InMemoryTextRepository());
        initializeContentView(R.layout.activity_main, presentationModel);
        initializeCalculatorFragment();
    }

    private void initializeCalculatorFragment()
    {
        CalculatorFragment newFragment = new CalculatorFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.root_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void showAlert()
    {
        AlertDialog show = new AlertDialog.Builder(this)
                .setTitle(getString(R.string.alert_title))
                .setMessage(getString(R.string.alert_message))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int which)
                    {
                        // continue
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int which)
                    {
                        // do nothing
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
