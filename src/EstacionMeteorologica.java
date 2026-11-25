import java.util.ArrayList;

public class EstacionMeteorologica {
    private ArrayList<Sensor> sensores;

    public EstacionMeteorologica() { sensores = new ArrayList<Sensor>(); }

    public void agregarSensor(Sensor sensor) { sensores.add(sensor); }

    public void generarReporteClimatico() {
        System.out.println("Reporte climático:");
        for (Sensor sensor : sensores) {
            System.out.printf("%s: %.2f%n", sensor.getTipo(), sensor.obtenerLectura());
        }
    }
}
