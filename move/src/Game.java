import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.awt.Color.RED;

/**
 * Created by administrator on 4/24/2017.
 */
public class Game {
    public Game() {
        int height = 400;
        int width = 400;
        final ExecutorService executorService = Executors.newFixedThreadPool(16);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from a thread!");

                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }
                Frame frame = new Frame();
                frame.addLayers(executorService);




            }

        });

    }
}
