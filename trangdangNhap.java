import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.Checkbox;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class trangdangNhap {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trangdangNhap window = new trangdangNhap();
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
	public trangdangNhap() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(242, 208, 183));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Khách Sạn Bình Dương");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(192, 20, 267, 66);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(188, 110, 257, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tài Khoản");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(102, 117, 76, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mật Khẩu");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(102, 160, 76, 43);
		frame.getContentPane().add(lblNewLabel_2);
		
		Checkbox checkbox = new Checkbox(" ");
		checkbox.setBounds(202, 220, 22, 22);
		frame.getContentPane().add(checkbox);
		
		JLabel lblNewLabel_3 = new JLabel("Hiển Thị Mật Khẩu");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(230, 211, 193, 45);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(184, 258, 112, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Đăng ký");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(342, 258, 103, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(188, 166, 257, 34);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_imghotel_wrapp = new JLabel("");
		lblNewLabel_imghotel_wrapp.setIcon(new ImageIcon(trangdangNhap.class.getResource("/img/zzz-removebg-preview.png")));
		 
		Image img= new ImageIcon(this.getClass().getResource(" ")).getImage();
		lblNewLabel_imghotel_wrapp.setBounds(78, 20, 125, 86);
		frame.getContentPane().add(lblNewLabel_imghotel_wrapp);
		
		JLabel lblNewLabel_4 = new JLabel(" ");
		lblNewLabel_4.setIcon(new ImageIcon(trangdangNhap.class.getResource("/img/key-icon.png")));
		lblNewLabel_4.setBounds(46, 159, 46, 48);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(" ");
		lblNewLabel_5.setIcon(new ImageIcon(trangdangNhap.class.getResource("/img/Users-Name-icon.png")));
		lblNewLabel_5.setBounds(46, 85, 46, 58);
		frame.getContentPane().add(lblNewLabel_5);
		frame.setBounds(100, 100, 529, 366);
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
