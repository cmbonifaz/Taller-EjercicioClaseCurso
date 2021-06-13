package test;

import dominio.Curso;

public class TestCurso {

    public static void main(String[] args) {

        Curso cursoA = new Curso();
        double[] notas = new double[12];
        llenaNotas(notas);
        cursoA.setNotas(notas);
        cursoA.mostrarNotas();
        cursoA.setEstudiantesEncimaPromedio();
        cursoA.setPromedio();
        System.out.println("Promedio de curso= " + cursoA.getPromedio());
        System.out.println("Nro de esstudiantes encima del promedio= " + cursoA.nroEstudiantesEncimaPromedio());

    }

    public static void llenaNotas(double[] notas) {
        for (int i = 0; i < 12; i++) {
            notas[i] = Math.random() * 6;
        }
    }
}
