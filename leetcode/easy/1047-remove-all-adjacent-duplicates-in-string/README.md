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
**Runtime:** 4 ms (beats 69.96%)  
**Memory:** 14.4 MB (beats 34.05%)  
**Submitted:** 2026-10-08T10:33:05.930Z  

```cpp
class Solution1 {
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

             // erasing those 2  indexes [i] and [i+1] 
            s.erase(dup - 1, 2);
        }
        return s;
    }
};
//  --------------------------------------------------------------------------

class Solution {
    public: 
     string removeDuplicates(string s){
        stack<char>stk;

        // stk.push(s[0]);

        // for(int i=0; i<s.size(); i++){
            // stk.push(s[i]);

            // if(stk.top()==s[i])
            //   stk.pop();
        // }
        // Pushing Stack Element into String 
        // string res="";

        // for(auto ee : stk)
        //   res.push_back(ee.pop());
        
        // while(!stk.empty()){
            // res+=stk.top();
            // stk.pop();
        // }
        // return res;

        for(int i=0; i<=s.size()-1; i++){

            if( !stk.empty() && stk.top() == s[i] ){
                stk.pop();
            }
            else
               stk.push(s[i]);
        }
        string res="";
        // copying the stack into a string res 
        while(!stk.empty()){
            res+=stk.top();
            stk.pop();
        }
        reverse(res.begin(), res.end());
        return res;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)