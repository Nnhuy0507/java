package Model;

public class thongtinDTModel {
	public String maDT;
	public String tenthuoc;
	public String loaithuoc;
	public String soluong;
	public String ngaycap;
	public String hansudung;
	
	public thongtinDTModel() {
	}
	public String getMaDT() {
		return maDT;
	}
	public void setMaDT(String maDT) {
		this.maDT = maDT;
	}
	public String getTenthuoc() {
		return tenthuoc;
	}
	public void setTenthuoc(String tenthuoc) {
		this.tenthuoc = tenthuoc;
	}
	public String getLoaithuoc() {
		return loaithuoc;
	}
	public void setLoaithuoc(String loaithuoc) {
		this.loaithuoc = loaithuoc;
	}
	public String getSoluong() {
		return soluong;
	}
	public void setSoluong(String soluong) {
		this.soluong = soluong;
	}
	public String getNgaycap() {
		return ngaycap;
	}
	public void setNgaycap(String ngaycap) {
		this.ngaycap = ngaycap;
	}
	public String getHansudung() {
		return hansudung;
	}
	public void setHansudung(String hansudung) {
		this.hansudung = hansudung;
	}
	@Override
	public String toString() {
		return "thongtinDTModel [maDT=" + maDT + ", tenthuoc=" + tenthuoc + ", loaithuoc=" + loaithuoc + ", soluong="
				+ soluong + ", ngaycap=" + ngaycap + ", hansudung=" + hansudung + "]";
	}

	
}
