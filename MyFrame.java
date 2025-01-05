import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button ;
	JLabel label;
	
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("mlt.png");
		ImageIcon icon2 = new ImageIcon("hq720.jpg");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 150, 300, 300);
		label.setVisible(false);
		
		//BROCODE LAYOUT KISMI DK 56DA KALDIN REİS
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
		button.setText("Baba yak");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.EAST);
		button.setFont(new Font("Arial",Font.ITALIC,25));
		button.setIconTextGap(-140); 
		button.setForeground(Color.red);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setTitle("Stock App");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(500,500);
		ImageIcon image = new ImageIcon("cartonbox.jpg");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);
		this.add(button);
		this.add(label);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			
			label.setVisible(true);
		}
		
	}
	

}
