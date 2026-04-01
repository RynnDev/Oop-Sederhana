package pertemuan3;

public class Matakuliah {
    public String kodeMK;
    public String namaMK;
    public int sks;

    public Matakuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void showMK() {
       System.out.println("Mata Kuliah: " + namaMK + " (" + sks + " SKS)");
    }
}
