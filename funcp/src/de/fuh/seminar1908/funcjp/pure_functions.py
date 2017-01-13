import threading
from threading import Thread

def run():
    threading.current_thread().name = 'Nope, er gehört mir'
    print(threading.current_thread())

thread = Thread(name='Mein Thread', target=run)
thread.start()