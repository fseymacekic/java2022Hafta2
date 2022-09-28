package javaHafta2;

public class Methods2 {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel!";
		String newMessage = message.substring(0,2);
		System.out.println(newMessage);
		String city = cities();
		int total = sum(5,7);
		System.out.println("Toplam: "+ total);
		int total2 = sum2(2,3,4,5,6,10);
		System.out.println("Toplam2: "+ total2);
		
	}

	public static void add() {
		System.out.println("Eklendi!");
	}

	public static void delete() {
		System.out.println("Silindi!");
	}

	public static void update() {
		System.out.println("Güncellendi!");
	}
	
	public static String cities() {
		return "Ankara";
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sum2(int... numbers) {
		int total = 0;
		for(int number:numbers) {
			total += number; 
		}
		return total;
	}

}
