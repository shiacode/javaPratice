import javax.swing.*;

public class SimpleGui1 {

    JFrame frame;
    JButton button;

    public static void main (String[] args) {

        frame = new JFrame();
        button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(300,300);

        frame.setVisible(true);

    }

   
}