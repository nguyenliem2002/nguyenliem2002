package phan1bai9;

public class Mang {
	
	// 1) Đếm số chuỗi có chiều dài hơn 4 ký tự trong mảng
	public static int SoChuoiHon4KyTu (String arr[]) {
		int count = 0;
		for (int i=0; i<arr.length; i++) {
			if(arr[i].length() > 4) {
				count++;
			}
		}
		return count;
		
	}
	
	// 2) Lấy ra chuỗi có chiều dài lớn nhất trong mảng
	public static String ChuoiDaiNhat (String arr[]) {
		String chuoiDaiNhat = arr[0];
		for (int i=0; i<arr.length ; i++) {
			if(arr[i].length() > chuoiDaiNhat.length()) {
				chuoiDaiNhat = arr[i];
			}
		}
		return chuoiDaiNhat;
	}
	
	// 3) Lấy ra tất cả các chuỗi bắt đầu bằng ký tự số trong mảng (kiểu trả về là mảng)
	public static String[] ChuoiBangSo (String arr[]) {
		int chuoiBatDauBangSo = 0;
		for (int i=0; i<arr.length ; i++) {
			if(Character.isDigit(arr[i].charAt(0))) {
				chuoiBatDauBangSo++;
			}
		}
		int chiSoMang2 = -1;
		String arr2 [] = new String [chuoiBatDauBangSo];
		for (int i=0; i<arr.length ; i++) {
			if(Character.isDigit(arr[i].charAt(0))) {
				arr2[++chiSoMang2] = arr[i];
			}
		}
		return arr2;
	}
	
	// Hàm main
	public static void main(String[] args) {
    	String arr[]  = {"123NguyenThanhLiem", "2UTC", "Phan hieu dai hoc giao thong van tai", "123hello"};
		
		System.out.println("\nChuoi co chieu dai lon hon bon ky tu la : " + SoChuoiHon4KyTu(arr));
		
		System.out.println("\nChuoi co chieu dai lon nhat trong mang la : " + ChuoiDaiNhat(arr));
		
		System.out.println("\nChuoi bat dau bang ky tu so trong mang la :");
		String arr3 [] = ChuoiBangSo(arr);
		for (int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
	}
}

