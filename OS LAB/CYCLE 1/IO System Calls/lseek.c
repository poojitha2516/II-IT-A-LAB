/* Write programs using the I/O system calls of UNIX/LINUX operating system (open, read,
write, close, fcntl, seek, stat, opendir, readdir) */

// Program using lseek

#include<sys/types.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<unistd.h>

int main() {
	int f;
	char buf[10];
	f=open("seek.txt",O_RDWR);
	read(f,buf,10);
	write(1,buf,10);
	read(f,buf,10);
	write(1,buf,10);
}


// seek.txt
// Hello ! This is Poojitha....
