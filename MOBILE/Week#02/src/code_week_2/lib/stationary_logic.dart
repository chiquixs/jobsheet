double getPrice(int pilihan) {
  // list harga dengan menggunakan operator relasional
  if (pilihan == 1) return 90000;
  if (pilihan == 2) return 15000;
  if (pilihan == 3) return 25000;
  if (pilihan == 4) return 10000;
  return 0;
}

double hitungSubtotal(double harga, int jumlah) {
  return harga * jumlah; // penggunaan operator arithmetic
}

double diskonBelanja(double total) {
  return total > 50000 ? 3000 : 0; // penggunaan operator ternary untuk menentukan diskon
}

int setPromoFlag(double total, String member) {
  int promo = 0;

  //   promo Diskon 3000  -> nilai 1  -> biner 0001
  //   promo Member 5%    -> nilai 2  -> biner 0010

  //   dengan begitu, satu variabel 'promo' bisa menyimpan lebih dari satu status promo sekaligus
  //   jika total belanja lebih dari 50.000
  //   maka aktifkan promo diskon 3000 dengan mengubah bit pertama menjadi 1 (0001)
      //  promo awal = 0000
      // promo | 0001
      // hasil      = 0001  (promo diskon 3000 aktif)

  if (total > 50000) promo |= 1; // bitwise OR
  if (member == "y" && total > 0) promo |= 2; // logical + bitwise

  //  promo |= 2 maka :
  //     promo = promo | 2

  //     jika sebelumnya promo sudah 0001, maka:
  //     0001
  //   | 0010
  //   -------
  //     0011  (kedua promo aktif)


  return promo;
}

double applyPromo(double total, int promo) {
  // penggunaan assignment operator untuk menerapkan hasil dari diskon berdasarkan flag promo yang sudah ditentukan
  if ((promo & 1) != 0) {
    total -= 3000; // ini memiliki arti total = total - 3000
  }

  if ((promo & 2) != 0) {
    total -= total * 0.05; // ini memiliki arti total = total - (total * 0.05)
  }

  return total;
}
