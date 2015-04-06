package bus;

import java.util.List;

import model.Hoadon;

public class DanhsachHoadon {
	private List<Hoadon> listHD;

	public DanhsachHoadon(List<Hoadon> listHD) {
		super();
		this.listHD = listHD;
	}
	
	public Hoadon getBySochungtu(String sct)
	{
		for(Hoadon hd : listHD)
		{
			if(hd.getSochungtu().contains(sct))
				return hd;
		}
		return null;
	}

	public List<Hoadon> getListHD() {
		return listHD;
	}

	public void setListHD(List<Hoadon> listHD) {
		this.listHD = listHD;
	}
	
	
}
