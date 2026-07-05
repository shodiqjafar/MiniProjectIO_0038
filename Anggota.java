public abstract class Anggota {
    private String nama;
    private String id;

    public Anggota(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public abstract String getKodeJenis();

    public void tampilkanInfo() {
        System.out.println(getKodeJenis() + " | " + id + " | " + nama);
    }
}