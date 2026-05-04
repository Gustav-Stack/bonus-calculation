public class Engenheiro extends Funcionario {

    public Engenheiro(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {

        System.out.println("Engenherio: "+ getNome());
        System.out.println("Bônus:" +getSalario() * 0.10);
    }
}