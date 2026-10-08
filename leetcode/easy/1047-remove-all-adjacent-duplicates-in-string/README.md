# Remove All Adjacent Duplicates In String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` consisting of lowercase English letters. A  **duplicate removal**  consists of choosing two  **adjacent**  and  **equal**  letters and removing them.

We repeatedly make  **duplicate removals**  on `s` until we no longer can.

Return  *the final string after all such duplicate removals have been made*. It can be proven that the answer is  **unique**.

 

 **Example 1:** 

```
Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

```

 **Example 2:** 

```
Input: s = "azxxzy"
Output: "ay"

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.

## Solution

**Language:** C++  
**Runtime:** 1999 ms (beats 5.02%)  
**Memory:** 12.4 MB (beats 99.90%)  
**Submitted:** 2026-10-08T10:05:15.330Z  

```cpp
class Solution {
public:
    string removeDuplicates(string s) {

        while(true){

              int dup=-1;

              for(int i=1; i<s.size(); i++){
                if(s[i] == s[i-1]){
                    dup=i;
                    break;
                } 
              }
              if(dup==-1)
                 return s;  // no duplicates-found , return s

             // erasing those 2  indexes 
            s.erase(dup - 1, 2);
        }
        return s;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)