package pertemuan_keempat;

public class operasi_boolean {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir =  80;

        var lulusabsen = absen >= 75;
        var lulusnilaiakhir = nilaiAkhir >= 75;
        
        var lulus = lulusabsen && lulusnilaiakhir;
        System.out.println(lulus);
    }
}
