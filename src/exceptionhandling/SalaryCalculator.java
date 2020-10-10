package exceptionhandling;

public class SalaryCalculator {
    int div;


    // Exception Handling

    // ArithmeticException
    public int doDivision(int num1, int num2) {
        //int div;
        try {
            this.div = num1 / num2;
            System.out.println("Division value is " + div);
        } catch (Exception e) {
            System.out.println("This is Arithmetic Exception");
        }
        return div;
    }

    public int doDivision1(int num1, int num2) throws Exception {
        //int div;
            this.div = num1 / num2;
            System.out.println("Division value is " + div);
            //System.out.println("This is Arithmetic Exception");
       // Throwable d=new Throwable("This is Arithmetic Exception");
        return div;
    }

    public static void main(String[] args) throws Exception {
        //SalaryCalculator.doDivision(60,20);
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        //salaryCalculator.doDivision(30, 2);

//        try{
//            SalaryCalculator.doDivision(70,0);
//        }catch (Exception e){
//           // e.printStackTrace();
//            System.out.println("This is Arithmetic Exception");
//        }

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException in){
//            System.out.println("This is Interrupted Exception");
//        }


       // salaryCalculator.doDivision1(20,0);




    }


}
