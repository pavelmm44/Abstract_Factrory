package Race;

import Main.Stats;

public class GnomeFactory implements RaceAbstractFactory{

    @Override
    public Gnome create(){
        return new Gnome(new Stats(0, 0, 0, 0, 0, 0));
    }
}