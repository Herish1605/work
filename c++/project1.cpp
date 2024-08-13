#include<iostream>
using namespace std;
int main(){
    int x[5];
    for(int i=0; i<=5; i++){
        cout<<"enter the didgits:";
        cin >> x[i]; 
    }
    int k;
    cout<< "enter the digit from which we have to divide";
    cin>> k;
    for(int g=0; g<=5;g++){
        for(int f=0; f<=5;f++){
            int r=0;
            
            if(g!=f){
               int r = x[g]+ x[f];
            
            if(r%k==0){
                cout<< x[g] <<" ,"<<x[f];
                }
            }
        }
    }

return 0;

}