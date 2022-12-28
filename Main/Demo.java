package Main;

import Race.ElfFactory;
import Race.GnomeFactory;
import Race.RaceFactory;
import Classes.ClassFactory;

public class Demo {

    public static void main(String[] args){
        Character character = new Character("Jace", ClassFactory.getClass("Barbarian"), RaceFactory.getRace(new GnomeFactory()));

        character.setAttributes(Stats.generate());
        character.addRaceBonuses();
        character.printSheet();

    }
}