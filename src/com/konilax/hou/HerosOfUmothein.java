package com.konilax.hou;

import javax.swing.*;
import java.awt.*;

public class HerosOfUmothein extends Canvas implements Runnable {

    public static final int WIDTH = 300;
    public static final int HEIGHT = WIDTH / 16 * 9;
    public static final int SCALE = 3;

    private Thread thread;
    private JFrame frame;
    private boolean runnning = false;

    public HerosOfUmothein() {
        Dimension size = new Dimension(WIDTH * SCALE, HEIGHT * SCALE);
        setPreferredSize(size);

        frame = new JFrame();
    }

    public synchronized void start() {
        runnning = true;
        thread = new Thread(this, "Heros of Umothein");
        thread.start();
    }

    public synchronized void stop() {
        runnning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void run() {
        while(runnning) {

        }

    }

    public static void main(String[] args) {
        HerosOfUmothein game = new HerosOfUmothein();
        game.frame.setResizable(false);
        game.frame.setTitle("Heros of Umothein | Pre-Alpha 0.0.1a");
        game.frame.add(game);
        game.frame.pack();
        game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.frame.setLocationRelativeTo(null);
        game.frame.setVisible(true);

        game.start();
    }

}
