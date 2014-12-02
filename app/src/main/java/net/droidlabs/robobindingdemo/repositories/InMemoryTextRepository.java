package net.droidlabs.robobindingdemo.repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by radoslaw.piekarz on 2014-12-02.
 */
public class InMemoryTextRepository implements ITextRepository
{
    private final ArrayList<String> values;

    public InMemoryTextRepository()
    {
        this.values = new ArrayList<String>();
    }

    @Override
    public void add(String text)
    {
        values.add(text);
    }

    @Override
    public List<String> getAll()
    {
        return values;
    }
}
