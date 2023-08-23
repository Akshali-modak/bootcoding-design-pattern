package singletone;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private static Student student;
 // constructor should be private
    void Student(){

    }
 //lazy way of creating singleton object
    public static Student getStudent(){
        // This method will create object

      if (student == null){
          student = new Student();
      }
        return null;
    }
}
