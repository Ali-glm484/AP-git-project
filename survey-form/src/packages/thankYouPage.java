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
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 800, 800);
        panel.setBackground(Color.yellow);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thanks for your participation!");
        thankYouLabel.setFont(CustomFonts.FONT);
        thankYouLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add components to the panel
        panel.add(thankYouLabel, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);


    }


}
