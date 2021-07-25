/* Write programs using the I/O system calls of UNIX/LINUX operating system
1.open 
2.read
3.write
4.close */

#include<stdio.h>
#include<sys/stat.h>
#include<sys/types.h>
#include<fcntl.h>

int main() {
	int i=0,i1,i2;
	char ch,name[20];
	
	// Opening the file 
	// To open the file : open(file, flags[, mode]);
	i1 = open("IO.txt",O_RDWR | O_CREAT | O_TRUNC);
	
	printf("Writing the text into the file..");
	printf("\nEnter your name : ");
	while((ch = getchar()) != '\n') {
		name[i++] = ch;
	}
	name[i] = '\0';
	
	// Writing into the file
	// To Write : write(fd, str);
	write(i1,name,i);
	
	//closing the file 1..
	close(i1);
	
	// Reading the file 
	// To Read : read(fd, n);
	i2 = open("IO.txt",O_RDONLY);
	read(i2,name,i);
	printf("---------------------------------");
	printf("\nReading the txt from the file..");
	printf("\n%s\n",name);
	
	// closing the file 2..
	close(i2);
	return 0;
}
