/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class Risa90479_JadwalMengajar {

    String hari;
    int jamKe;
    String kelas;
    Risa90479_Guru guru;
    Risa90479_MataPelajaran mapel;

    public Risa90479_JadwalMengajar(String hari, int jamKe, String kelas, Risa90479_Guru guru, Risa90479_MataPelajaran mapel) {
        this.hari = hari;
        this.jamKe = jamKe;
        this.kelas = kelas;
        this.guru = guru;
        this.mapel = mapel;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public int getJamKe() {
        return jamKe;
    }

    public void setJamKe(int jamKe) {
        this.jamKe = jamKe;
    }

    public Risa90479_Guru getGuru() {
        return guru;
    }

    public void setGuru(Risa90479_Guru guru) {
        this.guru = guru;
    }

    public Risa90479_MataPelajaran getMapel() {
        return mapel;
    }

    public void setMapel(Risa90479_MataPelajaran mapel) {
        this.mapel = mapel;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    
    @Override
    public String toString() {
        String s = "";
        //s = s + "Nama = " + guru.getNama() + "\n";
        //s = s + "Kode Guru = " + guru.getKodeGuru() + "\n";

        s = s + hari + ", jam Ke= " + jamKe + ", " + mapel.getNamaMapel() + ", " + kelas + ", " + guru.getKodeGuru() + "\n";
        return s ;
        //return hari+", jam Ke= " + jamKe + ", " + guru.getNama() + ", " + mapel.getNamaMapel();
    }

}
