import 'package:src/function_244107060020.dart'; // mengakses fungsi yang ada di lib

void main() {
  // 1. identitas & personalisasi NIM
  String nama = "Nafisa Chiquita Finandra Putri";
  String nim = "244107060020";
  
  // mengambil 3 digit terakhir NIM (020) menjadi nilai double
  double nilaiUnikNIM = 20.0; 

  // 2. variabel & tipe data (list harga barang)
  List<double> hargaBarang = [50000.0, 50000.0, 35000.0, 35000.0, 30000.0]; // bisa merubah data harga dengan merubah list harga disini
  
  // menambahkan nilaiUnikNIM sebagai elemen ke 6
  hargaBarang.add(nilaiUnikNIM);

  // 3. null safety (variabel keterangan diskon yang bisa bernilai null)
  String? pesanDiskon;
  double besarDiskon = 0;

  // 4. membuat fungsi dengan looping untuk menghitung total belanja (hitungTotal) yang akan saya letakkan di lib/function.dart
  // memanggil fungsi hitungTotal untuk menghitung total belanja awal
  double totalAwal = hitungTotal(hargaBarang);
  
  // 5. control Flow (logika percabangan diskon)
  if (totalAwal > 200000) {
    besarDiskon = totalAwal * 0.10; // diskon 10%
    pesanDiskon = "Selamat! kamu mendapatkan diskon 10%";
  } else if (totalAwal >= 100000) {
    besarDiskon = totalAwal * 0.05; // diskon 5%
    pesanDiskon = "Selamat! kamu mendapatkan diskon 5%";
  } else {
    besarDiskon = 0; // diskon 0%
    pesanDiskon = "Maaf, kamu belum mendapatkan diskon (0%)";
  }

  // menghitung total akhir
  double totalAkhir = totalAwal - besarDiskon;

  // 6. output
  print("--- Laporan Transaksi Toko ---");
  print("Nama          : $nama");
  print("NIM           : $nim");
  print("Total Awal    : Rp ${totalAwal.toStringAsFixed(2)}");
  print("");
  // menggunakan operator ! saat mencetak variabel null safety
  print("Keterangan    : ${pesanDiskon!}"); 
  
  print("Besar Diskon  : Rp ${besarDiskon.toStringAsFixed(2)}");
  print("Total Akhir   : Rp ${totalAkhir.toStringAsFixed(2)}");
  print("---------------------------------");
}