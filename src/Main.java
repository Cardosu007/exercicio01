public class Main {
    public static void main(String[] args) {

        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 27, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("A casa de doces", "José da Silva", 300, p[0]);
        l[1] = new Livro("Aprendendo a construir uma casa", "João Pedro", 9000, p[1]);
        l[2] = new Livro("Quebrando uma casa", "Luiz Gonzaga", 100, p[0]);

        l[0].abrir();
        l[0].folhear(100);
        System.out.println(l[0].detalhes());
    }
}