
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Robin Dupuis
 */
public class JavaGUI {

    public static void main(String[] args) {
       JFrame frame = new JFrame();//creates frame
       JLabel label = new JLabel();
       label.setText("Hello fellow coder, this is my first GUI in java");
       
       frame.setTitle("My first GUI window in java!");//title for frame
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(420,420);//dimension of frame x and y
       frame.setVisible(true);//makes frame visible
       
       ImageIcon image =new ImageIcon("Kit.png");
       ImageIcon image2 =new ImageIcon("Cat.png");
       
       frame.setIconImage(image.getImage());
       label.setIcon(image2);
       
       frame.getContentPane().setBackground(Color.cyan);
       label.setForeground(new Color(100,0,100));
       frame.add(label);
    }
}
