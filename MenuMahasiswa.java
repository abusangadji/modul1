import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class MenuMahasiswa{

    public static void main(String[] args) throws IOException {
        try{
           Scanner pilmenu = new Scanner(System.in);
           Scanner scan = new Scanner(System.in);
           Scanner opt = new Scanner(System.in);
		   ArrayList<String> nims = new ArrayList<>();


           String opt1 = " ";

           do{
           System.out.println("APLIKASI MAHASISWA : ");
           System.out.println("1.Entry Data Mahasiswa");
           System.out.println("2.Cari Data Mahasiswa ");
           System.out.println("3.Keluar Program (EXIT)");

           System.out.print("Pilihan Anda (1-3):");

           int menu = pilmenu.nextInt();
           switch (menu){
           case 1 : System.out.print("NIM : ");	
					String nim = scan.next();		
					nims.add(nim);
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
                    break;
           case 2 : System.out.print("Masukan NIM  : ");	
					String nm = scan.next();
					for (String name : nims) {
						if (name.equals(nm))			
						System.out.println("N I M  : " + name);		
					}
                     break;
           case 3 : break;
            default : System.out.println("Maaf Menu Tidak Ada Dalam Pilihan !");
        }
			
			System.out.println("");
            System.out.println("Ingin Entry lagi ?");
            System.out.println("Tekan 'Y' untuk Ya dan 'N' untuk Tidak");


            opt1 = opt.nextLine();



                }
           while (opt1.equals("y") || opt1.equals("Y"));
            }

        catch(InputMismatchException IME){
            System.out.println("Maaf salah input!");
        }
    }
}