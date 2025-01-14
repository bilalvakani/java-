
import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JFrame implements ActionListener{
	
   public JButton mybutton;
	public WelcomeScreen() {
        displayWelcomeScreen();      
        setSize(600, 600); 
        setLocationRelativeTo(null); 
        setResizable(false); 
        setTitle("NHU International Airlines");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        ImageIcon image = new ImageIcon("Plane.png");
        setIconImage(image.getImage());
        getContentPane().setBackground(new Color(0x0096FF));
      
      
      
      JPanel redpanel = new JPanel(); 

	         redpanel.setBounds(60,100,500,500);
	         redpanel.setBackground(new Color(0x0096FF));
	         	         
	         JPanel headpanel = new JPanel(); 

	         headpanel.setBounds(460,180,400,250);
	         headpanel.setBackground(new Color(0x0096FF));
	         
	         JPanel subpanel = new JPanel();

	         subpanel.setBounds(260,400,100,100);
	         subpanel.setBackground(new Color (0x0096FF));
	         
	         
	         JLabel mainlabel = new JLabel();

	         mainlabel.setText("NHU Airlines");
	         mainlabel.setForeground(Color.white);
		 mainlabel.setFont(new Font("Boiling Demo Black",Font.PLAIN,60));
			 
		 mainlabel.setVerticalTextPosition(JLabel.BOTTOM);
		 mainlabel.setVerticalAlignment(JLabel.BOTTOM);
	         
	         
             JLabel label = new JLabel();

		     label.setText("Let's Fly Together");
                     String imagePath  = "F:\\Hamiz\\Nazeer Hussain University\\OOP'S\\Nhu Airlines 2\\WelcomeScreen\\src\\welcomescreen\\Plane.png";
		     ImageIcon image1 = new ImageIcon(imagePath);
		         label.setIcon(image1);
			 label.setIconTextGap(25);
			 label.setHorizontalTextPosition(JLabel.CENTER);
			 label.setVerticalTextPosition(JLabel.TOP);
			 label.setForeground(Color.white);
			 label.setFont(new Font("Algeria",Font.ITALIC,20));
			 label.setHorizontalAlignment(JLabel.CENTER);
			 label.setVerticalAlignment(JLabel.CENTER);
			 
			 JButton mybutton = new JButton ();
			 mybutton.setText("Explore");
			 mybutton.setForeground(Color.white);
			 mybutton.setBackground(Color.black);

             mybutton.setPreferredSize(new Dimension(150,40));		
           
             mybutton.setFocusable(false);
            
         
        	mybutton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   
                	loginFrame frame = new loginFrame();
                	frame.setVisible(true);
                }
            });
         
            redpanel.add(label);
          
          add(subpanel);
            
          add(redpanel);
          add(headpanel);
          subpanel.add(mybutton);
          headpanel.add(mainlabel);
          
          
    }
    public static void main(String[] args) {
        new WelcomeScreen();
       
    }
    
    private void displayWelcomeScreen() {
        
          JLabel splashLabel = new JLabel("Welcome to NHU Airlines");
         splashLabel.setFont(new Font("Boiling Demo Black",Font.PLAIN,30));
         splashLabel.setForeground(Color.BLACK);
        
        
        final JWindow w = new JWindow();  
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0x0096FF));
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
 
         
        panel.add(splashLabel);
        w.add(panel);  
        String imagePath  = "F:\\Hamiz\\Nazeer Hussain University\\OOP'S\\NHU International Airlines\\NHU Airlines\\src\\Plane.png";
        JLabel label = new JLabel(new ImageIcon(imagePath) );
         label.setBounds(50,50,100,100);
        label.setHorizontalAlignment(SwingConstants.CENTER); 
        JProgressBar progress = new JProgressBar(0, 100); 
        progress.setForeground(Color.yellow);
        w.add(BorderLayout.PAGE_END, progress); 
        panel.add(label);
        w.revalidate(); 
        
        // Create a Timer to update the progress bar
        Timer timer = new Timer(100, new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) { 
            	
            	
            	int x = progress.getValue();
                
                if (x == 100) {
                    
                    w.dispose();
                    WelcomeScreen.this.setVisible(true);
                    ((Timer) e.getSource()).stop(); 
                } else {
                    
                    progress.setValue(x + 4);
                }
            }
        });

        timer.start();
                
        w.setSize(400, 300);
        w.setLocationRelativeTo(null); 
        w.setVisible(true); 
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
    

		
	}

