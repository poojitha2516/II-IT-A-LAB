/* Write C programs to illustrate the following IPC mechanisms
a) Pipes b) FIFOs c) Message Queues d) Shared Memory */

// a) Pipes :

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#define MSGSIZE 100

char* msg1 = "Hello ! This is Poojitha";
char* msg2 = "19WH1A1230";
char* msg3 = "BVRIT HYDERABAD";

int main() {
	char inbuf[MSGSIZE];
	int p[2],pid,nbytes;
	
	if(pipe(p) < 0) {
		exit(1);
	}
	
	if((pid == fork()) > 0) {
		write(p[1],msg1,MSGSIZE);
		write(p[1],msg2,MSGSIZE);
		write(p[1],msg3,MSGSIZE);
		close(p[1]);
	    wait(NULL);
	}
	else {
		close(p[1]);
		while((nbytes = read(p[0],inbuf,MSGSIZE)) > 0) {
			printf("%s\n",inbuf);
		}
		
		if(nbytes != 0) {
			exit(2);
		}
		printf("\nFinished Reading !! \n");
	}
	return 0;
	
}
