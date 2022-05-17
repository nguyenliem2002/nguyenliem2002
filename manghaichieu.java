package bai2;

import java.lang.Math;
import java.util.Scanner;

public class manghaichieu {
	static Scanner sc = new Scanner(System.in);
	// Hàm nhập mảng hai chiều
	public static void NhapMaTran(int a[][], int n, int m)
	{
		
	    for(int i = 0; i < n; i++)
	    	for(int j = 0; j < m; j++)
	        {
	    		System.out.println("A[" + i + "]" + "[" + j + "]" + "=");
	        	a[i][j]=sc.nextInt();
	    	}
	}
	 
	// Hàm xuất mảng hai chiều
	public static void XuatMaTran(int a[][], int n, int m)
	{
	    for(int i = 0; i < n; i++)
	    {
	        for(int j = 0; j < m; j++)
	        	System.out.printf("\t"+a[i][j]);
	        System.out.println();
	      
	    }
	}

	
//	1) Tìm số nguyên tố lớn thứ 2 trong mảng
	static Boolean SoNguyenTo(int soA)
	{
	    if (soA < 2)
	    {
	        return false;
	    }
	    else
	    {
	        for (int i = 2; i <= (int) Math.sqrt(soA); i ++)
	        {
	            if (soA%i==0)
	            {
	                return false;
	            }
	        }
	    }
	    return true;
	}

	public static void LietKeSNT(int a[][], int n, int m )
	{
	@SuppressWarnings("unused")
	int dem = 0;
	   for(int i = 0; i < n; i++)
	      for(int j = 0; j < m; j++)
	         if(SoNguyenTo(a[i][j])) System.out.println("\t" + a[i][j]);
	}
	
//	Thuật toán tìm số nguyên tố lớn thứ 2 trong mảng
	public static void timptlonthu2(int[][] a, int n, int m){
        //tìm số nguyên tố lớn thứ 2 trong mảng 2 chiều
        int max = a[0][0];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] > max && SoNguyenTo(a[i][j])){
                    max = a[i][j];
                }
            }
        }
        int max2 = a[0][0];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] != max && SoNguyenTo(a[i][j])){
                    max2 = a[i][j];
                }
            }
        }
        System.out.println("So nguyen to lon thu 2 trong mang 2 chieu la: " + max2);
    }
	
//  2) Tính tổng các phần tử trên hàng cho trước
	
	public static void TongHang(int a[][], int n, int m )
	{
	 
	 	for(int i=0;i<n;i++)   
	    {
	    int sum=0;
	        for(int j=0;j<m;j++)
	        {
	        	sum=sum+a[i][j];
	        }
	        System.out.println("\nHang thu "+ i +" co tong la: " + sum); 
	   }
	}
	
//   3) Thay thế phần tử biên bị thiếu (phần tử có giá trị = -1) bằng giá trị biên nhỏ nhất
	public static void thaythephantu(int[][] a, int n, int m) {
		int min = a[0][0];
		for (int i=0; i<m; i++) {
			if(a[0][i] < min) {
				min = a[0][i];
			}
		}
		for (int j=0; j<n; j++) {
			if (a[j][0] < min) {
				min = a[j][0];
			}
			if (a[j][m-1] < min) {
				min = a[j][m-1];
			}
		}
		for (int i=0; i<m; i++) {
			if (a[n-1][i] < min) {
				min = a[n-1][i];
			}
		}
		System.out.println("Xuat min: "+min);
		for (int i=0; i<m; i++) {
			if(a[0][i] == -1) {
				a[0][i] = min;
			}
		}
		for (int j=0; j<n; j++) {
			if (a[j][0] == -1) {
				a[j][0] = min;
			}
			if (a[j][m-1] == -1) {
				a[j][m-1] = min;
			}
		}
		for (int i=0; i<m; i++) {
			if (a[n-1][i] == -1) {
				a[n-1][i] = min;
			}
		}
		System.out.println("\nMa tran sau khi thay the la :");
		XuatMaTran(a,n,m);
		
	}
	
	public static void main(String[] args) {   
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    int m,n;
	    System.out.println("nhap so hang n = "); 
		n=sc.nextInt();
		System.out.println("nhap so cot m = "); 
		m=sc.nextInt();
		int a[][] = new int[n][m];
		System.out.println("nhap vao ma tran:\n");
	    NhapMaTran(a,n,m);
	    System.out.println("ma tran vua nhap la :\n");
	    XuatMaTran(a,n,m);
	    TongHang(a,n,m);
	    System.out.println("\n");
	    System.out.println("mang co so nguyen to la : ");
	    LietKeSNT(a,n,m);
	    System.out.println("\n");
	    timptlonthu2(a,n,m);
	    
	    thaythephantu(a,n,m);
	}
}
