#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int sp=2*n-3;
    int st=1;
    for(int i=1;i<=n;i++){
        int val=1;
        for(int j=1;j<=st;j++){
            cout<<val++<<" ";
        }
        for(int j=1;j<=sp;j++){
            cout<<"  ";
        }
        if(i==n){
            st--;
            val--;
        }
        for(int j=1;j<=st;j++){
            val--;
            cout<<val<<" ";
        }
        st++;
        sp-=2;
        cout<<endl;
    }
    return 0;
}