package veri.getirme.demo;
import java.util.Scanner;

public class AracMarka {
    Scanner sc = new Scanner(System.in);
    String marka;
    public AracMarka() {
	System.out.print("Aracýn markasýný yazýnýz : ");
	marka = sc.nextLine();
    }
    
    public void setMarka(String marka) {
	this.marka = marka;
    }
    
    public String getMarka() {
	return marka;
    }
    
    public String toString() {
	return "Marka : " + marka.toUpperCase();
    }
}
