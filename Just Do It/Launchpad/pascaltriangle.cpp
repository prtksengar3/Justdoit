#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int sp=n-1;
    for(int i=0;i<n;i++){
        for(int j=0;j<sp;j++){
            cout<<"  ";
        }
        int icj=1;
        for(int j=0;j<=i;j++){
            cout<<icj<<"    ";
            int icpj=icj*(i-j)/(j+1);
            icj=icpj;
        }
        sp--;
        cout<<endl;
    }
    return 0;
}