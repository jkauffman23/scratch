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
public class DrawPane extends JLayeredPane {

    private BufferedImage image;
    private String path;

    private int x;
    private int y;

    private int dx;
    private int dy;

    private int rx;
    private int ry;


    public DrawPane() {
        x = 0;
        y = 0;
        dx=400;
        dy=200;
        path="resources/knight.png";

        try {
            image = ImageIO.read(new File(path));
            this.rx = image.getMinX();
            this.ry = image.getMinY();
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }

    public DrawPane(int dx, int dy, String path) {
        x = 5;
        y = 5;
        this.dx = dx;
        this.dy = dy;
        this.path = path;

        try {
            image = ImageIO.read(new File(path));
            this.rx = image.getMinX();
            this.ry = image.getMinY();
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawImage(image, x, y, null  );
    }

    public Dimension getPreferredSize() {
        return new Dimension(dx, dy);
    }

    public int getRx() {
        return rx;
    }

    public void setRx(int rx) {
        this.rx = rx;
    }

    public int getRy() {
        return ry;
    }

    public void setRy(int ry) {
        this.ry = ry;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

