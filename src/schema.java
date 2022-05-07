import java.util.ArrayList;
import java.util.Scanner;

public class schema extends menu{
    public void lijst() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is uw naam?");
        String voor = scanner.nextLine();
        System.out.println("Geef hier de naam van een persoon waarvan jij zijn lichaam bewondert.");
        String droom = scanner.nextLine();
        System.out.println("Laten we aan de slag gaan!");
        System.out.println("Hoeveel dagen wilt u dit week trainen");
        Integer dag = scanner.nextInt();
        if (dag == 3) {
            System.out.println("Dag EEN Gaat als volgt");
            ArrayList<String> koen = new ArrayList<>();
            koen.add("Rug");
            koen.add("Bicep");
            koen.add("Buik");
            oefeningen koenP = new oefeningen(voor,droom);
            koenP.printSchema(koen);
            System.out.println("Dag Twee kom op hou het vol!!!");
            ArrayList<String> koen1 = new ArrayList<>();
            koen1.add("Benen");
            koen1.add("Schouder");
            koen1.add("Kuiten");
            oefeningen koenT = new oefeningen(voor);
            koenT.printSchema(koen1);
            System.out.println("Dag Drie!!");
            ArrayList<String> koen2 = new ArrayList<>();
            koen2.add("Borst");
            koen2.add("Tricep");
            oefeningen koenK = new oefeningen(voor);
            koenK.printSchema(koen2);
        }
        else if (dag == 4) {
            System.out.println("Dag EEN Gaat als volgt");
            ArrayList<String> koen = new ArrayList<>();
            koen.add("Rug");
            koen.add("Buik");
            oefeningen koenP = new oefeningen(voor,droom);
            koenP.printSchema(koen);
            System.out.println("Dag Twee kom op hou het vol!!!");
            ArrayList<String> koen1 = new ArrayList<>();
            koen1.add("Benen");
            koen1.add("Kuiten");
            oefeningen koenT = new oefeningen(voor);
            koenT.printSchema(koen1);
            System.out.println("Dag Drie!!");
            ArrayList<String> koen2 = new ArrayList<>();
            koen2.add("Borst");
            koen2.add("Tricep");
            oefeningen koenK = new oefeningen(voor);
            koenK.printSchema(koen2);
            System.out.println("Dag Vier!!!!");
            ArrayList<String> koen3 = new ArrayList<>();
            koen3.add("Bicep");
            koen3.add("Schouder");
            oefeningen koenw = new oefeningen(voor);
            koenw.printSchema(koen3);
        }
        else if (dag == 5) {
            System.out.println("Dag EEN Gaat als volgt");
            ArrayList<String> koen = new ArrayList<>();
            koen.add("Rug");
            koen.add("Buik");
            oefeningen koenP = new oefeningen(voor,droom);
            koenP.printSchema(koen);
            System.out.println("Dag Twee kom op hou het vol!!!");
            ArrayList<String> koen1 = new ArrayList<>();
            koen1.add("Benen");
            koen1.add("Kuiten");
            oefeningen koenT = new oefeningen(voor);
            koenT.printSchema(koen1);
            System.out.println("Dag Drie!!");
            ArrayList<String> koen2 = new ArrayList<>();
            koen2.add("Borst");
            koen2.add("Tricep");
            oefeningen koenK = new oefeningen(voor);
            koenK.printSchema(koen2);
            System.out.println("Dag Vier!!!!");
            ArrayList<String> koen3 = new ArrayList<>();
            koen3.add("Bicep");
            koen3.add("Schouder");
            oefeningen koenw = new oefeningen(voor);
            koenw.printSchema(koen3);
            System.out.println("Dag Vijf!!!!");
            ArrayList<String> koen4 = new ArrayList<>();
            koen4.add("Benen");
            koen4.add("Borst");
            oefeningen koenq = new oefeningen(voor);
            koenq.printSchema(koen4);
        }
        else if (dag == 6) {
            System.out.println("Dag EEN Gaat als volgt");
            ArrayList<String> koen = new ArrayList<>();
            koen.add("Rug");
            koen.add("Buik");
            oefeningen koenP = new oefeningen(voor,droom);
            koenP.printSchema(koen);
            System.out.println("Dag Twee kom op hou het vol!!!");
            ArrayList<String> koen1 = new ArrayList<>();
            koen1.add("Benen");
            koen1.add("Kuiten");
            oefeningen koenT = new oefeningen(voor);
            koenT.printSchema(koen1);
            System.out.println("Dag Drie!!");
            ArrayList<String> koen2 = new ArrayList<>();
            koen2.add("Borst");
            koen2.add("Tricep");
            oefeningen koenK = new oefeningen(voor);
            koenK.printSchema(koen2);
            System.out.println("Dag Vier!!!!");
            ArrayList<String> koen3 = new ArrayList<>();
            koen3.add("Bicep");
            koen3.add("Schouder");
            oefeningen koenw = new oefeningen(voor);
            koenw.printSchema(koen3);
            System.out.println("Dag Vijf!!!!");
            ArrayList<String> koen4 = new ArrayList<>();
            koen4.add("Benen");
            koen4.add("Borst");
            oefeningen koenq = new oefeningen(voor);
            koenq.printSchema(koen4);
            System.out.println("Dag zes kom op hou het vol!!!!");
            ArrayList<String> koen5 = new ArrayList<>();
            koen5.add("Rug");
            koen5.add("Bicep");
            koen5.add("Tricep");
            oefeningen koenr = new oefeningen(voor);
            koenr.printSchema(koen5);
        }
        else if (dag == 7) {
            System.out.println("Dag EEN Gaat als volgt");
            ArrayList<String> koen = new ArrayList<>();
            koen.add("Rug");
            koen.add("Buik");
            oefeningen koenP = new oefeningen(voor,droom);
            koenP.printSchema(koen);
            System.out.println("Dag Twee kom op hou het vol!!!");
            ArrayList<String> koen1 = new ArrayList<>();
            koen1.add("Benen");
            koen1.add("Kuiten");
            oefeningen koenT = new oefeningen(voor);
            koenT.printSchema(koen1);
            System.out.println("Dag Drie!!");
            ArrayList<String> koen2 = new ArrayList<>();
            koen2.add("Borst");
            koen2.add("Tricep");
            oefeningen koenK = new oefeningen(voor);
            koenK.printSchema(koen2);
            System.out.println("Dag Vier!!!!");
            ArrayList<String> koen3 = new ArrayList<>();
            koen3.add("Bicep");
            koen3.add("Schouder");
            oefeningen koenw = new oefeningen(voor);
            koenw.printSchema(koen3);
            System.out.println("Dag Vijf!!!!");
            ArrayList<String> koen4 = new ArrayList<>();
            koen4.add("Benen");
            koen4.add("Borst");
            oefeningen koenq = new oefeningen(voor);
            koenq.printSchema(koen4);
            System.out.println("Dag zes kom op hou het vol!!!!");
            ArrayList<String> koen5 = new ArrayList<>();
            koen5.add("Rug");
            koen5.add("Bicep");
            koen5.add("Tricep");
            oefeningen koenr = new oefeningen(voor);
            koenr.printSchema(koen5);
            System.out.println("Dag zeven als je dit iedere week doet ben je voordat je het weet je eigen droom body<3<3<3");
            ArrayList<String> koen6 = new ArrayList<>();
            koen6.add("Schouder");
            koen6.add("Kuiten");
            koen6.add("Buik");
            oefeningen koent = new oefeningen(voor);
            koent.printSchema(koen6);
        }
        else {
            System.out.println("De aantal dagen die u heeft aangegeven om te trainen is niet reëel.");
            System.out.println("Ik raad u aan om keuze twee te kiezen.");
        }

    }
}
