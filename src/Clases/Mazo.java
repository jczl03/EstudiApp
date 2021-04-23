package Clases;
import Estructuras.*;
public class Mazo extends MiniTarea{
  
  private ListaEnlazada<FlashCard> cartas;
  private NodeListaEnlazada<FlashCard> nodoProvisional;
  public Mazo(){
    cartas=new ListaEnlazada<FlashCard>();
  }
  public void add(FlashCard carta){
    cartas.PushBack(carta);
  }
  public void preguntar(){
    nodoProvisional=cartas.getHead();
    while(nodoProvisional!=null){
      nodoProvisional.getKey().preguntar();
      nodoProvisional=nodoProvisional.getNext();
    }


  }
  public void print(){
    nodoProvisional=cartas.getHead();
    while(nodoProvisional!=null){
      nodoProvisional.getKey().print();
      nodoProvisional=nodoProvisional.getNext();
    }


  }

}