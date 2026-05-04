import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Carlos", 3000));
        funcionarios.add(new Engenheiro("Cristiano", 4000));
        funcionarios.add(new Vendedor("Julia", 2500, 25000));
        funcionarios.add(new Gerente("Augusto", 3000));



        for(Funcionario f : funcionarios){
            f.calcularBonus();
        }

    }

}