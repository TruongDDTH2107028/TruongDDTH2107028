var today = new Date(); //khai bao kieu object => today is an object.
var hournow = today.getHours() //getHours() => method: tac dong len doi tuong
var greeting; //propperty -> dinh nghia doi tuong

if (hournow > 18) {
    greeting = 'Good evening!';
} else if (hournow > 12) {
    greeting = 'Good afternoon!';
} else if (hournow > 0) {
    greeting = 'Good morning!';
} else {
    greeting = 'Welcome!';
}

//DOM
document.write('<h3>' + greeting + '</h3>');