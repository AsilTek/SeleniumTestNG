package utilities;

public class Singleton1 {

    /*
    Singleton means, you can create only 1 instance of the class.
    1- Create static instance(object) of the class                                             --> static ClassName obj = new ClassName();
    2- Create a private constructor of the class so no one can create an object from the class --> private ClassName(){}
    3- Create a method which should be static, name getInstance and return instance of class.  --> public static ClassName getInstance(){ return obj; }
     */

    //Mainden getInstance methodunu cagirirken daha once bundan olusturduk mu diye diye kontrol edecegiz. Eger olusturduysak null olmicak olusturuan obje donecek
    private static Singleton1 uniqueInstance = null; // tek instance olacagi icin (uzerinde degisiklik yapacagimiz class a ait tek instance) unique dedim.

    private static int value = 0; // adding attribute (variable) of class


    private Singleton1(){ // disaridan erisim olmamasi icin
    }

    public static Singleton1 getInstance() {//getInstance bize Singleton classinin instance ini dondurecek

        synchronized (Singleton1.class) { // works for multi-thread. It will wait one thread execute this block then will start for next thread.
            if (uniqueInstance == null) { //will provide us to return same instance every time.
                uniqueInstance = new Singleton1(); // eger null ise uniqueInstance icin bir Singleton objesi olusturacak
            }
        }
        return uniqueInstance; // eger daha once olusturulduysa direk uniqueInstance dondurecek.
    }
}
