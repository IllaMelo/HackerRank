def bot_clean():
    matriz=[]
    count = 0
    for i in range(5):
        line = input()
        for j in line:
            count +=1
            if count <=5:
                matriz.append(tuple(line))
            else:
                break
    return matriz
    
    
    
bot_clean()
