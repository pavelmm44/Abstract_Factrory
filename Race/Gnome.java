package Race;

import Main.Stats;

public class Gnome extends CharacterRace{

    Gnome(String name, Stats stats){
        this.name = name;
        this.bonuses = stats;
    }

    public Gnome(Stats stats) {
        super();
    }

    @Override
    public int getRaceBonuses(String type){
        if(type == "Constitution")
            return 1;
        else if(type == "Intelligence")
            return 2;

        return 0;
    }

    @Override
    public void battleCry(){
        System.out.println("Rock and dust!");
    }
}