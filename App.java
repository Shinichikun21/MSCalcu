import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBackground(new Color(0, 0, 0));
		frame.setForeground(new Color(255, 128, 128));
		frame.setBounds(100, 100, 625, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 255));
		panel.setForeground(new Color(64, 128, 128));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 589, 388);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setForeground(new Color(0, 0, 0));
		txt1.setHorizontalAlignment(SwingConstants.CENTER);
		txt1.setBounds(218, 89, 170, 20);
		panel.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Milestone 1");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(73, 89, 118, 17);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Milestone 2");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(73, 129, 118, 17);
		panel.add(lblNewLabel_1);
		
		txt2 = new JTextField();
		txt2.setHorizontalAlignment(SwingConstants.CENTER);
		txt2.setColumns(10);
		txt2.setBounds(218, 129, 170, 20);
		panel.add(txt2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Milestone 3");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(73, 168, 118, 17);
		panel.add(lblNewLabel_1_1);
		
		txt3 = new JTextField();
		txt3.setHorizontalAlignment(SwingConstants.CENTER);
		txt3.setColumns(10);
		txt3.setBounds(218, 168, 170, 20);
		panel.add(txt3);
		
		JLabel lblNewLabel_2 = new JLabel("MS Calculator");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(218, 29, 155, 25);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TOTAL");
		lblNewLabel_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(133, 211, 118, 17);
		panel.add(lblNewLabel_1_1_1);
		
		txt4 = new JTextField();
		txt4.setHorizontalAlignment(SwingConstants.CENTER);
		txt4.setColumns(10);
		txt4.setBounds(239, 211, 108, 20);
		panel.add(txt4);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float MS1 =Float.parseFloat(txt1.getText());
				float MS2 = Float.parseFloat(txt2.getText());
				float MS3 = Float.parseFloat(txt3.getText());
				float tot = MS1 + MS2 +MS3;
				txt4.setText(String.valueOf(tot));
				
				
				if(Float.parseFloat(txt1.getText()) > 25||Float.parseFloat(txt2.getText()) > 25 || Float.parseFloat(txt3.getText()) > 50) {
					txt1.setText("Maximum value for MS1 is 25");
					txt2.setText("Maximum value for MS2 is 25");
					txt3.setText("Maximum value for MS1 is 50");
					txt4.setText("There's an error!");
					
				}
				else if(Float.parseFloat(txt1.getText()) < 0||Float.parseFloat(txt2.getText()) < 0 || Float.parseFloat(txt3.getText()) < 0) {
					JOptionPane.showMessageDialog(panel,"The value should not be less than 0");
				}
				else {}
			
			
			}});
		btnNewButton.setBounds(409, 102, 89, 31);
		panel.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(255, 255, 255));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
				txt4.setText("");
				txt1.requestFocus();
			}
		});
		btnClear.setBounds(409, 163, 89, 31);
		panel.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(255, 255, 255));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(249, 246, 89, 31);
		panel.add(btnExit);
	
}}
