package baitap3;
import java.util.ArrayList;


public class DanhSachPhong {
	private ArrayList<Phong> DanhSachPhong = new ArrayList<Phong>();

	public void ThemPhongVaoDS(Phong p) {
		this.DanhSachPhong.add(p);
	}

//	3) Phương thức xác định loại của phòng
	public void XacDinhLoaiPhong(Phong p) {
		if (p.getMaPhong() == "phong don") {
			System.out.println(" La phong don");
		} else if (p.getMaPhong() == "phong doi") {
			System.out.println(" La phong doi");
		} else if (p.getMaPhong() == "phong gia dinh") {
			System.out.println(" La phong gia dinh");
		}
	}



//4) Phương thức kiểm tra đơn đặt phòng có đặt phòng gia đình hay không?
	public boolean KiemTraPhongLaPhongGiaDinh(Phong p) {
		if (p.getMaPhong() == "phong gia dinh") {
				return true;
			} else {
				return false;
			}
	}
	
//5) Phương thức tính tiền cho mỗi hóa đơn đặt hàng dựa vào thông tin đặt?
	public double TinhTienChoMoiHoaDon() {
		double tinhTien = 0;
		for (int i=0; i<DanhSachPhong.size(); i++) {
			tinhTien = tinhTien + DanhSachPhong.get(i).getDonGia();
		}
		return tinhTien;
	}
	
	

	@Override
	public String toString() {
		return "DanhSachPhong [DanhSachPhong=" + DanhSachPhong + "]";
	}
	
	
}
