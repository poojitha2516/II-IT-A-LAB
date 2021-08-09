/* Write C programs to illustrate the following IPC mechanisms
a) Pipes b) FIFOs c) Message Queues d) Shared Memory */

// c) Message Queues
//   Writer Process

#include<stdio.h>
#include<sys/ipc.h>
#include<sys/msg.h>

// Structure for message queue
struct msg_buffer {
	long msg_type;
	char msg_text[100];
}message;

int main() {
	key_t key;
	int msg_id;
	key = ftok("progfile",65);  //ftok to generate unique key
	msg_id = msgget(key,0666 | IPC_CREAT); //creates a message queue and returns identifier 
	message.msg_type = 1;
	
	printf("Write Data : ");
	gets(message.msg_text);
	
	msgsnd(msg_id,&message,sizeof(message),0); // to send message
	
	printf("Data send is : %s\n",message.msg_text); // display message
	return 0;
}
