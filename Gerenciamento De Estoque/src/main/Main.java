public class Main {
    public static void main(String[] args) {

        Filial brasilia = new Filial("Filial 1", "Brasilia");
        Caneca starwars = new Caneca("Caneca Star wars", "Uma caneca muito maneira", 1, 4, 13.4f, brasilia, 0.3f);
        Curso vestibularmilitar = new Curso("Militar", "Preparatorio para vestibulares militares", 2, 30, 199.99f, brasilia);
        
        
        brasilia.adicionarProduto(vestibularmilitar);
        brasilia.adicionarProduto(starwars);
        

        System.out.println(starwars.toString());
        System.out.println("----------------------------------------------------");
        System.out.println(vestibularmilitar.toString());
        System.out.println("----------------------------------------------------");
        System.out.println(brasilia.toString());
        System.out.println("----------------------------------------------------");
        brasilia.produtosArmazenados();

    }

}
