/* Write C programs to illustrate the following IPC mechanisms
a) Pipes b) FIFOs c) Message Queues d) Shared Memory */

// c) Message Queues
//   Reader Process

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
	msgrcv(msg_id,&message,sizeof(message),1,0); // to receive message
	
	printf("Data received is %s/n",message.msg_text); // display message
	msgctl(msg_id,IPC_RMID,NULL); // to destroy the message queue
	return 0;
}


