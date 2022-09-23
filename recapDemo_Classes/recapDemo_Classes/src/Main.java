public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(4, 5);
        System.out.println(sonuc);

        int sonuc1 = dortIslem.Cikar(9, 5);
        System.out.println(sonuc1);

        int sonuc2 = dortIslem.Carp(4, 5);
        System.out.println(sonuc2);
    }
}