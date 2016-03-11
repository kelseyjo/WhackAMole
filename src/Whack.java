

import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JApplet;

public class Whack implements MouseListener{
	private static int ctr = 0;
	private JButton b1 = new JButton();
	private JButton b2 = new JButton();
	private JButton b3 = new JButton();
	private JButton b4 = new JButton();
	private JButton b5 = new JButton();
	private JButton b6 = new JButton();
	private JButton b7 = new JButton();
	private JButton b8 = new JButton();
	private JButton b9 = new JButton();
	private JButton b10 = new JButton();
	private JButton b11 = new JButton();
	private JButton b12 = new JButton();
	private JButton b13 = new JButton();
	private JButton b14 = new JButton();
	private JButton b15 = new JButton();
	private JButton b16 = new JButton();
	private JButton b17 = new JButton();
	private JButton b18 = new JButton();
	private JButton b19 = new JButton();
	private JButton b20 = new JButton();
	private JButton b21 = new JButton();
	private JButton b22 = new JButton();
	private JButton b23 = new JButton();
	private JButton b24 = new JButton();
	private JButton b25 = new JButton();
	public void run()
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.setSize(400, 400);
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.add(b1);
		b1.setBounds(10, 10, 90, 30);
		frame.add(b2);
		b2.setBounds(110, 10, 90, 30);
		frame.add(b3);
		b3.setBounds(220, 10, 90, 30);
		frame.add(b4);
		b4.setBounds(10, 50, 90, 30);
		frame.add(b5);
		b5.setBounds(110, 50, 90, 30);
		frame.add(b6);
		b6.setBounds(220, 50, 90, 30);
		frame.add(b7);
		b7.setBounds(10, 90, 90, 30);
		frame.add(b8);
		b8.setBounds(110, 90, 90, 30);
		frame.add(b9);
		b9.setBounds(220, 90, 90, 30);
		frame.add(b10);
		b10.setBounds(10, 130, 90, 30);
		frame.add(b11);
		b11.setBounds(110, 130, 90, 30);
		frame.add(b12);
		b12.setBounds(220, 130, 90, 30);
		frame.add(b13);
		b13.setBounds(10, 170, 90, 30);
		frame.add(b14);
		b14.setBounds(110, 170, 90, 30);
		frame.add(b15);
		b15.setBounds(220, 170, 90, 30);
		frame.add(b16);
		b16.setBounds(10, 210, 90, 30);
		frame.add(b17);
		b17.setBounds(110, 210, 90, 30);
		frame.add(b18);
		b18.setBounds(220, 210, 90, 30);
		frame.add(b19);
		b19.setBounds(10, 250, 90, 30);
		frame.add(b20);
		b20.setBounds(110, 250, 90, 30);
		frame.add(b21);
		b21.setBounds(220, 250, 90, 30);
		frame.add(b22);
		b22.setBounds(10, 290, 90, 30);
		frame.add(b23);
		b23.setBounds(110, 290, 90, 30);
		frame.add(b24);
		b24.setBounds(220, 290, 90, 30);
		frame.add(b25);//would only work if I had an extra button
		b25.setBounds(0, 0, 90, 30);
		
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		b3.addMouseListener(this);
		b4.addMouseListener(this);
		b5.addMouseListener(this);
		b6.addMouseListener(this);
		b7.addMouseListener(this);
		b8.addMouseListener(this);
		b9.addMouseListener(this);
		b10.addMouseListener(this);
		b11.addMouseListener(this);
		b12.addMouseListener(this);
		b13.addMouseListener(this);
		b14.addMouseListener(this);
		b15.addMouseListener(this);
		b16.addMouseListener(this);
		b17.addMouseListener(this);
		b18.addMouseListener(this);
		b19.addMouseListener(this);
		b20.addMouseListener(this);
		b21.addMouseListener(this);
		b22.addMouseListener(this);
		b23.addMouseListener(this);
		b24.addMouseListener(this);
		
		
		frame.setVisible(true);
		
	}
	
	public void drawButtons(int num)
	{
		if(num ==1)
			b1.setText("mole!");
		else if(num ==2)
			b2.setText("mole!");
		else if(num ==3)
			b3.setText("mole!");
		else if(num ==4)
			b4.setText("mole!");
		else if(num ==5)
			b5.setText("mole!");
		else if(num ==6)
			b6.setText("mole!");
		else if(num ==7)
			b7.setText("mole!");
		else if(num ==8)
			b8.setText("mole!");
		else if(num ==9)
			b9.setText("mole!");
		else if(num ==10)
			b10.setText("mole!");
		else if(num ==11)
			b11.setText("mole!");
		else if(num ==12)
			b12.setText("mole!");
		else if(num ==13)
			b13.setText("mole!");
		else if(num ==14)
			b14.setText("mole!");
		else if(num ==15)
			b15.setText("mole!");
		else if(num ==16)
			b16.setText("mole!");
		else if(num ==17)
			b17.setText("mole!");
		else if(num ==18)
			b18.setText("mole!");
		else if(num ==19)
			b19.setText("mole!");
		else if(num ==20)
			b20.setText("mole!");
		else if(num ==21)
			b21.setText("mole!");
		else if(num ==22)
			b22.setText("mole!");
		else if(num ==23)
			b23.setText("mole!");
		else if(num ==24)
			b24.setText("mole!");
		
	}
	public static void main (String[] args)
	{
		Date time = new Date(2016, 2, 10);
		Whack aMole = new Whack();
		int rand;
		
		rand = (int) (Math.random() *25 +1);
		aMole.drawButtons(rand);
		aMole.run();
		if(ctr == 10)
			endGame(time, ctr);
		
	}
	private static void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date(2016, 2, 10);
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}


	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton one = (JButton)e.getSource();
		if(one.getText().equals("mole!"))
		{
			playSound("moo.wav");
			ctr++;
			
		}
		else
			speak("dork");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
