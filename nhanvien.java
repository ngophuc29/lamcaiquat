import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import java.awt.Scrollbar;
import java.awt.Choice;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class nhanvien {

	private JFrame frame;
	private JTable table;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nhanvien window = new nhanvien();
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
	public nhanvien() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(242, 208, 183));
		frame.setBounds(100, 100, 1206, 680);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Nhân viên");
		btnNewButton.setBounds(-14, 25, 243, 57);
		btnNewButton.setBackground(new Color(242, 208, 183));
		btnNewButton.setIcon(new ImageIcon(trangchu_home.class.getResource("/img/Administrator-icon.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		btnNewButton.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 93, 1066, 366);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setBorder(new LineBorder(Color.WHITE, 2));
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, "", null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 NV", "H\u1ECD V\u00E0 T\u00EAn", "S\u0110T", "CMND", "\u0110\u1ECBa Ch\u1EC9", "Ch\u1EE9c v\u1EE5", "Gi\u1EDBi T\u00EDnh", "Ng\u00E0y sinh", "Ng\u00E0y V\u00E0o L\u00E0m", "Tr\u1EA1ng Th\u00E1i L\u00E0m Vi\u1EC7c"
			}
		));
		table.setRowHeight(30);
		table.getColumnModel().getColumn(0).setPreferredWidth(81);
		table.getColumnModel().getColumn(0).setMinWidth(18);
		scrollPane.setViewportView(table);
		
		btnNewButton_1 = new JButton("Thêm ");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(190, 510, 127, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Xoá");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(404, 510, 127, 48);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Sửa");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(612, 510, 127, 48);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Lưu");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(816, 510, 127, 48);
		frame.getContentPane().add(btnNewButton_4);
		// sự kiện khi hover chuột vào và đổi màu jbutton
		btnNewButton.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		    	btnNewButton.setBackground(Color.white);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		    	btnNewButton.setBackground(Color(255, 153, 153));
		    }

			private Color Color(int i, int j, int k) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		
		
		// sự kiện khi hover chuột vào và đổi màu jbutton
				btnNewButton.addMouseListener(new MouseAdapter() {
				    @Override
				    public void mouseEntered(MouseEvent e) {
				    	btnNewButton.setBackground(Color.white);
				    }

				    @Override
				    public void mouseExited(MouseEvent e) {
				    	btnNewButton.setBackground(Color(255, 153, 153));
				    }

					private Color Color(int i, int j, int k) {
						// TODO Auto-generated method stub
						return null;
					}
				});
	}
}
