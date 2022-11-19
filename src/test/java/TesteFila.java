import org.example.Fila;

public class TesteFila {
    public static void main(String[] args) {
        Fila f = new Fila();
        System.out.println(f);
        System.out.println("Tamanho: " + f.getTamanho());
        f.enfileira(1);
        f.enfileira(2);
        f.enfileira(3);
        System.out.println(f);
        System.out.println(f.desenfileira());
        System.out.println("Tamanho: " + f.getTamanho());
        System.out.println(f);

    }
}
