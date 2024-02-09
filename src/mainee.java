public class mainee {
    public static void main(String[] args) {
//        System.out.println("A");
//        int arr[]={1,2,3,4};
//
//        try{
//            System.out.println(arr[6]);
//        }
////        catch(ArrayIndexOutOfBoundsException e)
////        {
////            System.out.println("B");
////        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("C");
//        }
//        finally{
//            System.out.println("D");
//        }
//        System.out.println("E");
//        System.out.println("A");
        try {
            fun(6);
        }
        catch(underAgeException e){
            System.out.println("Chhoti bacchi ho kya " + e);
        }
        System.out.println("C");
    }
    public static int fun(int age) throws underAgeException{
        if(age<18)
        {
            throw new underAgeException();
        }

        return 10;

    }

    }

