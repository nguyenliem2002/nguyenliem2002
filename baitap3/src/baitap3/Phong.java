package baitap3;

public class Phong {
	private String maPhong;
	private double donGia;
	

    public Phong(String maPhong, double donGia) {

        this.maPhong = maPhong;
        this.donGia = donGia;
      
    }


	public String getMaPhong() {
		return maPhong;
	}


	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}


	public double getDonGia() {
		return donGia;
	}


	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}


	@Override
	public String toString() {
		return "Phong [maPhong=" + maPhong + ", donGia=" + donGia + "]";
	}
	
	
}
