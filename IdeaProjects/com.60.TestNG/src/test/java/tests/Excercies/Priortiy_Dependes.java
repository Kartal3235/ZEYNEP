package tests.Excercies;

import org.testng.annotations.Test;

public class Priortiy_Dependes {

    @Test(dependsOnMethods ="B" )
    public void A() {
        System.out.println("A");
    }

    @Test
    public void B() {
        System.out.println("B");
    }

    @Test
    public void C() {
        System.out.println("C");
    }

    @Test(priority = -1)
    public void D() {
        System.out.println("D");
    }

    @Test
    public void E() {
        System.out.println("E");
    }
}
