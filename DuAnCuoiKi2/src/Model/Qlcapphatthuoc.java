package Model;

import java.util.ArrayList;

public class Qlcapphatthuoc {
    public ArrayList<thongtinbnModel> dsbenhnhan;
	private Object mabn;
	private String luachon;

	public Qlcapphatthuoc() {
		this.dsbenhnhan = dsbenhnhan;
		this.luachon = "";
	}

	public ArrayList<thongtinbnModel> getDsbenhnhan() {
		return dsbenhnhan;
	}

	public void setDsbenhnhan(ArrayList<thongtinbnModel> dsbenhnhan) {
		this.dsbenhnhan = dsbenhnhan;
	}
	public void insert(thongtinbnModel benhnhan) {
		this.dsbenhnhan.add(benhnhan);
	}
	public void delete(thongtinbnModel benhnhan) {
		this.dsbenhnhan.remove(benhnhan);
	}
	public void edit(thongtinbnModel benhnhan) {
		this.dsbenhnhan.set(0, benhnhan);
	}
	public void update(thongtinbnModel benhnhan) {
		this.dsbenhnhan.set(0, benhnhan);
	}

	public String getLuachon() {
		return luachon;
	}

	public void setLuachon(String luachon) {
		this.luachon = luachon;
	}

	public thongtinbnModel timkiem(thongtinbnModel benhnhan) {
		  for (thongtinbnModel thongtinbnModel : dsbenhnhan) {
	            if (thongtinbnModel.getMabn().equals(mabn)) {
	                return thongtinbnModel;
	            }
	        }
	        return null;
	    }
	public thongtinDTModel timkiem1(thongtinDTModel benhnhan) {
		  for (thongtinDTModel thongtinDTModel : dsbenhnhan) {
	            if (thongtinDTModel.getMaDT().equals(maDT)) {
	                return thongtinDTModel;
	            }
	        }
	        return null;
	    }
	public NguoikedonModel timkiem2(NguoikedonModel benhnhan) {
		  for (NguoikedonModel NguoikedonModel : dsbenhnhan) {
	            if (NguoikedonModel.getMabs().equals(mabs)) {
	                return NguoikedonModel;
	            }
	        }
	        return null;
	    }

	public boolean kiemtratontai(thongtinbnModel bn) {
		for(thongtinbnModel thongtinbnModel: dsbenhnhan);
		if( thongtinbnModel.getMabn()== bn.getDiachi())
		{
			return true;
		}
		return false;
	}


	}
    

