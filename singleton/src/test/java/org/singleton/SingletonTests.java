package org.singleton;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTests {


    @Test
    public void test_java_singleton_instance(){
        ECU_Eager ecuEager = ECU_Eager.getInstance();
        ECU_Eager ecuEager2 = ECU_Eager.getInstance();
        ecuEager.startEngine();
        ecuEager2.adjustFuelInjection();
        ecuEager.monitorPerformance();
        Assertions.assertEquals(ecuEager.hashCode(),ecuEager2.hashCode());
    }


    @Test
    public void test_java_bill_plugh_instance(){
        ECU_Lazy_Thread_Safe_Doube_Checking bill_plugh1 = ECU_Lazy_Thread_Safe_Doube_Checking.getInstance();
        ECU_Lazy_Thread_Safe_Doube_Checking bill_plugh2 = ECU_Lazy_Thread_Safe_Doube_Checking.getInstance();
        bill_plugh1.startEngine();
        bill_plugh2.adjustFuelInjection();
        bill_plugh1.monitorPerformance();
        Assertions.assertEquals(bill_plugh1.hashCode(),bill_plugh2.hashCode());
    }
}
