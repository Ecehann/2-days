package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int toplaSonuc = dortIslem.Topla(3, 4);
		System.out.println(toplaSonuc);
		
		
		dortIslem.Cıkar(3, 4);
		int cıkarSonuc = dortIslem.Cıkar(3, 4);
		System.out.println(cıkarSonuc);
		
		
		dortIslem.Carp(3, 4);
		int carpSonuc = dortIslem.Carp(3, 4);
		System.out.println(carpSonuc);
	}

}
