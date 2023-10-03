import java.util.Scanner;
public class Pemilihan2Percobaan218 {
    public static void main(String[] args){
        Scanner input18 = new Scanner(System.in);
        //Deklarasi
        float sudut1, sudut2, sudut3, totalSudut;
        //output
        System.out.print("Masukkan Sudut 1: ");
        sudut1 = input18.nextFloat();
        System.out.print("Masukkan Sudut 2: ");
        sudut2 = input18.nextFloat();
        System.out.print("Masukkan Sudut 3: ");
        sudut3 = input18.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if(totalSudut == 180){
            if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }else{
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
            }
        }else{
            System.out.println("Bukan segitiga");
        }
    }
}
