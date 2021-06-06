package projects;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DiscoLights extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiscoLights frame = new DiscoLights();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DiscoLights() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Thread t = new Thread(new Runnable() {
			public void run() {
				try {
					while(true) {
						getContentPane().setBackground(Color.RED);
						Thread.sleep(100);
						getContentPane().setBackground(Color.ORANGE);
						Thread.sleep(100);
						getContentPane().setBackground(Color.YELLOW);
						Thread.sleep(100);
						getContentPane().setBackground(Color.GREEN);
						Thread.sleep(100);
						getContentPane().setBackground(Color.BLUE);
						Thread.sleep(100);
						getContentPane().setBackground(Color.PINK);
						Thread.sleep(100);
						getContentPane().setBackground(Color.CYAN);
						Thread.sleep(100);
					}
				}
				catch(Exception e) {}
			}
		});
		t.start();
	}

}
