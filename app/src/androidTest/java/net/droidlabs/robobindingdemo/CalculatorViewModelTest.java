package net.droidlabs.robobindingdemo;


import net.droidlabs.robobindingdemo.viewmodels.CalculatorViewModel;
import net.droidlabs.robobindingdemo.views.ICalculatorView;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.mock;

public class CalculatorViewModelTest
{
    private CalculatorViewModel presentationModel;

    @Before
    public void setup()
    {
        ICalculatorView view = mock(ICalculatorView.class);
        this.presentationModel = new CalculatorViewModel(view);
    }

    @Test
    public void testShouldFail()
    {
        final double expectedValue = 3.5;
        this.presentationModel.setA("2.0");
        this.presentationModel.setB(1.5);

        assertEquals(expectedValue, this.presentationModel.getResult(), 0.0001);
    }
}

