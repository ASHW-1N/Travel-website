import javax.swing.*;

public class ConfirmationPage {
    public ConfirmationPage(JFrame frame, String name, String destination) {
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        JLabel confirmationLabel = new JLabel("Booking Confirmed!");
        JLabel nameLabel = new JLabel("Name: " + name);
        JLabel destinationLabel = new JLabel("Destination: " + destination);

        panel.add(confirmationLabel);
        panel.add(nameLabel);
        panel.add(destinationLabel);
    }
}
