package mvctwo;
import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

    public static List<Student> getStudents(){
        List<Student> studentsList =new ArrayList<>();

        studentsList.add(new Student("Do", "Truong","dotruong77@fpt.vn"));
        studentsList.add(new Student("Trinh", "Yen","haiyen99@fpt.vn"));
        studentsList.add(new Student("Nguyen", "Anh","lamanh123@fpt.vn"));
        return studentsList;
    }
}