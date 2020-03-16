#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int sp=n-1;
    int st=n;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=sp;j++){
            cout<<" ";
        }
        for(int j=1;j<=st;j++){
            if(i>1&&i<st&&j>1&&j<st){
                cout<<" ";
            }
            else
            cout<<"*";
        }
        sp--;
        cout<<endl;
    }
    return 0;
}