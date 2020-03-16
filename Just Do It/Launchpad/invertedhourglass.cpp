#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int pt=1;
    int sp=2*n-1;
    for(int i=1;i<=2*n+1;i++){
        int num=n;
        for(int j=1;j<=pt;j++){
            cout<<num--<<" ";
        }
        for(int j=1;j<=sp;j++){
            cout<<"  ";
        }
        if(i==n+1){
            pt--;
            num++;
        }
        for(int j=1;j<=pt;j++){
            num++;
            cout<<num<<" ";
        }
        if(i==n+1){
            pt++;
        }
        // cout<<sp;
        if(i<n+1){
            pt++;
            sp-=2;
        }
        else{
            pt--;
            sp+=2;
        }
        cout<<endl;
    }
    return 0;
}