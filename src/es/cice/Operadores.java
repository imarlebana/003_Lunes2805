package es.cice;

public class Operador {

    //Operadores de relacion ->, <; >;<=,>=, !=,==;
    //Relacionan dos objetos o variables para conseguir true o false
    static boolean r1 = 1 > 2;
    static boolean r2 = 1 < 2;
    static boolean r3 = 1 >= 1;
    static boolean r4 = 1 <= 2;
    static boolean r5 = 1 != 2;
    static boolean r6 = 1 == 2;

    //Operadores logicos && &; || |; !: ^

    public static void main(String[] args) {


        System.out.println( "Operadores de Relacion:" );
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println( "Operadores Logicos:" );
        System.out.println( (r1 && r2) );
        System.out.println( (r2 || r3) );
        System.out.println( (!r4) );
        System.out.println( (r1 && r2) );
        System.out.println( (r5 ^ r6) );
    }
}

