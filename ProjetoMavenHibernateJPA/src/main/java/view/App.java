package view;

import controller.AlunosJpaDAO;
import model.Alunos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alunos alunos = new Alunos();
    	alunos.setNome("Vinicius");
    	alunos.setEndereco("Rua Samira 45");
        AlunosJpaDAO.getInstance().merge(alunos);
        System.out.println("Objetos salvo com sucesso!");
    }
}
