package tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C03_Enabled {

    /*
    Determines if we want to run specific test methods in the existing suite/class
    Sometimes we don't want to run several tests due to requirement changes
    We don't want to break existing work for that particular function
    Provides a way to temporarily disable tests
     */


    @Test
    void test01(){
        System.out.println("Test 01");
    }

    @Test(enabled = false) // Disables the test, it will be skipped during execution
    void test02(){
        System.out.println("Test 02");
        assert false; // This assertion will not be executed since the test is disabled
    }

    @Test
    void test03(){
        System.out.println("Test 03");
    }

    @Test
    //@Ignore
    void test04(){
        System.out.println("Test 04");
    }

    @Test
    void test05(){
        System.out.println("Test 05");
    }
}
