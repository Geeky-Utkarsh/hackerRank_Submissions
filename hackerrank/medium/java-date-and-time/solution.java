

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        
        // 1. Calendar is abstract class [which is meant to be inherited] , So to get an object of class we have a specific method given the Java ".getInstance()" to get the object of this class [whose Calendar field are initialised with the current date-and-time ]
         
        Calendar cc = Calendar.getInstance();  // Getting an object through ".getInstance()" method 
        cc.set(year, month-1, day);
        
        String [] week = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };       
         String d = week[cc.get(Calendar.DAY_OF_WEEK) - 1]; // Subtracting -1 because indexing in array works from 0 
         // 
         return d;
        
                
    }

}

