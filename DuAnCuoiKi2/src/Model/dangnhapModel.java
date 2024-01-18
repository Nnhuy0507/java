package Model;

import java.util.Objects;

public class dangnhapModel {
	public String mabn;
	public String mk;
	
	public String getMk() {
		return mk;
	}
	public void setMk(String mk) {
		this.mk = mk;
	}
	public String getMabn() {
		return mabn;
	}
	public void setMabn(String mabn) {
		this.mabn = mabn;
	}
	
	
	public dangnhapModel() {
	}
	@Override
	public int hashCode() {
		return Objects.hash(mabn, mk);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		dangnhapModel other = (dangnhapModel) obj;
		return Objects.equals(mabn, other.mabn) && Objects.equals(mk, other.mk);
	}
}

