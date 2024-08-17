import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {
    private String name;
    private int sno;
    private int java;
    private int eng;
    private int maths;

    StudentTest(int sno, String name, int java, int eng, int maths)
    {
        this.name = name;
        this.sno = sno;
        this.java = java;
        this.eng = eng;
        this.maths =maths;
        //getAverage();
    }
    public String toString()
    {
        return "sno: "+sno+", name: " + name + ", average: " + getAverage();
    }

    public int getAverage()
    {
        return((java+eng+maths)/3);
    }
    
    public static void main(String[] args) {
        
        List<StudentTest> al = new ArrayList<>();
        al.add(new StudentTest(101,"varsha", 87,67,77));
        al.add(new StudentTest(102,"mansi",89,54,67));
        al.add(new StudentTest(103, "himanshi", 56, 56, 45));
        al.add(new StudentTest(104, "bhavna", 45, 56, 54));
        al.add(new StudentTest(105, "heena", 65, 45, 45));

        System.out.println("student name whose start with 'h': ");
        for(StudentTest i : al)
        {
            if(i.name.startsWith("h"))
            {
                System.out.println(i);
            }
        }

        System.out.println("before remove: ");
        for(StudentTest i : al)
        {
            System.out.println(i);
        }

        Iterator<StudentTest> it = al.iterator();
        {
           while(it.hasNext())
           {
                StudentTest students = it.next();
                if(students.name.startsWith("b"))
                {
                    System.out.println("\nstudent name whose start with 'b': " + students);
                    it.remove();
                }
            }
        }
        System.out.println("After remove: ");
        for(StudentTest i : al)
        {
            System.out.println(i);
        }
        
    }

}