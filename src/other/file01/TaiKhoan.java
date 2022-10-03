package other.file01;

import java.util.Scanner;

public class TaiKhoan {
	// Variable
	private String maTK = null;
	private String hoTen = null;
	private int soDuTK = 0;
	private String loaiGiaoDich = null;
	
	// Constructor
	public TaiKhoan() {
		
	}
	
	public TaiKhoan(String maTK, String hoTen, int soDuTK, String loaiGiaoDich) {
		this.maTK = maTK;
		this.hoTen = hoTen;
		this.soDuTK = soDuTK;
		this.loaiGiaoDich = loaiGiaoDich;
	}
	
	// Setter, Getter
	public String getMaTK() {
		return maTK;
	}

	public void setMaTK(String maTK) {
		this.maTK = maTK;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getSoDuTK() {
		return soDuTK;
	}

	public void setSoDuTK(int soDuTK) {
		this.soDuTK = soDuTK;
	}

	public String getLoaiGiaoDich() {
		return loaiGiaoDich;
	}

	public void setLoaiGiaoDich(String loaiGiaoDich) {
		this.loaiGiaoDich = loaiGiaoDich;
	}
	
	// Method
	public void nhapTaiKhoan(Scanner scanner) {
		System.out.print("Nhap maTK:	");
		this.setMaTK(scanner.next());
		System.out.print("Nhap hoTen:	");
		this.setHoTen(scanner.next());
		System.out.print("Nhap soDuTK:	");
		this.setSoDuTK(scanner.nextInt());
		System.out.print("Nhap loaiGiaoDich:	");
		this.setLoaiGiaoDich(scanner.next());
	}
	
	public void xuatTaiKhoan() {
		String s = String.format("maTK: %s\nhoTen: %s\nsoDuTK: %d\nloaiGiaoDich: %s",
				this.maTK, this.hoTen, this.soDuTK, this.loaiGiaoDich);
		System.out.println(s);
	}
}
