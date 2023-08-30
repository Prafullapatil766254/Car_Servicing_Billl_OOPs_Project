import java.util.HashMap;

public class Sedan {
    HashMap<String , String> sedanServices;
    HashMap<String , Integer> servicePrices;


    Sedan(){
        HashMap<String , String> sedanServices = new HashMap<>(){{
            put("BS01" , "Basic Servicing");
            put("EF01" , "Engine Fixing");
            put("CF01" , "Clutch Fixing");
            put("BF01" , "Brake Fixing");
            put("GF01" , "Gear Fixing");
        }};

        HashMap<String , Integer> servicePrices = new HashMap<>(){{
            put("Basic Servicing" , 4000);
            put("Engine Fixing" , 8000);
            put("Clutch Fixing" , 4000);
            put("Brake Fixing" , 1500);
            put("Gear Fixing" , 6000);
        }};

        this.sedanServices = sedanServices;
        this.servicePrices = servicePrices;

    }
}
