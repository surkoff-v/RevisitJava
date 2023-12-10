package com.surcov.revisit.java.designPatterns.mediator;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class RoketTableModel extends AbstractTableModel {

    protected Rocket[] rockets;
    protected String[] columnNames = {"Name","Price","Apogee"};

    public RoketTableModel(Rocket[] rockets) {
        this.rockets = rockets;
    }

    @Override
    public int getRowCount() {
        return rockets.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Rocket rocket = rockets[rowIndex];
        Object res = null;
        switch (columnIndex) {
           case 0 : res = rocket.getName(); break;
           case 1 : res = rocket.getPrice(); break;
            case 2 : res = rocket.getApogee(); break;
        }
        return res;
    }
}
