package org.singleton;

public class ECU_Lazy_BillPlugh {

    private ECU_Lazy_BillPlugh(){

    }

    private static class SingletonHolder {
        private static final ECU_Lazy_BillPlugh INSTANCE = new ECU_Lazy_BillPlugh();
    }

    public static ECU_Lazy_BillPlugh getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
