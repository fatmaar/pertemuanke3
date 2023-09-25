//Nama : Fatma Robbaniyah
//NIM  : 1237050030
//Kelas: A

import java.util.Scanner;

//memanggil class
class KasirQu {
  public static void main(String[] argumen) {

    //untuk menjalankan program
    boolean programBerjalan = true;

    //untuk memanggil data berupa angka
    int totalBarang1 = 0;
    int totalBarang2 = 0;
    int totalBarang3 = 0;
    int totalBarang4 = 0;
    int totalKeuntungan = 0;

    //input data
    Scanner inputPengguna = new Scanner(System.in);
    int nomorBarangDibeli;
    int kuantitasBarangDibeli;
    String kataPembuka;

    //pengulangan kata
    while(programBerjalan) {
      kataPembuka = "========================================================";
      kataPembuka += "\nSelamat datang di Toko Solusi, mau beli apa ?";
      kataPembuka += "\n1. Obat untuk menyembuhkan luka hati ($ 30) - " + totalBarang1 + " barang terjual";
      kataPembuka += "\n2. Jimat kaya selamanya ($ 20) - " + totalBarang2 + " barang terjual";
      kataPembuka += "\n3. Buku kumpulan doa agar berjodoh dengan dia ($ 35) - " + totalBarang3 + " barang terjual";
      kataPembuka += "\n4. Minuman keluarga cemara ($ 12) - " + totalBarang4 + " barang terjual";
      kataPembuka += "\n9. Program ini kurang bermanfaat, saya memilih keluar";
      kataPembuka += "\n\nTotal keuntungan toko saat ini $ " + totalKeuntungan + ",,, alhamdulillah";
      kataPembuka += "\n========================================================";
      kataPembuka += "\n\nPilih nomor barang (1 / 2 / 3 / 4):";

      //untuk memanggil data yang di perintahkan
      System.out.println(kataPembuka);
      nomorBarangDibeli = inputPengguna.nextInt();

      //kondisi jika nomorBarangDibeli (untuk menangani tanggapan atau keadaan)
      if (nomorBarangDibeli == 1 || nomorBarangDibeli == 2 || nomorBarangDibeli == 3 || nomorBarangDibeli == 4) {

        System.out.println("Barang nomor " + nomorBarangDibeli + " dipilih\nMau berapa banyak ?");
        kuantitasBarangDibeli = inputPengguna.nextInt();

        System.out.println("Barang nomor " + nomorBarangDibeli + " dibeli sejumlah " + kuantitasBarangDibeli + " buah");

        //untuk menghitung total
        switch(nomorBarangDibeli) {
          //jika barang nomor 1
          case 1:
            totalBarang1 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 30);
            break;
          //jika barang nomor 2
          case 2:
            totalBarang2 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 20);
            break;
          //jika barang nomor 3
          case 3:
            totalBarang3 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 35);
            break;
          //jika barang nomor 4
          case 4:
            totalBarang4 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 12);
            break;
        }

        //jika memilih no 5 dan o looping berakhir
      } else if (nomorBarangDibeli == 9) {
        programBerjalan = false; 
        System.out.println("Sayang sekali, kamu melewatkan banyak solusi rahasia");
      } else {
        System.out.println("Apa yang kamu pilih tidak layak untuk dibeli");
      }
    }
  }
}