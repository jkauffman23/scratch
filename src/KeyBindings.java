import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;

/**
 * Created by administrator on 4/23/2017.
 */
public class KeyBindings extends JFrame {

    public KeyBindings(DrawPane drawPane){


        Action rightAction = new AbstractAction() {
            public void actionPerformed(ActionEvent e){
                drawPane.setX(drawPane.getX() + 5);
                drawPane.repaint();

            }
        };

        Action downAction = new AbstractAction() {
            public void actionPerformed(ActionEvent e){
                drawPane.setY(drawPane.getY() + 5);
                drawPane.repaint();

            }
        };

        Action leftAction = new AbstractAction() {
            public void actionPerformed(ActionEvent e){
                drawPane.setX(drawPane.getX() - 5);
                drawPane.repaint();

            }
        };

        Action upAction = new AbstractAction() {
            public void actionPerformed(ActionEvent e){
                drawPane.setY(drawPane.getY() - 5);
                drawPane.repaint();

            }
        };

        InputMap inputMap = drawPane.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = drawPane.getActionMap();

        inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        actionMap.put("rightAction", rightAction);

        inputMap.put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        actionMap.put("downAction", downAction);

        inputMap.put(KeyStroke.getKeyStroke("UP"), "upAction");
        actionMap.put("upAction", upAction);

        inputMap.put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        actionMap.put("leftAction", leftAction);


        //drawPane.setBorder(BorderFactory.createEmptyBorder());
        add(drawPane);

        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        setVisible(true);
        pack();


    }


}
