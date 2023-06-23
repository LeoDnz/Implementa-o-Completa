package empresa;

public class Gerente extends Funcionario{
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Gerente(String departamento, double salario, String nome) {
        super(salario, nome);
        this.departamento = departamento;
    }
    public double calcularSalario() {
        return super.getSalario() *1.10;
    }
}
