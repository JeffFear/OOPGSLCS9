
public class Tea extends Food implements Harga{
	private String tea; // jenis teh
	public Tea( int jumlah,String tea2) {
		super(jumlah);
		tea = tea2; 
		this.harganya();
	}

	public String getTea() {
		return tea;
	}

	public void setTea(String tea) {
		this.tea = tea;
	}

	@Override
	public void harganya() {
		if (this.tea.equals("Ice")) {
			this.setHarga(6000);
		}else if(this.tea.equals("Hot")){
			this.setHarga(5000);
		}else {
			this.setHarga(4000);
		}
		
	}
	
}
