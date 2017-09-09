package com.acercow.designpattern.command;

/**
 * Created by Jansen on 2017/9/9.
 */
public class StopCommand implements ICommand {
    private MediaPlayer mediaPlayer;

    public StopCommand(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void execute() {
        mediaPlayer.stop();
    }
}
