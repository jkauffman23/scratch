import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by administrator on 4/24/2017.
 */
public class ImagePanel extends JPanel {
    private BufferedImage image;
    private String path;

    private int sx;
    private int sy;

    private int dx;
    private int dy;

    private int rx;
    private int ry;


    public ImagePanel() {
        sx = 0;
        sy = 0;
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

    public ImagePanel(int dx, int dy, int sx, int sy, String path) {
        this.sx = sx;
        this.sy = sy;
        this.path = path;

        try {
            image = ImageIO.read(new File(path));
            this.rx = image.getMinX();
            this.ry = image.getMinY();
        } catch (IOException e) {
            System.out.println("File not found.");
        }
        this.setOpaque(false);
        this.setSize(dx,dy);
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

        g.drawImage(image, sx, sy, null  );
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

    public int getSx() {
        return sx;
    }

    public void setSx(int sx) {
        this.sx = sx;
    }

    public int getSy() {
        return sy;
    }

    public void setSy(int sy) {
        this.sy = sy;
    }
}
