import java.util.Scanner;

public class Classe01
{
    public static void main (String[] args)
    {
        //OBJETIVO
        /*
         * 6) Elabore um sistema que dada a idade de um nadador 
         * classifique-o em uma das seguintes categorias:
            Infantil A = 5 a 7 anos
            Infantil B = 8 a 11 anos
            Juvenil A = 12 a 13 anos
            Juvenil B = 14 a 17 anos
            Adultos = Maiores de 18 anos
         */
        //INICIO
        //VARIAVEIS
        int idadeNadador = 0;  //camelCase
        
        Scanner s = new Scanner(System.in);

        //ENTRADAS
        System.out.print("Digite a idade do nadador: ");
        idadeNadador = s.nextInt();

        //PROCESSAMENTOS//saidas
        if (idadeNadador < 5) //me julguem
        {
            //saida
            System.out.print("Infelizmente não podemos atender!\n");
        }
        else if(idadeNadador <=7)
        {
        	System.out.print("Infantil A = 5 a 7 anos\n");
        } 
        else if(idadeNadador <=11)
        {
        	System.out.print("Infantil B = 8 a 11 anos\n");
        }
        else if(idadeNadador <=13)
        {
        	System.out.print("Juvenil A = 12 a 13 anos\n");
        }
        else if(idadeNadador <=17)
        {
        	System.out.print("Juvenil B = 14 a 17 anos\n");
        }
        else
        {
        	System.out.print("Adultos = Maiores de 18 anos\n");
        }
        //SAIDAS
        System.out.print("OBRIGADO, VOLTE SEMPRE!");
        //FIM
    }
}