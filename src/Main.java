import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprenda a linguagem Java");
        curso1.setCargaHoraria(8);

        System.out.println("\n" + curso1);


        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Aprenda JavaScript");
        curso2.setCargaHoraria(10);

        System.out.println("\n" + curso2);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java POO");
        mentoria.setData(LocalDate.now());

        System.out.println("\n" + mentoria);
    }
}