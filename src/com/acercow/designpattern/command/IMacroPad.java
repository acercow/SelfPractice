package com.acercow.designpattern.command;

/**
 * Created by Jansen on 2017/9/9.
 */
public interface IMacroPad {

    void add(ICommand cmd);
    void remove(ICommand cmd);
    void execute();
}
