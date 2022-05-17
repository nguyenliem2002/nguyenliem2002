package baitap3;

public class ThongTinDatCho {
	private String tenKhachHang;
	private Ngay ngayDen;
	private Ngay ngayDi;
	private DanhSachPhong danhSachPhong;
	private int soLuongMoiPhongDaDat;
	
	public ThongTinDatCho(String tenKhachHang, Ngay ngayDen, Ngay ngayDi, DanhSachPhong danhSachPhong, int soLuongMoiPhongDaDat) {
		super();
		this.tenKhachHang = tenKhachHang;
		this.ngayDen = ngayDen;
		this.ngayDi = ngayDi;
		this.danhSachPhong = danhSachPhong;
		this.soLuongMoiPhongDaDat = soLuongMoiPhongDaDat;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public Ngay getNgayDen() {
		return ngayDen;
	}
	public void setNgayDen(Ngay ngayDen) {
		this.ngayDen = ngayDen;
	}
	public Ngay getNgayDi() {
		return ngayDi;
	}
	public void setNgayDi(Ngay ngayDi) {
		this.ngayDi = ngayDi;
	}
	public DanhSachPhong getDanhSachPhong() {
		return danhSachPhong;
	}
	public void setDanhSachPhong(DanhSachPhong danhSachPhong) {
		this.danhSachPhong = danhSachPhong;
	}
	public int getSoLuongMoiPhongDaDat() {
		return soLuongMoiPhongDaDat;
	}
	public void setSoLuongMoiPhongDaDat(int soLuongMoiPhongDaDat) {
		this.soLuongMoiPhongDaDat = soLuongMoiPhongDaDat;
	}
	
	
	@Override
	public String toString() {
		return "ThongTinDatCho [tenKhachHang=" + tenKhachHang + ", ngayDen=" + ngayDen + ", ngayDi=" + ngayDi
				+ ", danhSachPhong=" + danhSachPhong + ", soLuongMoiPhongDaDat=" + soLuongMoiPhongDaDat + "]";
	}
	
	
	
}
