#include<bits/stdc++.h>
using namespace std;

int main(){

    int n;
    cin>>n;
    string s;
    cin>>s;
    int mov=0;
    for(int i=0;i<n-2;i++){
        if(s[i]=='0'){
                if(s[i+1]=='1'&&s[i+2]=='0'){
                    s[i+2]='1';
                    mov++;
                }
        }
    }

    cout<<mov<<endl;
}
