public class Main {
    public static void main(String[] args) {

        int []arr={1,2,3,4};
        System.out.println("A");
//        int i=5/0;                   //Arithmetic Exception
        try{
            int i=5/0;
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            //Arithmetic exception is a class and e is any variable
            System.out.println("this can handle arithmetic exception");
        }
//        catch(Exception e){
//            System.out.println("this can handle any type of exception");
//        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("this handle the array index out of bound exception");
        }
        //finally can always can return after try catch block
        finally {
            //finally basically has piece of code but will always be executed no matter
            //whether your code crash or not whether your exception handle or not.
            System.out.println("D");
        }
        System.out.println("B");
    }
}