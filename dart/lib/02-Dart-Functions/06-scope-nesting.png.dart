int globalVariable =10;
void main(){
  int localVariable =5;
  print('Global variable : $globalVariable');
  print('Local variabel : $localVariable');
  void nestedFunction(){
    int nestedVariable = 20;
    print('Global variable: $globalVariable');
    print('Local variable : $localVariable');
    print('Nested varibale : $nestedVariable');

  }
  nestedFunction();
}
void anotherFunction(){
  print('Global variable : $globalVariable');
}