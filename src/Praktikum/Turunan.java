
package Praktikum;

public class Turunan extends Induk{
    public void test(String s){
    System.out.println("Method overload di dalam kelas turunan");
    System.out.println("s : \""+s+"\"");
    //overload method di dalam satu class sama tapi implementasi dan parameternya berbeda
    }
    public void test(){
    System.out.println("Method override di dalam kelas turunan ");
    //override method di subclass dan superclass sama 
    } 
}
