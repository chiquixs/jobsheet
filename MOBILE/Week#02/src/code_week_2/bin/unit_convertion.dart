import 'dart:io'; // library Dart untuk input dan output

import 'package:code_week_2/unit_convertion_logic.dart';

void main() {
  // program akan terus berjalan sampai user memilih untuk keluar dengan memasukkan angka 0
  while (true) {
    print("\nUnit Convertion Program");
    print("Pilih kategori konversi dengan memasukkan angka :");
    print("1. Panjang");
    print("2. Massa");
    print("3. Volume");
    print("4. Suhu");
    print("0. Keluar");

    // menerima input pilihan kategori konversi dari user
    stdout.write("Pilih kategori: ");
    String? pilihan = stdin.readLineSync();

    // menggunakan switch case untuk menentukan fungsi konversi mana yang akan dijalankan berdasarkan input pilihan user
    switch (pilihan) {
      case '1':
        konversiPanjang();
        break;
      case '2':
        konversiMassa();
        break;
      case '3':
        konversiVolume();
        break;
      case '4':
        konversiSuhu();
        break;
      case '0':
        print("Terima kasih !");
        return;
      default:
        print("Pilihan tidak valid!");
    }
  }
}