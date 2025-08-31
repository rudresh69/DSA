#include <bits/stdc++.h>
using namespace std;

void UpperHalf(int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n-i; j++){
            cout << "*";
        }
        for(int j = 1; j < 2*i+1; j++){
            cout << " ";
        }
        for(int j = 0; j < n-i; j++){
            cout << "*";
        }   
        cout << endl;
    }
}

void LowerHalf(int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
            cout << "*";
        }
        for(int j = 1; j < 2*n-(2*i+1); j++){
            cout << " ";
        }
        for(int j = 0; j <= i; j++){
            cout << "*";
        }   
        cout << endl;
    }
}

int main(){
    int t;
    cin >> t;
    for(int i = 0; i <t; i++){
        int n;
        cin >> n;
        UpperHalf(n);
        LowerHalf(n);
    }
    return 0;
}