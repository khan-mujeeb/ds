# client

import time
import socket
import struct

host = 'localhost'  # Server IP or hostname
port = 8000

s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

client_time = time.time()
data = struct.pack('!d', client_time)
s.sendto(data, (host, port))

response, addr = s.recvfrom(1024)
server_time, client_time = struct.unpack('!dd', response)

delay = (server_time - client_time)
synchronized_time = server_time + delay
print(f'Estimated time delay: {delay}')
print(f'Actual time : {time.ctime(client_time)}')
print(f'Synchronized time: {time.ctime(synchronized_time)}')