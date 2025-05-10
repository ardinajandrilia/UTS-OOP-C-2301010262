package uts.oop.c.pkg2301010262;

import java.util.Scanner;


/**
 * Program untuk mengelola koleksi buku perpustakaan
 * @author Ardina
 * TGL 10 Mei 2025
 */
class Perpustakaan {
    static Buku[] koleksiBuku = new Buku[100];
    static int jumlahBuku = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== MENU APLIKASI PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Koleksi Buku");
            System.out.println("3. Ubah Data Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();  // Clear buffer

            switch (pilihan) {
                case 1: tambahBuku(); break;
                case 2: tampilkanBuku(); break;
                case 3: ubahBuku(); break;
                case 4: hapusBuku(); break;
            }
        } while (pilihan != 5);
    }

    static void tambahBuku() {
        System.out.print("Masukkan Kode Buku: ");
        String kode = input.nextLine();
        System.out.print("Masukkan Judul Buku: ");
        String judul = input.nextLine();
        System.out.print("Masukkan Nama Pengarang: ");
        String pengarang = input.nextLine();
        koleksiBuku[jumlahBuku] = new Buku(kode, judul, pengarang);
        jumlahBuku++;
        System.out.println("Buku berhasil ditambahkan.");
    }

    static void tampilkanBuku() {
        if (jumlahBuku == 0) {
            System.out.println("Tidak ada buku yang tersedia.");
        } else {
            for (int i = 0; i < jumlahBuku; i++) {
                System.out.print((i + 1) + ". ");
                koleksiBuku[i].displayInfo();
            }
        }
    }

    static void ubahBuku() {
        tampilkanBuku();
        System.out.print("Pilih buku yang ingin diubah (nomor): ");
        int index = input.nextInt() - 1;
        input.nextLine();
        if (index >= 0 && index < jumlahBuku) {
            System.out.print("Masukkan Kode Buku baru: ");
            koleksiBuku[index].setKodeBuku(input.nextLine());
            System.out.print("Masukkan Judul Buku baru: ");
            koleksiBuku[index].setJudul(input.nextLine());
            System.out.print("Masukkan Nama Pengarang baru: ");
            koleksiBuku[index].setPengarang(input.nextLine());
            System.out.println("Data buku berhasil diubah.");
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    static void hapusBuku() {
        tampilkanBuku();
        System.out.print("Pilih buku yang ingin dihapus (nomor): ");
        int index = input.nextInt() - 1;
        input.nextLine();
        if (index >= 0 && index < jumlahBuku) {
            for (int i = index; i < jumlahBuku - 1; i++) {
                koleksiBuku[i] = koleksiBuku[i + 1];
            }
            koleksiBuku[jumlahBuku - 1] = null;
            jumlahBuku--;
            System.out.println("Buku berhasil dihapus.");
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }
}

/**
 * Kelas Buku untuk menyimpan informasi tentang buku
 */
class Buku {
    private String kodeBuku;
    private String judul;
    private String pengarang;

    public Buku(String kodeBuku, String judul, String pengarang) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void displayInfo() {
        System.out.println("Kode Buku: " + kodeBuku + ", Judul: " + judul + ", Pengarang: " + pengarang);
    }
}
