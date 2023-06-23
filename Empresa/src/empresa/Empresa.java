package empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private final List<Funcionario> funcionarios;
    private Gerente gerente;
    
    public Empresa(){
        this.funcionarios = new ArrayList<>();
    }
    
    public void adicionaFuncionario(Funcionario f) {
        this.funcionarios.add(f);
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    
}
