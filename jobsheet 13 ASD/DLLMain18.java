import java.util.Scanner;
public class DLLMain18 {
    public static void main(String[] args) {
        DoubleLinkedList18 list = new DoubleLinkedList18();
        Scanner scan = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Insert After");
            System.out.println("8. Menambahkan data pada index tertentu");
            System.out.println("9. mengahpus data pada index tertentu");
            System.out.println("10. Menghapus data setelah key");
            System.out.println("11. Menampilkan data pertama");
            System.out.println("12. Menampilkan data paling akhir");
            System.out.println("13. Menampilkan data pada index tertentu");
            System.out.println("14. Menampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();
            
            switch (pilihan) {
                case 1 :
                    System.out.print("NIM : ");
                    String nim = scan.nextLine();
                    System.out.print("Nama : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = scan.nextLine();
                    System.out.print("IPK : ");
                    String ipkst = scan.nextLine();
                    double ipk = Double.parseDouble(ipkst);
                    Mahasiswa18 mhs = new Mahasiswa18(nim, nama, kelas, ipk);
                    list.addFirst(mhs);
                    System.out.println("Mahasiswa berhasil ditambahkan ! ");
                    list.print();
                    break;
                
                case 2 :
                    System.out.print("NIM : ");
                    nim = scan.nextLine();
                    System.out.print("Nama : ");
                    nama = scan.nextLine();
                    System.out.print("Kelas : ");
                    kelas = scan.nextLine();
                    System.out.print("IPK : ");
                    ipkst = scan.nextLine();
                    ipk = Double.parseDouble(ipkst);
                    Mahasiswa18 mhs1 = new Mahasiswa18(nim, nama, kelas, ipk);
                    list.addLast(mhs1);
                    System.out.println("Mahasiswa berhasil ditambahkan ! ");
                    list.print();
                    break;

                case 3 :
                    list.removeFirst();
                    System.out.println("Berhasil menghapus data teratas");
                    list.print();
                    break;

                case 4 :
                    list.removeLast();
                    System.out.println("Berhasil menghapus data terbawah");
                    list.print();
                    break;

                case 5 :
                    list.print();
                    break;

                case 6 :
                    System.out.print("Masukkan NIM yang dicari : ");
                    String nim1 = scan.nextLine();
                    Node18 found = list.search(nim1);
                    if (found != null ) {
                        System.out.println("Data Ditemukan");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;

                case 7 :
                    System.out.print("Masukkan NIM node yang ingin disisipkan setelahnya: ");
                    String keyNim = scan.nextLine();
                    System.out.print("NIM : ");
                    nim = scan.nextLine();
                    System.out.print("Nama : ");
                    nama = scan.nextLine();
                    System.out.print("Kelas : ");
                    kelas = scan.nextLine();
                    System.out.print("IPK : ");
                    ipkst = scan.nextLine();
                    ipk = Double.parseDouble(ipkst);
                    Mahasiswa18 mhs2 = new Mahasiswa18(nim, nama, kelas, ipk);
                    list.insertAfter(keyNim, mhs2);
                    list.print();
                    break;

                case 8 :         
                    System.out.print("Masukkan indeks (0 sampai " + list.size() + "): ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    System.out.print("NIM : ");
                    nim = scan.nextLine();
                    System.out.print("Nama : ");
                    nama = scan.nextLine();
                    System.out.print("Kelas : ");
                    kelas = scan.nextLine();
                    System.out.print("IPK : ");
                    ipkst = scan.nextLine();
                    ipk = Double.parseDouble(ipkst);
                    Mahasiswa18 mhs3 = new Mahasiswa18(nim, nama, kelas, ipk);
                    list.add(index, mhs3);
                    break;
                                    
                case 9 :
                    System.out.print("Masukkan indeks yang akan dihapus (0 sampai " + (list.size() - 1) + "): ");
                    index = scan.nextInt();
                    scan.nextLine();
                    list.remove(index);
                    break;

                case 10 : 
                    System.out.print("Masukkan NIM key (data yang akan dihapus setelahnya): ");
                    nim = scan.nextLine();
                    list.removeAfter(nim);
                    break;

                case 11 :
                    Mahasiswa18 first = list.getFirst();
                    if (first != null) {
                        System.out.println("Data pertama:");
                        first.tampil();
                    }
                    break;

                case 12 :
                    Mahasiswa18 last = list.getLast();
                    if (last != null) {
                        System.out.println("Data terakhir:");
                        last.tampil();
                    }
                    break;

                case 13 :
                    System.out.print("Masukkan indeks yang ingin ditampilkan (0 sampai " + (list.size() - 1) + "): ");
                    index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa18 data = list.getIndex(index);
                    if (data != null) {
                        System.out.println("Data pada indeks " + index + ":");
                        data.tampil();
                    }
                    break;

                case 14 :
                    System.out.println("Jumlah data dalam list: " + list.size());
                    break;

                case 0 : 
                    System.out.println("Keluar dari program");
                    break;

                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);
    }
    
}