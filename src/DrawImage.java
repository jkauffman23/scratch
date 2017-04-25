import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by administrator on 4/24/2017.
 */
public class DrawImage extends JPanel {
    protected void painComponent(Graphics g) {
        super.paintComponent(g);
        try {
            BufferedImage image = ImageIO.read(new File("resources/knight.png"));
            g.drawImage(image,0,0,null);

        } catch (IOException e){
            System.out.println("Path not found");
        }


    }
}
