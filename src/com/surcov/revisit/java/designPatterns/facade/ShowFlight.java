package com.surcov.revisit.java.designPatterns.facade;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class ShowFlight {

    public static void main(String[] args) {
        PlotPanel plotPanel =
                new PlotPanel((t, w) -> (int) (t * w),
                        (t, h) -> (int) (4 * h * (t - .5) * (t - .5)));
        plotPanel.setPreferredSize(new Dimension(300, 200));

        JPanel panel = UIUtility.createTitledPanel("Flight Path", plotPanel);
        JFrame frame = new JFrame("Flight Path for Shell Duds");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
