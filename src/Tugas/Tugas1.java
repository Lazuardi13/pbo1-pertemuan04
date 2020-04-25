package Tugas;

public class Tugas1 {
    public static void main(String[] args) {
        int isiKolam = 0;
        int penuh = 1000;

        System.out.println("Isi Kolam Sekarang : " + isiKolam + "L");
        System.out.println("Isi Kolam Ketika Penuh : " + penuh + "L");

        while (isiKolam != penuh){
            isiKolam++;
            System.out.println("Sedang mengisi Kolam..");
            System.out.println("Isi Kolam Sekarang : " + isiKolam + "L");
        }
        System.out.println("Finale : Isi Kolam Sekarang : " + isiKolam + "L");

    }
}
