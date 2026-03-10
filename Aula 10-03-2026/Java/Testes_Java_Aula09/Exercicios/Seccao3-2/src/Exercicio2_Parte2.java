/*Exercício 2, Parte 2

Seu programa deve produzir a seguinte
saída:
112.6666
3380.0
608.4

 */
public class Exercicio2_Parte2 {
    public static void main(String[] args) {
        //Coloque seu código aqui
        float ovos_segunda=100;
        float ovos_terca=121;
        float ovos_quarta=117;

        float Media_diaria = (ovos_segunda+ovos_terca+ovos_quarta)/3;
        float Media_mensal = 30*Media_diaria;
        float Lucro_mensal =  Media_mensal*18/100;

        System.out.println("Média diária::   " +Media_diaria);
        System.out.println("Média Mensal: " +Media_mensal);
        System.out.println("Lucro Mensal:  $" +Lucro_mensal);
    }

}


