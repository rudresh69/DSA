#include <bits/stdc++.h>
using namespace std;

void NumberTriangle(int n){
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            cout << j;
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
        NumberTriangle(n);
    }
    return 0;
}