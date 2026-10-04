
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    
     public long power(int b, int p) throws Exception{
        
        long res = 1;
        
        if(b<0 || p<0)
          throw new Exception("n or p should not be negative.");
          
        if(b==0 && p==0)
          throw new Exception("n and p should not be zero.");
        
        for(int i=1; i<=p ;i++){
            res*=b;
        }
        return res;
     }
    
    
    
}

