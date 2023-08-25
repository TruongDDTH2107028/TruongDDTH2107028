void main(){
  var count = 0;
  print('Dart break statrment');
  while(count<=10){
    count =count + 1;
    if (count == 5){
      break;
    }
    print('Inside loop ${count}');
  }
  print('out of while loop');
}