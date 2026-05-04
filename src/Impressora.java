public class Impressora {
    private String texto;
    private int numero;
    private double valor;
    private int vezes;

    public Impressora(){
        this.texto = "";
        this.numero = 0;
        this.valor = 0;
        this.vezes = 0;
    }

    public void imprimir(String texto){
        System.out.println("Texto Impresso:"+ texto);
    }
    public void imprimir(int numero){
        System.out.println("Texto será imprimido: "+  numero+" vezes.");
    }
    public void imprimir(double valor){
        System.out.println("O valor é: "+valor);
    }
    public void imprimir(String texto,int vezes){
        for(int i = 0; i <= vezes ; i++){
            System.out.println("Imprimindo Texto: "+ texto);
        }
    }
}
