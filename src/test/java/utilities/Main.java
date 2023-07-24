package utilities;

public class Main {

    public static void main(String[] args) {

//        Singleton1 s1 = new Singleton1();
//        Singleton1 s2 = new Singleton1();
//        System.out.println(s1 == s2); // bellekte farkli yerler tuttugu icin false geldi

            Singleton1 s1 = Singleton1.getInstance(); // daha once Singleton dan instance olusturmadigimiz icin objeyi olusturdu
            Singleton1 s2 = Singleton1.getInstance(); // yukarda (s1) olusturdugumuz icin if e girmeden s1 donecek.

        System.out.println(s1 == s2);
    }
}
