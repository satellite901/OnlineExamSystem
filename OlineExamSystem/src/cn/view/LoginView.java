package cn.view;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JTextField;

import cn.bean.User;
import cn.biz.LoginBiz;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout.Group;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginView {

	private JFrame frame;
	private JTextField userName;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
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
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("\u767B\u5F55");
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 603, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);  //∆¡ƒªæ”÷–œ‘ æ
		
		
		userName = new JTextField();
		userName.setBounds(211, 170, 154, 21);
		frame.getContentPane().add(userName);
		userName.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(211, 215, 154, 21);
		frame.getContentPane().add(password);
		
		JLabel label = new JLabel("\u8D26  \u53F7\uFF1A");
		label.setBounds(147, 173, 54, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u5BC6  \u7801\uFF1A");
		label_1.setBounds(147, 216, 54, 18);
		frame.getContentPane().add(label_1);
		
		JRadioButton rbAdmin = new JRadioButton("\u7BA1\u7406\u5458\u767B\u5F55");
		rbAdmin.setBounds(94, 261, 107, 23);
		frame.getContentPane().add(rbAdmin);
		
		JRadioButton rdbTeacher = new JRadioButton("\u6559\u5E08\u767B\u5F55");
		rdbTeacher.setBounds(224, 261, 94, 23);
		frame.getContentPane().add(rdbTeacher);
		
		JRadioButton rdbStudent = new JRadioButton("\u5B66\u751F\u767B\u5F55");
		rdbStudent.setBounds(353, 261, 121, 23);
		frame.getContentPane().add(rdbStudent);
		
		JButton btLogin = new JButton("\u767B\u5F55");
		btLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginBiz login = new LoginBiz();
				User user =null;
				String uName=userName.getText().trim() ;
				String pWord=password.getText().trim();
				boolean isFlag = false;
				if(uName==null&&password==null){
					JOptionPane.showMessageDialog(null, "«Î ‰»Î’À∫≈∫Õ√‹¬Î£°");
					return;
				}
				else if(uName==null){
					JOptionPane.showMessageDialog(null, "«Î ‰»Î’À∫≈£°");
						return;
				}else if(password==null){
					JOptionPane.showMessageDialog(null, "«Î ‰»Î√‹¬Î£°");
					return;
				}
				
				if(rbAdmin.isSelected()){
					user =login.login(uName, pWord, 1);
					if(user!=null){	
					new AdminView(user).showWindow();
					
					isFlag = true;
					}else{
						JOptionPane.showMessageDialog(null, "’ÀªßªÚ√‹¬Î¥ÌŒÛ£°");
						return ;
					}
				}else if(rdbTeacher.isSelected()){	
					user =login.login(uName, pWord, 2);
					if(user!=null){
					new TeacherView(user).showWindow();
					 
					isFlag = true;
					}else{
						JOptionPane.showMessageDialog(null, "’ÀªßªÚ√‹¬Î¥ÌŒÛ!");
						return ;
					}

				}else if(rdbStudent.isSelected()){
					user =login.login(uName, pWord, 3);
					if(user!=null){
						new StudentView(user).showWindow();
						 
						isFlag = true;
					}else{
						JOptionPane.showMessageDialog(null, "’ÀªßªÚ√‹¬Î¥ÌŒÛ!");
						return ;
					}
				}
				if(isFlag){
					frame.setVisible(false);
					JOptionPane.showMessageDialog(null, user.getName()+"ª∂”≠ƒ˙£°");
				}
			}
		});
		btLogin.setBounds(410, 189, 76, 32);
		frame.getContentPane().add(btLogin);
		
		JLabel lblNewLabel = new JLabel("\u5FD8\u8BB0\u5BC6\u7801\u8BF7\u8054\u7CFB\u7BA1\u7406\u5458");
		lblNewLabel.setBounds(456, 341, 121, 15);
		frame.getContentPane().add(lblNewLabel);
		rbAdmin.setSelected(true);
		 ButtonGroup bg = new ButtonGroup();
		 bg.add(rbAdmin);
		 bg.add(rdbTeacher);
		 bg.add(rdbStudent);
		 
		 
		
	}
}
