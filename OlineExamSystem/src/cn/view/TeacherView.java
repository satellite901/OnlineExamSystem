package cn.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import cn.bean.User;

public class TeacherView {

	private JFrame frame;
	private User user;
	/**
	 * Launch the application.
	 */
	public void showWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherView window = new TeacherView(user);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TeacherView(){
		super();
	}
	/**
	 * @wbp.parser.constructor
	 */
	public TeacherView(User user ) {
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
		JLabel lblTeacher = new JLabel("Teacher");
		lblTeacher.setBounds(179, 127, 54, 15);
		frame.getContentPane().add(lblTeacher);
	}

}
