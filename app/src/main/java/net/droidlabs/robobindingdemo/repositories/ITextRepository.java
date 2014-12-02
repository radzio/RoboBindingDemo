package net.droidlabs.robobindingdemo.repositories;

import java.util.Collection;

/**
 * Created by radoslaw.piekarz on 2014-12-02.
 */
public interface ITextRepository
{
    public void add(String text);
    public Collection<String> getAll();
}
