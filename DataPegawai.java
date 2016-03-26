import java.util.Scanner;
public class DataPegawai {
	public static void main(String... args) {
	//char Nm;
	//String S;
	System.out.print("NIK Pegawai : ");
	Scanner scan = new Scanner(System.in);
	String nik = scan.next();
	System.out.print("Nama Lengkap : ");		
	String nd = scan.next();
	String nb = scan.next();	
	//Nm = scan.nextLine();
	//Nm = S.charAt(1);
	System.out.print("Usia : ");
	int usia = scan.nextInt();
	System.out.print("Jenis Kelamin : ");
	String jk = scan.next();
	System.out.print("IPK : ");
	Double ipk = scan.nextDouble();
	
	System.out.println("");
	System.out.println("");
	System.out.println("NIK Pegawai   : " + nik);
	System.out.println("Nama Lengkap  : " + nd + " " + nb);	
	System.out.println("Usia Pegawai  : " + usia);
	System.out.println("Jenis Kelamin : " + jk);
	System.out.println("IPK Pegawai   : " +ipk);

}
}