package Controller;

import Entity.Risa90479_Guru;
import javax.swing.table.DefaultTableModel;

public class Risa90479_JadwalMengajarController implements Risa90479_ControllerInterface {

    @Override
    public void login(String npm, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void view() {
        Risa90479_AllObjectModel.daftarJadwalMengajarModel.view();
    }

    public void dataJadwalMengajar() {
        Risa90479_DataController.dataJadwalMengajarAll();
    }
    
    public DefaultTableModel daftarJadwalMengajar(){
        DefaultTableModel tmdaftarJadwalMengajar = new DefaultTableModel();
        
        Object[] kolom ={"Hari","Jam Ke","Kelas","Kode Guru","Kode Mapel"};
        tmdaftarJadwalMengajar .setColumnIdentifiers(kolom);
        int size = Risa90479_AllObjectModel.daftarJadwalMengajarModel.getDaftarJadwalMengajar().size();       
        
        for(int i=0;i<size;i++){
            
            Object [] data = new Object[5];
            data[0] = Risa90479_AllObjectModel.daftarJadwalMengajarModel.getDaftarJadwalMengajar().get(i).getHari();
            data[1] = Risa90479_AllObjectModel.daftarJadwalMengajarModel.getDaftarJadwalMengajar().get(i).getJamKe();
            data[2] = Risa90479_AllObjectModel.daftarJadwalMengajarModel.getDaftarJadwalMengajar().get(i).getKelas();
            data[3] = Risa90479_AllObjectModel.daftarJadwalMengajarModel.getDaftarJadwalMengajar().get(i).getGuru().getKodeGuru();
            data[4] = Risa90479_AllObjectModel.daftarJadwalMengajarModel.getDaftarJadwalMengajar().get(i).getMapel().getKodeMapel();
            
            tmdaftarJadwalMengajar.addRow(data);
        }
        return tmdaftarJadwalMengajar;
    }

}
