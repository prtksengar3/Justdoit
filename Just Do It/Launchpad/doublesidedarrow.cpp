#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int sp=n-1;
    int st=1;
    int sst=1;
    int ssp=-1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=sp;j++){
            cout<<"  ";
        }
        int val;
        if(i<=n/2)
        val=i;
        else
        {
            val=n-i+1;
        }
        
        for(int j=1;j<=st;j++){
            cout<<val--<<" ";
        }
        for(int j=1;j<=ssp;j++){
            cout<<"  ";
        }
        if(i==1||i==n){

        }
        else
        {
            int vaal=1;
            for(int j=1;j<=sst;j++){
                cout<<vaal++<<" ";
            }
        }    
        if(i<=n/2){
            sp-=2;
            st++;
            sst++;
            ssp+=2;
        }
        else{
            st--;
            sp+=2;
            sst--;
            ssp-=2;
        }
        
        cout<<endl;
    }
    return 0;
}