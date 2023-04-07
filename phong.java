import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class phong {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					phong window = new phong();
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
	public phong() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(242, 208, 183));
		frame.setBounds(100, 100, 1273, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPhng = new JButton("Phòng");
		btnPhng.setIcon(new ImageIcon(phong.class.getResource("/img/Shoji2-paper-sliding-door-icon.png")));
		btnPhng.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPhng.setBorderPainted(false);
		btnPhng.setBackground(new Color(242, 208, 183));
		btnPhng.setBounds(41, 35, 194, 48);
		frame.getContentPane().add(btnPhng);
		
		JPanel panel = new JPanel();
		panel.setBounds(31, 156, 1197, 523);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4,4));
		//		<html> <center> Phòng A01<br/>(VIP)<br/>Phòng Trống   </center></html>
				JButton btnNewButton_1 = new JButton("<html><div style='text-align: center;'>Phòng 101<br> <br>(Thường)  <br> <br> Phòng Trống</div></html>");
				btnNewButton_1.setBackground(new Color(153, 204, 153));
				panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("<html><div style='text-align: center;'>Phòng 102<br> <br>(Thường)  <br> <br> Phòng Trống</div></html>");
		btnNewButton_2.setBackground(new Color(153, 204, 153));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("<html><div style='text-align: center;'>Phòng 103<br> <br>(Thường)  <br> <br> Phòng Đã Có Khách</div></html>");
		btnNewButton_3.setBackground(new Color(224, 63, 63));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("<html><div style='text-align: center;'>Phòng 104<br> <br>(Thường)  <br> <br> Phòng Đang Sửa Chữa</div></html>");
		btnNewButton_4.setBackground(new Color(255, 255, 128));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_8 = new JButton("<html><div style='text-align: center;'>Phòng 201<br> <br>(Thường)  <br> <br> Phòng Đã Có Khách</div></html>");
		btnNewButton_8.setBackground(new Color(224, 63, 63));
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_5 = new JButton("<html><div style='text-align: center;'>Phòng 202<br> <br>(Thường)  <br> <br> Phòng Trống</div></html>");
		btnNewButton_5.setBackground(new Color(153, 204, 153));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_12 = new JButton("<html><div style='text-align: center;'>Phòng 203<br> <br>(Thường)  <br> <br> Phòng Trống</div></html>");
		btnNewButton_12.setBackground(new Color(153, 204, 153));
		panel.add(btnNewButton_12);
		
		JButton btnNewButton = new JButton("<html><div style='text-align: center;'>Phòng 204<br> <br>(Thường)  <br> <br> Phòng Trống</div></html>");
		btnNewButton.setBackground(new Color(153, 204, 153));
		panel.add(btnNewButton);
		
		JButton btnNewButton_10 = new JButton("<html><div style='text-align: center;'>Phòng 301<br> <br>(VIP)  <br> <br> Phòng Đã Có Khách</div></html>");
		btnNewButton_10.setBackground(new Color(224, 63, 63));
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("<html><div style='text-align: center;'>Phòng 302<br> <br>(VIP)  <br> <br> Phòng Đã Có Khách</div></html>");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11.setBackground(new Color(224, 63, 63));
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("<html><div style='text-align: center;'>Phòng 303<br> <br>(VIP)  <br> <br> Phòng Trống</div></html>");
		btnNewButton_13.setBackground(new Color(224, 63, 63));
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("<html><div style='text-align: center;'>Phòng 304<br> <br>(Thường)  <br> <br> Phòng Trống</div></html>");
		btnNewButton_14.setBackground(new Color(153, 204, 153));
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("<html><div style='text-align: center;'>Phòng 401<br> <br>(Thường)  <br> <br> Phòng Đang Sửa Chữa</div></html>");
		btnNewButton_15.setBackground(new Color(255, 255, 128));
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_2_1 = new JButton("<html><div style='text-align: center;'>Phòng 402<br> <br>(Thường)  <br> <br> Phòng Trống</div></html>");
		btnNewButton_2_1.setBackground(new Color(153, 204, 153));
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("<html><div style='text-align: center;'>Phòng 403<br> <br>(Thường)  <br> <br> Phòng Trống</div></html>");
		btnNewButton_2_1_1.setBackground(new Color(153, 204, 153));
		panel.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_2 = new JButton("<html><div style='text-align: center;'>Phòng 404<br> <br>(Thường)  <br> <br> Phòng Trống</div></html>");
		btnNewButton_2_1_2.setBackground(new Color(153, 204, 153));
		panel.add(btnNewButton_2_1_2);
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setBackground(new Color(177, 234, 162));
		lblNewLabel.setBounds(375, 24, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_16 = new JButton(" ");
		btnNewButton_16.setBackground(new Color(153, 204, 153));
		btnNewButton_16.setBounds(295, 55, 35, 14);
		frame.getContentPane().add(btnNewButton_16);
		
		JLabel lblNewLabel_1 = new JLabel("Phòng Trống");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(340, 49, 144, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_16_1 = new JButton(" ");
		btnNewButton_16_1.setBackground(new Color(255, 153, 153));
		btnNewButton_16_1.setBounds(511, 55, 35, 14);
		frame.getContentPane().add(btnNewButton_16_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Phòng Đã Có Khách");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(567, 49, 144, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton_16_2 = new JButton(" ");
		btnNewButton_16_2.setBackground(new Color(240, 245, 50));
		btnNewButton_16_2.setBounds(766, 58, 35, 14);
		frame.getContentPane().add(btnNewButton_16_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Phòng Đang Sửa Chữa");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(823, 49, 183, 23);
		frame.getContentPane().add(lblNewLabel_1_1_1);
	}
}
