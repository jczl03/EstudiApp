package Clases;
import java.time.*;
import java.util.Scanner;
public class FlashCard extends MiniTarea{
  private static Scanner input=new Scanner(System.in);
  private String pregunta;
  private String respuesta;
  private int coeficiente_frecuencia;
  private LocalDate fecha;
  private LocalTime hora;

  public FlashCard(String pregunta,String respuesta,int id){
    super.id=id;
    coeficiente_frecuencia=0;
    this.pregunta=pregunta;
    this.respuesta=respuesta;

  }
  public FlashCard(String pregunta,String respuesta){
    this(pregunta,respuesta,-1);

  }
  public void preguntar(){
    System.out.println("-----------");
    System.out.println(pregunta);
    System.out.println("Ingrese la palabra 'next' para saltar la pregunta");
    String respuesta1;
    boolean x=true;
    do{
      respuesta1=input.nextLine();
      if(respuesta1.equals("next")){
        System.out.println("Pregunta saltada");
        x=false;
        coeficiente_frecuencia--;
      }else if(respuesta1.equals(respuesta)){
        System.out.println("Respuesta correcta! :D");
        x=false;
        coeficiente_frecuencia++;
      }else{
        System.out.println("Respuesta incorrecta! D:");
        System.out.println("Intentalo nuevamente");
        coeficiente_frecuencia--;
      }
    }while(x);
    

    System.out.println("-----------");


  }
  public void print(){
    System.out.println("-----------");
    System.out.println("Pregunta:");
    System.out.println(pregunta);
    System.out.println("Respuesta:");
    System.out.println("-----------");
    System.out.println(respuesta);
  }
}
