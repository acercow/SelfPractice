package com.acercow.designpattern.command;

/**
 * Created by Jansen on 2017/9/9.
 */
public class PauseCommand implements ICommand {
    private MediaPlayer mediaPlayer;

    public PauseCommand(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void execute() {
        mediaPlayer.pause();
    }
}
