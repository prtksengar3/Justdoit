#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int st=n-1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            cout<<j;
        }
        for(int j=1;j<=st;j++){
            cout<<"*";
        }
        st--;
        cout<<endl;
    }
    return 0;
}