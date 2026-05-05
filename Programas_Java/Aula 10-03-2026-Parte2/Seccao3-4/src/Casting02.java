public class Casting02 {
    public static void main(String[] args){
        //População mundial hoje
        double currentWorldPop = 7000000000d;
        System.out.println("População mundial hoje " +currentWorldPop);

        //População mundial em 1950, Fonte: Divisão de População das Nações Unidas
        //2.52 Billion
        double africaPop   =   221_000_000;
        double asiaPop     = 1_402_000_000;
        double europePop   =   547_000_000;
        double americasPop =   339_000_000;
        double oceanaPop   =    13_000_000;
        System.out.println("População mundial em 1950: "+
        (+africaPop +asiaPop +europePop +americasPop +oceanaPop));

        //A população atual da Ásia é estimada em 60% da população mundial
        double percentAsia = 0.6;
        double currentAsiaPop = currentWorldPop * percentAsia;
        System.out.println("População atual da Ásia: " +currentAsiaPop);
    }
}
