import java.util.Random;

public class Sensor {
    private String tipo;

    public Sensor(String tipo) { this.tipo = tipo; }

    public double obtenerLectura() {
        Random random = new Random();
        if (tipo.equalsIgnoreCase("temperatura")) return 10 + random.nextDouble() * 25;
        if (tipo.equalsIgnoreCase("humedad")) return 30 + random.nextDouble() * 60;
        return 950 + random.nextDouble() * 100;
    }

    public String getTipo() { return tipo; }
}
