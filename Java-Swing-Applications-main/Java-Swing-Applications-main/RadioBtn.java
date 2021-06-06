package projects;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class RadioBtn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioBtn frame = new RadioBtn();
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
	public RadioBtn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setBounds(55, 28, 315, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton b1 = new JRadioButton("Regular");
		b1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			}
		});
		b1.setBounds(55, 86, 109, 23);
		contentPane.add(b1);
		
		JRadioButton b2 = new JRadioButton("Bold");
		b2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textField.setFont(new Font("Times New Roman", Font.BOLD, 18));
			}
		});
		b2.setBounds(55, 126, 109, 23);
		contentPane.add(b2);
		
		JRadioButton b3 = new JRadioButton("Italic");
		b3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textField.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			}
		});
		b3.setBounds(55, 165, 109, 23);
		contentPane.add(b3);
		
		JRadioButton b4 = new JRadioButton("Bold & Italic");
		b4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textField.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 18));
			}
		});
		b4.setBounds(55, 206, 109, 23);
		contentPane.add(b4);
		
		ButtonGroup  btngrp = new ButtonGroup();
		btngrp.add(b1);
		btngrp.add(b2);
		btngrp.add(b3);
		btngrp.add(b4);
	}
}
