/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class Risa90479_Kurikulum extends Risa90479_Guru {

    private String jabatan;

    public Risa90479_Kurikulum(String nbm, String nama, String password, String kodeGuru, Risa90479_Jurusan jurusan, String jabatan) {
        super(nbm, nama, password, kodeGuru, jurusan);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    /*
     @Override
     public String toString() {
     String s = "";
     s = s + "NBM = " + super.getNbm() + "\n";
     s = s + "NAMA = " + super.getNama() + "\n";
     s = s + "JABATAN = " + this.jabatan + "\n";
     return s;
     }*/
    @Override
    public String toString() {
        String s = "";
        s = super.toString();
        s = s + "JABATAN = " + this.jabatan + "\n";
        return s;
    }

}
