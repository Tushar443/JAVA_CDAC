
#include <iostream>

using namespace std;

int main()
{
    string str;
    cin>>str;
    int count=0;
    int max =0;
    char maxChar='a';
    //std::cout << str.length() << std::endl;
    for(int i=0;i<str.length();i++){
        for(int j=1;j<str.length();j++){
            if(str[i]==str[j]){
                count++;
            }
            if(count < max){
                max=count;
                maxChar=str[i];
            }
        }
    }
    if(max==0){
        cout<<str<<endl;
    }else{
        cout<<maxChar<<endl;
    }
    return 0;
}