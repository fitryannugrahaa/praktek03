package praktek03;
public class TasAksi {
    public static void main(String[] args) {
        Tas t = new Tas();

        t.setMerk("Jansport");
        t.setWarna("Hitam");
        t.setHarga(500000);
        
        t.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(t.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(t.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(t.getHarga());
    }
}
