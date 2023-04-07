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

public class trangchu_home {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trangchu_home window = new trangchu_home();
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
	public trangchu_home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(242, 208, 183));
		frame.setBounds(100, 100, 1400, 731);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Khách Sạn Bình Dương");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(40, 11, 306, 80);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Nhân viên");
		btnNewButton.setBackground(new Color(242, 208, 183));
		btnNewButton.setIcon(new ImageIcon(trangchu_home.class.getResource("/img/Administrator-icon.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(46, 188, 194, 48);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(307, 154, 1, 1);
		frame.getContentPane().add(table);
		
		JButton btnKhchHng = new JButton("Khách Hàng");
		btnKhchHng.setIcon(new ImageIcon(trangchu_home.class.getResource("/img/man-icon.png")));
		btnKhchHng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKhchHng.setBorderPainted(false);
		btnKhchHng.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnKhchHng.setBackground(new Color(242, 208, 183));
		btnKhchHng.setBounds(46, 287, 194, 48);
		frame.getContentPane().add(btnKhchHng);
		
		JButton btnPhng = new JButton("Phòng");
		btnPhng.setIcon(new ImageIcon(trangchu_home.class.getResource("/img/Shoji2-paper-sliding-door-icon.png")));
		btnPhng.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPhng.setBackground(new Color(242, 208, 183));
		btnPhng.setBounds(46, 381, 194, 48);
		frame.getContentPane().add(btnPhng);
		btnPhng.setBorderPainted(false);
		
		
		JButton btnDchV = new JButton("Dịch Vụ");
		btnDchV.setIcon(new ImageIcon(trangchu_home.class.getResource("/img/Household-Bell-Service-icon.png")));
		btnDchV.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDchV.setBackground(new Color(242, 208, 183));
		btnDchV.setBounds(46, 477, 194, 48);
		frame.getContentPane().add(btnDchV);
		

		btnDchV.setBorderPainted(false);
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
		
		JButton btnThngK = new JButton("Thống kê");
		btnThngK.setIcon(new ImageIcon(trangchu_home.class.getResource("/img/Numbers-icon.png")));
		btnThngK.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnThngK.setBackground(new Color(242, 208, 183));
		btnThngK.setBounds(56, 573, 184, 48);
		frame.getContentPane().add(btnThngK);
		btnThngK.setBorderPainted(false);
		
		JButton btnHome = new JButton("Home");
		btnHome.setIcon(new ImageIcon(trangchu_home.class.getResource("/img/home-icon.png")));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnHome.setBorderPainted(false);
		btnHome.setBackground(new Color(242, 208, 183));
		btnHome.setBounds(50, 102, 194, 48);
		frame.getContentPane().add(btnHome);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(652, 246, -78, -70);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(255, 153, 153));
		lblNewLabel_1.setIcon(new ImageIcon(trangchu_home.class.getResource("/img/homeslidehmm.png")));
		lblNewLabel_1.setBounds(273, 77, 1101, 544);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
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
				btnKhchHng.addMouseListener(new MouseAdapter() {
				    @Override
				    public void mouseEntered(MouseEvent e) {
				    	btnKhchHng.setBackground(Color.white);
				    }

				    @Override
				    public void mouseExited(MouseEvent e) {
				    	btnKhchHng.setBackground(Color(255, 153, 153));
				    }

					private Color Color(int i, int j, int k) {
						// TODO Auto-generated method stub
						return null;
					}
				});
				btnPhng.addMouseListener(new MouseAdapter() {
				    @Override
				    public void mouseEntered(MouseEvent e) {
				    	btnPhng.setBackground(Color.white);
				    }

				    @Override
				    public void mouseExited(MouseEvent e) {
				    	btnPhng.setBackground(Color(255, 153, 153));
				    }

					private Color Color(int i, int j, int k) {
						// TODO Auto-generated method stub
						return null;
					}
				});
				btnDchV.addMouseListener(new MouseAdapter() {
				    @Override
				    public void mouseEntered(MouseEvent e) {
				    	btnDchV.setBackground(Color.white);
				    }

				    @Override
				    public void mouseExited(MouseEvent e) {
				    	btnDchV.setBackground(Color(255, 153, 153));
				    }

					private Color Color(int i, int j, int k) {
						// TODO Auto-generated method stub
						return null;
					}
				});
				btnThngK.addMouseListener(new MouseAdapter() {
				    @Override
				    public void mouseEntered(MouseEvent e) {
				    	btnThngK.setBackground(Color.white);
				    }

				    @Override
				    public void mouseExited(MouseEvent e) {
				    	btnThngK.setBackground(Color(255, 153, 153));
				    }

					private Color Color(int i, int j, int k) {
						// TODO Auto-generated method stub
						return null;
					}
				});
	}
}
