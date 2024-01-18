package Controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.*;
import View.dangnhap2;
import javax.swing.Action;
import javax.swing.JOptionPane;
import Model.thongtinbnModel;
import Model.thongtinDTModel;
import Model.NguoikedonModel;
import Model.Qlcapphatthuoc;

public class hanhdong implements Action{
	private dangnhap2 dangnhap2;
	public View.dangnhap2 View;  

	public hanhdong(View.dangnhap2 dangnhap2) {
		this.dangnhap2 = dangnhap2;
		this.View = dangnhap2;
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		JOptionPane.showMessageDialog((Component) View, "Bạn vừa nhấn vào: " + cm);
        if(cm.equals("Thêm")) {
        	this.View.xoaForm();
        	this.View.Model.setLuachon("Thêm ");
        } else if(cm.equals("Lưu")) {
        	try {
				String mabn = this.View.jt_mabn.getText();
				String tenbn = this.View.jt_tenbn.getText();
				String tuoi = this.View.jt_tuoi.getName();
				String diachi = this.View.jt_diachi.getText();
				String sdt = this.View.jt_sdt.getText();
				String diung = this.View.jt_diung.getText();
				
			    thongtinbnModel bn = new thongtinbnModel(mabn, tenbn, tuoi, diachi, sdt, diung);
			    this.View.themBNhoaccapnhat(bn);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
        }
        
}
	public void actionPerformed1(ActionEvent e) {
		String cm = e.getActionCommand();
		JOptionPane.showMessageDialog((Component) View, "Bạn vừa nhấn vào: " + cm);
        if(cm.equals("Thêm")) {
        	this.View.xoaForm();
        	this.View.Model.setLuachon("Thêm ");
        } else if(cm.equals("Lưu")) {
        	try {
				String maDT = this.View.jt_mabn.getText();
				String tenthuoc = this.View.jt_tenbn.getText();
				String loaithuoc = this.View.jt_tuoi.getName();
				String soluong = this.View.jt_diachi.getText();
				String hansudung = this.View.jt_sdt.getText();
				String ngaycap = this.View.jt_diung.getText();
				
			    thongtinDTModel dt = new thongtinDTModel(maDT, tenthuoc, loaithuoc, soluong, hansudung, ngaycap);
			    this.View.themBNhoaccapnhat(dt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
        }
        
	}
	
	public void actionPerformed2(ActionEvent e) {
		String cm = e.getActionCommand();
		JOptionPane.showMessageDialog((Component) View, "Bạn vừa nhấn vào: " + cm);
        if(cm.equals("Thêm")) {
        	this.View.xoaForm();
        	this.View.Model.setLuachon("Thêm ");
        } else if(cm.equals("Lưu")) {
        	try {
				String mabs = this.View.jt_mabn.getText();
				String tenbs = this.View.jt_tenbn.getText();
				String diachi = this.View.jt_tuoi.getName();
				String chuyenkhoa = this.View.jt_diachi.getText();
				String sdt = this.View.jt_sdt.getText();
			    thongtinbnModel bn = new thongtinbnModel(mabs, tenbs, diachi, chuyenkhoa, sdt);
			    this.View.themBNhoaccapnhat(bs);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
        }
        
	}
        
	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}
	}
