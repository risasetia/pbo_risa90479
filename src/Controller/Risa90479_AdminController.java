package Controller;

import Entity.Risa90479_Kurikulum;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Risa90479_AdminController implements Risa90479_ControllerInterface {

    int indexLogin = -1;

    public Risa90479_AdminController() {
    }

    public int getIndexLogin() {
        return indexLogin;
    }

    public void setIndexLogin(int indexLogin) {
        this.indexLogin = indexLogin;
    }

    
    public void dataKurikulum() {
        Risa90479_DataController.dataKurikulum();
    }

    public void viewKurikulum() {
        Risa90479_AllObjectModel.daftarKurikulumModel.view();
    }

    @Override
    public void login(String NBM, String password) {
        indexLogin = Risa90479_AllObjectModel.daftarKurikulumModel.login(NBM, password);

    }

    public ArrayList<Risa90479_Kurikulum> cekDaftarKurikulumModel() {
        return Risa90479_AllObjectModel.daftarKurikulumModel.getDaftarKurikulum();
    }
    
    public Risa90479_Kurikulum kurikulumEntity() {
        return Risa90479_AllObjectModel.daftarKurikulumModel.getDaftarKurikulum().get(indexLogin);
    }
    
    
}
