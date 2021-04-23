package Clases;
import Estructuras.ArregloDinamico;
import java.time.*;
public class Tarea{
  private ArregloDinamico<MiniTarea> lista;
  String nombre;
  int id;
  int asignatura;
  LocalDate fecha;
  LocalTime hora;
  int importancia;
  public Tarea(String nombre, int id){
    this.id=id;
    this.nombre=nombre;
    lista=new ArregloDinamico<MiniTarea>();
  }
  public Tarea(){
    lista=new ArregloDinamico<MiniTarea>();
  }
  public void addMiniTarea(MiniTarea miniTarea){
    lista.PushBack(miniTarea);
  }
  public void removerTarea(int idx){
    lista.Remove(idx);
  }
  public MiniTarea getTarea(int idx){
    return lista.Get(idx);
  }
  public int tamaño(){
    return lista.size();
  }

}