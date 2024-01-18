package Model;

import java.sql.Date;

public class thongtinbnModel {
	public static String mabn;
	public String tenbn;	
	public String tuoi;
	public String diachi;
	public String sdt;
	public String diung;
	
	public thongtinbnModel(String mabn, String tenbn, String tuoi, String diachi, String sdt, String diung) {
	}

	public String getDiung() {
		return diung;
	}

	public String getTuoi() {
		return tuoi;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}

	public void setDiung(String diung) {
		this.diung = diung;
	}

	public static String getMabn() {
		return mabn;
	}

	public void setMabn(String mabn) {
		this.mabn = mabn;
	}

	public String getTenbn() {
		return tenbn;
	}

	public void setTenbn(String tenbn) {
		this.tenbn = tenbn;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiungthuoc() {
		return diung;
	}

	public void setDiungthuoc(String diungthuoc) {
		this.diung= diungthuoc;
	}

	@Override
	public String toString() {
		return "thongtinbnModel [mabn=" + mabn + ", tenbn=" + tenbn + ", diachi=" + diachi + ", sdt=" + sdt
				+ ", diungthuoc=" + diung + "]";
	}
	

}
