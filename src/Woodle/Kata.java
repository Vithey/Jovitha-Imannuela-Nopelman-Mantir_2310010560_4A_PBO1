
package Woodle;

public abstract class Kata {
    //atribut untuk class Kata
    //ecapsilation protek
    protected String kata;
    
    //Mengambil katakunci dari array sesuai kategori
    protected String randomKata(String[] daftar) {
        int i = (int)(Math.random() * daftar.length);
        return daftar[i];
    }
    
    //Mutator
    public void setKata(String kata) {
        this.kata = kata;
    }
    //Accessor
    public String getKata() {
        return kata;
    }
    public abstract String getKategori();
    
    
    
}
