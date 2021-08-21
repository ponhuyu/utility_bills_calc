package org.ponhuyu.gui;

import org.ponhuyu.gui.forms.MainFrame;
import org.ponhuyu.gui.forms.MainWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class StartWindow {



    {
        mainFrame = new MainFrame();
    }

    private final MainFrame mainFrame;

    public void createAndShowStartGUI() {
        //Create and set up the window.

        JFrame frame = new JFrame("MainWindow");

        frame.setContentPane(mainFrame.getPanelForButtons());


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
    private int count = 0;
}
