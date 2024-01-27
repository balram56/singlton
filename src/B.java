 class A {
    //create properties private and static
    private static A a;
    //create constructor
    private A(){

    }
    //create lazy way of singleton object
    public static A getA(){
        //create obj of this class
        if (a==null){
            //create synchronized block for thread safe
            synchronized(A.class){
                if(a==null){
                    a = new A();
                }
            }
        }
        return a;
    }

    }

 public class B{
     public static void main(String[] args) {
         A a1 = A.getA();
         A a2 = A.getA();

         System.out.println(a1);
         System.out.println(a2);

     }
}
