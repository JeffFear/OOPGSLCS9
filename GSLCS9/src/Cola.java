
public class Cola extends Food implements Harga{
	private String jenisc; //jenis cola yang akan dipilih
	
	public Cola(int jumlah, String jenisc) {
		super(jumlah);
		this.jenisc = jenisc;
		this.harganya();
	}

	public String getJenisc() {
		return jenisc;
	}

	public void setJenisc(String jenisc) {
		this.jenisc = jenisc;
	}

	@Override
	public void harganya() {
		if (jenisc.equals("Pepsi")) {
			this.setHarga(10000);
		}else if(jenisc.equals("Coca")){
			this.setHarga(11000);
		}else if(jenisc.equals("Fanta")){
			this.setHarga(9500);
		
		}
	}
}
