#Treasure Island

print('''
   ,a8888a,       ,a8888a,  888888888888  
 ,8P"'  `"Y8,   ,8P"'  `"Y8,        ,8P'  
,8P        Y8, ,8P        Y8,      d8"    
88          88 88          88    ,8P'     
88          88 88          88   d8"       
`8b        d8' `8b        d8' ,8P'        
 `8ba,  ,ad8'   `8ba,  ,ad8' d8"          
   "Y8888P"       "Y8888P"  8P'           
                                  
''')

dog = ('''

                                          _.-.._         _._
                                     _,/^^,y./  ^^^^"""^^\= \\
                                     \y###XX;/  /     \    ^\^\\
                                       `\Y^   /   .-==||==-.)^^
                   ,.-=""""=-.__       /^ (  (   -/<0>++<0>(
                 .^      .: . . :^===(^ \ (  (  /```^^^^^^^)
                /      .: .,GGGGp,_ .(   \   /    /-(o'~'o))
              .^      : . gGG"""YGG}. \   )   / /  _/-====-\\
             /       (. .gGP  __ ~~ . .\  \  (    (  _.---._)
            /        (. (GGb,,)GGp. . . \_-^-.__(_ /______./
           (          \ . `"!GGP^ . . . . ^=-._--_--^^^^^~)
           (        /^^^\_. . . . . . . . . . . . . . . . )
           )       /     /._. . . . . . . . . . . . . ._.=)
           \      /      |  ^"=.. . . . . . . ._++""\"^    \\
            \    |       |       )^|^^~'---'~^^      \     )
            )   /        )      /   \                 \    \\
            |`  |        \     /\    \                (    /
            |   |         (   (  \ . .\               |   (
            )   |         )   )   ^^^^^^              |   |
           /. . \         |  '|                       )   (
           ^^^^^^         )    \                      /. . \\
                          / . . \                     ^^^^^^
                          ^^^^^^^
''')

print('''
<h1>Welcome to Treasure Island?</h1>

Please Select options from the List and find your Trasure ?

''')

print(''' Select one direction from the Following?

1.Left  2.Right 3.Front 4.Back
''')

Ans = int(input())

if Ans == 1 :
    print("2. Do you Want Swim or Wait for the Treasure?")

    Ans = input().lower()

    if Ans == "wait":
        print('''3. There are three doors in front of you which door will you select?
        1. Red      2.Green     3.Yellow        4.Orange 
        ''')

        Ans = int(input().lower())

        if Ans == 1 or Ans == "Red":
            print("Wow You Found the Treasure")
        else :
            print("You are Out! Sorry! Try Again" + dog)

    else:
        print("You are Out! Sorry! Try Again" + dog)
    
else :
    print("You are Out! Sorry! Try Again" + dog)

