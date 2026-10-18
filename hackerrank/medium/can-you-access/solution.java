
            
            // Solution.Inner.Private SI = new Solution.Inner.Private();
            
            Solution.Inner SI = new Solution.Inner(); // Creating an object Inner class [which is a static-nested-class]---> So need to create it's object [static is a classLevel Keyword which is called on className not on method/anything]
            
            // But as the class named "Private" is non-static , So we have to create it's object to use it's method
            // There is no-other way out for [non-static-nested-class].
                         
            Solution.Inner.Private Sip = SI.new Private();
            
            o = Sip; // Object class reference named "o" is holding the reference to Solution.Inner.Private class 
             
            String res = Sip.powerof2(num);  // Storing the "String" value returned by the method "powerof2"
            System.out.println(num +" is "+ res); // printing it 
            
            
