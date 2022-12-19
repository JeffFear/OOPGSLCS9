
public class Burger extends Food implements Harga{
	private String jenisb; // jenis burger (Chicken dan Beef)

	public Burger(int jumlah, String jenisb) {
		super(jumlah);
		this.jenisb = jenisb;
		this.harganya();
	}

	public String getJenisb() {
		return jenisb;
	}

	public void setJenisb(String jenisb) {
		this.jenisb = jenisb;
	}

	@Override
	public void harganya() {
		if(jenisb.equals("Chicken")){
			this.setHarga(17000);
		}
		else if(jenisb.equals("Beef")){
				this.setHarga(20000);	
		}
	}
}
