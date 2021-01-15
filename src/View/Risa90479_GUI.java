package View;

import Controller.Risa90479_AdminController;
import Controller.Risa90479_AllObjectModel;
import Controller.Risa90479_DataController;
import Controller.Risa90479_GuruController;
import Entity.Risa90479_Guru;
import Entity.Risa90479_Kurikulum;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Risa90479_GUI {

    JFrame TampilanAwal = new JFrame();
    JLabel login, daftar, top;
    JRadioButton radioKurikulum, radioGuru;

    JTextField textnbmlogin, textnama, textKodeGuru, texttgllahir, textnbmdaftar, textkelas;

    JLabel labelnbmlogin, labelnama, labelpasswordlogin, labelkodeGuru, labelkodeMapel, labelnbmdaftar, labelpassworddaftar, labelJurusan;
    JButton check, reg;
    JPasswordField passwordlogin, passworddaftar;
    private boolean ceklogin = false;

    public Risa90479_GUI() {
        Risa90479_DataController.dataJurusan();
        Risa90479_DataController.dataMapel();
        Risa90479_DataController.dataGuru();
        Risa90479_DataController.dataKurikulum();
        Risa90479_DataController.dataJadwalMengajarAll();

        TampilanAwal.setSize(700, 630);
        TampilanAwal.setLayout(null);
        TampilanAwal.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("SMK Muhammadiyah 1 Surabaya");
        top.setBounds(50, 10, 600, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        TampilanAwal.add(top);
        login = new JLabel("login");
        login.setBounds(100, 50, 100, 100);
        login.setFont(new Font("Times New Roman", Font.BOLD, 30));
        TampilanAwal.add(login);
        radioKurikulum = new JRadioButton("Kurikulum");
        radioKurikulum.setBounds(30, 150, 100, 30);
        radioKurikulum.setBackground(Color.CYAN);
        TampilanAwal.add(radioKurikulum);
        radioGuru = new JRadioButton("Guru");
        radioGuru.setBounds(140, 150, 100, 30);
        radioGuru.setBackground(Color.CYAN);
        TampilanAwal.add(radioGuru);
        labelnbmlogin = new JLabel("NBM");
        labelnbmlogin.setBounds(30, 180, 30, 30);
        TampilanAwal.add(labelnbmlogin);
        textnbmlogin = new JTextField();
        textnbmlogin.setBounds(30, 210, 200, 30);
        TampilanAwal.add(textnbmlogin);
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(30, 240, 100, 30);
        TampilanAwal.add(labelpasswordlogin);
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30, 270, 200, 30);
        TampilanAwal.add(passwordlogin);
        check = new JButton("check");
        check.setBounds(90, 320, 100, 40);
        check.setBackground(Color.GREEN);
        TampilanAwal.add(check);
        daftar = new JLabel("Akun Guru");
        daftar.setFont(new Font("Times New Roman", Font.BOLD, 30));
        daftar.setBounds(440, 50, 150, 100);
        TampilanAwal.add(daftar);
        labelnbmdaftar = new JLabel("NBM");
        labelnbmdaftar.setBounds(400, 150, 30, 30);
        TampilanAwal.add(labelnbmdaftar);
        textnbmdaftar = new JTextField();
        textnbmdaftar.setBounds(400, 180, 200, 30);
        TampilanAwal.add(textnbmdaftar);
        labelnama = new JLabel("Nama");
        labelnama.setBounds(400, 210, 100, 30);
        TampilanAwal.add(labelnama);
        textnama = new JTextField();
        textnama.setBounds(400, 240, 200, 30);
        TampilanAwal.add(textnama);
        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(400, 270, 100, 30);
        TampilanAwal.add(labelpassworddaftar);
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(400, 300, 200, 30);
        TampilanAwal.add(passworddaftar);
        labelkodeGuru = new JLabel("Kode Guru");
        labelkodeGuru.setBounds(400, 330, 100, 30);
        TampilanAwal.add(labelkodeGuru);
        textKodeGuru = new JTextField();
        textKodeGuru.setBounds(400, 360, 200, 30);
        TampilanAwal.add(textKodeGuru);
        labelkodeMapel = new JLabel("Kode Mapel");
        labelkodeMapel.setBounds(400, 390, 200, 30);
        TampilanAwal.add(labelkodeMapel);
        texttgllahir = new JTextField();
        texttgllahir.setBounds(400, 420, 200, 30);
        TampilanAwal.add(texttgllahir);
        labelJurusan = new JLabel("Jurusan");
        labelJurusan.setBounds(400, 450, 200, 30);
        TampilanAwal.add(labelJurusan);
        textkelas = new JTextField();
        textkelas.setBounds(400, 480, 200, 30);
        TampilanAwal.add(textkelas);
        reg = new JButton("Daftar");
        reg.setBounds(460, 520, 100, 40);
        reg.setBackground(Color.GREEN);
        TampilanAwal.add(reg);
        TampilanAwal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TampilanAwal.setVisible(true);
        TampilanAwal.setLocationRelativeTo(null);
        radioKurikulum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radioKurikulum.isSelected()) {
                    radioGuru.setSelected(false);
                    ceklogin = true;
                }
            }
        });
        radioGuru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radioGuru.isSelected()) {
                    radioKurikulum.setSelected(false);
                    ceklogin = false;
                }
            }
        });

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //login Kurikulum
                if (ceklogin == true) {
                    try {
                        Risa90479_AllObjctrl.admin.login(textnbmlogin.getText(), passwordlogin.getText());
                        String nama = Risa90479_AllObjctrl.admin.kurikulumEntity().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat datang " + nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        Risa90479_KurikulumGUI kGUI = new Risa90479_KurikulumGUI();
                        TampilanAwal.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "NBM atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    kosong();

                } else {
                    try{ 
                        Risa90479_AllObjctrl.guru.login(textnbmlogin.getText(), passwordlogin.getText());
                        Risa90479_Guru guru = Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(Risa90479_AllObjctrl.guru.getIndexLogin());
                        String nama = Risa90479_AllObjctrl.guru.guruEntity().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat datang " + nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        Risa90479_GuruGUI kGUI = new Risa90479_GuruGUI(guru);
                        TampilanAwal.dispose();
                        
                    } catch (Exception eception) {
                        JOptionPane.showMessageDialog(null, "NPM atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }
            }
        });

        /*
         reg.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent ae){
         try{
         String npm = textnpmdaftar.getText();
         String pass = passworddaftar.getText();
         String nama = textnama.getText();
         String notelp = textnotelp.getText();
         Date tgllahir = new Date(texttgllahir.getText());
         String kelas = textkelas.getText();
         Allobjctrl90479.Praktikan.insert(npm, pass, nama, notelp, tgllahir, kelas);
         JOptionPane.showMessageDialog(null, "Registrasi sukses", "information", JOptionPane.INFORMATION_MESSAGE);
         kosong();
         }catch(Exception exception){
         JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
         }
         }
         });*/
    }

    void kosong() {
        textnbmdaftar.setText(null);
        passworddaftar.setText(null);
        textnama.setText(null);
        textKodeGuru.setText(null);
        texttgllahir.setText(null);
        textnbmlogin.setText(null);
        passwordlogin.setText(null);
        textkelas.setText(null);
    }
}
