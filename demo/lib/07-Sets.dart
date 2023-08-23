void main() {
  var elements = {'0', 'K', 'Ni', 'Rd'
  };
  elements.addAll(['H', 'C']);
  print(elements);
  elements.add('F');
  elements.addAll(['H', 'C']);
  print(elements);
  elements.add('C');
  print(elements);
}