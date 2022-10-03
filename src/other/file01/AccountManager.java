package other.file01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AccountManager {
	//Variable
	List<TaiKhoan> listAccount = new LinkedList<>();
	
	//Constructor
	public AccountManager() {
		
	}
	
	public AccountManager(List<TaiKhoan> listAccount) {
		this.listAccount = listAccount;
	}
	
	//Method
	// Show menu
	public void showMenu() {
		System.out.println("1. Nhap tai khoan moi.");
		System.out.println("2. Xem danh sach tai khoan.");
		System.out.println("3. Sap xep danh sach tai khoan theo thu tu tang dan theo soDuTK.");
		System.out.println("4. Tim kiem tuyen tinh theo soDuTK");
		System.out.println("5. Sua ten tai khoan co ma tai khoan nhap tu ban phim.");
		System.out.println("6. Xoa tai khoan co ma tai khoan nhap tu ban phim.");
		System.out.println("7. Chen mot tai khoan vao danh sach da sap xep sao cho tinh sap xep van duoc dam bao.");
		System.out.println("0. Ket thuc.");
	}
	// 1.
	public void addNewAccount(Scanner scanner) {
		TaiKhoan newAccount = new TaiKhoan();
		newAccount.nhapTaiKhoan(scanner);
		this.listAccount.add(newAccount);
		System.out.println("Added new account.");
	}
	
	// 2.
	public void showListAccount() {
		System.out.println("List account:\n");
		for (TaiKhoan account : this.listAccount) {
			account.xuatTaiKhoan();
			System.out.println("--------------------------------------------");
		}
	}
	
	// 3.
	public void sortBySoDuTK() {
		for (int turn = 1; turn < this.listAccount.size(); turn++) {
			for (int index = 0; index < this.listAccount.size()-1; index++) {
				TaiKhoan tempAccount = this.listAccount.get(index);
				TaiKhoan nextAccount = this.listAccount.get(index + 1);
				if (tempAccount.getSoDuTK() > nextAccount.getSoDuTK()) {
					this.listAccount.set(index, nextAccount);
					this.listAccount.set(index+1, tempAccount);
				}
			}
		}
		System.out.println("Sorted by 'soDuTK'");
	}
	
	// 4.
	public TaiKhoan findAccountBySoDuTK(Scanner scanner) {
		System.out.print("Nhap soDuTK:   ");
		int soDuTK = scanner.nextInt();
		for (TaiKhoan account : this.listAccount) {
			if (account.getSoDuTK() == soDuTK) {
				account.xuatTaiKhoan();
				return account;
			}
		}
		return null;
	}
	
	// 5.
	public void renameAccountByMaTK(Scanner scanner) {
		System.out.print("Nhap maTK:	");
		String maTK = scanner.next();
		for (TaiKhoan account : this.listAccount) {
			if (account.getMaTK().equals(maTK)) {
				System.out.print("Nhap hoTen moi:	");
				String newName = scanner.next();
				account.setHoTen(newName);
				System.out.println("Da sua ten thanh cong.");
				return;
			}
		}
		System.out.println("Khong tim thay maTK nay.");
	}
	
	// 6.
	public void removeAccountByMaTK(Scanner scanner) {
		System.out.print("Nhap maTK:	");
		String maTK = scanner.next();
		for (TaiKhoan account : this.listAccount) {
			if (account.getMaTK().equals(maTK)) {
				this.listAccount.remove(account);
				System.out.println("Da xoa tai khoan thanh cong.");
				return;
			}
		}
		System.out.println("Khong tim thay maTK nay.");
	}
	
	// 7.
	public void insertNewAccount(Scanner scanner) {
		TaiKhoan account = new TaiKhoan();
		account.nhapTaiKhoan(scanner);
		int tempIndex = 0;
		for (int index = 0; index < this.listAccount.size(); index++) {
			if (account.getSoDuTK() >= this.listAccount.get(index).getSoDuTK()) {
				tempIndex = index+1;
			}
		}
		this.listAccount.add(tempIndex, account);
	}
}
