import 'dart:io'; // library Dart untuk input dan output
import 'package:code_week_2/stationary_logic.dart';

void main() {
  double total = 0; // variable untuk menyimpan total harga
  int totalItem = 0; // variable untuk menyimpan total jumlah item yang dibeli

  print("Welcome to the Shop!");
  print("Dapatkan diskon Rp 3000 untuk pembelian di atas Rp 50.000");
  print("Dapatkan diskon tambahan 5% untuk member!");

  while (true) {
    print("\n1. Book     : Rp 90.000");
    print("2. Pen      : Rp 15.000");
    print("3. Notebook : Rp 25.000");
    print("4. Pencil   : Rp 10.000");
    print("0. Selesai");

    // menerima input pilihan barang dari user
    stdout.write("Pilih barang: ");
    String? input = stdin.readLineSync();
    int? pilihan = int.tryParse(input ?? ""); // program akan mencoba mengubah input menjadi integer, jika gagal/inputan bukan berupa int maka terdapat warning dan nilai pilihan akan default null

    // validasi input
    if (pilihan is! int) {
      print("Input harus angka!");
      continue;
    }

    // berhenti jika pilihan 0
    if (pilihan == 0) break;

    stdout.write("Masukkan jumlah: ");
    int jumlah = int.tryParse(stdin.readLineSync() ?? "") ?? 0; // menerima input jumlah barang yang dibeli, jika inputan null/bukan int maka default 0

    totalItem += jumlah; // increment via += untuk mendapatkan total item yang dibeli

    double harga = getPrice(pilihan); // memanggil fungsi getPrice untuk mendapatkan harga berdasarkan pilihan barang

    // validasi pilihan barang
    if (harga == 0) {
      print("Pilihan tidak valid!");
      continue;
    }

    // menghitung subtotal untuk barang yang dipilih dan jumlah yang dibeli, lalu disimpan ke total
    total += hitungSubtotal(harga, jumlah);

    print("Subtotal: Rp $total");
  }

  if (!(total > 0)) { // jika total tidak lebih besar dari 0, maka tidak ada transaksi
    print("Tidak ada transaksi yang dilakukan");
    return;
  }

  stdout.write("\nApakah Anda member? (y/n): ");
  String member = stdin.readLineSync() ?? "n"; // null aware / memberikan default value "n" jika inputan null

  int promo = setPromoFlag(total, member); // mendapatkan flag promo berdasarkan total belanja dan status member

  total = applyPromo(total, promo); // menerapkan promo ke total belanja berdasarkan flag yang sudah ditentukan

  print("\nTotal item : $totalItem");
  print("Total akhir : Rp $total");
  print("Terima kasih sudah berbelanja!");
}