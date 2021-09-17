import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
 
import javax.swing.border.Border;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
public class HangMan   {

 static JButton button;

        public static void main(String[] args) {

        

        
        // JFrame = a Gui window  to add componeents to
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        ImageIcon image1 = new ImageIcon("src/USA.png");
        ImageIcon image = new ImageIcon("src/Vector_20180626_009.jpg"); //create image icon
        JFrame frame = new JFrame(); //creates a frame
        JLabel label = new JLabel(); //create a label
        JPanel redpanel = new JPanel(); //creates panel
        JPanel bluepanel = new JPanel();
        button = new JButton();
        
        label.setText("LEVEL 1"); //set text of label
        //label.setIcon(image1);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text position
        label.setVerticalTextPosition(JLabel.TOP); // set text position
        label.setForeground(Color.green); //setfont color
        label.setFont(new Font("MV Boli",Font.ITALIC,30)); 
        label.setIconTextGap(-6); // set gap of text to image
        label.setBackground(Color.BLACK); //set backgound color
        label.setOpaque(true); //display backgound color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical postin of icon+text
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        label.setBounds(0, 0, 150, 150); // set x and y position and dimsstions
        bluepanel.add(label);

        redpanel.setBackground(Color.red);
        redpanel.setBounds(250, 0, 250, 250);
        redpanel.add(button);
        frame.add(redpanel);

        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(0, 0, 250, 250);
        bluepanel.setLayout(new BorderLayout());
        frame.add(bluepanel);

        button.setBounds(200, 100, 100, 50);
        button.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            // TODD auto-generated method stub
            if(e.getSource()==button){
                System.out.println("chris is fat");
            }
              
          }

        });
        frame.add(button);

        frame.setTitle("MillerMan"); //set tittle of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(true); // prevent frame from being resized
        frame.setSize(500,500); //sets the x-dimension, and y-dimension of frame
        frame.setLayout(null);
        frame.setVisible(true); // makes frame visible


        frame.setIconImage(image.getImage()); // change
        frame.getContentPane().setBackground(new Color(123,50,250)); // change color of background
        
        
        
  }
 

}