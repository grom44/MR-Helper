package controller;

import view.MainWindow;
import javax.swing.*;

/**
 * Created by Sebastian on 2014-07-22.
 */
public class MainController {

    private MainWindow mw;

    public MainController(){

        mw = new MainWindow();
        mw.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mw.setVisible(true);
    }
}
