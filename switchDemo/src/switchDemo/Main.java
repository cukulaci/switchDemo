package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {

		case 'A':
			System.out.println("Mükemmel: Geçtiniz.");
			break;

		case 'B':
		case 'C':
		case 'D':
			System.out.println("Çok güzel : Geçtiniz.");
			break;

		case 'F':
			System.out.println("Maalesef Kaldınız.");
			break;

		default:
			System.out.println("Geçersiz giriş.");
		}

	}

}
