public class Dosen extends Anggota {

    public Dosen(String nama, String id) {
        super(nama, id);
    }

    @Override
    public String getKodeJenis() {
        return "D";
    }
}