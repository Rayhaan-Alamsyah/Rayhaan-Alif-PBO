package handson10;

/**
 * Class generik multi-tipe fleksibel yang dapat digunakan untuk menyimpan
 * berbagai jenis entitas selain Produk (misalnya Pelanggan atau Transaksi).
 */
public class DataRecord<T, U, V> {
    private final T field1;
    private final U field2;
    private final V field3;

    public DataRecord(T field1, U field2, V field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    @Override
    public String toString() {
        return field1 + "," + field2 + "," + field3;
    }
}
