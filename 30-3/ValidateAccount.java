package bank.t2108a;

public class ValidateAccount {

    public final String MOBILE = "0984999999";
    public final String PASSWORLD = "Ngo Van Khoai";
    public boolean checkAcount(String mobile, String passworld) {
        if (mobile.equals(MOBILE)) {
            if (passworld.equals(PASSWORLD)) {
                System.out.println("Đăng nhập thành công!");
                return true;
            } else {
                System.out.println("Mật khẩu sai, vui lòng nhập lại");

                return false;
            }
        }else{
            System.out.println("Kiếm tra lại số điện thoại hoặc passworld");
            return false;
        }
    }
}