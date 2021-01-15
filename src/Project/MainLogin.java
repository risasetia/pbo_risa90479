/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import Entity.Risa90479_Guru;
import Entity.Risa90479_JadwalMengajar;
import Entity.Risa90479_MataPelajaran;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SMKM1
 */
public class MainLogin {

    int menuUTAMA() {
        System.out.println("Menampilkan : ");
        System.out.println("1. LOGIN");
        System.out.println("Pilih:");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int pilih = Integer.parseInt(str);
        return pilih;
    }

    int menuKurikulum() {
        System.out.println("KURIKULUM");
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

    void tambahDataJadwalMengajar() {
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

        int index = Data.guruModel.search(kodeG);

        Risa90479_Guru tempGuru = Data.guruModel.getDaftarGuru().get(index);

        System.out.println("Masukkan kode Mapel ;");
        String kodeMapel = input.next();

        index = Data.mapelModel.search(kodeMapel);
        Risa90479_MataPelajaran mapel = Data.mapelModel.getDaftarMapel().get(index);

        Risa90479_JadwalMengajar jadwal = new Risa90479_JadwalMengajar(hari, jam, kelas, tempGuru, mapel);
        Data.jadwalMengajarModel.insert(jadwal);
    }

    String login() {
        System.out.print("NBM : ");
        Scanner input = new Scanner(System.in);
        String nbm = input.next();
        System.out.print("Password : ");
        String password = input.next();

        int index = Data.guruModel.searchNBM(nbm);
        if (index != -1) {
            //Data.guruModel.view();
            System.out.println("-------------------------------");
            System.out.println(Data.guruModel.getDaftarGuru().get(index));
            System.out.println("-------------------------------");
            Risa90479_Guru g = Data.guruModel.getDaftarGuru().get(index);
            ArrayList<Risa90479_JadwalMengajar> jadwalG = Data.jadwalMengajarModel.searchJadwalMengajarGuru(g);
            System.out.println(jadwalG);
            return "guru";
        } else {
            index = Data.kurikulumModel.searchNBM(nbm);
            System.out.println("-------------------------------");
            System.out.println(Data.kurikulumModel.getDaftarKurikulum().get(index));
            System.out.println("-------------------------------");
            int p = menuKurikulum();
            if (p == 1) {
                tambahDataJadwalMengajar();
                Data.jadwalMengajarModel.view();
            } else if (p == 4) {
                Data.jadwalMengajarModel.view();
            }

            return "kurikulum";

        }

    }

    public static void main(String[] args) {

        MainLogin mainLogin = new MainLogin();

        Data.dataMapel();
        Data.dataJurusan();
        Data.dataGuru();
        Data.dataKurikulum();
        Data.dataJadwalMengajarAll();
        
        String jawab="";
        do {
            int pilih = mainLogin.menuUTAMA();

            switch (pilih) {
                case 1:
                    String jenis = mainLogin.login();
                    break;
            }

            Scanner input = new Scanner(System.in);
            System.out.println("Lanjut [Y]:");
            jawab = input.next();

        } while (jawab.equalsIgnoreCase("Y")  || jawab.equalsIgnoreCase("y") );
                
    }
}
