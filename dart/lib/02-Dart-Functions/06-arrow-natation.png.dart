void main(){
  int traditionalSquare(int num){
    return num * num;
  }
  int arrowSquare(int num)=> num * num;
  var traditionalVariable = traditionalSquare(50);
  var arrowVariale = arrowSquare(5);

  print('Traditional suare : $traditionalVariable');
  print('Arrow square : $arrowVariale');
  void printMessage(String message) => print('Message : $message');
  printMessage('Hello, World!');
}