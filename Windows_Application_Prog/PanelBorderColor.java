import java.awt.*;

public class PanelBorderColor {

    public static void main(String[] args) {

        Panel panel = new Panel();

        // Set the border color to red
        panel.setBorder(BorderFactory.createLineBorder(Color.red));

        // Add the panel to the frame
        Frame frame = new Frame();
        frame.add(panel);

        // Set the frame size and visibility
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}