package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public static class CustomFonts {

        public static final Font FONT = new Font("Arial", Font.BOLD, 15);
    }

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thanks for your participation!");
        thankYouLabel.setFont(CustomFonts.FONT);
        thankYouLabel.setBounds(10, 10, 200, 20);

        // Add components to the panel
        panel.add(thankYouLabel);

        // Add panel to the frame
        frame.add(panel);


    }


}
