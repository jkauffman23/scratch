import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutorService;

/**
 * Created by administrator on 4/24/2017.
 */
public class Frame extends JFrame {

    private int priority = 0;

    public Frame() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());


    }


    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void addLayers(ExecutorService es) {
        JLayeredPane lp = new JLayeredPane();
        ImagePanel ip1 = new ImagePanel(400, 400, 5, 5, "resources/knight.png");
        ImagePanel ip2 = new ImagePanel(400, 400, 40, 40, "resources/knight.png");

//        Thread thread1 = new Thread() {public void run() {
//            ArrowActions aa1 = new ArrowActions(ip1);
//        }};
//
//        Thread thread2 = new Thread() {public void run() {
//            WASDActions aa1 = new WASDActions(ip2);
//        }};

        ArrowActions aa1 = new ArrowActions(ip1, this);
        WASDActions aa2 = new WASDActions(ip2, this);





        //ArrowActions aa1 = new ArrowActions(ip1);
        //aa1.start();

        //WASDActions aa2 = new WASDActions(ip2);
        //aa2.start();

        //ActionMap aa3 = new ActionMap();



        lp.add(ip1, Integer.valueOf(1));


        lp.add(ip2, Integer.valueOf(2));

        this.add(lp);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(new Dimension(400, 400));
    }

    public void addPanel(ImagePanel panel, int x) {

        this.add(panel, x);
        ArrowActions aa = new ArrowActions(panel, this);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(new Dimension(400, 400));


    }


}
