#include <bits/stdc++.h>
using namespace std;

void Pattern(int n){
    char ch = 'A';
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            cout << ch;
        }
        ch = ch + 1;
        cout << endl;
    }
}

int main(){
    int t;
    cin >> t;
    for(int i = 0; i < t; i++){
        int n;
        cin >> n;
        Pattern(n);
    }
    return 0;
}  