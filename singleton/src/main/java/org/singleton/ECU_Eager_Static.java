package org.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ECU_Eager_Static {

    private Logger logger= LoggerFactory.getLogger(ECU_Eager_Static.class);
    private static ECU_Eager_Static INSTANCE;

    static {
        try {
            if(INSTANCE == null){
                INSTANCE =  new ECU_Eager_Static();
            }
        }catch (Exception e){
            throw e;
        }
    }

    private ECU_Eager_Static(){};

    public static ECU_Eager_Static getInstance(){
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
