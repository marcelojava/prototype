package partitura;

import nota.*;

import java.util.Hashtable;

public class Partitura {

    private static Hashtable<String, NotaMusical> notasMap = new Hashtable<>();

    static {
        Do notaDo = new Do();
        notasMap.put("Do", notaDo);

        Re re = new Re();
        notasMap.put("Re", re);

        Mi mi = new Mi();
        notasMap.put("Mi", mi);

        Fa fa = new Fa();
        notasMap.put("Fa", fa);

        Sol sol = new Sol();
        notasMap.put("Sol", sol);

        La la = new La();
        notasMap.put("La", la);

        Si si = new Si();
        notasMap.put("Si", si);
    }

    public NotaMusical getNota(String nota) {
        NotaMusical notaMusical = notasMap.get(nota);

        return notaMusical.clone();
    }
}
