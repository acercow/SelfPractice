package com.acercow.designpattern.command;

/**
 * Created by Jansen on 2017/9/9.
 */
public class MediaPlayer {


    public void play() {
        System.out.println("==== MediaPlayer :: play ====");
    }


    public void pause() {
        System.out.println("==== MediaPlayer :: pause ====");
    }

    public void stop() {
        System.out.println("==== MediaPlayer :: stop ====");
    }
}
