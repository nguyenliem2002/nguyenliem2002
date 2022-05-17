package baitap3;

import java.util.ArrayList;

public class DanhSachThongTinDatHang {
	private ArrayList<ThongTinDatCho> Ds = new ArrayList<ThongTinDatCho>();

	public void ThemPhongVaoDS(ThongTinDatCho in4) {
		this.Ds.add(in4);
	}
	
//	6) Trong mỗi thông tin đặt phòng, tìm ra loại phòng có số lượng đặt nhiều nhất.
	public void PhongCoSoLuongDatNhieuNhieuNhat() {
		int soluongphongdon = 0;
		int soluongphongdoi = 0;
		int soluongphonggd = 0;
		
//		for (int i=0; i<Ds.size(); i++) {
//			if (Ds.get(i).)
//		}
	}
	
	
//  7) Lấy ra danh sách các đơn đặt phòng của một khách hàng có tên cho trước	
	
	public void DanhSachDonHangCuaMotKhachHang(String tenKhachHang) {
		for (int i=0; i<Ds.size(); i++) {
			if(Ds.get(i).getTenKhachHang() == tenKhachHang) {
				System.out.println(Ds.get(i));
			}
		}
	}
}
