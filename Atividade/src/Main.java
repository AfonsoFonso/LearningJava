public class Main {

    public static void main(String[] args) {
        folhapagamento();
    }

    public static void folhapagamento() {
        Console input = new Console();

        String nome = input.getFuncionario();
        int horasTrabalhadas = input.getHorasTrabalhadas();
        float valorHora = input.getValorHora();

        FolhaPagamento folha1 = new FolhaPagamento(nome, horasTrabalhadas, valorHora);

        System.out.println("\nFolha de Pagamento:");
        System.out.println(folha1.toString());

    }
}