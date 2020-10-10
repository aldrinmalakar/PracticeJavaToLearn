package exceptionhandling;

public class LearnFinalFinallyFinalize {

    // what is final, finally and finalize?
    // Garbage collection: finalize
    // Finalize is used to perform clean up processing just before object is garbage collected.

    final String name = "Sadia";
    int div;

    public int doDivision(int num1, int num2) {
        //int div;
        try {
            this.div = num1 / num2;
            System.out.println("Division value is " + div);
        } catch (Exception e) {
            System.out.println("This is Arithmetic Exception");
        } finally {
            System.out.println("Division is done");
        }
        return div;
    }


    public static void main(String[] args) {
        LearnFinalFinallyFinalize lf = new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf1 = new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf2 = new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf3 = new LearnFinalFinallyFinalize();
        lf.doDivision(98, 0);
        //System.out.println(lf.name="James");
        lf1 = null;
        lf2 = null;
        lf3 = null;


        System.gc();

    }

}
