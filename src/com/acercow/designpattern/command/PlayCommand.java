package com.acercow.designpattern.command;

/**
 * Created by Jansen on 2017/9/9.
 */
public class PlayCommand implements ICommand {
    private MediaPlayer mediaPlayer;

    public PlayCommand(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void execute() {
        mediaPlayer.play();
    }
}
