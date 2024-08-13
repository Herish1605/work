#include <iostream>
using namespace std;
int main() {
   char a[200];
   
   int maxo=0,length=0,i=0;
   cout<< "Enter your sentence:";
   cin.getline(a,200);
   
   
   
   while(a[i]!='\0'){
       if(a[i]!=' '){
           length ++; 
       }
       else{
           maxo = max(maxo,length);
           length= 0;
       }
       i++;
   }
   maxo= max(maxo,length);
   cout<< maxo;
    
    

    return 0;
}