package com.acercow.designpattern.command;

/**
 * Created by Jansen on 2017/9/9.
 */
public class KeyPad {
    private PlayCommand playCommand;
    private PauseCommand pauseCommand;
    private StopCommand stopCommand;

    public void setPlayCommand(PlayCommand playCommand) {
        this.playCommand = playCommand;
    }

    public void setPauseCommand(PauseCommand pauseCommand) {
        this.pauseCommand = pauseCommand;
    }

    public void setStopCommand(StopCommand stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void play() {
        playCommand.execute();
    }

    public void pause() {
        pauseCommand.execute();
    }

    public void stop() {
        stopCommand.execute();
    }
}
