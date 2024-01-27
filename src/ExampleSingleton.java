import javax.sound.midi.Soundbank;
import java.lang.reflect.Constructor;

public class ExampleSingleton {
    public static void main(String[] args) throws Exception {
//        SingleTon singleTon1 = SingleTon.getSingleTon();
//
//        SingleTon singleTon2 = SingleTon.getSingleTon();
//        System.out.println(singleTon1.hashCode());
//        System.out.println(singleTon2.hashCode());
//
//
//        System.out.println(SingleTon2.getSingleTon2().hashCode());
//        System.out.println(SingleTon2.getSingleTon2().hashCode());

        //Reflection Api used for break singleton

        SingleTon s1 = SingleTon.getSingleTon();
        System.out.println(s1.hashCode());
        //get class
        Constructor<SingleTon> constructor = SingleTon.class.getDeclaredConstructor();

        constructor.setAccessible(true);// TO access for private constructor
        SingleTon s2 = constructor.newInstance();
        System.out.println(s2.hashCode());
                ;
    }
}
