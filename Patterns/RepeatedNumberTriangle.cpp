#include <bits/stdc++.h>
using namespace std;

void RepeatedNumberTriangle2(int n){
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            cout << i;
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
        RepeatedNumberTriangle2(n);
    }
    return 0;
}  