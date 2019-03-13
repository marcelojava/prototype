import org.junit.Test;
import partitura.Partitura;

public class PartituraTest {

    @Test
    public void deveClonarComSucesso() {
        Partitura partitura = new Partitura();
        partitura.getNota("Do").desenhar();
        partitura.getNota("Re").desenhar();
        partitura.getNota("Mi").desenhar();
        partitura.getNota("Fa").desenhar();
        partitura.getNota("Fa").desenhar();
        partitura.getNota("Fa").desenhar();
        partitura.getNota("Do").desenhar();
        partitura.getNota("Re").desenhar();
        partitura.getNota("Do").desenhar();
        partitura.getNota("Re").desenhar();
        partitura.getNota("Re").desenhar();
        partitura.getNota("Re").desenhar();
    }
}
