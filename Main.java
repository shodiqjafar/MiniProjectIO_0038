import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Anggota> daftarAwal = new ArrayList<>();
        daftarAwal.add(new Mahasiswa("Epenk", "M001"));
        daftarAwal.add(new Dosen("Rangga", "D001"));
        daftarAwal.add(new Karyawan("Pak Supri", "K001"));

        AnggotaFileIO.simpanAnggota(daftarAwal, "anggota.txt");

        List<Anggota> daftarHasilBaca = AnggotaFileIO.bacaAnggota("anggota.txt");
        System.out.println("\n========= Daftar Anggota ==========");
        for (Anggota a : daftarHasilBaca) {
            a.tampilkanInfo();
        }
    }
}