from threading import Thread

def count(name, until):
    print('Zähle ', name)
    for i in range(1, until+1):
        print(i)

thread = Thread(target=count, args=('Schafe',), kwargs={'until': 3})
thread.start()

'''
Zähle  Schafe
1
2
3
'''