package com.surcov.revisit.java.designPatterns.mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class ShowRocket {

    public static void main(String[] args) {
        Rocket[] rockets =  {new Rocket("x",10, 10.0),
                new Rocket("y",20, 20.0)};
        RoketTableModel roketTableModel = new RoketTableModel(rockets);

        JTable jTable = new JTable(roketTableModel);

        JScrollPane pane = new JScrollPane(jTable);

        display(pane, " Rockets");

    }


    public static void display(Component c, String title) {
        JFrame frame = new JFrame(title);
        frame.getContentPane().add(c);
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
