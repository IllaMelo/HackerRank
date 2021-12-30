
n = int(input())
r,c = [int(i) for i in input().strip().split()]
matriz= []
pl=pc=0
  
for i in range(n):
        linha = input()
        matriz.append(tuple(linha))
        for j in range(n):
            matriz[r][c]="m"
            if matriz[i][j]=="p":
                pl=i
                pc=j
    
        if r>pl:
            r=r-1
            print("UP")
        elif r<pl:
            r=r+1
            print("DOWN")
        elif c<pc:
            c=c+1
            print("RIGHT")
        elif c>pc:
            c=c-1
            print("LEFT")
        
                


