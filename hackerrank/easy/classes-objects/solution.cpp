


// Write your Student class here
class Student{
    public:
     int scores[5];
     
     void input(){
        for(int i=0; i<5; i++){
            cin>>scores[i];
        }
     };
     
     int calculateTotalScore(){
        int sum=0;
        for(int &e : scores){
            sum+=e;
        }
        return sum;
     }
    
};
