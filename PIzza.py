
print("PIZZA DELIVERY APP WELCOMES YOU")

size = input("What Size of Pizza you want? S, M and L\n")

pep = input("Do you want Pepproni? Y or N\n")

cheese = input("Do you Want Cheese? Y or N\n")

if size == "S" :
    size = 15
elif size == "M" :
    size = 20
elif size == "L":
    size = 25
else :
    print("Please Enter S, M or L")

if pep == "Y":
    pep = 3
    if size == "S" :
        pep = 2
    else :
        pep = 3
else :
    pep = 0

if cheese == "Y":
    cheese = 2
else :
    cheese = 0

print(f"your Pizaa price is ${size+pep+cheese} Only")