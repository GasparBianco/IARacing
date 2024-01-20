import javax.swing.*;

class RepresentacionGrafica extends JFrame {

    private Circuito circuito;
    private CircuitoPanel circuitoPanel;

    public RepresentacionGrafica(Circuito circuito) {
        this.circuito = circuito;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Representación Gráfica del Circuito");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        circuitoPanel = new CircuitoPanel(circuito);
        add(circuitoPanel);

        setVisible(true);
    }
}