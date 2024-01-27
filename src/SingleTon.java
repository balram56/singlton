public class SingleTon {

    // 1. create  private static field
    private static  SingleTon singleTon;

    //2.create private constructors
    private SingleTon(){

    }
    //3. Lazy way of creating single object
    public static SingleTon getSingleTon(){
        //create object of this class
        if(singleTon == null){
            //create synchronized block for thread safe
            synchronized (SingleTon.class){
                if (singleTon==null){
                    singleTon = new SingleTon();
                }

            }
        }
        return  singleTon;
    }
}
