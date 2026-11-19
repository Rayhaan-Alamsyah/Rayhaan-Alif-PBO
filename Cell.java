package handson3;

public class Cell<T> {
    private T data;

    public void setValue(T data) {
        this.data = data;
    }

    public T getValue() {
        return data;
    }

    public void displayType() {
        if (data != null) {
            System.out.println("Nilai: " + data + " | Tipe Data: " + data.getClass().getName());
        } else {
            System.out.println("Data bernilai null (tipe belum dapat dideteksi saat runtime).");
        }
    }
}
