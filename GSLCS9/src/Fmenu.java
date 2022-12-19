import java.util.ArrayList;
import java.util.Scanner;

public class Fmenu {
	Scanner scan = new Scanner(System.in);
	ArrayList<Food> foodData = new ArrayList<>();
	
	public void order() {
		String jenis; 
		String burger;
		int level;
		int input;
		String tea;
		String cola;
		String jminum;
		String jburger;
		String jumlah;
		do { //untuk pemilihan jenis makanan
			System.out.println("Mau pesan apa ?");
			System.out.println("1. Ayam");
			System.out.println("2. Minum");
			System.out.println("3. Burger");
			System.out.print("->> ");
			input = scan.nextInt();
			scan.nextLine();
		}while(input<1 || input>3);
		if(input==1) {
			
		do { //untuk pemilihan jenis ayam
			System.out.println("Original 20000"); 
			System.out.println("Spicy 25000");
			System.out.print("Jenis ayam[ Original | Spicy ]: ");
			jenis = scan.nextLine();
		}while(!jenis.equals("Original")&& !jenis.equals("Spicy"));
		
		if(jenis.equals("Spicy")) {
			
			do {//pemilihan level pedas
				System.out.print("Level[1-5]");
				level =scan.nextInt();
				scan.nextLine();
			}while(level<1|| level>5);
		}
		else{
			level = 0;
		}
		do {// untuk jumlah pesanan ayam
			System.out.println("Jumlah pesanan : ");
			jumlah = scan.nextLine();
		}while(jumlah.length()==0);
		int amount = Integer.parseInt(jumlah);
		foodData.add(new Ayam(amount, level, jenis));
		}
		else if(input==2){
		do { //untuk pemilihan jenis minuman
			System.out.println("Water : 3000");
			System.out.print("Minuman[ Coca | Tea | Water ]: ");
			jminum = scan.nextLine();
		}while(!jminum.equals("Coca") && !jminum.equals("Tea") && jminum.equals("Water"));
		
		if(jminum.equals("Tea")) {
			do { // untuk pemilihan jenis Tea
				System.out.println("Ice 	: 6000");
				System.out.println("Hot 	: 5000");
				System.out.println("Normal	: 4000");
				System.out.print("[Ice | Hot | Normal ]: ");
				tea = scan.nextLine();
			}while(!tea.equals("Ice") && !tea.equals("Hot") && !tea.equals("Normal"));			
			if(tea.equals("Ice")|| tea.equals("Hot"))jminum = tea+" Tea" ;
			do { // untuk jumlah pesanan pada minuman
				System.out.println("Jumlah pesanan : ");
				jumlah = scan.nextLine();
			}while(jumlah.length()==0);
			int amount = Integer.parseInt(jumlah);
			
			foodData.add(new Tea(amount, jminum));
		}
		else if(jminum.equals("Cola")) {
			do { // untuk pemilihan jenis Cola
				System.out.println("Pepsi : 10000");
				System.out.println("Coca  : 11000");
				System.out.println("Fanta : 9500");
				System.out.print("[ Pepsi | Coca | Fanta ]: ");
				cola = scan.nextLine();
			}while(!cola.equals("Pepsi") && !cola.equals("Coca") && !cola.equals("Fanta"));			
			do { // jumlah pemilihan cola
				System.out.println("Jumlah pesanan : ");
				jumlah = scan.nextLine();
			}while(jumlah.length()==0);
			int amount = Integer.parseInt(jumlah);
			foodData.add(new Cola(amount, cola));
		}
		else { //jumlah pembelian Water
			do {
				System.out.println("Jumlah pesanan : ");
				jumlah = scan.nextLine();
			}while(jumlah.length()==0);
			int amount = Integer.parseInt(jumlah);
			foodData.add(new Water(amount));
			}
		}
		else{
		do {//pemilihan jenis burger
			System.out.println("Chicken : 17000");
			System.out.println("Beef    : 20000");
			System.out.println("Burger[ Chicken | Beef ]: " );
			burger = scan.nextLine();
		}while(!burger.equals("Chicken") && !burger.equals("Beef"));
		jburger = burger +" burger";
		do {//jumlah pemesanan burger
			System.out.println("Jumlah pesanan : ");
			jumlah = scan.nextLine();
		}while(jumlah.length()==0);
		int amount = Integer.parseInt(jumlah);
		foodData.add(new Burger(amount, jburger));
		}
		scan.nextLine();
	}
	public void view() {
		if(foodData.isEmpty()) { // jika tidak ada orderan
			System.out.println("NO ORDER !!!");
			return;
		}
		int no = 1;
		System.out.println("Ayam :");
		for(Food i:foodData) { // memberikan informasi jika ada orderan ayam
			if(i instanceof Ayam) { //apabila i nya merupakan class ayam
				System.out.print(no+". ");
				System.out.println(((Ayam)i).getJenis());	
				System.out.println("level : " + ((Ayam)i).getLevel());
				System.out.println("Jumlah : "+ ((Ayam)i).getJumlah());
				no++;
			}
		}
		if(no==1) { // apabila tidak ada orderan ayam
			System.out.println("-");
		}
		no=1;
		System.out.println("Minuman :");
		for(Food i:foodData) { // memberikan informasi jika ada orderan minuman
			if(i instanceof Tea) {//apabila i nya merupakan class Tea
				System.out.print(no+". ");
				System.out.println(((Tea)i).getTea());	
				System.out.println("Jumlah : "+((Tea)i).getJumlah());
				no++;
			}else if(i instanceof Cola) { //apabila i nya merupakan class Cola
				System.out.print(no+". ");
				System.out.println(((Cola)i).getJenisc());	
				System.out.println("Jumlah : "+((Cola)i).getJumlah());
				no++;
			}
			else if(i instanceof Water){ //apabila i nya merupakan class Water
				System.out.print(no+". ");
				System.out.println("Jumlah : "+((Water)i).getJumlah());
				no++;
			}
		}
		if(no==1) { // apabila tidak ada orderan minuman
			System.out.println("-");
		}
		no=1;
		System.out.println("Burger :");
		for(Food i:foodData) { // memberikan informasi jika ada orderan burger
			if(i instanceof Burger) { //apabila i nya merupakan class burger
				System.out.print(no+". ");
				System.out.println(((Burger)i).getJenisb());
				System.out.println("Jumlah : "+ ((Burger)i).getJumlah());
				no++;
			}
		}
		if(no==1) { // apabila tidak ada orderan burger
			System.out.println("-");
		}
		scan.nextLine();
	}
	public void remove() {
		if(foodData.isEmpty()) { // jika tidak ada orderan
			System.out.println("NO ORDER !!!");
			return;
		}
		for(int i = 0; i<foodData.size();i++) { // print data
			Food temp = foodData.get(i);
			if(temp instanceof Ayam) { //apabila temp nya merupakan class Ayam 
				System.out.println((i+1)+". "+((Ayam)temp).getJenis());
			}else if(temp instanceof Cola) { //apabila temp nya merupakan class Cola
				System.out.println((i+1)+". "+((Cola)temp).getJenisc());
			}else if(temp instanceof Tea) {//apabila temp nya merupakan class Tea
				System.out.println((i+1)+". "+((Tea)temp).getTea());
			}else if(temp instanceof Water) { //apabila temp nya merupakan class Water
				System.out.println((i+1)+". Water");
			}else if(temp instanceof Burger) { //apabila temp nya merupakan class Burger
				System.out.println((i+1)+". "+((Burger)temp).getJenisb());
			}
		}
		int num;
		do { // untuk menginput nomor pada orderan yang ingin dihapus
			System.out.print("Input number :[1-"+ foodData.size()+"]");
			num = scan.nextInt();
			scan.nextLine();
			
		}while(num<1||num>foodData.size());
		foodData.remove(num-1); // untuk menghapus data
		scan.nextLine();
	}
	public void bill() {
		if(foodData.isEmpty()) { // jika tidak ada orderan
			System.out.println("NO ORDER !!!");
		}
		else { //jika ada orderan
			String nama;
				do {
					
				System.out.print("Nama : "); // menginput nama pembeli
				nama = scan.nextLine();	
			}while(nama.length()<=2);
			int total = 0;
			for(Food i: foodData) { // menghitung total harga orderan
				total += i.getHarga()*i.getJumlah();
			}
			System.out.println("MEKDI");
			System.out.println(nama);
			System.out.println("Total Harga : "+ total); //menunjukan hasil
			scan.nextLine();
			
		}
	}
}
