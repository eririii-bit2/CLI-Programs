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

int Factorial(int n){
//4. Process: f(n) * f(n-1) * f(n-2) * ... * 1
    if (n <= 1)
    return n;
    return n * Factorial(n - 1);
}

int main() {
    int x;
    
	//1. Start
	cout << lineBreak
	     << endl << titleTabs << "== Welcome! =="
	     << endl << titleTabs << "   Factorial"; //2. Welcome
	     
    //3. Input Value.
    cout << blankSpace << titleTabs << "Factorial of: ";
    cin >> x;

    cout << "\nThe factorial of " << x << " is " << Factorial(x); //5. Output (Fact!)
	
	//6. End
	cout << blankSpace << lineBreak
	     << endl << titleTabs << "== Program End! ==" << blankSpace;

	return 0;
}
