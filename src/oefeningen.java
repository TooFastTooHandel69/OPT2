import java.util.ArrayList;

public class oefeningen {
    private static ArrayList<frame> alleOefeningen;
    private String naam;
    private String doel;
    public ArrayList<frame> initialiseerOefeningen(){
        alleOefeningen = new ArrayList<frame>();
        alleOefeningen.add(new frame("Dumbell-Shoulder-press", "Schouder",4,10,60, 20));
        alleOefeningen.add(new frame("Overhead-press", "Schouder",4,10,60, 30));
        alleOefeningen.add(new frame("shoulder-fly", "Schouder",4,10,60, 14));
        alleOefeningen.add(new frame("reverse-cable-crossover", "Schouder",4,10,60, 9));
        alleOefeningen.add(new frame("behind-the-neck-press", "Schouder",4,10,60, 30));

        alleOefeningen.add(new frame("Bicep-curls","Bicep", 3, 12, 30, 30));
        alleOefeningen.add(new frame("Barbell-curls", "Bicep", 5, 10, 60, 35));
        alleOefeningen.add(new frame("Hammer-Curls", "Bicep", 3,12,30,16));
        alleOefeningen.add(new frame("Bicep-Cable-Curl", "Bicep", 5,10,15,23));

        alleOefeningen.add(new frame("Tricep-extensions","Tricep", 5,10,30,20));
        alleOefeningen.add(new frame("Cable-push-down","Tricep", 5,10,60,30));
        alleOefeningen.add(new frame("Kick-Backs","Tricep", 5,10,45,12));

        alleOefeningen.add(new frame("Sit-ups", "Buik", 3,25,30, 30));
        alleOefeningen.add(new frame("Plank", "Buik", 3,60,120, 0));
        alleOefeningen.add(new frame("Reverse-crunsh", "Buik", 4,25,30, 30));

        alleOefeningen.add(new frame("Squats","Benen", 5,10,60,100));
        alleOefeningen.add(new frame("Stiff-leg-deadlift","Benen", 5,10,60,70));
        alleOefeningen.add(new frame("leg-extensions","Benen", 4,10,60,50));
        alleOefeningen.add(new frame("Hack-squats","Benen", 4,10,80,120));
        alleOefeningen.add(new frame("Leg-curl","Benen", 4,10,30,40));

        alleOefeningen.add(new frame("Lat-pull-downs", "Rug", 4,12,30,45));
        alleOefeningen.add(new frame("Dubbel-rows", "Rug", 5,8,60,30));
        alleOefeningen.add(new frame("T-bar", "Rug", 5,10,80,50));
        alleOefeningen.add(new frame("Seated-row", "Rug", 5,8,60,60));
        alleOefeningen.add(new frame("Pull-Ups", "Rug", 5,8,60,100));

        alleOefeningen.add(new frame("Bench press", "Borst",3,6,30, 140));
        alleOefeningen.add(new frame("Cable-fly", "Borst",4,12,30, 41));
        alleOefeningen.add(new frame("incline-Bench press", "Borst",3,10,30, 80));
        alleOefeningen.add(new frame("Low-Cable-Crossovers", "Borst",4,12,30, 14));
        alleOefeningen.add(new frame("Dumbell-press", "Borst",4,12,30, 14));


        alleOefeningen.add(new frame("Seated Calve-Raises", "Kuiten",3,12,30, 40));
        alleOefeningen.add(new frame("Standing Calve-Raises", "Kuiten",3,12,30, 40));


        return alleOefeningen;
    }
    public oefeningen(String naam){
        initialiseerOefeningen();
        this.naam = naam;
    }
    public oefeningen(String naam, String doel){
        this(naam);
        this.doel = doel;

    }


    private static void printOefening(String naam, String spierGroep, Integer aantalSets, Integer reps, Integer rustTijd, Integer gewicht)
    {
        System.out.println("Oefening voor " + spierGroep + ": " + naam +
                " herhaal " + aantalSets + " sets " +
                "(rust tussendoor " + rustTijd + " seconden) " +
                reps +
                " repetitions " + "gewicht " + gewicht);
    }
    public void printSchema(ArrayList<String> spierGroep){
        System.out.println("Schema: " + this.naam);
        if(this.doel != null){
            System.out.println("Droom body: " + this.doel);
        }
        for(String kay : spierGroep){
            for (frame oefening : alleOefeningen){
                if(kay.equals(oefening.getSpierGroep())){
                    printOefening(oefening.getNaam(), oefening.getSpierGroep(), oefening.getAantalSets(), oefening.getHerhalingen(), oefening.getRustTijd(), oefening.getGewicht());
                }
            }
        }
        System.out.println();

    }
}
