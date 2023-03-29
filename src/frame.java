public class frame {
    private String naam;
    private String spierGroep;
    private Integer aantalSets;
    private Integer reps;
    private Integer rustTijd;
    private Integer gewicht;
    public frame(String naam, String spierGroup, Integer aantalsets,Integer reps, Integer rustTijd, Integer gewicht){
        this.naam = naam;
        this.spierGroep = spierGroup;
        this.aantalSets = aantalsets;
        this.reps = reps;
        this.rustTijd = rustTijd;
        this.gewicht = gewicht;
 
        
    }
    public String getNaam(){
        return this.naam;
    }
    public String getSpierGroep(){
        return this.spierGroep;
    }
    public Integer getAantalSets(){
        return this.aantalSets;
    }
    public Integer getHerhalingen(){
        return this.reps;
    }
    public Integer getRustTijd(){
        return this.rustTijd;
    }
    public Integer getGewicht() {return this.gewicht;}

}
