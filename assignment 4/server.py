# server 
import time
import socket
import struct

host = ''  # Listen on all available interfaces
port = 8000  # Reserve a port for the service

s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
s.bind((host, port))

print('Server started...')

while True:
    data, addr = s.recvfrom(1024)
    client_time = struct.unpack('!d', data)[0]
    server_time = time.time()

    response = struct.pack('!dd', server_time, client_time)
    s.sendto(response, addr)

    print(f'Client time: {time.ctime(client_time)}, Server time: {time.ctime(server_time)}')