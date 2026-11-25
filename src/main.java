public class main {
    public static void main(String[] args) {
        EstacionMeteorologica estacion = new EstacionMeteorologica();
        estacion.agregarSensor(new Sensor("temperatura"));
        estacion.agregarSensor(new Sensor("humedad"));
        estacion.agregarSensor(new Sensor("presion"));
        estacion.generarReporteClimatico();
    }
}
