import java.util.Scanner;
public class Pemilihan2Percobaan118{
    public static void main(String[] args){
        Scanner input18 = new Scanner(System.in);
        //Deklarasi
        int tahun;

        //output
        System.out.print("Masukkan tahun: ");
        tahun = input18.nextInt();
        //Pemilihan
        if((tahun % 4)==0){
            if((tahun % 100) !=0){
                System.out.println("Tahun Kabisat");
            }else{
                System.out.println("Bukan Tahun Kabisat");
    }}
    
}
}