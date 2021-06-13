package dominio;

public class Curso {

    private double[] notas;
    private double promedio;
    private int estudiantesEncimaPromedio;

    public Curso() {
        notas = new double[12];
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void mostrarNotas() {
        for (int i = 0; i < 12; i++) {
            System.out.println(this.notas[i]);
        }

    }

    public void setPromedio() {
        double promedios = 0;
        for (int i = 0; i < 12; i++) {
            double aux = notas[i];
            promedios = aux + promedios;
        }
        this.promedio = (promedios / 12);
    }

    public void setEstudiantesEncimaPromedio() {
        int estudiantes = 0;
        double promedios = 0;
        for (int i = 0; i < 12; i++) {
            double aux = notas[i];
            promedios = aux + promedios;
        }
        for (int i = 0; i < 12; i++) {
            if (notas[i] > (promedios / 12)) {
                estudiantes++;
            }
        }

        this.estudiantesEncimaPromedio = estudiantes;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public int nroEstudiantesEncimaPromedio() {
        return this.estudiantesEncimaPromedio;
    }
}
