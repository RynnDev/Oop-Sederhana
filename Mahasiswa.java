package pertemuan3;

public class Mahasiswa {
    public String nim;
    public String nama;
    public String jurusan;
    public int angkatan;

    public Mahasiswa(String nim, String nama, String jurusan, int angkatan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    void showMahasiswa() {
        System.out.println("Mahasiswa: " + nama + " (" + nim + ")");
       
    }
}
