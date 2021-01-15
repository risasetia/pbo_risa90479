/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class Risa90479_MataPelajaran {
    private String kodeMapel ;
    private String namaMapel ;
    private String semester;
    
    public Risa90479_MataPelajaran(String kodeMapel, String namaMapel, String semester) {
        this.kodeMapel = kodeMapel;
        this.namaMapel = namaMapel;
        this.semester = semester;
    }

    public String getKodeMapel() {
        return kodeMapel;
    }

    public void setKodeMapel(String kodeMapel) {
        this.kodeMapel = kodeMapel;
    }

    public String getNamaMapel() {
        return namaMapel;
    }

    public void setNamaMapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        String s =kodeMapel + ", " + namaMapel + ", " + semester + "\n";
        return s;
    }
 }