@import url(http);
body {
    margin:0;
    padding:0;
    background-color: #f1f1f1;
    color: #333;}
/*Header*/
header {
    background-color: #333333;
    margin: 0 0 40px 0;
    padding: 10px 0 0 0;
    min-height: 50px;
    text-align: center;}
h1 {
    background-image: url("img2/creative-folk.png");
    background-repeat: no-repeat;
    background-position: center center;
    margin: 10px auto 5px auto;
    width: 516px;
    height: 21px;
    text-align: center;
    text-indent: 100%;
    white-space: nowrap;
    overflow: hidden;}
h2 {
    font-size: 180px;
    margin: 0;}
h2, h4 {
    font-weight: normal;}
h4{
    color: #333;
    display: inline-block;
    font-size: 120px;
    margin: 5px 0 5px 0;}
/* Filter and search options */
#price-range{
    width: 370px;
    margin: 10px auto 30px auto;
    text-align: center;
    font-weight: bold;}
#value-min, #value-max{
    width: 100px;
    border: none;
    background-color: #f1f1f1;
    font-family: 'Karla', sans-serif;}
#slider {margin: 30px 0 30px 0;}
/* Filter and search options */
#buttons, #search {
    text-align: center;
    margin-bottom: 30px;}

/* Filter buttons */
button{
    background-color:  #d7d7d7;
    border: none;
    padding:  3px 10px 4px 10px;
    border-radius: 4px;
    color: #333;
    font-family: 'Karla', sans-serif;
    font-size: 100%;}

button:hover, button.active {
    background-color: #00cccc;
    color: #fff;
    cursor: pointer;}
/* Search input */
input{
    font-size: 120%;
    border: 1px solid #999;
    padding: 5px;}
input:hover {
    border: 1px solid #666;}
input:focus {
    border: 1px solid #00cccc;
    outline: none;}
/* Gallery of images */
#gallery {
    text-align: center;
    max-width: 1020px;
    margin: 0 auto;}

#gallery img {
    width: 300px;
    height: 150px;
    border-radius: 3px;
    border: 8px solid #fff;
    margin: 6px;
    -webkit-box-shadow: 0 0 3px 3px #ebebeb;
    float: left;}

/* Table styles */
table {
    margin: 0 auto;
    width: 780px;}
table#rates {width: 380px;}
th,td {
    border-radius: 3px;
    color: #333;
    padding: 7px 10px 5px 10px;
    min-width: 9em;
    text-align: left;}
th{
    background-color: #d7d7d7;
    font-weight: bold;
    text-transform: uppercase;}
td{
    background-color: #fff;}
table.sortable th:hover {
    cursor: pointer;}
th.ascending, th.descending, table.sortable th:hover {
    background-color: #00cccc;
    color: #fff;}
/*Arrows for table sorting */
th.ascending:after {
    font-size: 60%;
    content: '\25B2';
    float: left;
    padding: 4px 5px 0 0;}
th.descending:after {
    font-size: 60%;
    content: '\25BC';
    float: left;
    padding: 4px 5px 0 0;}

.about {
    width: 780px;
    margin: 0 auto 40px auto;}
.about:after {
    content: "";
    display: table;
    clear: both;}
.about h2 {
    text-align: left;
    float: left;}

.bio {
    float: right;
    width: 195px;}
.bio img {
    float: left;
    width: 50px;
    height: 50px;
    margin-right: 10px;}

.location {
    padding-left: 74px;
    background-image: url('img2/pointer.png');
    background-repeat: no-repeat;
    background-position: 60px 1px;
    font-size: 90%;}