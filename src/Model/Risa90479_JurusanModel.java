package Model;

import Entity.Risa90479_Jurusan;
import java.util.ArrayList;

public class Risa90479_JurusanModel implements Risa90479_ModelInterfaces {

    ArrayList<Risa90479_Jurusan> daftarJurusan = new ArrayList<Risa90479_Jurusan>();

    public ArrayList<Risa90479_Jurusan> getDaftarJurusan() {
        return daftarJurusan;
    }

    public void setDaftarJurusan(ArrayList<Risa90479_Jurusan> daftarJurusan) {
        this.daftarJurusan = daftarJurusan;
    }

    
    @Override
    public void view() {
        System.out.println("JURUSAN : ");
        for (int i = 0; i < daftarJurusan.size(); i++) {
            Risa90479_Jurusan jrs = daftarJurusan.get(i);
            System.out.println(jrs.getKodeJurusan() + ", " + jrs.getNamaJurusan());
        }
    }

    @Override
    public int search(String s) {
        for (int i = 0; i < daftarJurusan.size(); i++) {
            Risa90479_Jurusan g = daftarJurusan.get(i);
            if (g.getKodeJurusan().equalsIgnoreCase(s) == true) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insert(Object o) {
         Entity.Risa90479_Jurusan jurusan = (Entity.Risa90479_Jurusan) o ;
         daftarJurusan.add(jurusan);
    }

    @Override
    public void delete(String kode) {
        int index = search(kode);
        daftarJurusan.remove(index);
    }

    @Override
    public void edit(String kode, String kodeNew) {
        int index = search(kode);
        daftarJurusan.get(index).setKodeJurusan(kodeNew);
    }

}
