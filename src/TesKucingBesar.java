//Perintah Inheritance
//Kelas turunnya
package Latihan01.sesi1.bin;

public class TesKucingBesar
{
	public static void main(String[] Xx)
	{
		Singa mySinga = new Singa("SIMBA SURAI");
		System.out.println("Singa merupakan " +Singa.nama);
		mySinga.Makan();
		
		Harimau myHarimau = new Harimau("HARIMAU SUMATRA");
		System.out.println("Harimau merupakan " +Harimau.nama);
		myHarimau.Makan();
	}
}