/* Write programs using the I/O system calls of UNIX/LINUX operating system
(open, read, write, close, fcntl, seek, stat, opendir, readdir) */

// Program using opendir(), closedir(), readdir()

#include<stdio.h>
#include<fcntl.h>
#include<dirent.h>
 int main() {
	 char d[10];
	 DIR *e;
	 struct dirent *sd;
	 printf("Enter dir name to open : ");
	 scanf("%s",d);
	 e = opendir(d);
	 if(e == NULL) {
		 printf("dir does not exist..");
	 }
	 else {
		 printf("dir exist..\n");
		 while((sd=readdir(e)) != NULL) {
			 printf("%s\t",sd->d_name);
		 }
	 }
	 closedir(e);
}

