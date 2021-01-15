/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import Entity.Risa90479_Guru;
import Entity.Risa90479_JadwalMengajar;
import Entity.Risa90479_Jurusan;
import Entity.Risa90479_Kurikulum;
import Entity.Risa90479_MataPelajaran;
import java.util.ArrayList;

/**
 *
 * @author SMKM1
 */
public class Data {

    static Model.Risa90479_GuruModel guruModel = new Model.Risa90479_GuruModel();
    static Model.Risa90479_JurusanModel jurusanModel = new Model.Risa90479_JurusanModel();
    static Model.Risa90479_MaPelModel mapelModel = new Model.Risa90479_MaPelModel();
    static Model.Risa90479_JadwalMengajarModel jadwalMengajarModel = new Model.Risa90479_JadwalMengajarModel();
    static Model.Risa90479_KurikulumModel kurikulumModel = new Model.Risa90479_KurikulumModel();

    static void dataMapel() {
        mapelModel.insert(new Risa90479_MataPelajaran("Mulok", "Muatan Lokal", "Ganjil"));
        mapelModel.insert(new Risa90479_MataPelajaran("Anim2D", "Animasi 2D", "Ganjil"));
        mapelModel.insert(new Risa90479_MataPelajaran("Pemdas", "Pemrograman Dasar", "Ganjil"));
        mapelModel.insert(new Risa90479_MataPelajaran("BIG", "Bahasa Inggris", "Ganjil"));
        mapelModel.insert(new Risa90479_MataPelajaran("Simdig", "Simulasi & Komunikasi Digital", "Ganjil"));
        mapelModel.insert(new Risa90479_MataPelajaran("BIN", "Bahasa Indonesia", "Ganjil"));
        mapelModel.insert(new Risa90479_MataPelajaran("PENJAS", "Penjaskes", "Ganjil"));
        mapelModel.insert(new Risa90479_MataPelajaran("SISKOM", "Sistem Komputer", "Ganjil"));
        mapelModel.insert(new Risa90479_MataPelajaran("SEJ", "Sejarah", "Ganjil"));
        mapelModel.insert(new Risa90479_MataPelajaran("DESGRAF", "Desain Grafis", "Ganjil"));
        mapelModel.insert(new Risa90479_MataPelajaran("KJD", "Komputer Jaringan Dasar", "Ganjil"));
        mapelModel.insert(new Risa90479_MataPelajaran("KMD", "Kemuhammadiyahan", "Ganjil"));
        mapelModel.insert(new Risa90479_MataPelajaran("MARKET", "Marketing Digital", "Ganjil"));
        mapelModel.insert(new Risa90479_MataPelajaran("DMI", "Desain Multimedia Interaktif", "Ganjil"));
    }

    static void dataJurusan() {
        jurusanModel.insert(new Risa90479_Jurusan("MM", "Multimedia"));
        jurusanModel.insert(new Risa90479_Jurusan("TKJ", "Teknik Komputer Jaringan"));
        jurusanModel.insert(new Risa90479_Jurusan("AK", "Akuntansi"));
        jurusanModel.insert(new Risa90479_Jurusan("PBS", "Perbankan Syariah"));
        jurusanModel.insert(new Risa90479_Jurusan("MPU", "Mata Pelajaran Umum"));
    }

    static void dataKurikulum() {
        Risa90479_Jurusan jrs = jurusanModel.getDaftarJurusan().get(jurusanModel.search("MPU"));
        Risa90479_Kurikulum k = new Risa90479_Kurikulum("2000", "Irvandy", "IR", "IR", jrs, "Kurikulum");
        kurikulumModel.insert(k);

        k = new Risa90479_Kurikulum("2001", "Khusnul", "KH", "KH", jrs, "Humas");
        kurikulumModel.insert(k);
    }

    static void dataGuru() {
        //Guru Risa PP
        ArrayList<Risa90479_MataPelajaran> daftarMapelPP = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelPP.add(new Risa90479_MataPelajaran("Mulok", "Muatan Lokal", "Ganjil"));
        daftarMapelPP.add(new Risa90479_MataPelajaran("Simdig", "Simulasi & Komunikasi Digital", "Ganjil"));

        Risa90479_Jurusan jrs = jurusanModel.getDaftarJurusan().get(jurusanModel.search("MM"));
        Risa90479_Guru guruPP = new Risa90479_Guru("1100", "Risa", "PP", "PP", jrs);
        guruPP.setListMataPelajaran(daftarMapelPP);

        guruModel.insert(guruPP);

        //Guru Ika M
        ArrayList<Risa90479_MataPelajaran> daftarMapelM = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelM.add(new Risa90479_MataPelajaran("PEMDAS", "Pemrograman Dasar", "Ganjil"));

        Risa90479_Guru guruM = new Risa90479_Guru("1110", "Ika", "M", "M", jrs);
        guruM.setListMataPelajaran(daftarMapelM);

        guruModel.insert(guruM);

        //Guru SS         
        ArrayList<Risa90479_MataPelajaran> daftarMapelSS = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelSS.add(new Risa90479_MataPelajaran("SEJ", "Sejarah", "Ganjil"));

        Risa90479_Guru guruSS = new Risa90479_Guru("1111", "Fitria", "SS", "SS", jrs);
        guruSS.setListMataPelajaran(daftarMapelSS);

        guruModel.insert(guruSS);

        //guru kode DA
        ArrayList<Risa90479_MataPelajaran> daftarMapelDA = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelDA.add(new Risa90479_MataPelajaran("DA", "Sistem Komputer", "Ganjil"));

        Risa90479_Guru guruDA = new Risa90479_Guru("1112", "Hulam", "DA", "DA", jrs);
        guruDA.setListMataPelajaran(daftarMapelDA);

        guruModel.insert(guruDA);
        //guru kode HA
        ArrayList<Risa90479_MataPelajaran> daftarMapelHA = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelHA.add(new Risa90479_MataPelajaran("HA", "Desain Grafis", "Ganjil"));

        Risa90479_Guru guruHA = new Risa90479_Guru("1113", "Ruly", "HA", "HA", jrs);
        guruHA.setListMataPelajaran(daftarMapelHA);

        guruModel.insert(guruHA);
        //guru kode BA
        ArrayList<Risa90479_MataPelajaran> daftarMapelBA = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelHA.add(new Risa90479_MataPelajaran("BA", "Penjaskes", "Ganjil"));

        Risa90479_Guru guruBA = new Risa90479_Guru("1114", "Febry", "BA", "BA", jrs);
        guruBA.setListMataPelajaran(daftarMapelHA);

        guruModel.insert(guruBA);
        //guru kode CA
        ArrayList<Risa90479_MataPelajaran> daftarMapelCA = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelCA.add(new Risa90479_MataPelajaran("CA", "Komputer Jaringan Dasar", "Ganjil"));

        Risa90479_Guru guruCA = new Risa90479_Guru("1115", "Yazid", "CA", "CA", jrs);
        guruCA.setListMataPelajaran(daftarMapelCA);
        guruModel.insert(guruCA);
    }

    
    static void dataJadwalMengajarAll() {

        Risa90479_Guru guru = guruModel.getDaftarGuru().get(guruModel.search("SS"));
        Risa90479_MataPelajaran mapel = mapelModel.getDaftarMapel().get(mapelModel.search("SEJ"));

        jadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Senin", 1, "X", guru, mapel));

        Risa90479_Guru guru2 = guruModel.getDaftarGuru().get(guruModel.search("M"));
        Risa90479_MataPelajaran mapel2 = mapelModel.getDaftarMapel().get(mapelModel.search("PEMDAS"));

        jadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Senin", 2, "X",guru2, mapel2));

        Risa90479_Guru guru3 = guruModel.getDaftarGuru().get(guruModel.search("DA"));
        Risa90479_MataPelajaran mapel3 = mapelModel.getDaftarMapel().get(mapelModel.search("SISKOM"));

        jadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Senin", 3, "X",guru3, mapel3));

        Risa90479_Guru guru4 = guruModel.getDaftarGuru().get(guruModel.search("HA"));
        Risa90479_MataPelajaran mapel4 = mapelModel.getDaftarMapel().get(mapelModel.search("DESGRAF"));

        jadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Senin", 4,"X", guru4, mapel4));

        Risa90479_Guru guru5 = guruModel.getDaftarGuru().get(guruModel.search("BA"));
        Risa90479_MataPelajaran mapel5 = mapelModel.getDaftarMapel().get(mapelModel.search("PENJAS"));

        jadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Selasa", 1, "X",guru5, mapel5));

        Risa90479_Guru guru6 = guruModel.getDaftarGuru().get(guruModel.search("PP"));
        Risa90479_MataPelajaran mapel6 = mapelModel.getDaftarMapel().get(mapelModel.search("MULOK"));

        jadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Selasa", 2,"X", guru6, mapel6));
        //
        Risa90479_MataPelajaran mapel62 = mapelModel.getDaftarMapel().get(mapelModel.search("Anim2D"));

        jadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Rabu", 2,"XI", guru6, mapel62));
        //
        Risa90479_MataPelajaran mapel63 = mapelModel.getDaftarMapel().get(mapelModel.search("MARKET"));

        jadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Kamis", 2,"XI", guru6, mapel63));
        
        //
        Risa90479_MataPelajaran mapel64 = mapelModel.getDaftarMapel().get(mapelModel.search("DMI"));

        jadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Kamis", 4,"XII", guru6, mapel64));

        Risa90479_Guru guru7 = guruModel.getDaftarGuru().get(guruModel.search("CA"));
        Risa90479_MataPelajaran mapel7 = mapelModel.getDaftarMapel().get(mapelModel.search("KJD"));

        jadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Selasa", 3, "X",guru7, mapel7));
        jadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Selasa", 4, "X",guru7, mapel7));
    }
    
}
