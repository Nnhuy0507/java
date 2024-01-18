package Test;


import javax.swing.SwingUtilities;

import Controller.DBController;
import Model.dangnhapModel;
import View.dangnhap2;
public class ThongTinDNtest {
	public static void main (String args []) {
		 try {
			SwingUtilities.invokeLater(dangnhap2::new);
			new DBController();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
}
}
