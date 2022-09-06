package com.aksh.demo;

public class WriteImpl {
    WriterTool w;

    public static void writeDocument(WriterTool w){
        w.write();
    }

    public static void main(String[] args) {
        WriterTool pen = new Pen();
        pen.write();

        Pencil pencil = new Pencil();
        System.out.println(pencil.colour);
        pencil.write();
        pencil.erase();
        writeDocument(pen);
    }
}
