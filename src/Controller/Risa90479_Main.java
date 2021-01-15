package Controller;

import Entity.Risa90479_Guru;
import Entity.Risa90479_JadwalMengajar;
import Entity.Risa90479_Kurikulum;
import Entity.Risa90479_MataPelajaran;
import java.util.ArrayList;
import java.util.Scanner;

public class Risa90479_Main {

    private static Risa90479_AdminController admin = new Risa90479_AdminController();
    private static Risa90479_GuruController guru = new Risa90479_GuruController();
    private static Risa90479_JadwalMengajarController jadwal = new Risa90479_JadwalMengajarController();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int loop = 0;

        Risa90479_DataController.dataMapel();
        Risa90479_DataController.dataJurusan();
        Risa90479_DataController.dataGuru();
        Risa90479_DataController.dataKurikulum();
        Risa90479_DataController.dataJadwalMengajarAll();

        //admin.dataKurikulum();
        do {
            int pilih = 0;
            System.out.print("\nSelamat datang di SMK Muhammadiyah 1 SBY !!"
                    + "\n 1. Login"
                    + "\n 2. Stop"
                    + "\n Masukkan Pilihan Anda : ");
            pilih = input.nextInt();
            if (pilih == 1) {
                int pilLogin = 0;
                System.out.println("1. Login Kurikulum\n2. Login Guru\nPilih : ");
                pilLogin = input.nextInt();
                if (pilLogin == 1) {
                    loginKurikulum();
                    //jika login kurikulum salah maka tidak dapat menampilkan/merubah data jadwal mengajar
                    if (admin.indexLogin != -1) {
                        int p = menuJadwalMengajar();
                        if (p == 1) {
                            tambahDataJadwalMengajar();
                            jadwal.view();
                        } else if (p == 2) {
                            jadwal.view();
                            editDataJadwalMengajar();
                        } else if (p == 3) {
                            hapusDataJadwalMengajar();
                        } else if (p == 4) {
                            jadwal.view();
                        }
                    }

                } else {
                    loginGuru();

                    if (guru.indexLogin != -1) {
                        Risa90479_Guru g = Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(guru.indexLogin);
                        ArrayList<Risa90479_JadwalMengajar> jadwal = Risa90479_AllObjectModel.daftarJadwalMengajarModel.searchJadwalMengajarGuru(g);
                        System.out.println(jadwal);
                    }

                }
            } else if (pilih == 2) {
                break;
            }
        } while (loop != 1);
    }

    static void loginKurikulum() {
        System.out.print("NBM : ");
        String npm = input.next();
        System.out.print("Password : ");
        String password = input.next();
        try {
            //jika input NBM atau password salah maka mengembalikan nilai admin.indexLogin = -1
            admin.login(npm, password);

            //mengakses daftarKurikulum, dengan indexLogin -1 --> menghasilkan exception/kesalahan.
            //karena ArrayList tidak ada index -1, ArrayList mulai dari 0
            Risa90479_Kurikulum kurikulum = Risa90479_AllObjectModel.daftarKurikulumModel.getDaftarKurikulum().get(admin.indexLogin);
            System.out.println("NBM : " + kurikulum.getNbm());
            System.out.println("Nama : " + kurikulum.getNama());

        } catch (Exception exception) {
            System.out.println("=================================");
            System.out.println("NBM atau Password anda Salah !!");
            System.out.println("=================================");

        }

    }

    static void loginGuru() {
        System.out.print("NBM : ");
        String npm = input.next();
        System.out.print("Password : ");
        String password = input.next();
        try {
            guru.login(npm, password);

            Risa90479_Guru guruLogin = Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(guru.indexLogin);
            System.out.println("NBM : " + guruLogin.getNbm());
            System.out.println("Nama : " + guruLogin.getNama());

        } catch (Exception exception) {
            System.out.println("=================================");
            System.out.println("NBM atau Password anda Salah !!");
            System.out.println("=================================");

        }
    }

    static int menuJadwalMengajar() {
        System.out.println("Jadwal Mengajar");
        System.out.println("1. Menambah Data");
        System.out.println("2. Mengedit Data");
        System.out.println("3. Menghapus Data");
        System.out.println("4. Menampilkan Data");
        System.out.println("Pilih: ");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int p = Integer.parseInt(str);

        //System.out.println("pilih :" + pilih);
        return p;
    }

    static void editDataJadwalMengajar() {
        System.out.println("Masukkan kode Guru :");
        String kodeG = input.next();

        //int index = Risa90479_AllObjectModel.daftarGuruModel.search(kodeG);
        //Risa90479_Guru g = Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(index);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Hari  :");
        String hari = input.next();

        System.out.println("Masukkan Jam Ke :");
        String strJam = input.next();
        int jam = Integer.parseInt(strJam);

        System.out.println("Masukkan Hari (Baru)  :");
        String hari2 = input.next();

        System.out.println("Masukkan Jam Ke  (Baru) :");
        String strJam2 = input.next();
        int jam2 = Integer.parseInt(strJam2);

        int index = Risa90479_AllObjectModel.daftarJadwalMengajarModel.searchJadwalMengajar(kodeG, hari, jam);
        System.out.println("index :" + index);
        Risa90479_AllObjectModel.daftarJadwalMengajarModel.edit(kodeG, hari, jam, hari2, jam2);
        Risa90479_AllObjectModel.daftarJadwalMengajarModel.view();

    }

    static void hapusDataJadwalMengajar() {
        System.out.println("Masukkan kode Guru :");
        String kodeG = input.next();

        //int index = Risa90479_AllObjectModel.daftarGuruModel.search(kodeG);
        //Risa90479_Guru g = Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(index);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Hari :");
        String hari = input.next();

        System.out.println("Masukkan Jam Ke :");
        String strJam = input.next();
        int jam = Integer.parseInt(strJam);

        //int index = Risa90479_AllObjectModel.daftarJadwalMengajarModel.searchJadwalMengajar(kodeG, hari, jam);
        //System.out.println("index :"+ index);
        //Risa90479_AllObjectModel.daftarJadwalMengajarModel.getDaftarJadwalMengajar().remove(index);
        Risa90479_AllObjectModel.daftarJadwalMengajarModel.delete(kodeG, hari, jam);
        Risa90479_AllObjectModel.daftarJadwalMengajarModel.view();
    }

    static void tambahDataJadwalMengajar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Hari :");
        String hari = input.next();

        System.out.println("Masukkan Jam Ke :");
        String strJam = input.next();
        int jam = Integer.parseInt(strJam);

        System.out.println("Masukkan Kelas :");
        String kelas = input.next();

        System.out.println("Masukkan kode Guru :");
        String kodeG = input.next();

        int index = Risa90479_AllObjectModel.daftarGuruModel.search(kodeG);
        Risa90479_Guru g = Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(index);

        System.out.println("Masukkan kode Mapel ;");
        String kodeMapel = input.next();

        index = Risa90479_AllObjectModel.daftarMaPelModel.search(kodeMapel);
        Risa90479_MataPelajaran mapel = Risa90479_AllObjectModel.daftarMaPelModel.getDaftarMapel().get(index);

        Risa90479_JadwalMengajar jadwal = new Risa90479_JadwalMengajar(hari, jam, kelas, g, mapel);
        Risa90479_AllObjectModel.daftarJadwalMengajarModel.insert(jadwal);
    }

}
