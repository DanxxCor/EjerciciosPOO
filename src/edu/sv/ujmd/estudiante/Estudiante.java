
package edu.sv.ujmd.Estudiante;

import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String carrera;
    private int carnet;
    private String[] materias = new String[5];

    private Scanner teclado;

    public Estudiante() {

        nombre = "Daniel";
        apellido = "Reyes";
        edad = 21;
        genero = "Masculino";
        carrera = "Tecnologías de la Información";
        carnet = 201801035;

    }

    public Estudiante(String nom, String ape, int edad, String gen, String carr, int id) {

        this.nombre = nom;
        this.apellido = ape;
        this.edad = edad;
        this.genero = gen;
        this.carrera = carr;
        this.carnet = id;
    }

    public String getNombres() {
        return nombre;
    }

    public void setNombres(String nom) {
        this.nombre = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String ape) {
        this.apellido = ape;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String gen) {
        this.genero = gen;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carr) {
        this.carrera = carr;
    }

    public int getCarnet() {
        return carnet;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] mat) {
        this.materias = mat;
    }

    public void setCarnet(int id) {
        this.carnet = id;
    }

    public void IngresarMaterias() {

        teclado = new Scanner(System.in);
        System.out.println("Materia 1");
        this.materias[0] = teclado.next();
        teclado = new Scanner(System.in);
        System.out.println("Materia 2");
        this.materias[1] = teclado.next();
        teclado = new Scanner(System.in);
        System.out.println("Materia 3");
        this.materias[2] = teclado.next();
        teclado = new Scanner(System.in);
        System.out.println("Materia 4");
        this.materias[3] = teclado.next();
        teclado = new Scanner(System.in);
        System.out.println("Materia 5");
        this.materias[4] = teclado.next();

    }

    public void IngresarDatos() {

        teclado = new Scanner(System.in);
        System.out.println("ingresar sus nombres ");
        this.nombre = teclado.next();
        System.out.println("ingresar sus apellidos ");
        this.apellido = teclado.next();
        System.out.println("ingresar su edad ");
        this.edad = teclado.nextInt();
        System.out.println("ingresar sus genero ");
        this.genero = teclado.next();
        System.out.println("ingresar su carrera ");
        this.carrera = teclado.next();
        System.out.println("ingresar su carnet ");
        this.carnet = teclado.nextInt();

    }

    public void MostrarDatos() {
        System.out.println(" nombre = " + nombre);
        
        System.out.println("apellidos = " + apellido);
        
        System.out.println("genero = " + edad);
        
        System.out.println("genero = " + genero);
        
        System.out.println("carrera = " + carrera);
        
        System.out.println("carnet = " + carnet);
        
        System.out.println("materia1 = " + materias[0]);
        
        System.out.println("materia2 = " + materias[1]);
        
        System.out.println("materia3 = " + materias[2]);
        
        System.out.println("materia4 = " + materias[3]);
        
        System.out.println("materia5 = " + materias[4]);
        

    }
}
