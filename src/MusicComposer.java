package src;

import jm.JMC;
import jm.music.data.*;
import jm.util.Play;

public class MusicComposer implements JMC{

    public static void main(String[] args) {
        Play.midi(new Note(G4,QN));
    }
}
