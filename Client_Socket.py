#%%
# 서버에 접속, 데이터 송수신
# 서버는 클라이언트 접속 대기 상태로 존재 해야함
# 서버는 특정 클라이언트 간의 통신 중개 역할
#%% md

#%%
import pickle
class ChatMsg:
    def __init__(self, contents, to=None, frm=None, attach=None):
        self.contents = contents
        self.to = to
        self.frm = frm
        self.attach = attach

    def __str__(self):
        return "contents={}, frm={}, to={}".format(self.contents, self.to, self.frm)

#%%
from socket import *
import pickle
import time
from chat import ChatMsg
import threading

#%%
from socket import *
import pickle
import time
import threading
from chat import ChatMsg

class SendThread(threading.Thread):
    def __init__(self, soc):
        threading.Thread.__init__(self)
        self.soc = soc
    def run(self):
        while True:
            sMsg = input('입력: ')        # 3/hello
            in_list = sMsg.split('/')    # ['3', 'hello']
            chatmsg = None
            if len(in_list)==1:          # 모두에게 보내는 메시지
                chatmsg=ChatMsg(sMsg)
            elif len(in_list)==2:
                n, msg = in_list
                chaatmsg = ChatMsg(msg, to=int(n))
            self.soc.send(pickle.dumps(chatmsg))
#%%
clientSock = socket(AF_INET, SOCK_STREAM)  # 소켓 생성
clientSock.connect(('192.168.0.178', 1124))    # 서버에 접속

SendThread(clientSock).start()

while True:
    msg = clientSock.recv(1024)
    print(pickle.loads(msg))

print('클라이언트 종료...')
#%%


#%%
