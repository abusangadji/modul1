import java.util.Scanner;
public class DataMahasiswa {
	public static void main(String... args) {
	
	System.out.print("NIM : ");
	Scanner scan = new Scanner(System.in);
	String nim = scan.next();
	System.out.print("Nama Lengkap Mahasiswa : ");		
	String nd = scan.next();
	String nb = scan.next();	
	System.out.print("Alamat Tinggal Mahasiswa : ");		
	String jlT = scan.next();
	String ktT = scan.next();
	String pvT = scan.next();
	System.out.print("Alamat Asal Mahasiswa : ");		
	String jlA = scan.next();
	String ktA = scan.next();
	String pvA = scan.next();
	//Nm = scan.nextLine();
	//Nm = S.charAt(1);
	System.out.print("No Telp / HP : ");
	Double hp = scan.nextDouble();
	System.out.print("Jenis Kelamin : ");
	String jk = scan.next();
	
	
	System.out.println("");
	System.out.println("");
	System.out.println("N I M                    : " + nim);
	System.out.println("Nama Lengkap Mahasiswa   : " + nd + " " + nb);	
	System.out.println("Alamat Tinggal Mahasiswa : " + jlT + " " + ktT + " " + pvT);
	System.out.println("Alamat Asal Mahasiswa    : " + jlA + " " + ktA + " " + pvA);
	System.out.println("No Telp / HP             : " + hp);
	System.out.println("Jenis Kelamin            : " + jk);
	

}
}