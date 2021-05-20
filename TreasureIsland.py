#roller Coaster


print("Welcome to Roller Coaser")

Height = int(input("Please Enter your Height in cms\n"))

Age = int(input("Please Enter your Age in cms\n"))

Photos = input("Are you want Photos? Y or N\n")
bill = 0
if Height >= 120 :
    if Age <= 12 :
        bill = 8
    elif Age >12 and Age<18:
        bill = 10
    elif Age > 18 :
        bill = 15
        if Age >=45 and Age <= 55 :
            bill = 0
    if Photos == "Y" :
        bill1 = 3
    else:
        bill1 = 0

    print (f"your Price is {bill+bill1}")
else :
    print("They Can't Ride! Roller Coaster due to Insuffient Height")