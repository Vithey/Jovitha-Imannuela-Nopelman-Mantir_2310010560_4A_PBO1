
package Woodle;

public class KataBuah extends Kata {
    //Kontruktor
    public KataBuah() {
        String[] daftar = {"LEMON", "MELON", "ALMON", "JERUK", "JAMBU", "KURMA","LIMAU","NANAS","SUKUN","SALAK","TIMUN"};
        this.kata = randomKata(daftar);
    }
    
    @Override
    public String getKategori() {
        return "Buah";
    }
}
