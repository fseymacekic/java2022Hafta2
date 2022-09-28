package javaHafta2;

public class Methods {

	public static void main(String[] args) {
		numberFind();
	}

	public static void numberFind() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int find = 6;
		boolean isFind = false;

		for (int number : numbers) {
			if (number == find) {
				isFind = true;
				break;
			}
		}

		if (isFind) {
			sendMessage("Sayı mevcuttur: "+find);
		} else
			sendMessage("Sayı mevcut değildir: "+find);
	}
	public static void sendMessage(String message) {
		System.out.println(message);
	}
}
