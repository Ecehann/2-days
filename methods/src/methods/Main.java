package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		
	}
  
	public static void sayiBulmaca() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int sought = 6;
		boolean available = false;

		for (int number : numbers) {
			if (number == sought) {
				available = true;
				break;
			}
		}
		if (available) {
			//System.out.println("Sayı mecvut:" + sought);	//1. yöntem
			mesajVer ("Sayı mecvut:" + sought); 	//2. yöntem
		
			/* 2. yöntemin açıklaması
			
			String mesaj = "";
			if (available) {
			mesaj =	"Sayı mecvut:" + sought;
			mesajVer (mesaj);
			}	*/
			
			
		} else {
			//System.out.println("Sayı mecvut değil: " + sought);	//1. yöntem
			mesajVer ("Sayı mecvut değil:" + sought);	//2. yöntem
		}
						//1. yöntem
	}
	/*public static void mesajVer(int sought) {
		System.out.println("Sayı mecvut:" + sought);
	} */ 	
						//2. yöntem
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
		
}
