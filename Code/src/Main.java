import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	ArrayList<String> listName = new ArrayList<>();
	ArrayList<Integer> listPrice = new ArrayList<>();
	ArrayList<Integer> listCarats= new ArrayList<>();
	ArrayList<String> listType = new ArrayList<>();
	ArrayList<String> listId = new ArrayList<>();
	
	public void addJewelry() {
		String name;
		do {

			System.out.print("Input Jewelry Name [5-15 Characters] : ");
			name = scan.nextLine();
			if(name.length()>= 5 && name.length() <= 15) {
				break;
			}
		}while (true);
		listName.add(name);
		
		int price = 0;
		do {
			System.out.print("Input Jewelry Price [Min. 50000 and multiple of 50000] : ");
			try { 
				price = scan.nextInt();
			}catch (Exception e) {
			
			}
			scan.nextLine();
			if(price >= 50000) {
				break;	
			}
		}while (true);
		listPrice.add(price);
		
		int carats = 0;
		do {
			System.out.print("Input Jewelry Carats [Min. 1 and Max. 200] : ");
			try { 
				carats = scan.nextInt();
			}catch (Exception e) {
			
			}
			scan.nextLine();
			if(carats >= 1 && carats <= 200) {
				break;
			}
		}while (true);
		listCarats.add(carats);
		
		String type;
		do {
			System.out.println("Input Jewelry Type [Gold | Silver | Bronze ] :");
			type = scan.nextLine();
			if(type.equals("Gold") || type.equals("Silver") || type.equals("Bronze"));{	
			break;
			}
		}while(true);
		listType.add(type);
		
		String jewelryID;
		int angka1 = rand.nextInt(10);
		int angka2 = rand.nextInt(10);
		
		jewelryID = "DJ"+ angka1 + angka2;
		System.out.println(jewelryID);
		listId.add(jewelryID);
			
	}
	public void viewJewelry()
	{
		if(listName.isEmpty()) {
			System.out.println("Data is empty");
		}else {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("|No.  |ID     |Name                |Price     |Carats |Type      |");
			System.out.println("---------------------------------------------------------------------");
			for(int i=0; i< listType.size(); i++) {
			System.out.printf("|%4d.|%7s|%20s|%10d|%7d|%10s|\n", i+1, listId.get(i), listName.get(i), listPrice.get(i), listCarats.get(i), listType.get(i));
			}
			System.out.println("---------------------------------------------------------------------");
		}
		
	}
	public void deleteJewelry()
	{
		if(listName.isEmpty()) {
			System.out.println("Data is empty");
		}else {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("|No.  |ID     |Name                |Price     |Carats |Type      |");
			System.out.println("---------------------------------------------------------------------");
			for(int i=0; i< listType.size(); i++) {
			System.out.printf("|%4d.|%7s|%20s|%10d|%7d|%10s|\n", i+1, listId.get(i), listName.get(i), listPrice.get(i), listCarats.get(i), listType.get(i));
			}
			System.out.println("---------------------------------------------------------------------");
		
			int idxRemove = 1;
			do {
				System.out.println("Input index to be delete [Min. 1 and Max. 1]");
				try {
				idxRemove = scan.nextInt();
				}catch (Exception e) {
					
				}
				scan.nextLine();
				
				if(idxRemove >= -1 && idxRemove <=2 ) {
					listName.remove(idxRemove);
					break;
				}
				
			}while(true);
			
			do {
				System.out.println(idxRemove + " has been deleted");	
				break;
			}while (true);
//			
//			do {
//				System.out.println("---------------------------------------------------------------------");
//				System.out.println("|No.  |ID     |Name                |Price     |Carats |Type      |");
//				System.out.println("---------------------------------------------------------------------");
//				for(int i=0; i< listType.size(); i++) {
//				System.out.printf("|%4d.|%7s|%20s|%10d|%7d|%10s|\n", i+1, listId.get(i), listName.get(i), listPrice.get(i), listCarats.get(i), listType.get(i));
//				}
//				System.out.println("---------------------------------------------------------------------");
//				break;
//			}while (true);
		}
		
	}
	public Main () {
		
		int menu = 0;
		
		do {
			System.out.println("---- D'Jewelry ---- ");
			System.out.println("1. Add Jewelry ");
			System.out.println("2. View Jewelry ");
			System.out.println("3. Delete Jewelry ");
			System.out.println("4. Exit");
			System.out.println("Choose: ");
			try {
			menu = scan.nextInt();
			}catch (Exception e) {

			}
			scan.nextLine();
			
			if (menu == 1) {
				addJewelry();
				
			}else if (menu == 2) {
				viewJewelry();
				
			}else if (menu == 3) {
				deleteJewelry();
			}
			
		}while(menu != 4);
		System.out.println("Thank You");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
