import 'dart:math';

class Employe{
  late String eName;
  String get ename{
    return eName;
  }
  set ename(String name ){
    this.eName = name;

  }
}
void main (){
  Employe emp= new Employe();
  emp.ename ='Jeff';
  print("Eemploye nam I : ${emp.ename}");
}