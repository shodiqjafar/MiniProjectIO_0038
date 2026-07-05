public class Mahasiswa extends Anggota {

    public Mahasiswa(String nama, String id) {
        super(nama, id);
    }

    @Override
    public String getKodeJenis() {
        return "M";
    }
}