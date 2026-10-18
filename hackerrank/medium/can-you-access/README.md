# Can You Access?

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a class *Solution* and an inner class *Inner.Private*. The main method of class *Solution* takes an integer $num$ as input. The *powerof2* in class *Inner.Private* checks whether a number is a power of $2$. You have to call the method *powerof2* of the class *Inner.Private* from the *main* method of the class *Solution*.

**Constraints**   
$ 1 \le num \le 2^{30}$

**Input Format**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T05:11:43.482Z  

```java

            
            // Solution.Inner.Private SI = new Solution.Inner.Private();
            
            Solution.Inner SI = new Solution.Inner(); // Creating an object Inner class [which is a static-nested-class]---> So need to create it's object [static is a classLevel Keyword which is called on className not on method/anything]
            
            // But as the class named "Private" is non-static , So we have to create it's object to use it's method
            // There is no-other way out for [non-static-nested-class].
                         
            Solution.Inner.Private Sip = SI.new Private();
            
            o = Sip; // Object class reference named "o" is holding the reference to Solution.Inner.Private class 
             
            String res = Sip.powerof2(num);  // Storing the "String" value returned by the method "powerof2"
            System.out.println(num +" is "+ res); // printing it 
            
            

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/can-you-access/problem)