# Java Iterator

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

JAVA reflection is a very powerful tool to inspect the attributes of a class in runtime. For example, we can retrieve the list of public fields of a class using *getDeclaredMethods()*.

In this problem, you will be given a class *Solution* in the editor. You have to fill in the incompleted lines so that it prints all the methods of another class called *Student* in alphabetical order. We will append your code with the *Student* class before running it. The *Student* class looks like this:

```java
class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
    ......
    ......
    some more methods
    ......
}
```


You have to print all the methods of the student class in alphabetical order like this:

    anothermethod
    getName
    setEmail
    setId
    ......
    ......
    some more methods
    ......

There is no sample input/output for this problem. If you press "Run Code", it will compile it, but it won't show any outputs.


**Hint:** See the oracle docs for more details about [JAVA Reflection Methods and Fields](https://docs.oracle.com/javase/tutorial/reflect/class/classMembers.html)

**Input Format**

	

**Constraints**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T04:17:20.096Z  

```java

        // That ArrayList which is comming in this static function , is hvaing a generic Data-Type .Not a specfic data-Type 
         Object element = it.next();
         
         if( element instanceof String )//Hints: use instanceof operator
         // Inside this iterator , we have to check whether the current element is instance of String class or Integer-Wrapper-class 
         
         // Syntax of instance of operator ==> ObjectName instanceof className 

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-reflection-attributes/problem)