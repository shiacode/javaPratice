/*
可以改變 test = "yes" or "no" 來觀察try/catch/finally 之間的順序

test = "yes"

    start try
    start risky
    scary exception
    finally
    end of main

test = "no"

    start try
    start risky
    end risky
    end try
    finally
    end of main

*/
public class TestExceptions {
    
    public static void main(String [] args) {

        TestExceptions mytest = new TestExceptions();

        mytest.go1();
        mytest.go2();

    }

    void go1() 
    {
        String test = "yes";
        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");            
        } catch ( ScaryException se) {
            System.out.println("scary exception");            
        } finally {
            System.out.println("finally");
        }
        System.out.println("end of main");

    }

    void go2() 
    {
        Laundry laundry = new Laundry();
        //String test = "pants";
        String test = "lingerie";

        try {
            laundry.doLanudry(test);
        } catch (PantsException pex) {
            System.out.println("catch PantsException");

        } catch (LingerieException lex) {
            System.out.println("catch LingerieException");
        }        
    }

    static void doRisky(String test) throws ScaryException {
        System.out.println("start risky");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
    }

    static class ScaryException extends Exception {

    }


    public class Laundry {
        public void doLanudry(String test) throws PantsException, LingerieException {
            System.out.println("doLanudry start");
            if ("pants".equals(test)) {
                throw new PantsException();
            } else if ("lingerie".equals(test)) {
                throw new LingerieException();
            }
            System.out.println("doLanudry end");
        }
    }

    class PantsException extends Exception {

    }
    class LingerieException extends Exception {

    }

}
