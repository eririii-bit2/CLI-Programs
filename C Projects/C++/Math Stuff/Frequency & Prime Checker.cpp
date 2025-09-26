#include <bits/stdc++.h>

bool isPrime(int num){
    if (num <= 1){
        return false;
    }

    if (num <= 3){
        return true;
    }

    if (num % 2 == 0 || num % 3 == 0){
        return false;
    }

    for (int i = 5; i * i <= num; i = i + 6){
        if (num % i == 0 || num % (i + 2) == 0){
            return false;
        }
    }
    return true;
}

using namespace std;

int main()
{
    int arr[] = {2, 7, 11, 5, 2, 15, 8, 7, 19, 4, 11,};
    int size = sizeof(arr) / sizeof(arr[0]);

    // Count the frequency of each number
    map<int, int> frequencyMap;
    for (int i = 0; i < size; i++) {
        frequencyMap[arr[i]]++;
    }
    // Prints The Table of Frequency
    cout << "Frequency of Numbers and Prime Numbers" << endl;
    cout << "\nNumbers | Frequency\n";
    cout << "--------|----------\n";
    for (const auto& pair : frequencyMap) {
        cout << pair.first << " \t| " << pair.second << endl;
    }
    // Prints The Prime Numbers
    cout << "\nPrime Numbers From The Array: ";
    for (int i = 0; i < size; i++) {
        if (isPrime(arr[i])) {
            cout << arr[i] << " ";
        }
    }
    cout << endl;

    return 0;
}
