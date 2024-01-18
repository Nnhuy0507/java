package Model;

public class NguoikedonModel {
	private String tenbs;
	private String mabs;
	private String diachi;
	private String chuyenkhoa;
	private String sdt;
	public String getMabs() {
		return mabs;
	}
	public void setMabs(String mabs) {
		this.mabs = mabs;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public NguoikedonModel() {
	}
	public String getTenbs() {
		return tenbs;
	}
	public void setTenbs(String tenbs) {
		this.tenbs = tenbs;
	}
	public String getChuyenkhoa() {
		return chuyenkhoa;
	}
	public void setChuyenkhoa(String chuyenkhoa) {
		this.chuyenkhoa = chuyenkhoa;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	@Override
	public String toString() {
		return "NguoikedonModel [tenbs=" + tenbs + ", mabs=" + mabs + ", diachi=" + diachi + ", chuyenkhoa="
				+ chuyenkhoa + ", sdt=" + sdt + "]";
	}

}
