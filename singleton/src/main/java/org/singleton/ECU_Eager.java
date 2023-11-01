package org.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ECU_Eager {

    private Logger logger= LoggerFactory.getLogger(ECU_Eager.class);

    private static final ECU_Eager INSTANCE = new ECU_Eager();

    private ECU_Eager(){};

    public static ECU_Eager getInstance(){
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
