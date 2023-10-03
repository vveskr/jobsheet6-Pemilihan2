import java.util.Scanner;
public class Pemilihan2Percobaan318 {
    public static void main(String[] args){
        Scanner input18 = new Scanner(System.in);
        //Deklarasi
        String kategori,anotherString;
        int penghasilan, gajiBersih;
        double pajak = 0;
        //output
        System.out.print("Masukkan Kategori: ");
        kategori = input18.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan: ");
        penghasilan = input18.nextInt();

        if(kategori.equalsIgnoreCase(anotherString="pekerja")){
            if(penghasilan <= 20000000){
            pajak = 0.1;
            }else if(penghasilan <= 3000000){
                pajak = 0.15;
            }else{
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (pajak*penghasilan));
            System.out.print("Penghasilan Bersih: " + gajiBersih);
            }else if(kategori.equalsIgnoreCase(anotherString="pebisnis")){
                if(penghasilan <= 2500000){
                    pajak = 0.15;
                }else if(penghasilan <= 3500000) {
                    pajak = 0.2;
                }else{
                    pajak = 0.25;
                }
                gajiBersih = (int) (penghasilan - (pajak*penghasilan));
                System.out.print("Penghasilan Bersih: " + gajiBersih);
            }else{
                System.out.println("Masukkan Kategori Salah");
            }
        }
    }

