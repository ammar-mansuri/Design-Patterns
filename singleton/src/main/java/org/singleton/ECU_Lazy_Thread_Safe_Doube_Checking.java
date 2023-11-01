package org.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ECU_Lazy_Thread_Safe_Doube_Checking {

    private Logger logger= LoggerFactory.getLogger(ECU_Lazy_Thread_Safe_Doube_Checking.class);
    //volatile to ensure the instance is immediately available to other threads
    private static volatile ECU_Lazy_Thread_Safe_Doube_Checking INSTANCE;


    private ECU_Lazy_Thread_Safe_Doube_Checking(){};

    public static ECU_Lazy_Thread_Safe_Doube_Checking getInstance(){
        if(INSTANCE == null){

            synchronized (ECU_Lazy_Thread_Safe_Doube_Checking.class){
                if(INSTANCE==null){
                    try {
                        INSTANCE =  new ECU_Lazy_Thread_Safe_Doube_Checking();
                    }catch (Exception e){
                        throw e;
                    }
                }
            }

        }
        return INSTANCE;
    }

    protected void startEngine(){
        logger.info("Engine Started");
    }

    protected void adjustFuelInjection(){
        logger.info("Fuel Injection Adjusted");
    }

    protected void monitorPerformance(){
        logger.info("Performance Monitored");
    }


}
