import java.util.HashMap;

public class Hatchback {
    HashMap<String , String> hatchbackServices;
    HashMap<String , Integer> servicePrices;



    Hatchback(){

        HashMap<String , String> hatchbackServices = new HashMap<>(){{
            put("BS01" , "Basic Servicing");
            put("EF01" , "Engine Fixing");
            put("CF01" , "Clutch Fixing");
            put("BF01" , "Brake Fixing");
            put("GF01" , "Gear Fixing");
        }};

        HashMap<String , Integer> servicePrices = new HashMap<>(){{
            put("Basic Servicing" , 2000);
            put("Engine Fixing" , 5000);
            put("Clutch Fixing" , 2000);
            put("Brake Fixing" , 1000);
            put("Gear Fixing" , 3000);
        }};

        this.hatchbackServices = hatchbackServices;
        this.servicePrices = servicePrices;
    }




}
