package nota;

public abstract class NotaMusical implements Cloneable{

    public NotaMusical clone() {
        NotaMusical clone = null;

        try {
            clone = (NotaMusical) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    public abstract void desenhar();
}
