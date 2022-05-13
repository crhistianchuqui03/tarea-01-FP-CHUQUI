import math
signo=str(input("introdusca el signo"))
if(signo=="p"or signo=="P"or signo=="%"):
  raizModulo=int(input("introdusca el numero:"))
else:
  num1=int(input("introdusca el numero 1:"))
  num2=int(input("introdusca el numero 2:"))
if(signo=="*"):
  resultado=num1*num2
  print("La multiplicacion es:",resultado )
elif(signo=="+"):
  resultado=num1+num2
  print("La suma es:",resultado )
elif(signo=="-"):
  resultado=num1-num2
  print("La resta es:",resultado )
elif(signo=="/"):
  resultado=num1/num2
  print("La division es:",resultado )
elif(signo=="^"):
  resultado=num1**num2
  print("La division es:",resultado )
elif(signo=="%"):
  resultado=num1**num2
  print("La division es:",resultado )
elif(signo=="p"or signo=="P"):
  resultado=math.sqrt(raizModulo)
  print("La raiz cuadrada es:",resultado )
elif(signo=="%"):
  resultado=raizModulo%2
  print("El Modulo es:",resultado )
   
else:
  print("INVALIDO")