package empresa;

/**
 *
 * @author Alunos
 */
public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Gerente gerente = new Gerente("TI", 10000, "G1");
        empresa.setGerente(gerente);
        
        Funcionario f1 = new Funcionario(5000, "F1");
        Funcionario f2 = new Funcionario(5000, "F2");
        Funcionario f3 = new Funcionario(5000, "F3");
        Funcionario f4 = new Funcionario(5000, "F4");
        
        empresa.adicionaFuncionario(f1);
        empresa.adicionaFuncionario(f2);
    }
}
