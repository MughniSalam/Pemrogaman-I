//Peintah Class & Object - Dosen12

//package Latihan01.sesi1.bin;

public class Dosen12
{
	String nama;
	String email;
	
	//begitu kita mendifinisikan constructor.
	//java tidak akan membuatkan default constructor
	
	public Dosen12(String nama, String email)
	{
		this.nama = nama;
		this.email = email;
	}
	
	//tidak otomatis dibuatkan oleh java
	//bila dibutuhkan kita harus buat sendiri
	
	public Dosen12() {}
	
	//Method
	public void info()
	{
		System.out.println("Nama Dosen12  : " +nama);
		System.out.println("Email Dosen12 : " +email);
		System.out.println();
		System.out.println();
	}
}