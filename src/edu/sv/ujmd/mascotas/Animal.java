
package edu.sv.ujmd.mascotas;


/**
 *
 * @author reyee
 */
public class Animal {

    public String nombre;
    public int edad;
    public String alimento;

    public Animal(String nombreAnimal) {
        nombre = nombreAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombres) {
        this.nombre = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombres(int edad) {
        this.edad = edad;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public static class Gallo extends Animal {

        public String color_plumas;

        public Gallo(String nom, int edad, String alimento, String col_plu) {
            this.nombre = nom;
            this.edad = edad;
            this.alimento = alimento;
            this.color_plumas = col_plu;
        }

    }

    public static class Perro extends Animal {

        public String color_pelaje;

        public Perro(String nom, int edad, String alimento, String col_pelo) {
            this.nombre = nom;
            this.edad = edad;
            this.alimento = alimento;
            this.color_pelaje = col_pelo;
        }
    }

    public static class Gato extends Animal {

        public String color_ojos;

        public Gato(String nom, int edad, String alimento, String col_ojos) {
            this.nombre = nom;
            this.edad = edad;
            this.alimento = alimento;
            this.color_ojos = col_ojos;
        }
    }

    public static class Hamster extends Animal {

        public int cantidad_pulgas;

        public Hamster(String nom, int edad, String alimento, int cant_pulgas) {
            this.nombre = nom;
            this.edad = edad;
            this.alimento = alimento;
            this.cantidad_pulgas = cant_pulgas;
        }
    }

    public static void mostrarDatos() {
        Perro perro = new Perro("Cookie", 15, "Purina", "Blanco");
        Gato gato = new Gato("Kat", 6, "Pescado", "Negro");
        Hamster hamster = new Hamster("Peluza", 2, "Semillas", 15);
        Gallo gallo = new Gallo("Claudio", 2, "Semillas", "Cafe");
        System.out.println("Datos de Gallo: \n"
                + "Nombre: " + gallo.nombre + "\n"
                + "Edad: " + gallo.edad + "\n"
                + "Alimento: " + gallo.alimento + "\n"
                + "Color de plumas: " + gallo.color_plumas + "\n"
        );

        System.out.println("Datos de perro: \n"
                + "Nombre: " + perro.nombre + "\n"
                + "Edad: " + perro.edad + "\n"
                + "Alimento: " + perro.alimento + "\n"
                + "Color de pelo: " + perro.color_pelaje + "\n"
        );
        System.out.println("Datos de gato: \n"
                + "Nombre: " + gato.nombre + "\n"
                + "Edad: " + gato.edad + "\n"
                + "Alimento: " + gato.alimento + "\n"
                + "Color de ojos: " + gato.color_ojos + "\n"
        );
        System.out.println("Datos de hamster: \n"
                + "Nombre: " + hamster.nombre + "\n"
                + "Edad: " + hamster.edad + "\n"
                + "Alimento: " + hamster.alimento + "\n"
                + "Cantidad de pulgas: " + hamster.cantidad_pulgas + "\n"
        );

    }


}
