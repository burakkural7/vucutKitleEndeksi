package vucutKitleEndeksi;

public class Main {

	public static void main(String[] args) {
		double agirlik=54.7;
		double boy=1.75;
		double vki=agirlik/(boy*boy);
		if(vki>=0&&vki<18.5)  {
			System.out.println("Zayıf");
		}
			if(vki>=18.5&&vki<24.9)  {
				System.out.println("Normal");
				}

	}

}
