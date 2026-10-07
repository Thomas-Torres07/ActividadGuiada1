package software;

public class Dispositivo {
    public String nombre;
    String tipo;
    public boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Estado (Activo): " + activo);
    }

    void mostrarEstado() {
        System.out.println("El estado actual de " + nombre + " es activo: " + activo);
    }
}