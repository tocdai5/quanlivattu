package pre;

import java.util.Date;
import java.util.List;

import javax.swing.text.DateFormatter;

import com.toedter.calendar.DateUtil;

import model.Doituong;
import model.Hoadon;
import model.Kho;
import model.Nhacungcap;
import model.User;
import dao.DoituongHome;
import dao.HoadonHome;
import dao.KhoHome;
import dao.NhacungcapHome;
import dao.UserHome;

public class TestData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HoadonHome hdhome = new HoadonHome();
		
		KhoHome khohome = new KhoHome();
		NhacungcapHome ncchome = new NhacungcapHome();
		UserHome userhome = new UserHome();
		DoituongHome dthome = new DoituongHome();
		
		List<Hoadon> list = hdhome.findByExample();
		
		for(int i = 0 ; i< list.size() ; i++)
		{
			Hoadon hd = list.get(i);
			System.out.println(hd.getId());
			System.out.println(hd.getNgay());
			System.out.println(hd.getSochungtu());
			System.out.println(hd.getSohoadon());
			System.out.println(hd.getKho());
			System.out.println(hd.getNhacungcap());
			System.out.println(hd.getDoituong());
			System.out.println(hd.getUser());
			System.out.println(hd.getGhichu());
			System.out.println(hd.getLoaihoadon());
			System.out.println(hd.getNguoinhan());
			
			System.out.println("\n\n");
		}
		
		Kho k1 = new Kho("KH01", "Kho");
		User u1 =  new User("user1", "user1", "123");
		Nhacungcap ncc1 =  new Nhacungcap("1", "ncc", "q7");
		Doituong dt1 = new Doituong("ss", "dt", "q8");
		
		khohome.attachDirty(k1);
		userhome.attachDirty(u1);
		ncchome.attachDirty(ncc1);
		dthome.attachDirty(dt1);
		
//		Hoadon hd = new Hoadon(k1,u1,ncc1, dt1, new Date(), "sct", 123, "phieu nhap", true, "anh ta", "chan qua di dai qua");
//		hdhome.attachDirty(hd);
	}

}
