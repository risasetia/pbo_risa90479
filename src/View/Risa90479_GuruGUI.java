package View;


import Entity.Risa90479_Guru;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Risa90479_GuruGUI {
    Risa90479_Guru guru;
    JFrame guruGUI = new JFrame();
    JButton back,daftarbtn;
    JTextArea area = new JTextArea();
    JLabel datadiri,daftarpraktikum;
    //JComboBox pilprak = new JComboBox(PraktikumEntity90479.nama);
    //int cek = Allobjctrl90479.Praktikan.cekDaftarPrak(Allobjctrl90479.Praktikan.praktikanEntity().getNpm());
    public Risa90479_GuruGUI(Risa90479_Guru guru){
        this.guru = guru ;
        guruGUI.setSize(720, 600);
        guruGUI.setLayout(null);
        guruGUI.getContentPane().setBackground(Color.PINK);
        datadiri = new JLabel("Data Guru");
        datadiri.setFont(new Font("Timer New Roman",Font.BOLD,30));
        datadiri.setBounds(90, 30, 200, 30);
        guruGUI.add(datadiri);
        area.setBounds(30, 90, 400, 300);
        guruGUI.add(area);
        area.setText(guru.toString());
        //daftarpraktikum = new JLabel("Daftar Praktikum");
        //daftarpraktikum.setBounds(450, 30, 250, 30);
        //daftarpraktikum.setFont(new Font("Times New Roman",Font.BOLD,30));
        //guruGUI.add(daftarpraktikum);
        //pilprak.setBounds(450, 90, 230, 30);
        //guruGUI.add(pilprak);
        //daftarbtn = new JButton("Daftar");
       // daftarbtn.setBounds(500, 200, 100, 30);
        //daftarbtn.setBackground(Color.GREEN);
        //guruGUI.add(daftarbtn);
        back = new JButton("Back");
        back.setBounds(30, 500, 100, 30);
        back.setBackground(Color.red);
        guruGUI.add(back);
        guruGUI.setVisible(true);
        guruGUI.setLocationRelativeTo(null);
        guruGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
        if(cek==-1){
            JOptionPane.showMessageDialog(null, "Anda Belum Daftar Praktikum", "Information", JOptionPane.INFORMATION_MESSAGE);        
        }else if(cek==-2){
            JOptionPane.showMessageDialog(null,"Anda Belum Daftar Praktikum", "Information", JOptionPane.INFORMATION_MESSAGE);
        }else{
            area.setText(datapraktikan());
        }*/
        
        /*
        daftarbtn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            int indexprak = pilprak.getSelectedIndex();
            Allobjctrl90479.Praktikan.daftarPraktikum(indexprak, Allobjctrl90479.Praktikan.getData(), false);
            area.setText(datapraktikan());
        }
        });
        */
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                guruGUI.dispose();
                Risa90479_GUI men = new Risa90479_GUI();
            }
        });
    }
    /*
    String datapraktikan(){
        int cek = Allobjctrl90479.Praktikan.cekDaftarPrak(Allobjctrl90479.Praktikan.praktikanEntity().getNpm());
        String cekverif;
        if(Allobjctrl90479.Praktikan.showDaftarPrak(cek).IsVerified()==false){
            cekverif = "belum diverifikasi";
        }else{
            cekverif = "sudah diverifikasi";
        }
        String text = "Npm = "+Allobjctrl90479.Praktikan.showDaftarPrak(cek).getPraktikan().getNpm()+"\n"
                +"Nama = "+Allobjctrl90479.Praktikan.showDaftarPrak(cek).getPraktikan().getNama()+"\n"
                +"No Telp = "+Allobjctrl90479.Praktikan.showDaftarPrak(cek).getPraktikan().getNo_telp()+"\n"
                +"Tanggal Lahir = "+new SimpleDateFormat("dd-MM-yyyy").format(Allobjctrl90479.Praktikan.showDaftarPrak(cek).getPraktikan().getTglLahir())+"\n"
                +"Verifikasi = "+cekverif+"\n"
                +"Kelas = "+Allobjctrl90479.Praktikan.showDaftarPrak(cek).getPraktikan().getKelas()+"\n"
                +"Praktikum = "+PraktikumEntity90479.nama[Allobjctrl90479.Praktikan.showDaftarPrak(cek).getIndexPrak()];
        return text;
    }*/
}
