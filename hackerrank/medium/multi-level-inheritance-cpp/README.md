# Rectangle Area

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

*This challenge is an extension of a previous challenge named Inheritance-Introduction. We highly recommend solving Inheritance-Introduction before solving this problem.*

In the previous problem, we learned about inheritance and how can a derived class object use the member functions of the base class.

In this challenge, we explore multi-level inheritance. Suppose, we have a class A which is the base class and we have a class B which is derived from class A and we have a class C which is derived from class B, we can access the functions of both class A and class B by creating an object for class C. Hence, this mechanism is called *multi-level inheritance*. (B inherits A and C inherits B.)

Create a class called *Equilateral* which inherits from *Isosceles* and should have a function such that the output is as given below.
    

**Input Format**

  

**Constraints**

 

**Output Format**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T13:09:33.481Z  

```cpp

/*
 * Create classes Rectangle and RectangleArea
 
 */
   class Rectangle{
    public :
      int width, height;
      
      Rectangle(){};
      // parametrized constructor 
      Rectangle(int width , int height ) : width(width) , height(height) {};
      
      // method() 
       virtual void display (){  
        cout<<width<<" "<<height<<"\n";
       } 
    
   };
   
   class RectangleArea : public Rectangle {
      public: 
        // void read_input(int width, int height){
            // this->width = width;
            // this->height = height; 
        // }
        
        void read_input(){
            cin>> width;
            cin>> height;
        }
        
        // Overriding of display() function from parents class 
        void display(){
            cout<<width*height<<"\n";
        }          
   };


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/multi-level-inheritance-cpp/problem)