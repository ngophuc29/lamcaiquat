import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class dichvu {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dichvu window = new dichvu();
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
	public dichvu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(242, 208, 183));
		frame.getContentPane().setLayout(null);
		
		JButton btnDchV = new JButton("Dịch Vụ");
		btnDchV.setIcon(new ImageIcon(dichvu.class.getResource("/img/Household-Bell-Service-icon.png")));
		btnDchV.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDchV.setBorderPainted(false);
		btnDchV.setBackground(new Color(242, 208, 183));
		btnDchV.setBounds(10, 23, 194, 48);
		frame.getContentPane().add(btnDchV);
		
		JLabel lblNewLabel = new JLabel("Mã Dịch Vụ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(56, 83, 185, 30);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(53, 124, 188, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTnDchV = new JLabel("Tên Dịch Vụ");
		lblTnDchV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTnDchV.setBounds(56, 165, 185, 30);
		frame.getContentPane().add(lblTnDchV);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(53, 206, 188, 30);
		frame.getContentPane().add(textField_1);
		
		JLabel lblPhDchV = new JLabel("Phí Dịch Vụ");
		lblPhDchV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhDchV.setBounds(56, 261, 185, 30);
		frame.getContentPane().add(lblPhDchV);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(53, 302, 188, 30);
		frame.getContentPane().add(textField_2);
		
		JLabel lblTrngThi = new JLabel("Trạng Thái");
		lblTrngThi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTrngThi.setBounds(56, 353, 185, 30);
		frame.getContentPane().add(lblTrngThi);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hỗ trợ");
		rdbtnNewRadioButton.setBackground(new Color(242, 208, 183));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(56, 390, 90, 36);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNgngHotng = new JRadioButton("Ngừng Hoạt Động");
		rdbtnNgngHotng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNgngHotng.setBackground(new Color(242, 208, 183));
		rdbtnNgngHotng.setBounds(147, 390, 148, 36);
		frame.getContentPane().add(rdbtnNgngHotng);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(56, 433, 89, 48);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXa.setBounds(168, 433, 89, 48);
		frame.getContentPane().add(btnXa);
		
		JButton btnSa = new JButton("Sửa");
		btnSa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSa.setBounds(56, 503, 89, 48);
		frame.getContentPane().add(btnSa);
		
		JButton btnLu = new JButton("Lưu");
		btnLu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLu.setBounds(168, 503, 89, 48);
		frame.getContentPane().add(btnLu);
		
		JLabel lblNewLabel_1 = new JLabel("Tìm Kiếm");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(307, 48, 99, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(416, 40, 585, 31);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Tìm ");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(1036, 39, 89, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Hủy");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1.setBounds(1158, 39, 89, 32);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(295, 124, 984, 495);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"M\u00E3 D\u1ECBch V\u1EE5", "T\u00EAn D\u1ECBch V\u1EE5", "Ph\u00ED D\u1ECBch V\u1EE5", "Tr\u1EA1ng Th\u00E1i"
			}
		));
		table.setRowHeight(30);
		scrollPane.setViewportView(table);
		frame.setBounds(100, 100, 1328, 695);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
