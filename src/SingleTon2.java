public class SingleTon2 {

    //Eager way of creating singleton object
    private static  SingleTon2 singleTon2 = new SingleTon2();

    public static SingleTon2 getSingleTon2(){
        return singleTon2;
    }
}
