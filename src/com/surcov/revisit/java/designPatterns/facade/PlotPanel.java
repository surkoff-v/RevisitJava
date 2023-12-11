package com.surcov.revisit.java.designPatterns.facade;

import javax.swing.*;
import java.awt.*;
import java.util.function.BiFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class PlotPanel extends JPanel {

    BiFunction<Double,Double,Integer> fx;
    BiFunction<Double,Double,Integer> fy;

    PlotPanel(BiFunction<Double,Double,Integer> fx,BiFunction <Double,Double,Integer> fy){
        this.fx = fx;
        this.fy = fy;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // paint the background
        int nPoint = 101;
        double w = getWidth() - 1;
        double h = getHeight() - 1;
        int[] x = new int[nPoint];
        int[] y = new int[nPoint];
        for (int i = 0; i < nPoint; i++) {
            // t goes 0 to 1
            double t = ((double) i) / (nPoint - 1);
            // x goes 0 to w
            x[i] = fx.apply(t , w);
            // y is h at t = 0 and t = 1, and y is 0 at t = .5
            y[i] = fy.apply(t,h);
        }
        g.drawPolyline(x, y, nPoint);
    }

    public void setPreferredSize(Dimension d){
        super.setPreferredSize(d);
    }

}
