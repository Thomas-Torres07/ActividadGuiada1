package software;

public class MainS {
    public static void main(String[] args) {
        Dispositivo dispositivo1 = new Dispositivo(); //[cite: 8]
        Dispositivo dispositivo2 = new Dispositivo(); //[cite: 8]

        dispositivo1.nombre = "Servidor Principal";
        dispositivo1.tipo = "Servidor";
        dispositivo1.activo = true;

        dispositivo2.nombre = "Router de Oficina";
        dispositivo2.tipo = "Redes";
        dispositivo2.activo = true;

        System.out.println("--- Información inicial ---");
        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();
        System.out.println();
        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();

        System.out.println("\n--- Modificando el primer objeto ---");
        dispositivo1.activo = false;
        
        dispositivo1.mostrarInformacion();
        System.out.println();
        dispositivo2.mostrarInformacion();
    }
}