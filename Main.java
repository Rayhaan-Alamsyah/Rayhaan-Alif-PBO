package handson10;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Menyimpan dan membaca kembali data Produk (dengan atribut stok bertipe Integer)
        List<Produk<String, Double>> produkList = new ArrayList<>();
        produkList.add(new Produk<>("Laptop", 15000000.0, 10));
        produkList.add(new Produk<>("Mouse", 150000.0, 45));
        produkList.add(new Produk<>("Keyboard", 350000.0, 25));

        Path produkPath = Paths.get("produk_output.txt");
        try {
            List<String> lines = new ArrayList<>();
            for (Produk<String, Double> p : produkList) {
                lines.add(p.toString());
            }
            Files.write(produkPath, lines, StandardCharsets.UTF_8);
            System.out.println("Data produk berhasil disimpan ke '" + produkPath + "' menggunakan NIO.2");

            // Membaca kembali isi file dengan Files.readAllLines()
            System.out.println("\n=== Isi File produk_output.txt ===");
            List<String> readProduk = Files.readAllLines(produkPath, StandardCharsets.UTF_8);
            for (String line : readProduk) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Gagal memproses file produk: " + e.getMessage());
        }

        // 2. Penggunaan class generik DataRecord<T, U, V> untuk data Pelanggan & Transaksi
        List<DataRecord<String, String, Integer>> pelangganList = List.of(
                new DataRecord<>("PLG-01", "Andi", 120),
                new DataRecord<>("PLG-02", "Siti", 250)
        );

        List<DataRecord<String, Double, String>> transaksiList = List.of(
                new DataRecord<>("TRX-1001", 15150000.0, "LUNAS"),
                new DataRecord<>("TRX-1002", 350000.0, "PENDING")
        );

        Path pelangganPath = Paths.get("pelanggan_output.txt");
        Path transaksiPath = Paths.get("transaksi_output.txt");

        try {
            List<String> pelangganLines = pelangganList.stream().map(Object::toString).toList();
            Files.write(pelangganPath, pelangganLines, StandardCharsets.UTF_8);

            List<String> transaksiLines = transaksiList.stream().map(Object::toString).toList();
            Files.write(transaksiPath, transaksiLines, StandardCharsets.UTF_8);

            System.out.println("\n=== Isi File pelanggan_output.txt ===");
            Files.readAllLines(pelangganPath, StandardCharsets.UTF_8).forEach(System.out::println);

            System.out.println("\n=== Isi File transaksi_output.txt ===");
            Files.readAllLines(transaksiPath, StandardCharsets.UTF_8).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Gagal memproses file pelanggan/transaksi: " + e.getMessage());
        }
    }
}
