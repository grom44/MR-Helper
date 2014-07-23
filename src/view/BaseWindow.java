package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sebastian on 2014-07-21.
 * :)
 */
public class BaseWindow extends JFrame {

    private int winHeight;
    private int winWidth;
    private String title;

    //default constructor for centered view
    public BaseWindow(String title) {
        this.title = title;
        this.CenteredFrame();
    }

    protected void CenteredFrame() {
        Toolkit toolSet = Toolkit.getDefaultToolkit();
        Dimension dimension = toolSet.getScreenSize();
        this.winHeight = dimension.height;
        this.winWidth = dimension.width;

        setSize(this.winWidth /2, this.winHeight /2);
        setLocation(this.winWidth /4, this.winHeight /4);
        setTitle(this.title);

    }
}
