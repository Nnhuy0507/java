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

public class dangnhap extends JFrame {
	public Component txtPassword;
	public Component chkShowPassword;
	public JLabel txtUsername;

	public dangnhap() {
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

        JTextField txtUsername = new JTextField(20);
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
}