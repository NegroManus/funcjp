from threading import Thread
import threading


def run():
    # Ich laufe in  <Thread(Thread-1, started 10024)>
    print('Ich laufe in ', threading.current_thread())

thread = Thread(target=run)
thread.start()

thread = Thread(
    target=lambda: print('Ich laufe in ', threading.current_thread()))
thread.start()
