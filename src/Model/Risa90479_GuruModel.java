package Model;

import Entity.Risa90479_Guru;
import java.util.ArrayList;

public class Risa90479_GuruModel implements Risa90479_ModelInterfaces {

    ArrayList<Risa90479_Guru> daftarGuru = new ArrayList<Risa90479_Guru>();

    public Risa90479_GuruModel() {
    }

    public ArrayList<Risa90479_Guru> getDaftarGuru() {
        return daftarGuru;
    }

    public void setDaftarGuru(ArrayList<Risa90479_Guru> daftarGuru) {
        this.daftarGuru = daftarGuru;
    }

    
    @Override
    public void view() {
        System.out.println("JUMLAH GURU :" + daftarGuru.size());
        for (int i = 0; i < daftarGuru.size(); i++) {
            System.out.println("----------------------------");
            Risa90479_Guru tempGuru = daftarGuru.get(i);
            System.out.println(tempGuru);
            //System.out.println("Kode Guru   :" + tempGuru.getKodeGuru());
            //System.out.println("Nama Guru   :" + tempGuru.getNama());
        }
    }

   

    public void delete(String kodeG) {
        int index = search(kodeG);
        daftarGuru.remove(index);

    }

    public void edit(String kodeG, String kodeGB) {
        int index = search(kodeG);
        daftarGuru.get(index).setKodeGuru(kodeGB);
    }

    @Override
    public int search(String kodeG) {
        for (int i = 0; i < daftarGuru.size(); i++) {
            Risa90479_Guru g = daftarGuru.get(i);
            if (g.getKodeGuru().equalsIgnoreCase(kodeG) == true) {
                return i;
            }
        }
        return -1;
    }
    
  
    public int searchNBM(String nbm) {
        for (int i = 0; i < daftarGuru.size(); i++) {
            Risa90479_Guru g = daftarGuru.get(i);
            if (g.getNbm().equalsIgnoreCase(nbm) == true) {
                return i;
            }
        }
        return -1;
    }
    
    public int login(String nbm, String password) {
        for (int i = 0; i < daftarGuru.size(); i++) {
            Risa90479_Guru g = daftarGuru.get(i);
            if (g.getNbm().equalsIgnoreCase(nbm) == true && g.getPassword().equalsIgnoreCase(password)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insert(Object o) {
        Entity.Risa90479_Guru guru = (Entity.Risa90479_Guru) o ;
        daftarGuru.add(guru);
    }

}
