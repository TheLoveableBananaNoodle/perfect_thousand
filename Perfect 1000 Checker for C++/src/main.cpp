#include <iostream>
#include <cctype>
#include <windows.h>
#include <conio.h>
#include <vector>
#include <cstdlib>
#include <sstream>

using namespace std;

void convert(string &s) {
	for (int i = 0; i < s.length(); i++) {
		s[i] = toupper(s[i]);
	}
}

void perfect_1000() {
	string choice;
	cout << endl << "Enter C to check numbers or E to exit: ";
	cin >> choice;
	convert(choice);

	if (choice == "C" || choice == "CHECK") {
		int calculations = 0;
		int calculation_times;
		cout << endl
				<< "How many calculations should I do? (1000/sec on average PC) (Recommended: 3000-6000 Attempts): ";
		cin >> calculation_times;
		cout << endl;
		string List[9];
		cout << "Enter your nine numbers one by one:";
		string num;
		cout << endl;
		for (int i = 0; i <= 8; i++) {
			num;
			cout << ">>> ";
			cin >> num;
			if (num != "9" && num != "8" && num != "7" && num != "6"
					&& num != "5" && num != "4" && num != "3" && num != "2"
					&& num != "1" && num != "0") {
				cout << endl
						<< "You must enter either 0, 1, 2, 3, 4, 5, 6, 7, 8 or 9."
						<< endl;
				Sleep(1000);
				i--;
			} else {
				List[i] = num;
			}
		}
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;

		cout << endl << endl << "********" << endl << "NUMBERS:" << endl
				<< "********" << endl << endl;
		while ((number1 + number2 + number3) != 1000) {
			int randomizer_var = (rand() % 7) + 0;
			switch (randomizer_var) {
			case 0:
				swap(List[0], List[1]);
			case 1:
				swap(List[1], List[2]);
			case 2:
				swap(List[2], List[3]);
			case 3:
				swap(List[3], List[4]);
			case 4:
				swap(List[4], List[5]);
			case 5:
				swap(List[5], List[6]);
			case 6:
				swap(List[6], List[7]);
			case 7:
				swap(List[7], List[8]);
			}

			string str = List[0] + List[1] + List[2];
			istringstream(str) >> number1;

			string str2 = List[3] + List[4] + List[5];
			istringstream(str2) >> number2;

			string str3 = List[6] + List[7] + List[8];
			istringstream(str3) >> number3;
			cout << number1 << " " << number2 << " " << number3 << endl;

			if ((number1 + number2 + number3) == 1000) {
				cout << endl << endl << "Number One: " << number1 << endl
						<< "Number Two: " << number2 << endl << "Number Three: "
						<< number3 << endl << "Total: "
						<< (number1 + number2 + number3) << endl;
				perfect_1000();
			} else {
				calculations++;
				if (calculations >= calculation_times) {
					cout << endl << "Not determined or not found." << endl;
					Sleep(1000);
					perfect_1000();
				}
			}
		}
	} else if (choice == "E" || choice == "EXIT") {
		cout << endl
				<< "\"Thank you for using my perfect thousand checker!\" -Kyle James Catterall."
				<< endl;
		Sleep(2000);
		exit(0);
	} else {
		cout << endl << "Not an option!" << endl;
		perfect_1000();
	}
}

int main() {
	cout << endl << "*******************************************" << endl
			<< "Perfect 1000 Checker - Kyle James Catterall" << endl
			<< "*******************************************" << endl;
	perfect_1000();
	return 0;
}
