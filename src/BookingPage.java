import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookingPage {
    public BookingPage(JFrame frame) {
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel destinationLabel = new JLabel("Destination:");
        JTextField destinationField = new JTextField(20);
        JButton confirmButton = new JButton("Confirm Booking");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(destinationLabel);
        panel.add(destinationField);
        panel.add(confirmButton);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                new ConfirmationPage(frame, nameField.getText(), destinationField.getText());
                frame.revalidate();
                frame.repaint();
            }
        });
    }
}
