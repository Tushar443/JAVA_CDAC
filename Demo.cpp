#include<iostream>
using namespace std;
int main(){
    int a = 20;
    int &n= a;
    cout<<&n<<endl;
    cout<<&a<<endl;
    n=a++;
    cout<<"7 "<<a<<endl;
    a=n++;
    

    cout<<a<<" "<<n<<endl;
    return 0;
}