import 'dart:io'; // library Dart untuk input dan output

// saya menggunakan map dengan tipe data String sebagai key untuk nama satuan, dan double sebagai value untuk faktor konversi ke satuan dasar
// String → key (nama satuan)
// double → value (faktor konversi ke satuan dasar)

// -- KONVERSI PANJANG --
void konversiPanjang() {
  // mendefinisikan map untuk menyimpan unit konversi 
  Map<String, double> panjang = {
    'mm': 0.001,
    'cm': 0.01,
    'm': 1,
    'km': 1000,
    'inch': 0.0254,
  };
  
  // memanggil fungsi umum untuk melakukan konversi dengan kategori "PANJANG" dan map panjang yang sudah didefinisikan, serta mengatur allowNegative menjadi false karena panjang tidak boleh negatif
  konversiUmum("PANJANG", panjang, allowNegative: false);
}

// -- KONVERSI MASSA --
void konversiMassa() {
  // mendefinisikan map untuk menyimpan unit konversi 
  Map<String, double> massa = {
    'mg': 0.000001,
    'g': 0.001,
    'kg': 1,
    'ton': 1000,
    'lb': 0.453592,
  };

  // memanggil fungsi umum untuk melakukan konversi dengan kategori "MASSA" dan map massa yang sudah didefinisikan, serta mengatur allowNegative menjadi false karena massa tidak boleh negatif
  konversiUmum("MASSA", massa, allowNegative: false);
}

// -- KONVERSI VOLUME --
void konversiVolume() {
  // mendefinisikan map untuk menyimpan unit konversi 
  Map<String, double> volume = {
    'ml': 0.001,
    'liter': 1,
    'm3': 1000,
    'cc': 0.001,
    'galon': 3.78541,
  };

  // memanggil fungsi umum untuk melakukan konversi dengan kategori "VOLUME" dan map volume yang sudah didefinisikan, serta mengatur allowNegative menjadi false karena volume tidak boleh negatif
  konversiUmum("VOLUME", volume, allowNegative: false);
}

// -- KONVERSI SUHU --
void konversiSuhu() {
  print("\n-- KONVERSI SUHU -- ");
  print("Unit : C, F, K, R");
  stdout.write("Masukkan nilai suhu : ");
  double? nilai = double.tryParse(stdin.readLineSync()!);

  // validasi jika input bukan angka, hentikan fungsi
  if (nilai == null) {
    print("Input tidak valid!");
    return;
  }

  // meminta unit asal
  stdout.write("Dari unit : ");
  // toUpperCase() agar input tidak case sensitive
  // misalnya user input c atau C tetap dianggap sama
  String from = stdin.readLineSync()!.toUpperCase();

  // meminta unit tujuan
  stdout.write("Ke unit : ");
  String to = stdin.readLineSync()!.toUpperCase();

  double hasil;
  double celcius;

  // semua suhu dikonversi dulu ke Celcius supaya lebih mudah dan sistematis
  switch (from) {
    case 'C':
    // jika sudah Celcius, langsung gunakan nilainya
      celcius = nilai;
      break;
    case 'F':
      celcius = (nilai - 32) * 5 / 9;
      break;
    case 'K':
      celcius = nilai - 273.15;
      break;
    case 'R':
      celcius = nilai * 5 / 4;
      break;
    default:
      print("Unit tidak valid!");
      return;
  }

  // setelah jadi Celcius, konversi ke unit tujuan
  switch (to) {
    case 'C':
      hasil = celcius;
      break;
    case 'F':
      hasil = (celcius * 9 / 5) + 32;
      break;
    case 'K':
      hasil = celcius + 273.15;
      break;
    case 'R':
      hasil = celcius * 4 / 5;
      break;
    default:
      print("Unit tidak valid!");
      return;
  }

  print("\nHasil Konversi :");
  // toStringAsFixed(2) digunakan untuk membatasi 2 angka di belakang koma
  print("${nilai.toStringAsFixed(2)} $from = ${hasil.toStringAsFixed(2)} $to");
}


// Fungsi umum untuk konversi panjang, massa, dan volume
void konversiUmum(String kategori, Map<String, double> data,
    {required bool allowNegative}) {
  print("\n-- KONVERSI $kategori -- ");

  // menampilkan semua unit yang tersedia (key dari Map)
  // data.keys mengambil semua nama satuan
  // join(", ") menggabungkan menjadi satu string dipisahkan koma
  print("Unit tersedia : ${data.keys.join(", ")}");

  // meminta user memasukkan nilai yang ingin dikonversi
  stdout.write("Masukkan nilai : ");

  // tryParse agar tidak error jika input bukan angka
  double? nilai = double.tryParse(stdin.readLineSync()!);

  // validasi jika input bukan angka
  if (nilai == null) {
    print("Input tidak valid!");
    return;
  }

  // validasi nilai negatif
  // jika allowNegative = false dan nilai < 0 maka ditolak
  if (!allowNegative && nilai < 0) {
    print("Nilai tidak boleh negatif!");
    return;
  }

  // meminta unit asal
  stdout.write("Dari unit : ");
  // toLowerCase() agar tidak sensitif terhadap huruf besar/kecil
  String from = stdin.readLineSync()!.toLowerCase();

  // meminta unit tujuan
  stdout.write("Ke unit : ");
  // toLowerCase() agar tidak sensitif terhadap huruf besar/kecil
  String to = stdin.readLineSync()!.toLowerCase();

  // mengecek apakah unit yang dimasukkan tersedia dalam map
  if (!data.containsKey(from) || !data.containsKey(to)) {
    print("Unit tidak tersedia!");
    return;
  }

  // PROSES KONVERSI
  // pertama, konversi nilai ke satuan dasar dengan mengalikan faktor konversi dari unit asal (data[from])
  // kemudian, konversi dari satuan dasar ke unit tujuan dengan membagi faktor konversi dari unit tujuan (data[to])
  double nilaiDasar = nilai * data[from]!;
  double hasil = nilaiDasar / data[to]!;

  // menampilkan hasil konversi dengan 2 angka di belakang koma
  print("\nHasil Konversi :");
  // toStringAsFixed(2) membatasi 2 angka di belakang koma
  print("${nilai.toStringAsFixed(2)} $from = ${hasil.toStringAsFixed(2)} $to");
}