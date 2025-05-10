package uts.oop.c.pkg2301010262;

public class Buku {
    private String kodeBuku;
    private String judul;
    private String pengarang;

    public Buku() {}

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

    @Override
    public String toString() {
        return "Kode: " + kodeBuku + ", Judul: " + judul + ", Pengarang: " + pengarang;
    }
}
