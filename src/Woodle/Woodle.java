
package Woodle;

public class Woodle {
    //Atribut
    //Encapsulation private
    private String input;
    private String hasil;
    private String kataKunci;
    
    //Constructor
    public Woodle(String input, String kataKunci) {
        this.input = input.toUpperCase();
        this.kataKunci = kataKunci;
        this.hasil = verifikasi();
    }
    
    //Accessor
    public String getInput() {
        return input;
    }
    public String getHasil() {
        return hasil;
    }
    
    //Seleksi memproses huruf
    private String verifikasi() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < kataKunci.length(); i++) {
            char c = input.charAt(i);
            if (c == kataKunci.charAt(i)) {
                sb.append("O ");
            } else if (kataKunci.contains(String.valueOf(c))) {
                sb.append("~ ");
            } else {
                sb.append("x ");
            }
        }
        return sb.toString();
    }
    
    //Poli overloading
    public static void infoTabel(Woodle[] tebakanList) {
        System.out.println("\n=== HASIL WOODLE ===\n");
        //Seleksi
        for (Woodle t : tebakanList) {
            //Seleksi
            if (t != null) {
                System.out.print("| ");
                for (char c : t.getInput().toCharArray()) {
                    System.out.print(c + " | ");
                }
                System.out.println(" --> " + t.getHasil());
            } else {
                System.out.println("| _ | _ | _ | _ | _ |");
            }
        }
    }
    
    //poli overloading
    public static void infoKategori(String kategori) {
        System.out.println("\n=== WOODLE - Kategori: " + kategori.toUpperCase() + " ===");
        System.out.println("TIPS : ");
        System.out.println("O = BENAR");
        System.out.println("~ = LETAK SALAH");
        System.out.println("x = SALAH");
    }

    
}
