import 'dart:io'; // library Dart untuk input dan output

void calculate() {
  print("Calculator BMI");

  stdout.write("Masukkan berat badan (kg) : "); // menampilkan teks tanpa pindah baris
  double berat = double.parse(stdin.readLineSync()!); // menerima input dari user dan mengubahnya menjadi double

  stdout.write("Masukkan tinggi badan (cm) : "); // menampilkan teks tanpa pindah baris
  double tinggiCm = double.parse(stdin.readLineSync()!); // menerima input dari user dan mengubahnya menjadi double

  // convert tinggi dari cm ke meter
  double tinggiMeter = tinggiCm / 100;

  // menghitung BMI berdasarkan rumus
  double bmi = berat / (tinggiMeter * tinggiMeter);

  // menampilkan hasil BMI dengan 2 angka di belakang koma
  print("Hasil BMI kamu: ${bmi.toStringAsFixed(2)}");

  // menentukan kategori berdasarkan nilai BMI
  if (bmi < 18.5) {
    print("Kategori: Kurus");
  } else if (bmi < 25) {
    print("Kategori: Normal");
  } else if (bmi < 30) {
    print("Kategori: Overweight");
  } else {
    print("Kategori: Obesitas");
  }
}