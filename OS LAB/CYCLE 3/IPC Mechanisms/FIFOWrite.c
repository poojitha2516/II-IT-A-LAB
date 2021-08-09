/* Write C programs to illustrate the following IPC mechanisms
a) Pipes b) FIFOs c) Message Queues d) Shared Memory */

// b) FIFO 
// reads first and then writes

#include<stdio.h>
#include<string.h>
#include<fcntl.h>
#include<sys/stat.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
	int fd1;
	char *myfifo = "/tmp/myfifo";  //FIFO file path
	
	// creating named file FIFO
	mkfifo(myfifo,0666);
	
	char str1[80],str2[80];
	
	while(1) {
		fd1 = open(myfifo,O_RDONLY); // first open in read only then read
		read(fd1,str1,80);
		printf("User1: %s\n",str1);  // read string and close
		close(fd1);
		
		fd1 = open(myfifo,O_WRONLY); // now open in write mode and write string taken from user
		fgets(str2,80,stdin);
		write(fd1,str2,strlen(str2)+1);
		close(fd1);
	}
	return 0;
}
