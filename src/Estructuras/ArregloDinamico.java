package Estructuras;
public class ArregloDinamico<T>{
  private T arr[];
  private int size;
  private int capacity;
  private T new_arr[];
  public ArregloDinamico(){
    this.capacity=2;
    this.size=0;
    arr=(T[])new Object[capacity];
  }
  public T Get(int i){
    if(i >= 0 && i < size){
      return arr[i];
    }
    throw new RuntimeException("ERROR: index out of range");
  }
  public void Set(int i, T val){
    if(i >= 0 && i < size){
      
      arr[i] = val;
    }else{
      throw new RuntimeException("ERROR: index out of range");
    }
    
  }
  public void PushBack(T val){
    if(size == capacity){
      new_arr = (T[]) new Object[capacity*2];
      for(int i = 0 ; i < size ; i++){
        new_arr[i] = arr[i];
        arr[i] = null;
      }
      arr = new_arr;
      capacity = capacity * 2;
    }
    arr[size] = val;
    size++;
      
  }
  public void Remove(int i){
    if(i >= 0 && i < size){
      
      for(int j = i ; j < size - 1 ; j++){
        arr[j] = arr[j+1];
      }
      size--;
    }else{
    throw new RuntimeException("ERROR: index out of range");
    }
  }
  public int size(){
    return size;
  }

}