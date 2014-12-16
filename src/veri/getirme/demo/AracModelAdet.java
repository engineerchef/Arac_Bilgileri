package veri.getirme.demo;

public class AracModelAdet extends AracMarka{
    String model;
    int adet;
    
    public AracModelAdet() {
	super.sc = sc;
	System.out.print("Aracýn modelini giriniz  : ");
	model = sc.nextLine();
	System.out.print("Aracýn piyasaya çýkýþ tarihini giriniz : ");
	adet = sc.nextInt();
    }
    
    public void getModel(String model) {
	this.model = model;
    }
    
    public String setModel() {
	return model;
    }
    
    public void getTarih(int tarih) {
	this.adet = tarih;
    }
    
    public int setTarih() {
	return adet;
    }
    
    public String toString() {
	return "\n" + super.toString() + "\nModel : " + model.toUpperCase() + "\nTarih : " + adet;
    }
}
