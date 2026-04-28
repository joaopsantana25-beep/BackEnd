package Sec7_1;

public class Bond {
    public String name;
    public double balance, rate;
    public int term, monthsRemaining;

    public void setTermAndRate(int t){
        if(t>=0 && t<12){
            rate = 0.005;
        }
        else if(t>=12 && t<24){
            rate = 0.010;
        }
        else if(t>=24 && t<36){
            rate = 0.015;
        }
        else if(t>=36 && t<48){
            rate = 0.020;
        }
        else if(t>=48 && t<=60){
            rate=0.025;
        }
        else{
            System.out.println("Valor Inválido");
            t=0;
        }
    }

    public void earnInterest(){
        if(monthsRemaining>0){
            balance += balance*rate/12;
            monthsRemaining--;
            System.out.printf("Saldo: R$%.2f \n",balance);
            System.out.printf("Taxa: %.2f \n",rate);
            System.out.println("Meses Restantes: "+monthsRemaining);
        }
        else{
            System.out.println("Título Vencdido");
        }
    }

}
