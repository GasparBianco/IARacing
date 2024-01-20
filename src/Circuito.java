import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class Circuito {

    private Area pista;

    public Circuito() {
        inicializarPista();
    }

    private void inicializarPista() {
        float radioCentral = 250;
        float ancho = 15;
        float posicionCircuito = 350;


        float diametroExterno = 2*(radioCentral + ancho);
        float diametroInterno = 2*(radioCentral - ancho);
        float posicionExterna = posicionCircuito - diametroExterno/2;
        float posicionInterna = posicionCircuito - diametroInterno/2;

        // Crear dos círculos y sustraer uno del otro para obtener el anillo
        Shape circuloExterno = new Ellipse2D.Double(posicionExterna, posicionExterna, diametroExterno, diametroExterno);
        Shape circuloInterno = new Ellipse2D.Double(posicionInterna, posicionInterna, diametroInterno, diametroInterno);

        pista = new Area(circuloExterno);
        pista.subtract(new Area(circuloInterno));
    }

    public Area getPista() {
        return pista;
    }
}
