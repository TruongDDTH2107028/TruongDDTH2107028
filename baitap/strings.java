package baitap;

public class strings {
    public static void main ( String [] args){
        //Tạo một biến kiểu Stringvà gán cho nó một giá trị:
        String greeting = "Hello";
        System.out.println(greeting);
        //Chuỗi trong Java thực sự là một đối tượng, chứa các phương thức có thể thực hiện các thao tác nhất định trên chuỗi. Ví dụ, độ dài của một chuỗi có thể được tìm thấy bằng length()phương thức:
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        //Chuỗi trong Java thực sự là một đối tượng, chứa các phương thức có thể thực hiện các thao tác nhất định trên chuỗi. Ví dụ, độ dài của một chuỗi có thể được tìm thấy bằng length()phương thức:
        String txt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt2.length());
        //Có nhiều phương thức chuỗi có sẵn, ví dụ toUpperCase()và toLowerCase():
        String txt3 = "Hello World";
        System.out.println(txt3.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt3.toLowerCase());   // Outputs "hello world"
        //Phương indexOf()thức trả về chỉ mục (vị trí) của lần xuất hiện đầu tiên của một văn bản được chỉ định trong một chuỗi (bao gồm cả khoảng trắng):
        String txt4 = "Please locate where 'locate' occurs!";
        System.out.println(txt4.indexOf("locate")); // Outputs 7
        //Toán tử +có thể được sử dụng giữa các chuỗi để kết hợp chúng. Điều này được gọi là nối :
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        //Bạn cũng có thể sử dụng concat()phương pháp để nối hai chuỗi:
        String firstName1 = "John ";
        String lastName1 = "Doe";
        System.out.println(firstName1.concat(lastName1));

    }
}
