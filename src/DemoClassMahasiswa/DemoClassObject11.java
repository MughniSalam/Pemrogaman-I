//Perintah Class & Object - DemoClassObject1

//package Latihan01.sesi1.bin;

public class DemoClassObject11
{
	public static void main(String[] Xx)
	{
		Mahasiswa12.jumlah = 0;
		//Mahasiswa12.nim = "999"; //error, instance variabel harus ada objectnya dulu
		System.out.println("Jumlah Mahasiswa12 : " +Mahasiswa12.jumlah);
		
		Mahasiswa12 m1 = new Mahasiswa12();
		m1.nim = "123";
		m1.nama = "Candra";
		m1.jumlah = 1;
		
		Mahasiswa12 m2 = new Mahasiswa12();
		m1.nim = "456";
		m1.nama = "Mughni";
		m1.jumlah = 2;
		
		tampilkanMahasiswa12(m1);
		tampilkanMahasiswa12(m2);
		System.out.println("Jumlah Mahasiswa12 : " +Mahasiswa12.jumlah);
	}
	
	public static void tampilkanMahasiswa12(Mahasiswa12 m)
	{
		System.out.println(" NIM   	: " +m.nim);
		System.out.println(" Nama   : " +m.nim);
		System.out.println(" Jumlah : " +m.nim);
		System.out.println("");
		System.out.println("");
	}
}
		