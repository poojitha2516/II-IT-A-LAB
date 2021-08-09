/* Write C programs to illustrate the following IPC mechanisms
a) Pipes b) FIFOs c) Message Queues d) Shared Memory */

// b) FIFO
// writes first then reads

#include<stdio.h>
#include<string.h>
#include<fcntl.h>
#include<sys/stat.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
	int fd;
	char * myfifo = "/tmp/myfifo";  // FIFO file path
	
	// creating named file FIFO
	mkfifo(myfifo,0666);
	
	char arr1[80],arr2[80];
	while(1) {
		fd = open(myfifo,O_WRONLY); // open FIFO for write only
		
		// takes input 
		fgets(arr2,80,stdin);
		
		//write the input on FIFO and close it
		write(fd,arr2,strlen(arr2)+1);
		close(fd);
		
		fd = open(myfifo,O_RDONLY);
		read(fd,arr1,sizeof(arr1)); // read from FIFO
		printf("User2: %s\n",arr1);
		close(fd);
		
	}

	return 0;
}
