import 'dart:io'; // library Dart untuk input dan output


void konversiMataUang() {
  print("Currency Converter - Rupiah (IDR) ke SGD, MYR, PHP");

  print("Meminta input jumlah uang dalam Rupiah dari user");
  stdout.write("Masukkan jumlah uang dalam Rupiah : ");
  double idr = double.parse(stdin.readLineSync()!); // menerima input dari user dan mengubahnya menjadi double, null safety dengan tanda ! untuk memastikan input tidak null

  // menetapkan kurs mata uang untuk konversi
  double kursSGD = 13200;
  double kursMYR = 4300;
  double kursPHP = 291;

  // melakukan konversi mata uang dengan menggunakan operator arithmetic
  double sgd = idr / kursSGD;
  double myr = idr / kursMYR;
  double php = idr / kursPHP;

  // print hasil konversi dengan 2 angka di belakang koma dengan menggunakan toStringAsFixed untuk membatasi jumlah angka desimal yang ditampilkan
  print("\nHasil Konversi : ");
  print("Dollar Singapura (SGD) : ${sgd.toStringAsFixed(2)}");
  print("Ringgit Malaysia (MYR) : ${myr.toStringAsFixed(2)}");
  print("Peso Filipina (PHP) : ${php.toStringAsFixed(2)}");
}
