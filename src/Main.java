//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Funcionario funcionario = new Funcionario("Carlos", 3000);
    funcionario.calcularBonus();


        Engenheiro engenheiro = new Engenheiro("Cristiano", 4000);
        engenheiro.calcularBonus();

        Vendedor vendedor = new Vendedor("Julia", 2500, 25000);
        vendedor.calcularBonus();

        Gerente gerente = new Gerente("Augusto", 3000);
        gerente.calcularBonus();

    }

}