import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	Fmenu menu = new Fmenu();
	public Main() {
		int choose; // untuk pemilihan menu
		do {
		System.out.println("  MEKDI");
		System.out.println("========");
		System.out.println();
		System.out.println("1. Order ");
		System.out.println("2. View Order ");
		System.out.println("3. Remove Order ");
		System.out.println("4. Bills");
		System.out.println("5. Exit");
		System.out.print("Choose[1-5]:");
		choose = scan.nextInt();
		scan.nextLine();
		if(choose==1) { //untuk mengorder
			menu.order(); 
		}
		else if(choose==2) { //untuk melihat hasil order
			menu.view();
		}
		else if(choose==3) { //untuk menghapus order
			menu.remove();
		}
		else if(choose==4) { // untuk melihat total harga
			menu.bill();
		}
		}while(choose !=5); // untuk keluar dari aplikasi
		return;
	}

	public static void main(String[] args) {
		new Main();

	}

}
