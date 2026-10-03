# Java Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added  to or removed from either the front (head) or back (tail).

    
Deque interfaces can be implemented using various types of collections such as `LinkedList` or `ArrayDeque` classes. For example, deque can be declared as:

    Deque deque = new LinkedList<>();
    or
    Deque deque = new ArrayDeque<>();
    
You can find more details about Deque [here](http://docs.oracle.com/javase/7/docs/api/java/util/Deque.html).

In this problem, you are given $N$ integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size $M$.

*Note*: Time limit is $3$ second for this problem.


**Input Format**

The first line of input contains two integers $N$ and $M$: representing the total number of integers and the size of the subarray, respectively. The next line contains $N$ space separated integers. 

**Constraints**

$1 \le N \le 100000$<br>
$1 \le M \le 100000$<br>
$M\le N$<br>
The numbers in the array will range between $[0,10000000]$.


**Output Format**

Print the *maximum* number of unique integers among all possible contiguous subarrays of size $M$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T13:38:48.146Z  

```java
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




```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-dequeue/problem)