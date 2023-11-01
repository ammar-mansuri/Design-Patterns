package org.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ECU_Lazy {

    private Logger logger= LoggerFactory.getLogger(ECU_Lazy.class);
    private static ECU_Lazy INSTANCE;



    private ECU_Lazy(){};

    public static ECU_Lazy getInstance(){
        if(INSTANCE == null){
            INSTANCE =  new ECU_Lazy();
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
