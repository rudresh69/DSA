#include <bits/stdc++.h>
using namespace std;

void Pattern(int n){
    int space = 2*(n-1);
    for(int i = 1; i <= 2*n-1; i++){
        int stars = i;
        if(i > n){
            stars = 2*n-i;
        }
        for(int j = 0; j < stars; j++){
            cout << "*";
        }
        for(int j = 0; j < space; j++){
            cout << " ";
        }    
        for(int j = 0; j < stars; j++){
            cout << "*";
        }
        if(i < n){
            space -= 2;
        }
        else{
            space += 2;
        }
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
}