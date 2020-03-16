#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int num=n;
    int st=-1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=num;j++){
            cout<<j<<" ";
        }
        for(int j=1;j<=st;j++){
            cout<<"* ";
        }
        st+=2;
        num--;
    cout<<endl;
    }
    return 0;
}