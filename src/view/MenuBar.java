package view;

import listeners.ExitAction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sebastian on 2014-07-22.
 */
public class MenuBar {

    private JMenuBar menuBar;
    private JMenuItem exit;
    private ImageIcon exitIcon;

    public MenuBar(){

        menuBar = new JMenuBar();
        generateMenu();
    }

    private void generateMenu() {

        JMenu menu = new JMenu("FIle");
        menuBar.add(menu);
        exitIcon = new ImageIcon(MenuBar.class.getResource("../icons/exit.png"));
        exit = new JMenuItem(new ExitAction("Exit", exitIcon));
        menu.add(new JSeparator());
        menu.add(exit);

    }

    public JMenuBar getMenu() {
        return menuBar;
    }

}
