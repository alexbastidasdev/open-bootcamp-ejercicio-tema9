public class EjercicioTema9 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Juan";
        cliente1.edad = 20;
        cliente1.telefono = "123456789";
        cliente1.credito = true;
        System.out.println(cliente1.nombre);
        System.out.println(cliente1.edad);
        System.out.println(cliente1.telefono);
        System.out.println(cliente1.credito);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.nombre = "Juan";
        trabajador1.edad = 20;
        trabajador1.telefono = "123456789";
        trabajador1.salario = 1000;
        System.out.println(trabajador1.nombre);
        System.out.println(trabajador1.edad);
        System.out.println(trabajador1.telefono);
        System.out.println(trabajador1.salario);

    }

    static class Persona {
        int edad;
        String nombre;
        String telefono;
    }

    static class Cliente extends Persona {
        boolean credito;
    }

    static class Trabajador extends Persona {
        int salario;
    }

}
