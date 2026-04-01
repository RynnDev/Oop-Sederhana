package pertemuan3;

public class KRS {
    public Mahasiswa mahasiswa;
    public Matakuliah matakuliah;

    public KRS(Mahasiswa mahasiswa, Matakuliah matakuliah) {
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
    }

    void showKRS() {
        mahasiswa.showMahasiswa();
        matakuliah.showMK();
    }
}
