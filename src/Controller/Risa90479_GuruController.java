package Controller;

import Entity.Risa90479_Guru;
import Entity.Risa90479_Kurikulum;
import java.util.ArrayList;

public class Risa90479_GuruController implements Risa90479_ControllerInterface {

    int indexLogin = -1;

    public Risa90479_GuruController() {
    }

    public int getIndexLogin() {
        return indexLogin;
    }

    public void setIndexLogin(int indexLogin) {
        this.indexLogin = indexLogin;
    }

    
    public void dataGuru() {
        Risa90479_DataController.dataGuru();
    }

    public void viewGuru() {
        Risa90479_AllObjectModel.daftarGuruModel.view();
    }

    @Override
    public void login(String NBM, String password) {
        indexLogin = Risa90479_AllObjectModel.daftarGuruModel.login(NBM, password);

    }

    public ArrayList<Risa90479_Guru> cekDaftarKurikulumModel() {
        return Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru();
    }
        
    public Risa90479_Guru guruEntity() {
        return Risa90479_AllObjectModel.daftarGuruModel.getDaftarGuru().get(indexLogin);
    }
}
