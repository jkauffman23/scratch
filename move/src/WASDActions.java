import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by administrator on 4/24/2017.
 */
public class WASDActions{

    public WASDActions(ImagePanel panel, Frame frame) {
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setPriority(0);

            }
        });
        System.out.println("WASDActions thread started!");

        Action dAction = new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                if (frame.getPriority() < 5) {

                    System.out.println("dAction: " + frame.getPriority());
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

        Action sAction = new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                if (frame.getPriority() < 5) {

                    System.out.println("sAction: " + frame.getPriority());
                    panel.setSx(panel.getSy() + 5);
                    panel.repaint();
                    frame.setPriority(frame.getPriority()+1);

                } else {
//                    try {
                        //timer.wait(10);
                        frame.setPriority(0);
//                    } catch (InterruptedException ie){
//                        frame.setPriority(0);
//
//                    }
                }

            }
        };

        Action aAction = new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                if (frame.getPriority() < 5) {

                    System.out.println("aAction: " + frame.getPriority());
                    panel.setSx(panel.getSx() - 5);
                    panel.repaint();
                    frame.setPriority(frame.getPriority()+1);

                } else {
                    //try {
                        //timer.wait(10);
                        frame.setPriority(0);
                    //} catch (InterruptedException ie){
                        //frame.setPriority(0);

                    //}
                }

            }
        };

        Action wAction = new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                if (frame.getPriority() < 5) {

                    System.out.println("wAction: " + frame.getPriority());
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

        inputMap.put(KeyStroke.getKeyStroke("D"), "dAction");
        actionMap.put("dAction", dAction);

        inputMap.put(KeyStroke.getKeyStroke("S"), "sAction");
        actionMap.put("sAction", sAction);

        inputMap.put(KeyStroke.getKeyStroke("W"), "wAction");
        actionMap.put("wAction", wAction);

        inputMap.put(KeyStroke.getKeyStroke("A"), "aAction");
        actionMap.put("aAction", aAction);

    }
}
