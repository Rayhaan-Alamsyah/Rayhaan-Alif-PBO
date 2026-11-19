# Tugas Praktikum PBO - Pertemuan 11 (Generics, Enumeration, dan Input/Output)

Repositori ini berisi implementasi lengkap **Hands-on 1 sampai Hands-on 10** menggunakan bahasa Java.

## Struktur Folder
- `handson1/` : Enum `AccountType` dengan konstanta `SAVINGS`, `CREDIT`, `DEPOSIT` serta override `toString()`.
- `handson2/` : Enum `AccountType` dengan konstruktor (`code` dan `interestRate`).
- `handson3/` : Generic Class `Cell<T>` dengan `displayType()`.
- `handson4/` : Generic Class Multi-Tipe `Pair<T1, T2>` dengan method `swap()`.
- `handson5/` : Generic Method `CompareUtil.isEqual(T a, T b)` untuk `Integer`, `String`, `Double`, dan `Character`.
- `handson6/` : Membaca `employees.txt` via NIO.2, deteksi file hilang, simpan ke `ArrayList<String>`, dan salin ke `copy_employees.txt`.
- `handson7/` : Menulis `report.txt`, cek `Files.exists()`, backup ke `backup/report.txt`, dan catat riwayat ke `log.txt`.
- `handson8/` : Try-with-Resources `Scanner` + `BufferedWriter` dengan loop hingga `exit` dan timestamp otomatis.
- `handson9/` : Serialization & method `deserialize()` untuk beberapa objek `Employee`.
- `handson10/` : Generic Class `Produk<T, U>` (dengan `Integer stok`), `DataRecord<T, U, V>` untuk Pelanggan & Transaksi, serta `Files.write()` / `Files.readAllLines()`.
- `employees.txt` : File input bawaan untuk pengujian `handson6`.

## Cara Menjalankan di VS Code
1. Ekstrak ZIP ini dan buka folder `Pertemuan11_Generics_Enum_IO` di **Visual Studio Code** (`File > Open Folder`).
2. Buka masing-masing file `Main.java` di folder `handson1` s.d. `handson10`, lalu klik tombol **Run** di atas `main()`.
3. Khusus **Hands-on 8**, ketik input di panel **Terminal** VS Code dan ketik `exit` untuk mengakhiri pencatatan.

---

## Jawaban Pertanyaan Konseptual (Untuk Laporan PDF)

### 1. Hands-on 3: Keuntungan Penggunaan Generic Type Safety
- **Deteksi Error Saat Kompilasi (Compile-Time Checking):** Compiler Java memeriksa kesesuaian tipe data sebelum program dijalankan sehingga kesalahan pemberian tipe langsung terdeteksi lebih awal dibandingkan saat *runtime*.
- **Menghilangkan Kebutuhan Type Casting Manual:** Saat mengambil data menggunakan `getValue()`, tipe kembaliannya sudah pasti sesuai parameter tipe (`Integer` atau `String`) tanpa perlu melakukan *casting* eksplisit seperti `(String) obj`.
- **Mencegah `ClassCastException`:** Karena tipe data sudah dikunci secara statis pada saat deklarasi objek, risiko kegagalan konversi tipe ketika program berjalan dapat dihindari sepenuhnya.
- **Reusability Kode:** Satu definisi kelas `Cell<T>` dapat digunakan ulang untuk berbagai tipe objek tanpa menduplikasi kode.

### 2. Hands-on 5: Perbedaan antara Generic Class dan Generic Method
- **Cakupan Parameter Tipe (Scope):**
  - Pada **Generic Class** (contoh: `class Cell<T>`), parameter tipe `<T>` dideklarasikan di level nama kelas dan berlaku untuk seluruh atribut, konstruktor, serta method non-statis di dalam kelas tersebut.
  - Pada **Generic Method** (contoh: `public static <T extends Comparable<T>> boolean isEqual(T a, T b)`), parameter tipe `<T>` dideklarasikan khusus pada signature method itu sendiri (sebelum tipe kembalian) dan hanya berlaku di dalam method tersebut.
- **Cara Instansiasi / Pemanggilan:**
  - **Generic Class** mengharuskan penentuan tipe saat membuat objek (misalnya `new Cell<Integer>()`).
  - **Generic Method** dapat dipanggil langsung pada kelas biasa (bahkan kelas non-generik maupun method `static`) tanpa perlu menentukan tipe secara eksplisit karena compiler melakukan *type inference* otomatis dari argumen yang dikirimkan.
