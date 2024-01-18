package View;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import Controller.hanhdong;
//import View.Quanlidn.benhnhandn;
import Model.Qlcapphatthuoc;
import Model.thongtinbnModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
//Giao diện bệnh nhân đăng nhập
class benhnhandn extends JFrame {
    public JTextField jt_mabn1;
    public JTextField jt_tenbn1;
    public JTextField jt_tuoi1;
    public JTextField jt_diachi1;
    public JTextField jt_sdt1;
    public JTextField jt_diung1;
    public JLabel jl_tenthuoc1;
    public JLabel jl_loaithuoc1;
    public JLabel jl_soluong1;
    public JLabel jl_hsd1;
    public JLabel jl_ngaycap1;
    public JTextField jt_tenthuoc1;
    public JTextField jt_hsd1;
    public Component jt_loaithuoc1;
    public Component jt_soluong1;
    public Component jt_ngaycap1;
    public JTextField jt_tuoi;
    public JTextField jt_tenbn;
    public JTextField jt_mabn;
    public JLabel jl_madt;
    public JTextField jt_madt;

	 public benhnhandn() {
	        super("Truy cập để xem cho người dùng");

	        this.setTitle("Thông tin của bạn");
	        this.setSize(600, 750);
	        this.setLocationRelativeTo(null);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JPanel container = new JPanel();
	    container.setLayout(new CardLayout());
	    
	    JPanel panel1 = new JPanel();
     panel1.setLayout(new GridLayout(6, 2, 10, 20)); 
     Border border1 = BorderFactory.createLineBorder(Color.PINK, 4);
	
		panel1.setBorder(border1);
		
		Font fontBN = new Font("Arial", Font.BOLD, 16);

		jl_madt = new JLabel("Mã đơn thuốc ");
		jl_madt.setFont(fontBN);
		jt_madt = new JTextField();
		
		jl_tenthuoc1 = new JLabel("Tên thuốc  ");
		jl_tenthuoc1.setFont(fontBN);
		
		jt_tenthuoc1 = new JTextField();
		jl_loaithuoc1 = new JLabel("Loại thuốc ");
		jl_loaithuoc1.setFont(fontBN);
		jt_loaithuoc1 = new JTextField();

		jl_soluong1 = new JLabel("Số lượng ");
		jl_soluong1.setFont(fontBN);
		jt_soluong1 = new JTextField();

		jl_hsd1 = new JLabel("Hạn sử dụng ");
		jl_hsd1.setFont(fontBN);
		jt_hsd1 = new JTextField();

		jl_ngaycap1 = new JLabel("Ngày cấp ");
		jl_ngaycap1.setFont(fontBN);
		jt_ngaycap1 = new JTextField();
		

		panel1.add(jl_tenthuoc1);
		panel1.add(jt_tenthuoc1);
		panel1.add(jl_loaithuoc1);
		panel1.add(jt_loaithuoc1);
		panel1.add(jl_soluong1);
		panel1.add(jt_soluong1);
		panel1.add(jl_hsd1);
		panel1.add(jt_hsd1);
		panel1.add(jl_ngaycap1);
		panel1.add(jt_ngaycap1);

		container.add(panel1, "panel1");
		panel1.setVisible(true);

		//panel2
	    JPanel panel2 = new JPanel();
	    Font fontDT = new Font("Arial", Font.BOLD, 20);
		panel2.setFont(fontDT);

		JLabel jl_mabs = new JLabel("Mã bác sĩ ");
		JTextField jt_mabs = new JTextField();
		
		JLabel jl_tenbs = new JLabel("Tên bác sĩ ");
		JTextField jt_tenbs = new JTextField();

		JLabel jl_chuyenkhoa = new JLabel("Chuyên khoa ");
		JTextField jt_chuyenkhoa = new JTextField();
		
		JLabel jl_sdt = new JLabel("Số điện thoại ");
		JTextField jt_sdt = new JTextField();
		
		JLabel jl_diachi = new JLabel("Địa chỉ ");
		JTextField jt_diachi = new JTextField();
		
		panel2.setLayout(new GridLayout(5, 2, 50, 20));
     Border border2 = BorderFactory.createLineBorder(Color.PINK, 4);
     panel2.setBorder(border2);
		
     panel2.add(jl_tenbs);
     panel2.add(jt_tenbs);
     panel2.add(jl_chuyenkhoa);
     panel2.add(jt_chuyenkhoa);
     panel2.add(jl_sdt);
     panel2.add(jt_sdt);
     panel2.add(jl_diachi);
     panel2.add(jt_diachi);
     panel2.add(jl_mabs);
     panel2.add(jt_mabs);
     
     panel2.setVisible(true);
	  
     container.add(panel2, "panel2");

     this.setLayout(new BorderLayout());
     this.add(container, BorderLayout.CENTER);

     JToolBar toolbar = new JToolBar("");

     JButton button1 = new JButton("Đơn thuốc");
     JButton button2 = new JButton("Bác sĩ kê đơn");

     toolbar.add(button1);
     toolbar.add(button2);

     this.getContentPane().add(toolbar, BorderLayout.NORTH);
     this.setVisible(true);

     button1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             CardLayout cardLayout = (CardLayout) container.getLayout();
             cardLayout.show(container, "panel1");
         }
     });

     button2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             CardLayout cardLayout = (CardLayout) container.getLayout();
             cardLayout.show(container, "panel2");
         }
     });
 }

}
	public class dangnhap2 extends JFrame {
		public Quanlidn quanlidn;
		public benhnhandn benhnhandn;
		public JTextField txtUsername;
		public JPasswordField txtPassword;
		public JCheckBox chkShowPassword;
        //public Action ac;
        public JTextField jt_mabn;
		public JTextField jt_tenbn;
		public JTextField jt_tuoi;
		public JTextField jt_diachi;
		public JTextField jt_sdt;
		public JTextField jt_diung;
		public JTable jt_benhnhan;
		public JTextField jt_tenthuoc;
		public JTextField jt_loaithuoc;
		public JTextField jt_soluong;
		public JTextField jt_hsd;
		public JTextField jt_ngaycap;
		public JButton jb_them;
		public JButton jb_sua;
		public JButton jb_xoa;
		public JButton jb_tim;
		public JTable jt_donthuoc;
		public JPanel jp_tren;
		public Border border;
		public JTable jt_ttbacsi;
		public JButton jb_luu;
        public Qlcapphatthuoc Model;
        public DefaultTableModel model_table;
        
	    public dangnhap2() {
	        super("Đăng Nhập");
	        
	        JPanel headerPanel = new JPanel();
	        headerPanel.setBackground(new Color(255, 182, 193));
	        headerPanel.setLayout(new BorderLayout());
	        
	        JLabel lblHeader = new JLabel("CẤP PHÁT THUỐC", SwingConstants.CENTER);
	        lblHeader.setFont(new Font("Arial", Font.BOLD, 22));
	        lblHeader.setForeground(Color.BLACK);
	        headerPanel.add(lblHeader, BorderLayout.CENTER);

	        JPanel panel = new JPanel(new GridLayout(5, 1, 10, 10));
	        panel.setBackground(new Color(255, 182, 193));
	        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

	        JLabel lblUsername = new JLabel("Mã bệnh nhân");
	        JLabel lblPassword = new JLabel("Mật khẩu");

	        txtUsername = new JTextField(20);
	        txtPassword = new JPasswordField(20);
	        chkShowPassword = new JCheckBox("Hiển thị mật khẩu");
	        chkShowPassword.setBackground(new Color(255, 182, 193));
	        chkShowPassword.addItemListener(new ItemListener() {
	            @Override
	            public void itemStateChanged(ItemEvent e) {
	                if (e.getStateChange() == ItemEvent.SELECTED) {
	                    txtPassword.setEchoChar((char) 0);
	                } else {
	                    txtPassword.setEchoChar('\u2022');
	                }
	            }
	        });

	        JButton btnQuanLy = new JButton("Quản lý");
	        btnQuanLy.setForeground(Color.BLACK);
	        btnQuanLy.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                loginQuanLy();
	            }
	        });

	        JButton btnLogin = new JButton("Người dùng");
	        btnLogin.setForeground(Color.BLACK);
	        btnLogin.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                loginUser();
	            }
	        });

	        JPanel btnPanel = new JPanel(new GridLayout(1, 2, 10, 0));
	        btnPanel.setBackground(new Color(255, 182, 193));
	        btnPanel.add(btnLogin);
	        btnPanel.add(btnQuanLy);

	        panel.add(lblUsername);
	        panel.add(txtUsername);
	        panel.add(lblPassword);
	        panel.add(txtPassword);
	        panel.add(chkShowPassword);
	        panel.add(btnPanel); 
	        
	        setLayout(new BorderLayout());
	        add(headerPanel, BorderLayout.NORTH);
	        add(panel, BorderLayout.CENTER);

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(500, 400);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    private void moquanli() {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new Quanlidn();
	            }
	        });
	    }

	    public void monguoidung() {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	            new benhnhandn();
	            
	            }
	            });
	        
	        }
	    

		private void loginUser() {
	        String username = txtUsername.getText();
	        char[] passwordChars = txtPassword.getPassword();
	        String password = new String(passwordChars);

	        if ("nguoidung".equals(username) && "123456".equals(password)) {
	            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
	            monguoidung();
	            dispose();
	        } else {
	            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại. Vui lòng thử lại.");
	            txtUsername.setText("");
	            txtPassword.setText("");
	        }
	    }

	    private void loginQuanLy() {
	        String username = txtUsername.getText();
	        char[] passwordChars = txtPassword.getPassword();
	        String password = new String(passwordChars);

	        if ("quanly".equals(username) && "123456".equals(password)) {
	            JOptionPane.showMessageDialog(this, "Đăng nhập quản lý thành công!");
	            moquanli();
	            dispose();
	        } else {
	            JOptionPane.showMessageDialog(this, "Đăng nhập quản lý thất bại. Vui lòng thử lại.");
	            txtUsername.setText("");
	            txtPassword.setText("");
	        }
	    }

		public void dangnhap2() {
			// TODO Auto-generated method stub
			
		}

		public void xoaForm() {
		}

		public void setLuachon(String string) {
			// TODO Auto-generated method stub

		}

		public void hienthiBNdachon() {
			// TODO Auto-generated method stub
			
		}

		public void themBNhoaccapnhat(thongtinbnModel bn) {
			// TODO Auto-generated method stub
			
		}
	}
//Giao diện quản lý đăng nhập
	//class Quanlidn extends JFrame {
	class Quanlidn extends dangnhap2 {
		
		public Quanlidn() {
		 JFrame frame = new JFrame("Thông tin");
		    frame.setSize(900, 700);
		    frame.setLocationRelativeTo(null);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    

		    JPanel container = new JPanel(new CardLayout());

		    JPanel panel1 = createPanel1();
		    JPanel panel2 = createPanel2();
		    JPanel panel3 = createPanel3();

		    container.add(panel1, "panel1");
		    container.add(panel2, "panel2");
		    container.add(panel3, "panel3");

		    JMenuBar menuBar = new JMenuBar();
		    JMenu menu = new JMenu("Menu");

		    JMenuItem menuItem1 = new JMenuItem("Thông tin cá nhân");
		    menuItem1.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            CardLayout cardLayout = (CardLayout) container.getLayout();
		            cardLayout.show(container, "panel1");
		        }
		    });
		    menu.add(menuItem1);

		    JMenuItem menuItem2 = new JMenuItem("Thông tin đơn thuốc");
		    menuItem2.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            CardLayout cardLayout = (CardLayout) container.getLayout();
		            cardLayout.show(container, "panel2");
		        }
		    });
		    menu.add(menuItem2);
		    JMenuItem menuItem3 = new JMenuItem("Thông tin bác sĩ");
		    menuItem3.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            CardLayout cardLayout = (CardLayout) container.getLayout();
		            cardLayout.show(container, "panel3");
		        }
		    });
		    
		    menu.add(menuItem3);

		    
		    menuBar.add(menu);
		    frame.setJMenuBar(menuBar);
		    frame.add(container);
		    frame.setVisible(true);
		    }
		    
		    private JPanel createPanel1() {
		    	JPanel panel1 = new JPanel();
		    	panel1.setLayout(new BorderLayout());
		    		
		    	ActionListener ac = new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					}
				};
		    		JPanel Jp_tren = new JPanel();
		    		Jp_tren.setLayout(new GridLayout(6,2,50,10));
		    		Border border = BorderFactory.createLineBorder(Color.PINK, 2);
		    		Jp_tren.setBorder(border);

		    		
		    		JLabel jl_mabn = new JLabel("Mã bệnh nhân ");
		    		jt_mabn = new JTextField();
		    		
		    		JLabel jl_tenbn = new JLabel("Họ và tên ");
		    		jt_tenbn = new JTextField();
		    		
		    		JLabel jl_tuoi = new JLabel("Tuổi ");
		    		jt_tuoi = new JTextField();
		    		
		    		JLabel jl_diachi = new JLabel("Địa chỉ ");
		    		jt_diachi = new JTextField();
		    		
		    		JLabel jl_sdt = new JLabel("Số điện thoại ");
		    		jt_sdt = new JTextField();
		    		
		    		JLabel jl_diung = new JLabel("Dị ứng thuốc (nếu có) ");
		    		jt_diung = new JTextField();
		    	
		    		Jp_tren.add(jl_mabn);
		    		Jp_tren.add(jt_mabn);
		    		
		    		Jp_tren.add(jl_tenbn);
		    		Jp_tren.add(jt_tenbn);
		    		
		    		Jp_tren.add(jl_tuoi);
		    		Jp_tren.add(jt_tuoi);
		    		
		    		Jp_tren.add(jl_diachi);
		    		Jp_tren.add(jt_diachi);
		    		
		    		Jp_tren.add(jl_sdt);
		    		Jp_tren.add(jt_sdt);
		    		
		    		Jp_tren.add(jl_diung);
		    		Jp_tren.add(jt_diung);
		    		
		    		
		    		JPanel Jp_giua = new JPanel();
		    		Jp_giua.setBackground(Color.pink);
		    		
		    		jb_them = new JButton("Thêm");
		    		jb_them.addActionListener(ac);
		    		jb_sua = new JButton("Sửa");
		    		jb_sua.addActionListener(ac);
		    		jb_xoa = new JButton("Xóa");
		    		jb_xoa.addActionListener(ac);
		    		jb_luu = new JButton("Lưu ");
		    		jb_luu.addActionListener(ac);
		    		jb_tim = new JButton("Tìm ");
		    		jb_tim.addActionListener(ac);
		    		
		    		Jp_giua.add(jb_them);
		    		Jp_giua.add(jb_sua);
		    		Jp_giua.add(jb_xoa);
		    		Jp_giua.add(jb_luu);
		    		Jp_giua.add(jb_tim);
		    		
		    		JPanel Jp_duoi = new JPanel(new BorderLayout());
		    		
		    		String[] columnNames = {"Mã bn", "Họ và tên", "tuổi", "Địa chỉ", "Số điện thoại", "Dị ứng thuốc(nếu có)"};
		    		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
		    		jt_benhnhan = new JTable(model);
		    		Object[] data = {"23it", "Hồ Trương Như Ý", "18","Huế", "0329466605", "không "};
		    		model.addRow(data);
		    		
		    		JScrollPane jscoll = new JScrollPane(jt_benhnhan);
		    		jscoll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		    		Jp_duoi.setBorder(border);
		    		
		    		Jp_duoi.add(jscoll,BorderLayout.CENTER);
		    		
		    		panel1.add(Jp_tren,BorderLayout.NORTH);
		    		panel1.add(Jp_giua,BorderLayout.CENTER);
		    		panel1.add(Jp_duoi,BorderLayout.SOUTH);
		    		
		    		//panel1.add(jp_benngoai);
		    		panel1.setVisible(true);
					return panel1;
		    		}
		    

		    private JPanel createPanel2() {
		    	JPanel panel2 = new JPanel();
		    	panel2.setLayout(new BorderLayout());
		        
                 ActionListener ac = new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					}
				};
		        JLabel jl_donthuoc = new JLabel();
		        Font fontDT = new Font("Arial", Font.BOLD, 25);
		        jl_donthuoc.setFont(fontDT);
		        panel2.add(jl_donthuoc, BorderLayout.NORTH);

		        JPanel Jp_tren = new JPanel();
		        Jp_tren.setLayout(new GridLayout(6, 2, 50, 20));
		        Border border = BorderFactory.createLineBorder(Color.PINK, 2);
		        Jp_tren.setBorder(border);
		        

		        JLabel jl_madt = new JLabel("Mã đơn thuốc ");
		        JTextField jt_madt = new JTextField();

		        JLabel jl_tenthuoc = new JLabel("Tên thuốc  ");
		        jt_tenthuoc = new JTextField();

		        JLabel jl_loaithuoc = new JLabel("Loại thuốc ");
		        jt_loaithuoc = new JTextField();

		        JLabel jl_soluong = new JLabel("Số lượng ");
		        jt_soluong = new JTextField();

		        JLabel jl_hsd = new JLabel("Hạn sử dụng ");
		        jt_hsd = new JTextField();

		        JLabel jl_ngaycap = new JLabel("Ngày cấp ");
		        jt_ngaycap = new JTextField();

		        Jp_tren.add(jl_madt);
		        Jp_tren.add(jt_madt);
		        
		        Jp_tren.add(jl_tenthuoc);
		        Jp_tren.add(jt_tenthuoc);

		        Jp_tren.add(jl_loaithuoc);
		        Jp_tren.add(jt_loaithuoc);

		        Jp_tren.add(jl_soluong);
		        Jp_tren.add(jt_soluong);

		        Jp_tren.add(jl_hsd);
		        Jp_tren.add(jt_hsd);

		        Jp_tren.add(jl_ngaycap);
		        Jp_tren.add(jt_ngaycap);

		        JPanel Jp_giua = new JPanel();
		        Jp_giua.setBackground(Color.pink);

		        jb_them = new JButton("Thêm");
		        jb_them.addActionListener(ac);
		        jb_sua = new JButton("Sửa");
		        jb_sua.addActionListener(ac);
		        jb_xoa = new JButton("Xóa");
		        jb_xoa.addActionListener(ac);
		        jb_luu = new JButton("Lưu");
		        jb_luu.addActionListener(ac);
		        jb_tim = new JButton("Tìm");
		        jb_tim.addActionListener(ac);

		        Jp_giua.add(jb_them);
		        Jp_giua.add(jb_sua);
		        Jp_giua.add(jb_xoa);
		        Jp_giua.add(jb_luu);
		        Jp_giua.add(jb_tim);

		        JPanel Jp_duoi = new JPanel(new BorderLayout());

		        String[] columnNames = {"Mã đơn thuốc","Tên thuốc", "Loại thuốc", "Số lượng", "Hạn sử dụng", "Ngày cấp"};
		        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
		        jt_donthuoc = new JTable(model);
		        Object[] data = {"a31","acdh", "loại a", "18", "23/12/2023", "12/12"};
		        model.addRow(data);
		    	
		    	JScrollPane jscoll = new JScrollPane(jt_donthuoc);
		    	jscoll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		    	Jp_duoi.setBorder(border);

		    	Jp_duoi.add(jscoll, BorderLayout.CENTER);

		    	panel2.add(Jp_tren, BorderLayout.NORTH);
		    	panel2.add(Jp_giua, BorderLayout.CENTER);
		    	panel2.add(Jp_duoi, BorderLayout.SOUTH);

		        panel2.setVisible(true);
		        
		        return panel2;
		    
		}
		    private JPanel createPanel3() {
		    	JPanel panel3 = new JPanel();
		    	panel3.setLayout(new BorderLayout());
		    	
		    	 ActionListener ac = new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
						}
					};
					
				jp_tren = new JPanel();
				JLabel jl_ttbacsi = new JLabel();
				Font fontDT = new Font("Arial", Font.BOLD, 25);
				jp_tren.setFont(fontDT);
				panel3.add(jp_tren,BorderLayout.NORTH);

				JLabel jl_mabs = new JLabel("Mã bác sĩ ");
				JTextField jt_mabs = new JTextField();
				
				JLabel jl_tenbs = new JLabel("Tên bác sĩ ");
				JTextField jt_tenbs = new JTextField();
				
				JLabel jl_chuyenkhoa = new JLabel("Chuyên khoa ");
				JTextField jt_chuyenkhoa = new JTextField();
				
				JLabel jl_sdt = new JLabel("Số điện thoại ");
				JTextField jt_sdt = new JTextField();
				
				JLabel jl_diachi = new JLabel("Địa chỉ ");
				JTextField jt_diachi = new JTextField();
				
				jp_tren = new JPanel();
				jp_tren.setLayout(new GridLayout(5, 2, 50, 20));
		        Border border = BorderFactory.createLineBorder(Color.PINK, 2);
		        jp_tren.setBorder(border);
				
				jp_tren.add(jl_tenbs);
				jp_tren.add(jt_tenbs);
				jp_tren.add(jl_chuyenkhoa);
				jp_tren.add(jt_chuyenkhoa);
				jp_tren.add(jl_sdt);
				jp_tren.add(jt_sdt);
				jp_tren.add(jl_diachi);
				jp_tren.add(jt_diachi);
				jp_tren.add(jl_mabs);
				jp_tren.add(jt_mabs);
				
				JPanel Jp_giua = new JPanel();
		        Jp_giua.setBackground(Color.pink);

		        jb_them = new JButton("Thêm");
		        jb_them.addActionListener(ac);
		        jb_sua = new JButton("Sửa");
		        jb_sua.addActionListener(ac);
		        jb_xoa = new JButton("Xóa");
		        jb_xoa.addActionListener(ac);
				jb_luu = new JButton("Lưu");
		        jb_luu.addActionListener(ac);
		        jb_tim = new JButton("Tìm");
		        jb_tim.addActionListener(ac);

		        Jp_giua.add(jb_them);
		        Jp_giua.add(jb_sua);
		        Jp_giua.add(jb_xoa);
		        Jp_giua.add(jb_luu);
		        Jp_giua.add(jb_tim);
				
		        JPanel Jp_duoi = new JPanel(new BorderLayout());

		        String[] columnNames = {"Mã bs","Tên bác sĩ", "Chuyên khoa", "Số điện thoại","Địa chỉ"};
		        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
		        jt_ttbacsi = new JTable(model);
		        Object[] data = {"a23","Phạm N T Linh", "Khoa thần kinh", "0123456", "Huế"};
		        model.addRow(data);
		    	
		    	JScrollPane jscoll = new JScrollPane(jt_ttbacsi);
		    	jscoll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		    	Jp_duoi.setBorder(border);

		    	Jp_duoi.add(jscoll, BorderLayout.CENTER);
		    	
		    	panel3.add(jp_tren, BorderLayout.NORTH);
		    	panel3.add(Jp_giua, BorderLayout.CENTER);
		    	panel3.add(Jp_duoi, BorderLayout.SOUTH);
		    	
				panel3.setVisible(true);
				
				return panel3;
	}
 	
	public void xoaForm() {
		jt_mabn.setText("");
		jt_tenbn.setText("");
		jt_tuoi.setText("");
		jt_diachi.setText("");
		jt_sdt.setText("");
		jt_diung.setText("");
		
//		jt_tenthuoc.setText("");
//		jt_loaithuoc.setText("");
//		jt_soluong.setText("");
//		jt_hsd.setText("");
//		jt_ngaycap.setText("");
	}

	public void themBNhoaccapnhat(thongtinbnModel bn) {
		if(!this.Model.kiemtratontai(bn)) {
		this.Model.insert(bn);
		DefaultTableModel model_table = (DefaultTableModel) jt_benhnhan.getModel();
		model_table.addRow(new Object[] {bn.getMabn()+"",
				bn.getTenbn()+"" ,
				bn.getTuoi()+"" ,
				bn.getDiachi()+"" ,
				bn.sdt+"" ,
				bn.getDiung()
				});
	}else {
		this.Model.update(bn);
		int soluongdong = model_table.getRowCount();
		for(int i=0; i < soluongdong; i++) {
		   String ma = model_table.getValueAt(i, 0)+"";
		   if(ma.equals(bn.getMabn()+"")) {
			   model_table.setValueAt(bn.getMabn()+"",i,0);
			   model_table.setValueAt(bn.getTenbn()+"",i,1);
			   model_table.setValueAt(bn.getTuoi()+"",i,2);
			   model_table.setValueAt(bn.getDiachi()+"",i,3);
			   model_table.setValueAt(bn.getSdt()+"",i,4);
			   model_table.setValueAt(bn.getDiung()+"",i,5);
			   
		   }
		}
	}
	}
	public void hienthiBNdachon() {
		DefaultTableModel model_table = (DefaultTableModel) jt_benhnhan.getModel();
		int i_row = jt_benhnhan.getSelectedRow();
		model_table.getValueAt(i_row, 0);
		
		String mabn = model_table.getValueAt(i_row, 0)+"";
		String tenbn = model_table.getValueAt(i_row, 1)+"";
		String tuoi = model_table.getValueAt(i_row, 2)+"";
		String diachi = model_table.getValueAt(i_row, 3)+"";
		String sdt = model_table.getValueAt(i_row, 4)+"";
		String diung = model_table.getValueAt(i_row, 5)+"";
		
	    //thongtinbnModel bn = new thongtinbnModel(mabn, tenbn, tuoi, diachi, sdt, diung);
		this.jt_mabn.setText(mabn+"");
		this.jt_tenbn.setText(tenbn+"");
		this.jt_tuoi.setText(tuoi+"");
		this.jt_diachi.setText(diachi+"");
		this.jt_sdt.setText(sdt+"");
		this.jt_diung.setText(diung+"");
	}
	}

