#include<iostream>
using namespace std;
int main(){
    // int a = 20;
    // int &n= a;
    // cout<<&n<<endl;
    // cout<<&a<<endl;
    // n=a++;
    // cout<<"7 "<<a<<endl;
    // a=n++;
    

    // cout<<a<<" "<<n<<endl;

    // int arr[]={10,20,30,40,50};
    // int x, *ptr1=arr,*ptr2=&arr[3];
    // cout<<&arr[0]<<endl;
    // cout<<&arr[1]<<endl;
    // cout<<&arr[2]<<endl;
    // cout<<&arr[3]<<endl;
    // cout<<&arr[4]<<endl;
    
    // x= ptr2-ptr1;
    // cout<<x<<endl;


    class A{
        int i;
        long j;
    };
    class B : public A{
        int k;
    };
    cout<<sizeof(A)<<endl;
    cout<<sizeof(B)<<endl;

    return 0;
}