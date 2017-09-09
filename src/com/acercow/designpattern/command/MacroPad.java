package com.acercow.designpattern.command;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jansen on 2017/9/9.
 */
public class MacroPad implements IMacroPad {

    private List<ICommand> commands = new ArrayList<>();

    @Override
    public void add(ICommand cmd) {
        commands.add(cmd);
    }

    @Override
    public void remove(ICommand cmd) {
        commands.remove(cmd);
    }

    @Override
    public void execute() {
        System.out.println("\n======[Macro Pad]======");

        for (ICommand cmd : commands) {
            cmd.execute();
        }
    }
}
