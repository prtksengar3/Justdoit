#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int sp=n-1;
    int st=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=sp;j++){
            cout<<"\t";
        }
        int num=i;
        for(int j=1;j<=st;j++){
            if(j<st/2+1)
            cout<<num++<<"\t";
            else{
                cout<<num--<<"\t";
            }
        }
        sp--;
        st+=2;
        cout<<endl;
    }
    return 0;
}