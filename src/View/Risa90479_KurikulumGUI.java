package View;


import Controller.Risa90479_AdminController;
import Controller.Risa90479_JadwalMengajarController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Risa90479_KurikulumGUI {
   
    private static Risa90479_JadwalMengajarController jadwal = new Risa90479_JadwalMengajarController();
    
    JFrame kurikulumJFrame = new JFrame();
    JTable tabelKurikulum = new JTable();
    JScrollPane scrollaslab = new JScrollPane(tabelKurikulum);
    JButton back,verif;
    JLabel adminlabel,nbmlabel,passlabel;
    JTextField npmtext,passtext;
    public Risa90479_KurikulumGUI(){
        kurikulumJFrame.setSize(650,500);
        kurikulumJFrame.setLayout(null);
        kurikulumJFrame.getContentPane().setBackground(Color.PINK);
        adminlabel = new JLabel("Admin");
        adminlabel.setBounds(250, 30, 200, 30);
        adminlabel.setFont(new Font("Timer New Roman",Font.BOLD,40));
        kurikulumJFrame.add(adminlabel);
        scrollaslab.setBounds(30, 100, 570, 200);
        tabelKurikulum.setModel(jadwal.daftarJadwalMengajar());
        kurikulumJFrame.add(scrollaslab);
        //npmlabel = new JLabel("NPM");
        //npmlabel.setBounds(50, 320, 100, 30);
        //Aslab.add(npmlabel);
        //npmtext = new JTextField();
        //npmtext.setBounds(50, 350, 100, 30);
        //Aslab.add(npmtext);
        //passlabel = new JLabel("Password");
        //passlabel.setBounds(200, 320, 100, 30);
        //Aslab.add(passlabel);
        //passtext = new JTextField();
        //passtext.setBounds(200, 350, 100, 30);
        //Aslab.add(passtext);
        //verif = new JButton("verif");
        //verif.setBounds(350, 350, 100, 30);
        //verif.setBackground(Color.GREEN);
        //Aslab.add(verif);
        back = new JButton("back");
        back.setBounds(50, 400, 100, 30);
        back.setBackground(Color.red);
        kurikulumJFrame.add(back);
        kurikulumJFrame.setLocationRelativeTo(null);
        kurikulumJFrame.setVisible(true);
        kurikulumJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                kurikulumJFrame.dispose();
                Risa90479_GUI men = new Risa90479_GUI();
            }
        });
        
        /*
        verif.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                String npm = npmtext.getText();
                String pass = passtext.getText();
                int index = AllObjectModel90479.daftarPrakModel.cekData(npm, pass);
                Allobjctrl90479.admin.updateIsVerified(index, Allobjctrl90479.Praktikan.showDaftarPrak(index).getIndexPrak(),Allobjctrl90479.Praktikan.showDaftarPrak(index).getPraktikan());
                tabelpraktikan.setModel(praktikan.daftarprak());
            }
        });
        tabelpraktikan.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i = tabelpraktikan.getSelectedRow();
                npmtext.setText(Allobjctrl90479.Praktikan.daftarprak().getValueAt(i, 0).toString());
                passtext.setText(Allobjctrl90479.Praktikan.daftarprak().getValueAt(i, 1).toString());
            }
        });
        */
    }
}
