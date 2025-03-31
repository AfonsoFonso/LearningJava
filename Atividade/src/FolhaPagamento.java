public class FolhaPagamento {

    private String funcionario;
    private float horasTrabalhadas;
    private float valorHora;
    private float salarioBruto;
    private float ir;
    private float inss;
    private float fgts;
    private float salarioLiquido;

    public FolhaPagamento(String funcionario, float horasTrabalhadas, float valorHora) {
        this.funcionario = funcionario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;

        calcularSalarioBruto();
        calcularIR();
        calcularINSS();
        calcularFGTS();
        calcularSalarioLiquido();
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
        calcularSalarioBruto();
        calcularIR();
        calcularINSS();
        calcularFGTS();
        calcularSalarioLiquido();
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
        calcularSalarioBruto();
        calcularIR();
        calcularINSS();
        calcularFGTS();
        calcularSalarioLiquido();
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public float getIR() {
        return ir;
    }

    public float getINSS() {
        return inss;
    }

    public float getFGTS() {
        return fgts;
    }

    public float getSalarioLiquido() {
        return salarioLiquido;
    }

    private void calcularSalarioBruto() {
        salarioBruto = horasTrabalhadas * valorHora;
    }

    private void calcularIR() {
        if (salarioBruto <= 1903.98) {
            ir = 0;
        } else if (salarioBruto <= 2826.65) {
            ir = salarioBruto * 0.075f - 142.80f;
        } else if (salarioBruto <= 3751.05) {
            ir = salarioBruto * 0.15f - 354.80f;
        } else if (salarioBruto <= 4664.68) {
            ir = salarioBruto * 0.225f - 636.13f;
        } else {
            ir = salarioBruto * 0.275f - 869.36f;
        }
    }

    private void calcularINSS() {
        if (salarioBruto <= 1212.00) {
            inss = salarioBruto * 0.075f;
        } else if (salarioBruto <= 2427.35) {
            inss = salarioBruto * 0.09f;
        } else if (salarioBruto <= 3641.03) {
            inss = salarioBruto * 0.12f;
        } else if (salarioBruto <= 7087.22) {
            inss = salarioBruto * 0.14f;
        } else {
            inss = 7087.22f * 0.14f;
        }
    }

    private void calcularFGTS() {
        fgts = salarioBruto * 0.08f;
    }

    private void calcularSalarioLiquido() {
        salarioLiquido = salarioBruto - ir - inss;
    }

    @Override
    public String toString() {
        return "Funcionário: " + funcionario + "\n" +
               "Horas trabalhadas: " + horasTrabalhadas + "\n" +
               "Valor da Hora: R$ " + valorHora + "\n" +
               "Salário Bruto: R$ " + salarioBruto + "\n" +
               "IR: R$ " + ir + "\n" +
               "INSS: R$ " + inss + "\n" +
               "FGTS: R$ " + fgts + "\n" +
               "Salário Líquido: R$ " + salarioLiquido + "\n";
    }
}