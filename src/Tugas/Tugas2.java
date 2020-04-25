package Tugas;

public class Tugas2 {
    public static void main(String[] args) {
        double[][] nilaiPraktikum = new double[5][30];
        int bobot[] = {1, 1, 1, 1};

        nilaiPraktikum[0][0] = 60;
        nilaiPraktikum[1][0] = 70;
        nilaiPraktikum[2][0] = 80;
        nilaiPraktikum[3][0] = 90;

        nilaiPraktikum[4][0] = nilaiPraktikum[0][0] * bobot[0] +
                nilaiPraktikum[1][0] * bobot[1] +
                nilaiPraktikum[2][0] * bobot[2] +
                nilaiPraktikum[3][0] * bobot[3];

        System.out.println("Nilai Praktikum Mahasiswa 1 : " + nilaiPraktikum[4][0]);

        nilaiPraktikum[0][1] = 90;
        nilaiPraktikum[1][1] = 80;
        nilaiPraktikum[2][1] = 70;
        nilaiPraktikum[3][1] = 60;

        nilaiPraktikum[4][1] = 0;
        for (int i = 0; i <= 3; i++) {
            nilaiPraktikum[4][1] += nilaiPraktikum[i][1] * bobot[i];

        }

        System.out.println("Nilai Praktikum Mahasiswa 2 :" + nilaiPraktikum[4][0]);

        double jumlahNilaiAkhir = 0;
        for (int i = 0; i <= 3; i++) {
            jumlahNilaiAkhir += nilaiPraktikum[4][i];
        }
        System.out.println(jumlahNilaiAkhir);
    }
}
