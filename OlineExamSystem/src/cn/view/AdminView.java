package cn.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import cn.bean.User;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminView {

	private JFrame frame;
	private User user;

	/**
	 * Launch the application.
	 */
	public void showWindow(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminView window = new AdminView(user);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AdminView() {
		 
	}


	 
	/**
	 * @wbp.parser.constructor
	 */
	public AdminView(User user) {
		initialize();
		this.user = user;
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);  //∆¡ƒªæ”÷–œ‘ æ
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(107, 124, 54, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(user.getName());
			}
		});
		btnNewButton.setBounds(184, 120, 93, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
