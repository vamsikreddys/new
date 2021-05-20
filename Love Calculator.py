
#Calculator

print("Calculator")

Name1 = (input("What's your Name?\n")).lower()
Name2 = (input("What's your Name2\n")).lower()

Added = Name1+Name2

T = Added.count("t")
R = Added.count("r")
U = Added.count("u")
E = Added.count("e")

true = T+R+U+E
print(true)
L = Added.count("l")
O = Added.count("o")
V = Added.count("v")
E = Added.count("e")

love = L+O+V+E
print(love)
fn1 = int(str(true)+str(love))

if fn1 < 10 or fn1 > 90:
    if fn1 == 0:
        print(f"Your Score is {fn1} and Please Enter Valid input!")
    else:
        print(f"Your Score is {fn1} and you couple like cola and mentos")
elif fn1 >=40 and fn1<=50:
    print(f"Your Score is {fn1} and You are Alright Toghether")

else :
    print(f"Your Score is {fn1}")