package com.aplicaciones_graficas;
import javax.swing.*;

public class CreateFrame {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

class MyFrame extends JFrame {
    public MyFrame(){
        setSize(500,300);
    }
}
