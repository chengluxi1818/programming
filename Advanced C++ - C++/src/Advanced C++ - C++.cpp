//============================================================================
// Name        : Advanced.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>

#include "Advance.h"
#include "Template.h"

using namespace std;

int main() {

/*	Advance a(1, 2);
	Advance newA;
	Advance add;
	Advance copy = a;

	copy.printXY();

	a.printXY();
	newA = a;
	newA.printXY();
	add = a + newA;
	add.printXY();
	copy = add;
	copy.printXY();*/

	Template<int> temp1(2, 3);
	Template<char> temp2('a', 'b');
	Template<string> temp3("hello", "good");
	Template<float> temp4(1.121, 3.156);
	Template<double> temp5(5.676, 8.686);

	return 0;
}
