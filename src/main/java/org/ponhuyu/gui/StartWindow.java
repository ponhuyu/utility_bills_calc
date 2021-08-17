package org.ponhuyu.gui;

import javax.swing.*;
import java.awt.*;

public class StartWindow {

    private final JFrame MAIN_FRAME;

    {
        MAIN_FRAME = new JFrame("utility bills calculator");
    }


    public void createAndShowStartGUI() {
        //Create and set up the window.

        MAIN_FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        MAIN_FRAME.getContentPane().add(label);

        //Display the window.
        MAIN_FRAME.pack();
        MAIN_FRAME.getContentPane().setBackground(new Color(52, 52, 52));
        //Center the screen
        MAIN_FRAME.setLocationRelativeTo(null);
        MAIN_FRAME.setVisible(true);
    }

}
