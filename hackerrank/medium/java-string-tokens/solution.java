

    static boolean isAnagram(String a, String b) {
        // if( a.length() != b.length()  )
        //    return false;
        
        // Complete the function
        
        String x = a.toLowerCase();
        String y = b.toLowerCase();
        int []f = new int[26];
        
        for(char e : x.toCharArray()){
            
            f[e-'a']++;
        }
        for(char e : y.toCharArray()){
            f[e-'a']++;
        }
        for(int e : f){
            if(e%2 != 0 )
             return false;
        }
        return true;
    }

