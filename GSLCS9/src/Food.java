
public abstract class Food {
	private int jumlah; //untuk jumlah banyak pembelian per menu
	private int harga; // untuk harga
	public Food(int jumlah) {
		super();
		
		this.jumlah = jumlah;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	
}
