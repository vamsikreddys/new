

Year = int(input("Enter the Year?\n"))

if Year % 4 == 0:
    if Year % 100 == 0 :
        if Year % 400 == 0 :
            print("Leap Year!")
        else:
            print("Not a Leap Year!")
    else :
        print("This is A Leap Year")
else:
    print("This is not a Leap Year")