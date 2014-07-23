package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sebastian on 2014-07-22.
 */
public class MenuBar {

    private JMenuBar menuBar;

    public MenuBar(){

        menuBar = new JMenuBar();
        generateMenu();
    }

    private void generateMenu() {

        JMenu menu = new JMenu("FIle");
        menuBar.add(menu);
        JMenuItem exit = new JMenuItem(new ExitAction("Exit"));
        menu.add(exit);

    }

    public JMenuBar getMenu() {
        return menuBar;
    }

    private class ExitAction extends AbstractAction {

        private ExitAction(String name) {
            super(name);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
