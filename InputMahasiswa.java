import java.util.ArrayList;
import java.util.Scanner;

public class InputMahasiswa {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while (true) {
            System.out.print("Masukkan nama ke-" + i + ": ");
            String nama = scanner.nextLine();

            if (nama.isEmpty()) {
                try {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            mahasiswa.add(nama);
            i++;
        }

        System.out.println("Daftar mahasiswa yang diinputkan:");
        for (String nama : mahasiswa) {
            System.out.println("- " + nama);
        }
    }
}