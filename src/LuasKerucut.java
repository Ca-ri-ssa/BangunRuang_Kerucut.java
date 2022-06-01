import java.util.Scanner;  
public class LuasKerucut
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Masukkan panjang radius = ");
        int rad = num.nextInt();
        System.out.println("Masukkan panjang garis pelukis = ");
        int garpel = num.nextInt();
        double phi = 3.14;

        System.out.println("\nDiketahui bahwa kerucut memiliki panjang radius yaitu " + rad + " cm dan memiliki garis pelukis yaitu " + garpel + " cm.");

        double luas = phi*rad+(rad+garpel);
        System.out.println("Jawaban\n" + "Luas kerucut = " + luas + " cm.");
    }
}