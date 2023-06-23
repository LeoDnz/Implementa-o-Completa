package empresa;

public class Funcionario extends Pessoa implements Salario{
    private double salario;

    public Funcionario(double salario, String nome) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double calcularSalario() {
        return salario *1.10;
    }
}
