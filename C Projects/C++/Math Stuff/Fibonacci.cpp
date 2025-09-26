/*
1. Start
2. Welcome
3. Input value
4. Process
5. Output
6. End
*/
#include <iostream>
using namespace std;

const string lineBreak = string(120, '-');
const string blankSpace = string(2, '\n');
const string titleTabs = string(5, '\t');

int Fibonacci(int n) {
//4. Process: f(n - 1) + f(n - 2)
	if (n == 0 || n == 1) return 1;
	return Fibonacci(n - 1) + Fibonacci(n - 2);
}

int main() {
    int x;
    
	//1. Start
	cout << lineBreak
	     << endl << titleTabs << "== Welcome! =="
	     << endl << titleTabs << "Fibonacci Sequence"; //2. Welcome
	     
    //3. Input Value.
    cout << blankSpace << titleTabs << "Sequence Length: ";
    cin >> x;

	cout << endl << titleTabs;
	for (int i = 0; i < x; i++) {
		cout << Fibonacci(i) << " "; //5. Output (Fib)
	}
	
	//6. End
	cout << blankSpace << lineBreak
	     << endl << titleTabs << "== Program End! ==" << blankSpace;

	return 0;
}
