//Perintah Inheritance
//Kelas turunnya
package Latihan01.sesi1.bin;

class Harimau extends KucingBesar
{
	//Konstruktor untuk class Singa
	public Harimau(String namaHarimau)
	{
	//Mengisi pengubah yang diwarisi oleh kelas abstract
	Singa.nama = namaHarimau;
	}
	//Implementasi metode yang diwarisi dari kelas abstract
	public void Makan()
	{
	System.out.println("Singa makan daging");
	System.out.println();
	}
}