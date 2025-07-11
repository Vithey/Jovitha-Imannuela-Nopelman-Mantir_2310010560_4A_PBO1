
package Woodle;

public class KataHewan extends Kata {
    //Kontruktor
    public KataHewan() {
        String[] daftar = {"GAJAH", "TIKUS", "BEBEK", "BADAK", "ZEBRA", "SINGA", "RAKUN","KOALA","DOMBA","CITAH","BUAYA"};
        this.kata = randomKata(daftar);
    }
    @Override
    public String getKategori() {
        return "Hewan";
    }
}
