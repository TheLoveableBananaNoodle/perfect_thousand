#The perfect thousand checker machine by Kyle James Catterall.

import os
import random as r 
import time as t 
number = 0
randomthing = 0

def perfect_1000():
    global number
    global randomthing
    randomthing = 0
    choice = input("Enter C to check numbers or E to exit:  ").upper()
    if choice == 'C':
        calculations = 0
        List = []

        randomthing = 9
        while randomthing != 0:
                try:
                    number = int(input("\nEnter your numbers one by one (enter 10 to go back): "))
                    if number == 9 or number == 8 or number == 7 or number == 6 or number == 5 or number == 4 or number == 3 or number == 2 or number == 1 or number == 0:
                        List.append(number)
                        randomthing -= 1
                    elif number == 10:
                        print("\n\n****************************************************\n\n")
                        perfect_1000()
                    else:
                        print("\n\nNumber must be either 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 or 10!\n")
                except ValueError:
                    print("\n\nNot an integer!\n")
                    
        print("\n")
        number1 = 0 
        number2 = 0 
        number3 = 0


        while (number1 + number2 + number3) != 1000:
            print(number1 + number2 + number3)
            thing = r.randint(0,7)
            List[thing], List[thing + 1] = List[thing + 1], List[thing]
            number1 = int(str(int(List[0])) + str(int(List[1])) + str(int(List[2])))
            number2 = int(str(int(List[3])) + str(int(List[4])) + str(int(List[5])))
            number3 = int(str(int(List[6])) + str(int(List[7])) + str(int(List[8])))
            if (number1 + number2 + number3) == 1000:
                print("\n\nNumber One: " + str(number1))
                print("Number Two: " + str(number2))
                print("Number Three: " + str(number3))
                print("Total: 1000\n\n")
                t.sleep(1)
                perfect_1000()
            else:
                calculations += 1 
                if calculations >= 3000:
                    print("\n\nNot determined.\n\n")
                    t.sleep(0.5)
                    perfect_1000()
                else:
                    continue
    
    elif choice == 'E' or choice == 'EXIT':
        print("\n\n\"Thanks for using my perfect thousand checker!\" -Kyle James Catterall\n\n")
        t.sleep(2)
        os._exit(0)
    
    else:
        print("\n\nNot a valid answer!\n\n")
        perfect_1000()


perfect_1000()

