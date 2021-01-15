package Model;

import Entity.Risa90479_MataPelajaran;
import java.util.ArrayList;

public class Risa90479_MaPelModel implements Model.Risa90479_ModelInterfaces {

    ArrayList<Risa90479_MataPelajaran> daftarMapel = new ArrayList<Risa90479_MataPelajaran>();

    public ArrayList<Risa90479_MataPelajaran> getDaftarMapel() {
        return daftarMapel;
    }

    public void setDaftarMapel(ArrayList<Risa90479_MataPelajaran> daftarMapel) {
        this.daftarMapel = daftarMapel;
    }    
    
    @Override
    public void view() {
        System.out.println("MATA PELAJARAN : ");
        for (int i = 0; i < daftarMapel.size(); i++) {
            Risa90479_MataPelajaran mapel = daftarMapel.get(i);
            System.out.println(mapel.getKodeMapel() + ", " + mapel.getNamaMapel() + ", " + mapel.getSemester());
        }
    }

    @Override
    public int search(String s) {
        for (int i = 0; i < daftarMapel.size(); i++) {
            Risa90479_MataPelajaran mp = daftarMapel.get(i);
            if (mp.getKodeMapel().equalsIgnoreCase(s) == true) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insert(Object o) {
        Entity.Risa90479_MataPelajaran mapel = (Entity.Risa90479_MataPelajaran) o ;
        daftarMapel.add(mapel);
    }

    @Override
    public void delete(String kode) {
        int index = search(kode);
        daftarMapel.remove(index);
    }

    @Override
    public void edit(String kode, String kodeNew) {
        int index = search(kode);
        daftarMapel.get(index).setKodeMapel(kodeNew);
    }
}
