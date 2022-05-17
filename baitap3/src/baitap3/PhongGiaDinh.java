package baitap3;

public class PhongGiaDinh extends Phong{
	private int sucChuaToiDa;

	public PhongGiaDinh(String maPhong, double donGia, int sucChuaToiDa) {
		super(maPhong, donGia);
		this.sucChuaToiDa = sucChuaToiDa;
	}

	public int getSucChuaToiDa() {
		return sucChuaToiDa;
	}

	public void setSucChuaToiDa(int sucChuaToiDa) {
		this.sucChuaToiDa = sucChuaToiDa;
	}

	@Override
	public String toString() {
		return "PhongGiaDinh [sucChuaToiDa=" + sucChuaToiDa + "]";
	}
	
	
}
