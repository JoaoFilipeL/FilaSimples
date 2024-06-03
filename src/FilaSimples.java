public class FilaSimples {
    private Integer fila[];
    private Integer tamanho = 0;
    private Integer capacidade;

    public FilaSimples(int capacidade){
        this.capacidade = capacidade;
        this.fila = new Integer[this.capacidade];
        System.out.println("A fila foi criada.");
    }

    //ADICIONAR
    public void adicionar (Integer elemento){
        if(tamanho < capacidade){
            fila[tamanho] = elemento;
            tamanho++;
        } else {
            System.out.println("A fila esta cheia, não é possivel adicionar mais elementos.");
        }
    }

    //REMOVER
    public void remover (){
        if(tamanho > 0){
            for (int i = 0; i < this.tamanho-1; i++){
                fila[i] = fila[i + 1];
            }
            fila[tamanho - 1] = null;
            tamanho--;
        } else {
            System.out.println("A fila está vazia, não é possível remover elementos.");
        }
    }

    //REMOVER POR OCORRENCIA
    public void removerTodasOcorrencias(Integer elemento){
        int novoTamanho = 0;

        for (int i = 0; i < tamanho; i++) {
            if (!fila[i].equals(elemento)) {
                fila[novoTamanho] = fila[i];
                novoTamanho++;
            }
        }

        for (int i = novoTamanho; i < tamanho; i++) {
            fila[i] = null;
        }

        tamanho = novoTamanho;
    }

    //LISTAR
    public void listar(){
        for (int i = 0; i < tamanho; i++){
            System.out.println(fila[i]);
        }
    }


    //BUSCAR
    public Integer buscar(Integer elemento){
        for (int i = 0; i < tamanho; i++){
            if(fila[i].equals(elemento)){
                return fila[i];
            }
        }
        return null;
    }


    //MAIOR
    public Integer maior(){
        if (tamanho == 0) {
            System.out.println("A fila está vazia, não é possível encontrar o maior elemento.");
            return null;
        }
        Integer maiorElemento = fila[0];
        for (int i = 1; i < tamanho; i++) {
            if (fila[i] > maiorElemento) {
                maiorElemento = fila[i];
            }
        }
        return maiorElemento;
    }

    //MENOR
    public Integer menor() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia, não é possível encontrar o menor elemento.");
            return null;
        }
        Integer menorElemento = fila[0];
        for (int i = 1; i < tamanho; i++) {
            if (fila[i] < menorElemento) {
                menorElemento = fila[i];
            }
        }
        return menorElemento;
    }

    //MEDIA
    public Double media() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia, não é possível calcular a média.");
            return null;
        }
        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += fila[i];
        }
        return soma / tamanho;
    }

    //QUANTIDADE
    public int quantidade() {
        return tamanho;
    }

    //AUMENTAR CAPACIDADE
    public void aumentarCapacidade(int maisCapacidade) {
        Integer [] novaFila = new Integer[capacidade + maisCapacidade];
        for (int i = 0; i < capacidade; i++) {
            novaFila[i] = fila[i];
        }
        fila = novaFila;
        capacidade += maisCapacidade;
    }
}
    


