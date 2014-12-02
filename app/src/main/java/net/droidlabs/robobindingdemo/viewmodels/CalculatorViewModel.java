package net.droidlabs.robobindingdemo.viewmodels;

import net.droidlabs.robobindingdemo.views.ICalculatorView;
import org.robobinding.annotation.DependsOnStateOf;
import org.robobinding.annotation.PresentationModel;


@PresentationModel
public class CalculatorViewModel extends PresentationViewModelAbstract
{
    private final ICalculatorView view;

    private double a;
    private double b;

    public CalculatorViewModel(ICalculatorView view)
    {
        this.view = view;
    }


    public String getA()
    {
        return Double.toString(a);
    }

    public void setA(String a)
    {
        this.a = Double.parseDouble(a);
        raisePropertyChanded("a");
    }

    public double getB()
    {
        return b;
    }

    public void setB(double b)
    {
        this.b = b;
        raisePropertyChanded("b");
    }

    @DependsOnStateOf({"a", "b"})
    public double getResult()
    {
        return this.a + this.b;
    }
}
