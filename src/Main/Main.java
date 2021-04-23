package Main;


import Clases.*;
import Estructuras.*;
public class Main {
  //Arreglar el addBefore de las listas enlazadas.
  public static void main(String[] args) {
    //Prueba clases del programa:
    Mazo mazo =new Mazo();
    FlashCard flashCard;
    for(int i=0;i<10;i++){
      flashCard=new FlashCard("Pregunta"+i,"Respuesta "+i);
      mazo.add(flashCard);
    }
    mazo.preguntar();
    /*ListaEnlazada<MiniTarea> pruebaLsitaEnlazadaObjetos=new ListaEnlazada<MiniTarea>();
    MiniTarea miniTarea;
    
    for(int i=0;i<10;i++){
      miniTarea=new FlashCard("Pregunta "+i,"Respuesta "+i);
      pruebaLsitaEnlazadaObjetos.PushBack(miniTarea);
    }
    NodeListaEnlazada<MiniTarea> nodo=pruebaLsitaEnlazadaObjetos.getHead();
    while(nodo!=null){
        miniTarea=nodo.getKey();
        miniTarea.print();
        nodo=nodo.getNext();
        
    }*/

    //pruebaLsitaEnlazadaObjetos.PushBack();
    /*System.out.println("Prueba listas enlazadas");
    ListaEnlazada<Integer> pruebalista=new ListaEnlazada<Integer>();
    for(int i=0;i<10;i++){
      pruebalista.PushBack(i);
    }
    NodeListaEnlazada<Integer> nodo=pruebalista.getHead();
    NodeListaEnlazada<Integer> nodoprueba=pruebalista.getHead().getNext();
    System.out.println("------");
    while(nodo!=null){
      System.out.println(nodo.getKey());
      nodo=nodo.getNext();
    }
    pruebalista.Print();
    pruebalista.Erase(9);
    nodo=pruebalista.getHead();
    while(nodo!=null){
      System.out.println(nodo.getKey());
      nodo=nodo.getNext();
    }
    System.out.println("------");*/

    /*ArregloDinamico<Integer> prueba=new ArregloDinamico<Integer>();
    System.out.println("tamano:");
    System.out.println(prueba.size());

    for(int i=1;i<15;i++){
      prueba.PushBack(i);
    }
    System.out.println("Lista:");
    for(int i=0;i<prueba.size();i++){
      System.out.println(prueba.Get(i));
    }
    System.out.println("---------");
    prueba.Set(3,34);
    System.out.println("Lista:");
    for(int i=0;i<prueba.size();i++){
      System.out.println(prueba.Get(i));
    }*/
    /*System.out.println("tamano:");
    System.out.println(prueba.size());
    prueba.Remove(3);
    System.out.println("tamano depues de remover:");
    for(int i=0;i<prueba.size();i++){
      System.out.println(prueba.Get(i));
    }
    System.out.println(prueba.size());*/

  }
  public static void menu(){
    System.out.println("Bienvenido a ESTUDIAPP, elige una de las siguientes funcionalidades:");
    System.out.println("---------");
    System.out.println("1.Crear asignatura");
    System.out.println("2.Crear Tarea");
    System.out.println("3.Modificar Tarea");
    System.out.println("4.Ver tareas");
    //Presentarlas por orden de importancia(cola por importancia y/o fecha)
    System.out.println("5.Crear FlashCard");
    System.out.println("6.Estudiar Con FlashCard");
    
  }
  /*
  1. Clase Asignatura: Nombre, id, creditos, importancia
  2.3. Hacer los getters y setters y mejorar metodos creadores
  4.Crear metodos para , de momento, imprimir todas las tareas (incluyendo sus subtareas)
  5.Revisar metodos creadores.
  
  6.Crear un metodo print que sea como el menu de la flashcard
  */
}