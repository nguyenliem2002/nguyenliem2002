package baitap3;

public class Main {
	public static void main(String[] args) {
		
		DanhSachPhong dsp = new DanhSachPhong();
		
		Ngay ngayDen = new Ngay(10, 2, 2022);
		Ngay ngayDi = new Ngay(15, 2, 2022);
		
		Phong don = new Phong("phong don", 100000);
		Phong doi = new Phong("phong doi", 150000);
		Phong giadinh = new PhongGiaDinh("phong gia dinh", 200000, 5);
	

//	3) Phương thức xác định loại phòng

		dsp.ThemPhongVaoDS(don);
		dsp.ThemPhongVaoDS(doi);
		dsp.ThemPhongVaoDS(giadinh);
		
		dsp.XacDinhLoaiPhong(giadinh);
		dsp.XacDinhLoaiPhong(don);
		dsp.XacDinhLoaiPhong(doi);
		
//   4)	Phương thức kiểm tra đơn đặt phòng có đặt phòng gia đình hay không?
		System.out.println("phong đang kiêm tra là phong gia đình: " + dsp.KiemTraPhongLaPhongGiaDinh(giadinh));

//	 5) Phương thức tính tiền cho mỗi hóa đơn đặt hàng dựa vào thông tin đặt?
		System.out.println(dsp.TinhTienChoMoiHoaDon());

//	 7) Lấy ra danh sách các đơn đặt phòng của một khách hàng có tên cho trước
		ThongTinDatCho info1 = new ThongTinDatCho("A", ngayDen, ngayDi, dsp, 2);
		ThongTinDatCho info2 = new ThongTinDatCho("B", ngayDen, ngayDi, dsp, 6);
		ThongTinDatCho info3 = new ThongTinDatCho("A", ngayDen, ngayDi, dsp, 2);
		
		DanhSachThongTinDatHang dSTTDH = new DanhSachThongTinDatHang();
		
		dSTTDH.ThemPhongVaoDS(info1);
		dSTTDH.ThemPhongVaoDS(info2);
		dSTTDH.ThemPhongVaoDS(info3);
		
		dSTTDH.DanhSachDonHangCuaMotKhachHang("A");
		
	}

}
