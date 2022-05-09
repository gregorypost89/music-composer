package src;

import jm.JMC;
import jm.music.data.*;
import jm.util.Play;

public class MusicComposer implements JMC{

    public static void main(String[] args) {
        //Writes midi file in the music-composer directory
        Note n = new Note(C4, CROTCHET, MF, PAN_CENTRE);
        Phrase phrase = new Phrase();
        phrase.addNote(n);
        Part p = new Part();
        p.addPhrase(phrase);
        Score s = new Score("Sample");
        s.addPart(p);
        Play.midi(s);
        //Write.midi(s,"Bing.midi");  //extension can either be .mid or .midi
    }
}
