if __name__ == '__main__':
    list = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
    list.append([name, score])
    list.sort(key=lambda x: x[1])
    list.remove(min(list,key=lambda x:x[1]))
    minimum = min(list,key=lambda x:x[1])
    a=[]
    minimum = minimum[1]
    for i  in list:
        if(i[1] == minimum):
            a.append(i[0])
    a.sort()
    for n in a:
        n[1:] = sorted(n[1:], reverse=True)
    for i in a:
        print(i)
