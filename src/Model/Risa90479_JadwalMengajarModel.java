/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Risa90479_AllObjectModel;
import Entity.Risa90479_Guru;
import Entity.Risa90479_JadwalMengajar;
import java.util.ArrayList;

/**
 *
 * @author SMKM1
 */
public class Risa90479_JadwalMengajarModel implements Model.Risa90479_ModelInterfaces {

    ArrayList<Risa90479_JadwalMengajar> daftarJadwalMengajar = new ArrayList<Risa90479_JadwalMengajar>();

    public Risa90479_JadwalMengajarModel() {
    }

    public ArrayList<Risa90479_JadwalMengajar> getDaftarJadwalMengajar() {
        return daftarJadwalMengajar;
    }

    public void setDaftarJadwalMengajar(ArrayList<Risa90479_JadwalMengajar> daftarJadwalMengajar) {
        this.daftarJadwalMengajar = daftarJadwalMengajar;
    }

    @Override
    public void view() {
        System.out.println("JADWAL MENGAJAR : ");
        for (int i = 0; i < daftarJadwalMengajar.size(); i++) {
            Risa90479_JadwalMengajar jadwal = daftarJadwalMengajar.get(i);
            System.out.println(jadwal);
        }
    }

    @Override
    public void insert(Object o) {
        Entity.Risa90479_JadwalMengajar jadwal = (Entity.Risa90479_JadwalMengajar) o;
        daftarJadwalMengajar.add(jadwal);
    }

    @Override
    public int search(String s) {
        //searching berdasarkan jadwal mengajar dari kode guru
        for (int i = 0; i < daftarJadwalMengajar.size(); i++) {
            Risa90479_JadwalMengajar jadwal = daftarJadwalMengajar.get(i);
            if (jadwal.getGuru().getKodeGuru().equalsIgnoreCase(s) == true) {
                return i;
            }
        }
        return -1;
    }

    public int searchJadwalMengajar(String kodeG, String hari, int jam) {
        for (int i = 0; i < daftarJadwalMengajar.size(); i++) {
            Risa90479_JadwalMengajar jadwal = daftarJadwalMengajar.get(i);
            if (jadwal.getGuru().getKodeGuru().equalsIgnoreCase(kodeG) == true && jadwal.getHari().equalsIgnoreCase(hari) && jadwal.getJamKe() == jam) {

                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit(String kode, String kodeNew) {
        //edit hari 
        int index = search(kode);
        daftarJadwalMengajar.get(index).setHari(kodeNew);
    }

    public void edit(String kodeG, String hari, int jam, String hari2, int jam2) {
        int index = Risa90479_AllObjectModel.daftarJadwalMengajarModel.searchJadwalMengajar(kodeG, hari, jam);
        System.out.println("index :"+ index);
        Risa90479_AllObjectModel.daftarJadwalMengajarModel.getDaftarJadwalMengajar().get(index).setHari(hari2);
        Risa90479_AllObjectModel.daftarJadwalMengajarModel.getDaftarJadwalMengajar().get(index).setJamKe(jam2);
    }

    public ArrayList<Risa90479_JadwalMengajar> searchJadwalMengajarGuru(Risa90479_Guru guru) {
        ArrayList<Risa90479_JadwalMengajar> arrList = new ArrayList<Risa90479_JadwalMengajar>();
        for (int i = 0; i < daftarJadwalMengajar.size(); i++) {
            Risa90479_JadwalMengajar jadwal = daftarJadwalMengajar.get(i);
            String kodeG = jadwal.getGuru().getKodeGuru();
            if (kodeG.equalsIgnoreCase(guru.getKodeGuru())) {
                arrList.add(jadwal);
            }
        }
        return arrList;
    }

    @Override
    public void delete(String kode) {
        //delete berdasarkan kode guru
        int index = search(kode);
        daftarJadwalMengajar.remove(index);
    }
    
    public void delete(String kodeG, String hari, int jam){
        int index = Risa90479_AllObjectModel.daftarJadwalMengajarModel.searchJadwalMengajar(kodeG, hari, jam);
        System.out.println("index :"+ index);
        Risa90479_AllObjectModel.daftarJadwalMengajarModel.getDaftarJadwalMengajar().remove(index);
    }

}
