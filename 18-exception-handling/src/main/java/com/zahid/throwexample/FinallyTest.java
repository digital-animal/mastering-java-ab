package com.zahid.throwexample;

public class FinallyTest {
    public static void calledMethod() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
           System.out.println(e);
        } finally {
            System.out.println("# finally block executed inside calledMethod()");
        }
    }

    public static void callingMethod() {
        try {
            calledMethod(); // called method throws exception, so catch it
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("# finally block executed inside callingMethod()");
        }
    }

    public static void main(String[] args) {
        callingMethod();
    }
}
