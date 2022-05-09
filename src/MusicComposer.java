package src;

import jm.JMC;
import jm.music.data.*;
import jm.util.Play;
import jm.util.Write;

public class MusicComposer implements JMC{

    public static void main(String[] args) {
        //Writes midi file in the music-composer directory
        Note note = new Note(C4, DOUBLE_DOTTED_MINIM);
        Phrase phrase = new Phrase();
        phrase.addNote(note);
        Part p = new Part();
        p.addPhrase(phrase);
        Score s = new Score("Bing");
        s.addPart(p);
        Write.midi(s,"Bing.midi");  //extension can either be .mid or .midi
    }
}
