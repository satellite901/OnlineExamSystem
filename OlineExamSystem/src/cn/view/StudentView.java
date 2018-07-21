package cn.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import cn.bean.User;

public class StudentView {

	private JFrame frame;
	private User user;

	/**
	 * Launch the application.
	 */
	public void showWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentView window = new StudentView(user);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public StudentView(){
		super();
	}
	/**
	 * @wbp.parser.constructor
	 */
	public StudentView(User user) {
		this.user = user;
		initialize();
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
		JLabel lblStudent = new JLabel("Student");
		lblStudent.setBounds(176, 116, 54, 15);
		frame.getContentPane().add(lblStudent);
	}

}
