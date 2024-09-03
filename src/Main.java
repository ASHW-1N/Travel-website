import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Set the frame properties
        JFrame frame = new JFrame("Travel Website");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Open the HomePage
        HomePage homePage = new HomePage(frame);
        frame.setVisible(true);
    }
}
