
public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bügün hava çok güzel";
		String yeniMesaj = şehirVer();
		System.out.println(yeniMesaj);
		int sayı = topla(5, 7);
		System.out.println(sayı);
		
		
	}
	
	public static void ekel() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void güncelle() {
		System.out.println("Güncellendi");

	}
	
	public static int topla(int sayı1, int sayı2) {
		return sayı1 + sayı2;
	}
	
	public static String şehirVer() {
		return "Ankara";
	}

}
