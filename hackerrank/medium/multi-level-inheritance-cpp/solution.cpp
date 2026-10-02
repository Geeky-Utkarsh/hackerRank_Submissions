
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

