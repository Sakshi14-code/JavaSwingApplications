package projects;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter two numbers :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(88, 11, 287, 46);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tf1.getText());
				int num2 = Integer.parseInt(tf2.getText());
				int sum = num1 + num2;
				lblNewLabel.setText("Good Job!!");
				JOptionPane.showMessageDialog(null,"The sum is : "+ sum);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 120, 215));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(10, 199, 75, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("First number :");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16));
		lblNewLabel_1.setBounds(82, 85, 103, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Second number :");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16));
		lblNewLabel_2.setBounds(82, 142, 103, 14);
		contentPane.add(lblNewLabel_2);
		
		tf1 = new JTextField();
		tf1.setBounds(220, 82, 136, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(220, 139, 136, 20);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tf1.getText());
				int num2 = Integer.parseInt(tf2.getText());
				int sub = num1 - num2;
				JOptionPane.showMessageDialog(null,"The difference is : "+sub);
			}
		});
		btnSubtract.setForeground(Color.WHITE);
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSubtract.setBackground(SystemColor.textHighlight);
		btnSubtract.setBounds(107, 199, 103, 23);
		contentPane.add(btnSubtract);
		
		JButton btnMultiply = new JButton("Multiply");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tf1.getText());
				int num2 = Integer.parseInt(tf2.getText());
				int mul = num1 * num2;
				JOptionPane.showMessageDialog(null,"The Multiplication is : "+mul);
			}
		});
		btnMultiply.setForeground(Color.WHITE);
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMultiply.setBackground(SystemColor.textHighlight);
		btnMultiply.setBounds(236, 199, 103, 23);
		contentPane.add(btnMultiply);
		
		JButton btnDivide = new JButton("Divide");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tf1.getText());
				int num2 = Integer.parseInt(tf2.getText());
				
				if(num2==0)
					JOptionPane.showMessageDialog(null,"Something went wrong!!");
				else {
					int div = num1/num2;
					JOptionPane.showMessageDialog(null,"The division is : "+div);
				}
				
			}
		});
		btnDivide.setForeground(Color.WHITE);
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDivide.setBackground(SystemColor.textHighlight);
		btnDivide.setBounds(349, 199, 75, 23);
		contentPane.add(btnDivide);
		
		
	}
}
