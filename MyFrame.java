import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
public class MyFrame extends JFrame {
    
    MyFrame(){
        // JFrame = a Gui window  to add componeents to

        this.setTitle("MillerMan2"); //set tittle of frame
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); // prevent this from being resized
        this.setSize(420,420); //sets the x-dimension, and y-dimension of this
        this.setVisible(true); // makes this visible

        ImageIcon image = new ImageIcon("src/Vector_20180626_009.jpg"); //create image icon
        this.setIconImage(image.getImage()); // change
        this.getContentPane().setBackground(new Color(123,50,250)); // change color of background

        JLabel label = new JLabel(); //create a label
        label.setText("Chris is fat"); //set text of label
        this.add(label);
    }
}
