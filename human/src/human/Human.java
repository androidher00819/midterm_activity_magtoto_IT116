package human;



public class Human {
    
    private  String skin_color = "Brown Black ";
    private  String eye_color ="Blue Red";
    private  String gender = "Female";
    private  int height = 173;
    private  int weight = 60;
    private  int age = 25;
    private  String race = "Asian";
    private  String name = "Alleria";
    
    
    
    
    public static void main(String[] agrs)
    {
        
        Human b =  new Human ();
        System.out.println(b.skin_color);
        System.out.println(b.eye_color);
        System.out.println(b.gender);
        System.out.println(b.height);
        System.out.println(b.weight);
        System.out.println(b.age);
        System.out.println(b.race);
        System.out.println(b.name);
        //run child
        children a =  new children();
        System.out.println(a.intellegience_rating);
        System.out.println(a.mood_rating);
        System.out.println(a.genetic_disease[0]);
        System.out.println(a.wealth_rating);
        
        
    }
}