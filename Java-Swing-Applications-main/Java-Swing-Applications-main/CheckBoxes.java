package projects;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckBoxes extends JFrame {
	boolean noodles = false,bur=false,piz=false,fish=false;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-2,359
	 */
	private final JCheckBox checkBox = new JCheckBox("New check box");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					CheckBoxes frame = new CheckBoxes();
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
	public CheckBoxes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose your favourite dish");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 19));
		lblNewLabel.setBounds(118, 24, 199, 21);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Noodles");
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					noodles=true;
				}else
					noodles=false;
			}
		});
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxNewCheckBox.setBackground(new Color(123, 104, 238));
		chckbxNewCheckBox.setBounds(56, 88, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Burger");
		chckbxNewCheckBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					bur=true;
				}else
					bur=false;
			}
		});
		chckbxNewCheckBox_1.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxNewCheckBox_1.setBackground(new Color(123, 104, 238));
		chckbxNewCheckBox_1.setBounds(245, 88, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Pizza");
		chckbxNewCheckBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					piz=true;
				}else
					piz=false;
			}
		});
		chckbxNewCheckBox_2.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxNewCheckBox_2.setBackground(new Color(123, 104, 238));
		chckbxNewCheckBox_2.setBounds(56, 147, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Fish");
		chckbxNewCheckBox_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					fish=true;
				}else
					fish=false;
			}
		});
		chckbxNewCheckBox_3.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxNewCheckBox_3.setBackground(new Color(123, 104, 238));
		chckbxNewCheckBox_3.setBounds(245, 147, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(new Color(240, 255, 240));
		btnNewButton.setBackground(new Color(139, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "You like ";
				if(noodles==true)
				msg+="Noodles ";
				if(bur==true)
					msg+="Burger ";
				if(piz==true)
					msg+="Pizza";
				if(fish==true)
					msg+="Fish";
				JOptionPane.showMessageDialog(null,msg);
			}
		});
		btnNewButton.setBounds(174, 212, 89, 23);
		contentPane.add(btnNewButton);
	}
}
