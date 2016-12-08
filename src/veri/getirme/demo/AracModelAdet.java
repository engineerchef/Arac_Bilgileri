package veri.getirme.demo;

public class AracModelAdet extends AracMarka{
    String model;
    int adet;
    
    public AracModelAdet() {
	super.sc = sc;
	System.out.print("Aracin modelini giriniz  : ");
	model = sc.nextLine();
	System.out.print("Aracin piyasaya çikis tarihini giriniz : ");
	adet = sc.nextInt();
    }
    
    public void setModel(String model) {
	this.model = model;
    }
    
    public String getModel() {
	return model;
    }
    
    public void setTarih(int tarih) {
	this.adet = tarih;
    }
    
    public int getTarih() {
	return adet;
    }
    
    public String toString() {
	return "\n" + super.toString() + "\nModel : " + model.toUpperCase() + "\nTarih : " + adet;
    }
}
