def salvarPrincesa(n):
    if n>=3 and < 100:
        matriz = []
        pl=0
        pc=0
        ml=0
        mc=0
        AcharPrincessa=False
        for i in range(n):
            linha = input()
            matriz.append(tuple(linha))
            for j in range(n):
                if matriz[i][j]=="p":
                    pl=i
                    pc=j
                elif matriz[i][j]=="m":
                    ml=i
                    mc=j
        
            
        while AcharPrincessa==False:
            if ml>pl:
                ml=ml-1
                print("UP")
            if ml<pl:
                ml=ml+1
                print("DOWN")
            if mc<pc:
                mc=mc+1
                print("RIGHT")
            if mc>pc:
                mc=mc-1
                print("LEFT")
            if mc==pc and ml==pl:
                AcharPrincessa=True
    
            
             

salvarPrincesa(int(input()))
