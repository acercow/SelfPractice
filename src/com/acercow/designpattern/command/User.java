package com.acercow.designpattern.command;

import javafx.scene.paint.Stop;

/**
 * Created by Jansen on 2017/9/9.
 */
public class User {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        PlayCommand playCommand = new PlayCommand(mediaPlayer);
        PauseCommand pauseCommand = new PauseCommand(mediaPlayer);
        StopCommand stopCommand = new StopCommand(mediaPlayer);


        KeyPad keyPad = new KeyPad();
        keyPad.setPlayCommand(playCommand);
        keyPad.setPauseCommand(pauseCommand);
        keyPad.setStopCommand(stopCommand);


        keyPad.play();
        keyPad.pause();
        keyPad.stop();



        MacroPad macroPad = new MacroPad();
        macroPad.add(playCommand);
        macroPad.add(pauseCommand);
        macroPad.add(playCommand);
        macroPad.add(stopCommand);
        macroPad.remove(playCommand);
        macroPad.execute();
    }
}
