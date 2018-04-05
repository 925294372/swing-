package com.zl.page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JLabel text1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(74, 50, 54, 15);
		contentPane.add(label);

		usernameField = new JTextField();
		usernameField.setBounds(138, 47, 171, 21);
		contentPane.add(usernameField);
		usernameField.setColumns(10);

		JLabel label_1 = new JLabel("\u5BC6  \u7801");
		label_1.setBounds(74, 89, 54, 15);
		contentPane.add(label_1);

		JButton button = new JButton("\u767B\u5F55");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String username = usernameField.getText();
				String password = new String(passwordField.getPassword());

				// TODO �������û����������ж��û�״̬��0��ʾ����Ա��1��ʾ��ͨ�û���2��ʾ�û������������
				int t = 0;
				switch (t) {
				case 0:
					
					break;
				case 1:
					
					break;
				case 2:
					text1.setVisible(true);
					break;
				default:
					break;
				}
			}
		});
		button.setBounds(138, 147, 93, 23);
		contentPane.add(button);

		passwordField = new JPasswordField();
		passwordField.setBounds(138, 86, 171, 21);
		contentPane.add(passwordField);
		
		text1 = new JLabel("\u7528\u6237\u540D\u6216\u5BC6\u7801\u9519\u8BEF");
		text1.setVisible(false);
		text1.setForeground(Color.RED);
		text1.setBounds(198, 116, 111, 15);
		contentPane.add(text1);
	}
}
