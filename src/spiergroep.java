import java.util.ArrayList;
import java.util.Scanner;

public class spiergroep extends menu{
    public void lijst() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is uw naam?");
        String voor = scanner.nextLine();
        System.out.println("Geef hier de naam van een persoon waarvan jij zijn lichaam bewondert.");
        String droom = scanner.nextLine();
        System.out.println("Laten we aan de slag gaan!");
        String[] list = {"Kies welke spiergroep je wilt trainen","Typ een getal voor uw keuze.", "1.Borst", "2.Rug", "3.Benen", "4.Schouder", "5.Buik", "6.Bicep", "7.Tricep", "8.Kuiten"};

        for (String s : list) {
            System.out.println(s);
            
        }

        int num = scanner.nextInt();
        if (num==1){
            ArrayList<String> koen = new ArrayList<>();
            koen.add("Borst");
            oefeningen koenP = new oefeningen(voor,droom);
            koenP.printSchema(koen);
        }
        else if (num==2){
            ArrayList<String> koen = new ArrayList<>();
            koen.add("Rug");
            oefeningen koenP = new oefeningen(voor,droom);
            koenP.printSchema(koen);
        }
        else if (num==3){
            ArrayList<String> koen = new ArrayList<>();
            koen.add("Benen");
            oefeningen koenP = new oefeningen(voor,droom);
            koenP.printSchema(koen);
        }
        else if (num==4){
            ArrayList<String> koen = new ArrayList<>();
            koen.add("Schouder");
            oefeningen koenP = new oefeningen(voor,droom);
            koenP.printSchema(koen);
        }
        else if (num==5){
            ArrayList<String> koen = new ArrayList<>();
            koen.add("Buik");
            oefeningen koenP = new oefeningen(voor,droom);
            koenP.printSchema(koen);
        }
        else if (num==6){
            ArrayList<String> koen = new ArrayList<>();
            koen.add("Bicep");
            oefeningen koenP = new oefeningen(voor,droom);
            koenP.printSchema(koen);
        }
        else if (num==7){
            ArrayList<String> koen = new ArrayList<>();
            koen.add("Tricep");
            oefeningen koenP = new oefeningen(voor,droom);
            koenP.printSchema(koen);
        }
        else if (num==8){
            ArrayList<String> koen = new ArrayList<>();
            koen.add("Kuiten");
            oefeningen koenP = new oefeningen(voor,droom);
            koenP.printSchema(koen);
        }
        else{
            System.out.println("Moeilijk he een getal kiezen!");
        }
    }

}
