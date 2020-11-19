/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan59.detective.conan;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : detective konan
 */
public class Karakter extends Detective{
    private String keahlian;

    public Karakter(String nama, String asal, boolean detective, String keahlian) {
        super(nama, asal, detective);
        this.keahlian = keahlian;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void tampilKarakter() {
        System.out.println("Nama\t\t : " +getNama());
        System.out.println("Dari\t\t : " +getAsal());
        if(isDetective()) {
            System.out.println("Detective\t : YA");
        } else {
            System.out.println("Detective\t : TIDAK");
        }
        System.out.println("Keahlian\t : " + getKeahlian());
        System.out.println();
    } 
}
