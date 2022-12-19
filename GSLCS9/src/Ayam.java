
public class Ayam extends Food implements Harga{
	private int level; //level kepedasan pada ayam spicy
	private String jenis; // untuk jenis ayam yang akan dipilih
	public Ayam(int jumlah, int level2, String jenis) {
		super(jumlah);
		level = level2;
		this.jenis = jenis;
		this.harganya();
		
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	@Override
	public void harganya() {
		if (jenis.equals("Original")) {
			this.setHarga(20000);
		}else if(jenis.equals("Spicy")){
			this.setHarga(25000);
		}
		
	}
	
}
