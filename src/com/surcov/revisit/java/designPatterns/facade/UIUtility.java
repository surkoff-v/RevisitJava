package com.surcov.revisit.java.designPatterns.facade;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class UIUtility {


    public static TitledBorder createTitledBorder(String title) {
        TitledBorder tb = BorderFactory.createTitledBorder(
                BorderFactory.createBevelBorder(BevelBorder.RAISED),
                title,
                TitledBorder.LEFT,
                TitledBorder.TOP);
        tb.setTitleColor(Color.black);
        tb.setTitleFont(getStandardFont());
        return tb;
    }

    public static JPanel createTitledPanel(
            String title, JPanel in) {
        JPanel out = new JPanel();
        out.add(in);
        out.setBorder(createTitledBorder(title));
        return out;
    }

    public static Font getStandardFont() {
        return new Font("Dialog", Font.PLAIN, 18);
    }
}
