package listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by sebastians on 23.07.14.
 */
public class ExitAction extends AbstractAction{

    public ExitAction(String name, ImageIcon icon) {
        super(name, icon);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.exit(0);
    }
}
