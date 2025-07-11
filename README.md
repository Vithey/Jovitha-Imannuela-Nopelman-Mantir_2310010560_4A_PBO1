# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh program sederhana aplikasi permainan tebak kata **Woodle** menggunakan bahasa pemrograman Java sebagai tugas akhir dari Mata Kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini adalah permainan kata seperti Woodle yang menebak kata buah atau hewan yang memiliki 5 huruf dan memiliki kesempatan menebak hingga 10 kali. Pemain dapat memilih kategori dari kata yang akan ditebak.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam Pemrograman Berorientasi Objek (OOP) seperti **Class**, **Object**, **Atribut**, **Method Constructor**, **Method Mutator**, **Method Accessor**, **Encapsulation**, **Inheritance**, **Overloading**, **Overriding**, **Seleksi**, **Perulangan**, **IO Sederhana**, **Array**, dan **Error Handling**.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

### 1. Class

**Class** adalah template atau blueprint dari object. Pada kode ini, `Woodle`, `Kata`, `KataHewan`, `KataBuah`, dan `WoodleBeraksi` adalah contoh dari class.

```java
public class Woodle {
    ...
}

public abstract class Kata {
    ...
}

public class KataHewan extends Kata {
    ...
}

public class KataBuah extends Kata {
    ...
}

public class WoodleBeraksi {
    ...
}
```

### 2. Object

**Object** adalah instance dari class. Pada kode ini, `Woodle word = new Woodle(t, kata.getKata());` adalah contoh pembuatan object.

```java
Woodle word = new Woodle(t, kata.getKata());
```

### 3. Atribut

**Atribut** adalah variabel yang ada dalam class. Pada kode ini, `input`, `hasil`, `kataKunci`, dan `kata` adalah contoh atribut.

```java
//Pada Class Woodle
private String input;
private String hasil;
private String kataKunci;

//Pada Class Kata
protected String kata;
```

### 4. Constructor

**Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Woodle`, `KataHewan`, dan `KataBuah`.

```java
public Woodle(String input, String kataKunci) {
    this.input = input.toUpperCase();
    this.kataKunci = kataKunci;
    this.hasil = verifikasi();
}

public KataHewan() {
    String[] daftar = {"GAJAH", "TIKUS", "BEBEK", "BADAK", "ZEBRA", "SINGA", "RAKUN","KOALA","DOMBA","CITAH","BUAYA"};
    this.kata = randomKata(daftar);
}

public KataBuah() {
    String[] daftar = {"LEMON", "MELON", "ALMON", "JERUK", "JAMBU", "KURMA","LIMAU","NANAS","SUKUN","SALAK","TIMUN"};
    this.kata = randomKata(daftar);
}
```

### 5. Mutator

**Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setKata` adalah contoh method mutator.

```java
public void setKata(String kata) {
    this.kata = kata;
}
```

### 6. Accessor

**Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getInput`, `getHasil`, dan `getKata` adalah contoh method accessor.

```java
//Pada Class Woodle
public String getInput() {
    return input;
}
public String getHasil() {
    return hasil;
}

//Pada Class Kata
public String getKata() {
    return kata;
}
```

### 7. Encapsulation

**Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `input`, `hasil`, `kataKunci`, dan `kata` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```java
//Pada Class Woodle
private String input;
private String hasil;
private String kataKunci;

//Pada Class Kata
protected String kata;
```

### 8. Inheritance

**Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KataHewan` dan `KataBuah` mewarisi `Kata` dengan sintaks `extends`.

```java
public class KataHewan extends Kata {
    ...
}

public class KataBuah extends Kata {
    ...
}
```

### 9. Polymorphism

**Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. 
Pada kode ini, method `infoTabel(Woodle[] tebakanList)` dan `infoKategori(String kategori)` di `Woodle` merupakan overloading, sedangkan method `getKategori` di `KataHewan` dan `KataBuah` merupakan override.

```java
public static void infoTabel(Woodle[] tebakanList) {
    System.out.println("\n=== HASIL WOODLE ===\n");
    for (Woodle t : tebakanList) {
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

public static void infoKategori(String kategori) {
    System.out.println("\n=== WOODLE - Kategori: " + kategori.toUpperCase() + " ===");
    System.out.println("TIPS : ");
    System.out.println("O = BENAR");
    System.out.println("~ = LETAK SALAH");
    System.out.println("x = SALAH");
}

@Override
public String getKategori() {
    return "Hewan";
}

@Override
public String getKategori() {
    return "Buah";
}
```

### 10. Seleksi

 **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, `if else` merupakan contoh penggunaan seleksi 

```java
private String verifikasi() {
    ...
    for (int i = 0; i < kataKunci.length(); i++) {
        char c = input.charAt(i);
        if (c == kataKunci.charAt(i)) {
            sb.append("o ");
        } else if (kataKunci.contains(String.valueOf(c))) {
            sb.append("~ ");
        } else {
            sb.append("x ");
        }
    }
    return sb.toString();
}

public static void infoTabel(Woodle[] tebakanList) {
        ...
        for (Woodle t : tebakanList) {
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

while (true) {
     try {
         ...
         ...
            if (inputLine.isEmpty()) {
                 throw new IllegalArgumentException("Input tidak boleh kosong.");
            }
            pilih = Integer.parseInt(inputLine);
            if (pilih != 1 && pilih != 2) {
                 throw new IllegalArgumentException("Masukkan harus 1 atau 2!");
            }
             break;
         } ... {
               ...
         } ... {
               ...
         }
}

if (pilih == 1) {
      kata = new KataHewan();     
} else {
      kata = new KataBuah();
} 


for (int i = 0; i < kesempatan; i++) {
                String t;
                while (true) {
                    try {
                        System.out.print("\nTebakan ke-" + (i + 1) + ": ");
                        t = input.nextLine().toUpperCase();

                        if (!t.matches("[A-Z]+")) {
                            throw new IllegalArgumentException("Input hanya boleh huruf tanpa angka atau simbol!");
                        }

                        if (t.length() != kata.getKata().length()) {
                            throw new IllegalArgumentException("Kata harus " + kata.getKata().length() + " huruf!");
                        }
                        break;

if (t.equalsIgnoreCase(kata.getKata())) {
                    menang = true;
                    break;
}

if (menang) {
                System.out.println("\nSELAMAT! Kamu menebak kata kategori [" + kata.getKategori() + "]: " + kata.getKata());
            } else {
                System.out.println("\nKesempatan habis. Kata yang benar dari kategori [" + kata.getKategori() + "] adalah: " + kata.getKata());
}

```

### 11. Perulangan

**Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, `for (int i = 0; i < kesempatan; i++)` menggunakan loop `for` untuk mengulang input maksimal 10, `while (true)` menggunakan loop `while` agar pengguna terus menginput hingga valid, dan `for (Woodle t : tebakanList)` menggunakan loop `for` untuk menampilkan seluruh tebakan sebelumnya.

```java
for (int i = 0; i < kesempatan; i++) {
    ...
    while (true) {
        try {
            ...
            break;
        } catch (...) {
            ...
        }
    }
}

for (Woodle t : tebakanList) {
    if (t != null) {
        for (char c : t.getInput().toCharArray()) {
            ...
        }
    } else {
        ...
    }
}
```

### 12. Input Output Sederhana

Digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```java
Scanner input = new Scanner(System.in);
System.out.print("\nTebakan ke-" + (i + 1) + ": ");
String userInput = input.nextLine();

System.out.println("\n=== WOODLE - Kategori: " + kategori.toUpperCase() + " ===");
System.out.println("TIPS : ");
System.out.println("o = BENAR");
System.out.println("~ = LETAK SALAH");
System.out.println("x = SALAH\n");

System.out.print("| ");
... {
System.out.print(c + " | ");
}
System.out.println(" --> " + w.getHasil());

System.out.println("\nSELAMAT! Kamu menebak kata kategori [" + kata.getKategori() + "]: " +
kata.getKata());

System.out.println("\nKesempatan habis. Kata yang benar dari kategori [" + kata.getKategori() + "] adalah:
" + kata.getKata());
```

### 13. Array

**Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `String[] daftar = {...};` dan `Woodle[] daftarTebakan = new Woodle[kesempatan];` adalah contoh penggunaan array.

```java
public KataHewan() {
    String[] daftar = {...};
    ...
}

public KataBuah() {
    String[] daftar = {...};
    ...
}

Woodle[] daftarTebakan = new Woodle[kesempatan];
```

### 14. Error Handling

Digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```java
try {
    ...
    if (pilih != 1 && pilih != 2) {
        throw new IllegalArgumentException(...);
    }
} catch (InputMismatchException e) {
    ...
} catch (IllegalArgumentException e) {
    ...
}

try {
    ...
    if (!t.matches("[A-Z]+")) {
        throw new IllegalArgumentException(...);
    }
    ...
} catch (IllegalArgumentException e) {
    ...
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama : Jovitha Imannuela Nopelman Mantir  
NPM  : 2310010560
