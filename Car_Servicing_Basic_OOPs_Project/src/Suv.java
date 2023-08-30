import java.util.HashMap;

public class Suv {

    HashMap<String , String> suvServices;
    HashMap<String , Integer> servicePrices;

    Suv(){
        HashMap<String , String> suvServices = new HashMap<>(){{
            put("BS01" , "Basic Servicing");
            put("EF01" , "Engine Fixing");
            put("CF01" , "Clutch Fixing");
            put("BF01" , "Brake Fixing");
            put("GF01" , "Gear Fixing");
        }};

        HashMap<String , Integer> servicePrices = new HashMap<>(){{
            put("Basic Servicing" , 5000);
            put("Engine Fixing" , 10000);
            put("Clutch Fixing" , 6000);
            put("Brake Fixing" , 2500);
            put("Gear Fixing" , 8000);
        }};

        this.suvServices = suvServices;
        this.servicePrices = servicePrices;

    }
}
