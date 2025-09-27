package tests;

import org.testng.annotations.Test;

public class C04_TimeOut {

    @Test(timeOut = 3000) // if the method takes longer than 3 seconds, it fails
    void loginTest() throws InterruptedException {
        Thread.sleep(3000);//ThreadTimeoutException
        System.out.println("login Test");
    }

    @Test
    void test02(){
        System.out.println("Test 02");
    }

    @Test
    void test03(){
        System.out.println("Test 03");
    }

    @Test
    void test04(){
        System.out.println("Test 04");
    }

    @Test
    void test05(){
        System.out.println("Test 05");
    }
}
