import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by administrator on 4/24/2017.
 */
public class ArrowActions{

    public ArrowActions(ImagePanel panel, Frame frame) {
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setPriority(0);

            }
        });

        System.out.println("ArrowActions thread started!");
        Action rightAction = new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                if (frame.getPriority() < 5) {

                    System.out.println("rightAction: " + frame.getPriority());
                    panel.setSx(panel.getSx() + 5);
                    panel.repaint();
                    frame.setPriority(frame.getPriority()+1);

                } else {
//                    try {
//                        timer.wait(10);
                        frame.setPriority(0);
//                    } catch (InterruptedException ie){
//                        frame.setPriority(0);
//
//                    }
                }

            }
        };

        Action downAction = new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                if (frame.getPriority() < 5) {

                    System.out.println("downAction: " + frame.getPriority());
                    panel.setSx(panel.getSy() + 5);
                    panel.repaint();
                    frame.setPriority(frame.getPriority()+1);

                } else {
//                    try {
//                        timer.wait(10);
                        frame.setPriority(0);
//                    } catch (InterruptedException ie){
//                        frame.setPriority(0);
//
//                    }
                }

            }
        };

        Action leftAction = new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                if (frame.getPriority() < 5) {

                    System.out.println("rightAction: " + frame.getPriority());
                    panel.setSx(panel.getSx() - 5);
                    panel.repaint();
                    frame.setPriority(frame.getPriority()+1);

                } else {
//                    try {
//                        timer.wait(10);
                        frame.setPriority(0);
//                    } catch (InterruptedException ie){
//                        frame.setPriority(0);
//
//                    }
                }

            }
        };

        Action upAction = new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                if (frame.getPriority() < 5) {

                    System.out.println("rightAction: " + frame.getPriority());
                    panel.setSx(panel.getSy() - 5);
                    panel.repaint();
                    frame.setPriority(frame.getPriority()+1);

                } else {
//                    try {
//                        timer.wait(10);
                        frame.setPriority(0);
//                    } catch (InterruptedException ie){
//                        frame.setPriority(0);
//
//                    }
                }

            }
        };

        InputMap inputMap = panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = panel.getActionMap();

        inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        actionMap.put("rightAction", rightAction);

        inputMap.put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        actionMap.put("downAction", downAction);

        inputMap.put(KeyStroke.getKeyStroke("UP"), "upAction");
        actionMap.put("upAction", upAction);

        inputMap.put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        actionMap.put("leftAction", leftAction);

    }
}
