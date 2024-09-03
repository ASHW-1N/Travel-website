import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage {
    public HomePage(JFrame frame) {
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        JButton viewDestinationsButton = new JButton("View Destinations");
        JButton bookTripButton = new JButton("Book a Trip");

        panel.add(viewDestinationsButton);
        panel.add(bookTripButton);

        // Action listeners for buttons
        viewDestinationsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Here are some destinations...");
            }
        });

        bookTripButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                new BookingPage(frame);
                frame.revalidate();
                frame.repaint();
            }
        });
    }
}
