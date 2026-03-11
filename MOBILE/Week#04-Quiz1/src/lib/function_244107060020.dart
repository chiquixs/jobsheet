// fungsi untuk menghitung total belanja menggunakan perulangan for-in
double hitungTotal(List<double> daftarHarga) {
  double total = 0;
  // menggunakan perulangan for-in untuk memenuhi kriteria soal
  for (var harga in daftarHarga) {
    total += harga;
  }
  return total;
}