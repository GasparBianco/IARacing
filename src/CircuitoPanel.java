import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;

class CircuitoPanel extends JPanel {

    private Circuito circuito;

    public CircuitoPanel(Circuito circuito) {
        this.circuito = circuito;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);

        // Dibujar la pista
        Area pista = circuito.getPista();
        g2d.fill(pista);
    }
}
