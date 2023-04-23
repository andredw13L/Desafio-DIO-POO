import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprenda a linguagem Java");
        curso1.setCargaHoraria(8);

//        System.out.println("\n" + curso1);


        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Aprenda JavaScript");
        curso2.setCargaHoraria(10);

//        System.out.println("\n" + curso2);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java POO");
        mentoria.setData(LocalDate.now());

//        System.out.println("\n" + mentoria);


        // Polimorfismo: A partir da classe mãe, vamos instanciar a classe filha
//        Conteudo conteudo = new Curso();


        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp prazo = new Bootcamp();

        LocalDate prazoInicial = prazo.getDataInicial();

        LocalDate prazoFinal = prazo.getDataFinal();


        Dev devAndre = new Dev();

        devAndre.setNome("André");
        devAndre.inscreverBootcamp(bootcamp);

        if (prazoInicial.isAfter(prazoFinal)){
            devAndre.prazoEncerradoBootcamp(bootcamp);
        }



        System.out.println("\nConteúdos inscritos: " + devAndre.getConteudosInscritos());
        devAndre.progredir();
        devAndre.progredir();
        devAndre.progredir();
        System.out.println("\nConteúdos inscritos: " + devAndre.getConteudosInscritos());
        System.out.println("\nConteúdos concluídos: " + devAndre.getConteudosConcluidos());
        System.out.println("\nXP: " + devAndre.calcularTotalXP());


        Dev devJoao = new Dev();

        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("\nConteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("\nConteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("\nXP: " + devJoao.calcularTotalXP());



        if (prazoInicial.isAfter(prazoFinal)){
            devJoao.prazoEncerradoBootcamp(bootcamp);
        }

    }
}