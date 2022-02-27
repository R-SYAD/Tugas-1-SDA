package TugasSDA;

import java.util.ArrayList;

public class Nomor6 {
    public static void main(String[] args) {
        ArrayList <String> nama = new ArrayList<String>();
        nama.add("I");
        nama.add("K");
        nama.add("R");
        nama.add("I");

        nama.add(0,"e");
        System.out.println("nama setelah ditambahkan string e" +nama);
        nama.add(2,"f");
        System.out.println("nama setelah ditambahkan string f"+nama);
        nama.add(3,"g");
        System.out.println("nama setelah ditambahkan string g"+nama);
        nama.add(4,"h");
        System.out.println("nama setelah ditambahkan string h"+nama);
        nama.add(6,"h");
        System.out.println("nama setelah ditambahkan string h"+nama);
        nama.add(-3,"j");
        System.out.println("nama setelah ditambahkan string h"+nama);

    }
}
