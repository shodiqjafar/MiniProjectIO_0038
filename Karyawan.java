public class Karyawan extends Anggota {

    public Karyawan(String nama, String id) {
        super(nama, id);
    }

    @Override
    public String getKodeJenis() {
        return "K";
    }
}