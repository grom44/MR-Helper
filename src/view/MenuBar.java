package view;

import lib.StringContainer;
import listeners.ExitAction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sebastian on 2014-07-22.
 */
public class MenuBar {

    private JMenuBar menuBar;

    private JMenu menu;
    private JMenuItem exit;
    private JMenuItem options;
    private ImageIcon exitIcon;

    private StringContainer sc;

    public MenuBar(){

        sc = new StringContainer();
        menuBar = new JMenuBar();
        generateMenu();
    }

    private void generateMenu() {

        menu = new JMenu(sc.getString("menu_file"));
        options = new JMenu(sc.getString("menu_options"));

        menuBar.add(menu);
        exitIcon = new ImageIcon(MenuBar.class.getResource("../icons/exit.png"));
        exit = new JMenuItem(new ExitAction(sc.getString("menu_file_exit"), exitIcon));
        menu.add(new JSeparator());
        menu.add(exit);

        menuBar.add(options);
        ButtonGroup lookGroup = new ButtonGroup();
        JRadioButtonMenuItem nativeElem = new JRadioButtonMenuItem("Native Look & Feel");
        JRadioButtonMenuItem javaElem = new JRadioButtonMenuItem("Java Look & Feel");
        JRadioButtonMenuItem motifElem = new JRadioButtonMenuItem("Motif Look & Feel");
        lookGroup.add(nativeElem);
        lookGroup.add(javaElem);
        lookGroup.add(motifElem);
        options.add(nativeElem);
        options.add(javaElem);
        options.add(motifElem);
        options.add(new JSeparator());

    }

    public JMenuBar getMenu() {
        return menuBar;
    }

}
