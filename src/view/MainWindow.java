package view;

/**
 * Created by Sebastian on 2014-07-21.
 */
public class MainWindow extends BaseWindow {

    private static String title = "MR Helper v.1.0";
    private MenuBar menuBar;

    public MainWindow() {

        super(title);
        menuBar = new MenuBar();
        setJMenuBar(menuBar.getMenu());
    }
}
