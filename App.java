package pertemuan3;

public class App {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("25003002", "Ryan Adriyanto", "Sistem Informasi", 2025);
        Matakuliah mk1 = new Matakuliah("DI253", "Pemrograman Java", 4);
        KRS krs1 = new KRS(mhs1, mk1);

        Mahasiswa mhs2 = new Mahasiswa("24003001", "Krisna Kernok", "Sistem Informasi", 2024);
        KRS krs2 = new KRS(mhs2, mk1);

        krs1.showKRS();
        krs2.showKRS();
    }
}
