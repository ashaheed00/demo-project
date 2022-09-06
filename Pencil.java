package com.aksh.demo;

public class Pencil extends WriterTool {

    @Override
    public void write() {
        System.out.println("in Pencil");
    }

    public void erase(){
        System.out.println("erasing");
    }
}
