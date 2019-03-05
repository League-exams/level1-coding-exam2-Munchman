import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Level1CodingExam2 implements ActionListener {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button1=new JButton("cow");
	JButton button2=new JButton("cat");
	JButton button3=new JButton("dog");
	JButton button4=new JButton("duck");
	JButton button5=new JButton("llama");
public static void main(String[] args) {
	
new Level1CodingExam2().runner();
}

void runner(){
	
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(button5);
	frame.pack();
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if(e.getSource()==button1) {
	playNoise("moo.wav");
}
if(e.getSource()==button2) {
	playNoise("meow.wav");
}
if(e.getSource()==button3) {
	playNoise("woof.wav");
}
if(e.getSource()==button4) {
	playNoise("quack.wav");
}
if(e.getSource()==button5) {
	playNoise("llama.wav");
}
		
	
}
public void playNoise(String soundFile) {
	try {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
		sound.play();
		Thread.sleep(3400);
	} catch (Exception ex) {
		ex.printStackTrace();
	}
}
}
