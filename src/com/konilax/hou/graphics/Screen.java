package com.konilax.hou.graphics;

public class Screen {

    public int[] pixels;
    private int width, height;

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];
    }

}