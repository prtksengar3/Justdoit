#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(i==1){
                cout<<"1";
            }
            else if((j!=1&&j!=i)){
                cout<<"0";
                }
            else{
                cout<<i-1;
                }
        }
         cout<<endl;
    }
    return 0;
}