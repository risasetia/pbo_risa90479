package Controller;

import Entity.Risa90479_Guru;
import Entity.Risa90479_JadwalMengajar;
import Entity.Risa90479_Jurusan;
import Entity.Risa90479_Kurikulum;
import Entity.Risa90479_MataPelajaran;
import java.util.ArrayList;

public class Risa90479_DataController {

    public static void dataMapel() {
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("Mulok", "Muatan Lokal", "Ganjil"));
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("Anim2D", "Animasi 2D", "Ganjil"));
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("Pemdas", "Pemrograman Dasar", "Ganjil"));
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("BIG", "Bahasa Inggris", "Ganjil"));
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("Simdig", "Simulasi & Komunikasi Digital", "Ganjil"));
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("BIN", "Bahasa Indonesia", "Ganjil"));
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("PENJAS", "Penjaskes", "Ganjil"));
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("SISKOM", "Sistem Komputer", "Ganjil"));
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("SEJ", "Sejarah", "Ganjil"));
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("DESGRAF", "Desain Grafis", "Ganjil"));
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("KJD", "Komputer Jaringan Dasar", "Ganjil"));
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("KMD", "Kemuhammadiyahan", "Ganjil"));
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("MARKET", "Marketing Digital", "Ganjil"));
        Risa90479_AllObjectModel.daftarMaPelModel.insert(new Risa90479_MataPelajaran("DMI", "Desain Multimedia Interaktif", "Ganjil"));
    }

    public static void dataJurusan() {
        Risa90479_AllObjectModel.daftarJurusanModel.insert(new Risa90479_Jurusan("MM", "Multimedia"));
        Risa90479_AllObjectModel.daftarJurusanModel.insert(new Risa90479_Jurusan("TKJ", "Teknik Komputer Jaringan"));
        Risa90479_AllObjectModel.daftarJurusanModel.insert(new Risa90479_Jurusan("AK", "Akuntansi"));
        Risa90479_AllObjectModel.daftarJurusanModel.insert(new Risa90479_Jurusan("PBS", "Perbankan Syariah"));
        Risa90479_AllObjectModel.daftarJurusanModel.insert(new Risa90479_Jurusan("MPU", "Mata Pelajaran Umum"));
    }

    public static void dataKurikulum() {
        Risa90479_Jurusan jrs = Risa90479_AllObjectModel.daftarJurusanModel.getDaftarJurusan().get(Risa90479_AllObjectModel.daftarJurusanModel.search("MPU"));
        Risa90479_Kurikulum k = new Risa90479_Kurikulum("2000", "Irvandy", "IR", "IR", jrs, "Kurikulum");
        Risa90479_AllObjectModel.daftarKurikulumModel.insert(k);

        k = new Risa90479_Kurikulum("2001", "Khusnul", "KH", "KH", jrs, "Humas");
        Risa90479_AllObjectModel.daftarKurikulumModel.insert(k);
    }

    public static void dataGuru() {
        ArrayList<Risa90479_MataPelajaran> daftarMapelPP = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelPP.add(new Risa90479_MataPelajaran("Mulok", "Muatan Lokal", "Ganjil"));
        daftarMapelPP.add(new Risa90479_MataPelajaran("Simdig", "Simulasi & Komunikasi Digital", "Ganjil"));

        Risa90479_Jurusan jrs = Risa90479_AllObjectModel.daftarJurusanModel.getDaftarJurusan().get(Risa90479_AllObjectModel.daftarJurusanModel.search("MM"));
        Risa90479_Guru guruPP = new Risa90479_Guru("1100", "Risa", "PP", "PP", jrs);
        guruPP.setListMataPelajaran(daftarMapelPP);

        Risa90479_AllObjectModel.daftarGuruModel.insert(guruPP);

        //Guru Ika M
        ArrayList<Risa90479_MataPelajaran> daftarMapelM = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelM.add(new Risa90479_MataPelajaran("PEMDAS", "Pemrograman Dasar", "Ganjil"));

        Risa90479_Guru guruM = new Risa90479_Guru("1110", "Ika", "M", "M", jrs);
        guruM.setListMataPelajaran(daftarMapelM);

        Risa90479_AllObjectModel.daftarGuruModel.insert(guruM);

        //Guru SS         
        ArrayList<Risa90479_MataPelajaran> daftarMapelSS = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelSS.add(new Risa90479_MataPelajaran("SEJ", "Sejarah", "Ganjil"));

        Risa90479_Guru guruSS = new Risa90479_Guru("1111", "Fitria", "SS", "SS", jrs);
        guruSS.setListMataPelajaran(daftarMapelSS);

        Risa90479_AllObjectModel.daftarGuruModel.insert(guruSS);

        //guru kode DA
        ArrayList<Risa90479_MataPelajaran> daftarMapelDA = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelDA.add(new Risa90479_MataPelajaran("DA", "Sistem Komputer", "Ganjil"));

        Risa90479_Guru guruDA = new Risa90479_Guru("1112", "Hulam", "DA", "DA", jrs);
        guruDA.setListMataPelajaran(daftarMapelDA);

        Risa90479_AllObjectModel.daftarGuruModel.insert(guruDA);
        //guru kode HA
        ArrayList<Risa90479_MataPelajaran> daftarMapelHA = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelHA.add(new Risa90479_MataPelajaran("HA", "Desain Grafis", "Ganjil"));

        Risa90479_Guru guruHA = new Risa90479_Guru("1113", "Ruly", "HA", "HA", jrs);
        guruHA.setListMataPelajaran(daftarMapelHA);

        Risa90479_AllObjectModel.daftarGuruModel.insert(guruHA);
        //guru kode BA
        ArrayList<Risa90479_MataPelajaran> daftarMapelBA = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelHA.add(new Risa90479_MataPelajaran("BA", "Penjaskes", "Ganjil"));

        Risa90479_Guru guruBA = new Risa90479_Guru("1114", "Febry", "BA", "BA", jrs);
        guruBA.setListMataPelajaran(daftarMapelHA);

        Risa90479_AllObjectModel.daftarGuruModel.insert(guruBA);
        //guru kode CA
        ArrayList<Risa90479_MataPelajaran> daftarMapelCA = new ArrayList<Risa90479_MataPelajaran>();
        daftarMapelCA.add(new Risa90479_MataPelajaran("CA", "Komputer Jaringan Dasar", "Ganjil"));

        Risa90479_Guru guruCA = new Risa90479_Guru("1115", "Yazid", "CA", "CA", jrs);
        guruCA.setListMataPelajaran(daftarMapelCA);
        Risa90479_AllObjectModel.daftarGuruModel.insert(guruCA);
    }

    public static void dataJadwalMengajarAll() {

        Risa90479_Guru guru = Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(Risa90479_AllObjectModel.daftarGuruModel.search("SS"));
        Risa90479_MataPelajaran mapel = Risa90479_AllObjectModel.daftarMaPelModel.getDaftarMapel().get(Risa90479_AllObjectModel.daftarMaPelModel.search("SEJ"));

        Risa90479_AllObjectModel.daftarJadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Senin", 1, "X", guru, mapel));

        Risa90479_Guru guru2 = Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(Risa90479_AllObjectModel.daftarGuruModel.search("M"));
        Risa90479_MataPelajaran mapel2 = Risa90479_AllObjectModel.daftarMaPelModel.getDaftarMapel().get(Risa90479_AllObjectModel.daftarMaPelModel.search("PEMDAS"));

        Risa90479_AllObjectModel.daftarJadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Senin", 2, "X", guru2, mapel2));

        Risa90479_Guru guru3 = Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(Risa90479_AllObjectModel.daftarGuruModel.search("DA"));
        Risa90479_MataPelajaran mapel3 = Risa90479_AllObjectModel.daftarMaPelModel.getDaftarMapel().get(Risa90479_AllObjectModel.daftarMaPelModel.search("SISKOM"));

        Risa90479_AllObjectModel.daftarJadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Senin", 3, "X", guru3, mapel3));

        Risa90479_Guru guru4 = Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(Risa90479_AllObjectModel.daftarGuruModel.search("HA"));
        Risa90479_MataPelajaran mapel4 = Risa90479_AllObjectModel.daftarMaPelModel.getDaftarMapel().get(Risa90479_AllObjectModel.daftarMaPelModel.search("DESGRAF"));

        Risa90479_AllObjectModel.daftarJadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Senin", 4, "X", guru4, mapel4));

        Risa90479_Guru guru5 = Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(Risa90479_AllObjectModel.daftarGuruModel.search("BA"));
        Risa90479_MataPelajaran mapel5 = Risa90479_AllObjectModel.daftarMaPelModel.getDaftarMapel().get(Risa90479_AllObjectModel.daftarMaPelModel.search("PENJAS"));

        Risa90479_AllObjectModel.daftarJadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Selasa", 1, "X", guru5, mapel5));

        Risa90479_Guru guru6 = Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(Risa90479_AllObjectModel.daftarGuruModel.search("PP"));
        Risa90479_MataPelajaran mapel6 = Risa90479_AllObjectModel.daftarMaPelModel.getDaftarMapel().get(Risa90479_AllObjectModel.daftarMaPelModel.search("MULOK"));

        Risa90479_AllObjectModel.daftarJadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Selasa", 2, "X", guru6, mapel6));
        //
        Risa90479_MataPelajaran mapel62 = Risa90479_AllObjectModel.daftarMaPelModel.getDaftarMapel().get(Risa90479_AllObjectModel.daftarMaPelModel.search("Anim2D"));

        Risa90479_AllObjectModel.daftarJadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Rabu", 2, "XI", guru6, mapel62));
        //
        Risa90479_MataPelajaran mapel63 = Risa90479_AllObjectModel.daftarMaPelModel.getDaftarMapel().get(Risa90479_AllObjectModel.daftarMaPelModel.search("MARKET"));

        Risa90479_AllObjectModel.daftarJadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Kamis", 2, "XI", guru6, mapel63));

        //
        Risa90479_MataPelajaran mapel64 = Risa90479_AllObjectModel.daftarMaPelModel.getDaftarMapel().get(Risa90479_AllObjectModel.daftarMaPelModel.search("DMI"));

        Risa90479_AllObjectModel.daftarJadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Kamis", 4, "XII", guru6, mapel64));

        Risa90479_Guru guru7 = Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(Risa90479_AllObjectModel.daftarGuruModel.search("CA"));
        Risa90479_MataPelajaran mapel7 = Risa90479_AllObjectModel.daftarMaPelModel.getDaftarMapel().get(Risa90479_AllObjectModel.daftarMaPelModel.search("KJD"));

        Risa90479_AllObjectModel.daftarJadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Selasa", 3, "X", guru7, mapel7));
        Risa90479_AllObjectModel.daftarJadwalMengajarModel.insert(new Risa90479_JadwalMengajar("Selasa", 4, "X", guru7, mapel7));
    }

}
