package org.ponhuyu;

import org.ponhuyu.gui.StartWindow;

import javax.swing.*;


/**
 * App's main class
 *
 */
public class UtilityBillsCalc {

    public static void main(String[] args) {


            //Schedule a job for the event-dispatching thread:
            //creating and showing this application's GUI.
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                   new StartWindow().createAndShowStartGUI();

                }
            });
        }
    }

