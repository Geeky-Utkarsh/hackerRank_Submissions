# Java Method Overriding

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using **super** keyword. If you write *super.func()* to call the function *func()*, it will call the method that was defined in the superclass.

You are given a partially completed code in the editor. Modify the code so that the code prints the following text:

    Hello I am a motorcycle, I am a cycle with an engine.
    My ancestor is a cycle who is a vehicle with pedals.


**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T06:33:16.019Z  

```java


    // Write your overridden getNumberOfTeamMembers method here
    @Override
    void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in " + getName());
    }


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem)