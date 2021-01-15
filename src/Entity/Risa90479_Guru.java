/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

public class Risa90479_Guru extends Risa90479_Karyawan {

    private String kodeGuru;
    private ArrayList<Risa90479_MataPelajaran> listMataPelajaran = new ArrayList<Risa90479_MataPelajaran>();
    private Risa90479_Jurusan jurusan;

    public Risa90479_Guru( String nbm, String nama, String password, String kodeGuru, Risa90479_Jurusan jurusan) {
        super(nbm, nama, password);
        this.kodeGuru = kodeGuru;
        this.jurusan = jurusan;
    }

    public String getKodeGuru() {
        return kodeGuru;
    }

    public void setKodeGuru(String kodeGuru) {
        this.kodeGuru = kodeGuru;
    }

    public ArrayList<Risa90479_MataPelajaran> getListMataPelajaran() {
        return listMataPelajaran;
    }

    public void setListMataPelajaran(ArrayList<Risa90479_MataPelajaran> listMataPelajaran) {
        this.listMataPelajaran = listMataPelajaran;
    }

    public Risa90479_Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Risa90479_Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        String s = "";
        s = s + "NBM = " + super.getNbm()+ "\n";
        s = s + "NAMA = " + super.getNama() + "\n";
        s = s + "JURUSAN = " + jurusan.namaJurusan + "\n";
        s = s + "MATA PELAJARAN = \n";
        for (int i = 0; i < listMataPelajaran.size(); i++) {
            s = s + listMataPelajaran.get(i).toString();
        }
        return s;
    }
}
