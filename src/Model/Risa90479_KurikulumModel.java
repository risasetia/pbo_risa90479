package Model;

import Entity.Risa90479_Guru;
import Entity.Risa90479_Kurikulum;
import java.util.ArrayList;

public class Risa90479_KurikulumModel implements Risa90479_ModelInterfaces {

    ArrayList<Risa90479_Kurikulum> daftarKurikulum = new ArrayList<Risa90479_Kurikulum>();

    public Risa90479_KurikulumModel() {
    }

    @Override
    public void view() {
        System.out.println("JUMLAH KURIKULUM :" + daftarKurikulum.size());
        for (int i = 0; i < daftarKurikulum.size(); i++) {
            System.out.println("----------------------------");
            Risa90479_Kurikulum tempKurikulum = daftarKurikulum.get(i);
            System.out.println(tempKurikulum);
            //System.out.println("Kode Guru   :" + tempGuru.getKodeGuru());
            //System.out.println("Nama Guru   :" + tempGuru.getNama());
        }
    }

    public ArrayList<Risa90479_Kurikulum> getDaftarKurikulum() {
        return daftarKurikulum;
    }

    public void setDaftarKurikulum(ArrayList<Risa90479_Kurikulum> daftarKurikulum) {
        this.daftarKurikulum = daftarKurikulum;
    }

    public void delete(String kodeK) {
        int index = search(kodeK);
        daftarKurikulum.remove(index);

    }

    public void edit(String kodeK, String kodeKB) {
        int index = search(kodeK);
        daftarKurikulum.get(index).setNbm(kodeKB);
    }

    @Override
    public int search(String kodeG) {
        for (int i = 0; i < daftarKurikulum.size(); i++) {
            Risa90479_Kurikulum k = daftarKurikulum.get(i);
            if (k.getKodeGuru().equalsIgnoreCase(kodeG) == true) {
                return i;
            }
        }
        return -1;
    }
    
    
    public int searchNBM(String nbm) {
        for (int i = 0; i < daftarKurikulum.size(); i++) {
            Risa90479_Kurikulum k = daftarKurikulum.get(i);
            if (k.getNbm().equalsIgnoreCase(nbm) == true) {
                return i;
            }
        }
        return -1;
    }

    public int login(String nbm, String password){
        for (int i = 0; i < daftarKurikulum.size(); i++) {
            Risa90479_Kurikulum k = daftarKurikulum.get(i);
            if (k.getNbm().equalsIgnoreCase(nbm) == true && k.getPassword().equalsIgnoreCase(password)){
                return i;
            }
        }
        return -1;
    }
    @Override
    public void insert(Object o) {
        Entity.Risa90479_Kurikulum kurikulum = (Entity.Risa90479_Kurikulum) o;
        daftarKurikulum.add(kurikulum);
    }
}
