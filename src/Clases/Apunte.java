
package Clases;
public class Apunte extends MiniTarea{
  String nombre;
  String apunte;
  int idAsignatura;
  public Apunte(String nombre,String apunte){
    this(nombre,apunte,-1);
  }
  public Apunte(String nombre,String apunte,int id){
    this.nombre=nombre;
    this.apunte=apunte;
    this.idAsignatura=id;
  }
  public Apunte(String apunte){
    this(apunte,-1);
  }
  public Apunte(String apunte,int id){
    this(null,apunte,id);
  }
  public void print(){
    System.out.println("----");
    System.out.println(" "+nombre+" :");
    System.out.println(apunte);
    System.out.println("----");
  }
}