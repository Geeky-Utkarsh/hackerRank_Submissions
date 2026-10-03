import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

@SuppressWarnings("unsused")
class Cmp implements Comparator<Student>{
    @Override
    public int compare(Student x , Student y){
        
            int res = -Double.compare(x.getCgpa(), y.getCgpa());
            
            if(res != 0)
              return res;
            
            res = x.getFname().compareTo(y.getFname());
            
            if(res != 0)
             return res;
            
            res = Integer.compare(x.getId(), y.getId());
            
            return res;
    }
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        
       // studentList.sort(Comparator.comparing(Student::getCgpa).thenComparing(Student::getFname).thenComparing(Student::getId)); -> Won't work coz system is using java 7 , which does not have  this syntatic sugaring and method-references support 
              
    //    studentList.sort(Comparator.comparing(Student -> getCgpa()).thenComparing(Student -> getFname()).thenComparing(Student -> getId() ));
    
        
        Collections.sort(studentList, new Cmp() );
        
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



