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

public class khachhang {

	private JFrame frame;
	private JTable tableKH;
	private JButton btnKhchHng;
	private JButton btnNewButton;
	private JButton btnXa;
	private JButton btnSa;
	private JButton btnLu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					khachhang window = new khachhang();
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
	public khachhang() {
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
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(76, 82, 1031, 449);
		frame.getContentPane().add(scrollPane);
		
		tableKH = new JTable();
		tableKH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tableKH.setBorder(new LineBorder(Color.WHITE, 2));
		tableKH.setBackground(Color.WHITE);
		tableKH.setModel(new DefaultTableModel(
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
				"M\u00E3 Kh", "H\u1ECD V\u00E0 T\u00EAn", "S\u0110T", "CMND", "Email", "Ng\u00E0y Thu\u00EA", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "Lo\u1EA1i Kh\u00E1ch", "S\u1ED1 Ph\u00F2ng"
			}
		));
		scrollPane.setViewportView(tableKH);
		tableKH.setRowHeight(30);
		btnKhchHng = new JButton("Khách Hàng");
		btnKhchHng.setIcon(new ImageIcon(khachhang.class.getResource("/img/man-icon.png")));
		btnKhchHng.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnKhchHng.setBorderPainted(false);
		btnKhchHng.setBackground(new Color(242, 208, 183));
		btnKhchHng.setBounds(10, 23, 194, 48);
		frame.getContentPane().add(btnKhchHng);
		
		btnNewButton = new JButton("Thêm");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(198, 542, 109, 67);
		frame.getContentPane().add(btnNewButton);
		
		btnXa = new JButton("xóa");
		btnXa.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnXa.setBounds(430, 542, 109, 67);
		frame.getContentPane().add(btnXa);
		
		btnSa = new JButton("Sửa");
		btnSa.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSa.setBounds(668, 542, 109, 67);
		frame.getContentPane().add(btnSa);
		
		btnLu = new JButton("Lưu");
		btnLu.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLu.setBounds(876, 542, 109, 67);
		frame.getContentPane().add(btnLu);
	}
}
