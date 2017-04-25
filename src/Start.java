import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.awt.Color.RED;

/**
 * Created by administrator on 4/23/2017.
 */
public class Start {

    public static void main(String[] args){
        int height = 400;
        int width = 400;

        EventQueue.invokeLater(new Runnable(){
            public void run(){
                JFrame frame = new KeyBindings(new DrawPane(width,height,"resources/knight.png"));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Knight");
                //frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                //frame.setSize(width,height);
                //frame.setBounds(0,0,width,height);
                JPanel jp = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.setColor(RED);
                        g.fillRect(0,0,50,50);
                        g.fillRect(0,height - 50,50,50);
                        g.fillRect(width - 50,0,50,50);
                        g.fillRect(width - 50,height - 50,50,50);


                    }
                };
                frame.add(jp);

            }
        });



    }
}
