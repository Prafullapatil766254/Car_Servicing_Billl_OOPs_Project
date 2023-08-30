import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Tell me about type of car");

        String typeOfCar = scn.nextLine();

        System.out.println("Tell me about service codes");

        String serviceCode = scn.nextLine();

        System.out.println("Here is you bill according to your services");
        System.out.println();

        String [] serviceCodes = serviceCode.split(" ");  // Incase if there are multiple service codes, so I splited them


        if(typeOfCar.equals("HatchBack") || typeOfCar.equals("hatchback") || typeOfCar.equals("Hatchback") || typeOfCar.equals("hatchback") || typeOfCar.equals("HATCHBACK")  ){
            Hatchback hatchback = new Hatchback();


             int totalPrice = 0;

            for(int i=0 ; i<serviceCodes.length ; i++){
                System.out.println("Charges for "+hatchback.hatchbackServices.get(serviceCodes[i])+" - "+hatchback.servicePrices.get(hatchback.hatchbackServices.get(serviceCodes[i])));
                totalPrice+=hatchback.servicePrices.get(hatchback.hatchbackServices.get(serviceCodes[i]));
            }


            System.out.println("Total bill - "+totalPrice);

            if(totalPrice > 10000){
                System.out.println("You are provided with complimentary cleaning as you bill is greater that 10000..");
            }


        }else if (typeOfCar.equals("Sedan")  || typeOfCar.equals("sedan")  || typeOfCar.equals("SEDAN")){
            Sedan sedan = new Sedan();

            int totalPrice = 0;

            for(int i=0 ; i<serviceCodes.length ; i++){
                System.out.println("Charges for "+sedan.sedanServices.get(serviceCodes[i])+" - "+sedan.servicePrices.get(sedan.sedanServices.get(serviceCodes[i])));
                totalPrice+=sedan.servicePrices.get(sedan.sedanServices.get(serviceCodes[i]));
            }

            System.out.println("Total bill - "+totalPrice);

            if(totalPrice > 10000){
                System.out.println("You are provided with complimentary cleaning as you bill is greater that 10000..");
            }

        }else{
            Suv suv  = new Suv();

            int totalPrice = 0;

            for(int i=0 ; i<serviceCodes.length ; i++){
                System.out.println("Charges for "+suv.suvServices.get(serviceCodes[i])+" - "+suv.servicePrices.get(suv.suvServices.get(serviceCodes[i])));
                totalPrice+=suv.servicePrices.get(suv.suvServices.get(serviceCodes[i]));
            }


            System.out.println("Total bill - "+totalPrice);


            if(totalPrice > 10000){
                System.out.println("You are provided with complimentary cleaning as you bill is greater that 10000..");
            }

        }
        System.out.println();
        System.out.println("Thank you for servicing please visit again..");



    }
}