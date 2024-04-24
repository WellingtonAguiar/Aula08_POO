public class Conversao {
 public static void main(String args[]){
    String st, st2;
    float real, real2;
    int int1, int2;

    //String para real
    st = "123";
    real = (float) (new Float(st).floatValue());
    System.out.println("String para real "+real);

    //Real para string
    real2 = 10;
    st2 = new Float(real2).toString();
    System.out.println("Real para string "+st2);
    //Ou
    st2 = ""+real2;
    System.out.println("Real para string "+st2);

    // String para inteiro
    st2 = "13";
    int1 = Integer.parseInt(st2);
    System.out.println("String para inteiro "+int1);

    //Inteiro para string
    int2 = 5;
    st2 = Integer.toString(int2);
    System.out.println("Inteiro para string "+st2);
    //ou
    st2 = ""+int2;
    System.out.println("Inteiro para strig "+st2);
    
    //Puxar valor sem instanciar
    //só é possível puxar pois são valores estáticos
    Produto.valor1 = 35;
    Produto.valor2 = 20;
    
    System.out.println("Valor 1: "+Produto.valor1);
    System.out.println("Valor 2: "+Produto.valor2);

    Produto pr = new Produto();
    System.out.println("Valor 1: "+pr.valor1);
    pr.valor3 = 35;
    System.out.println("Valor 3: "+pr.valor3);

    }
}
