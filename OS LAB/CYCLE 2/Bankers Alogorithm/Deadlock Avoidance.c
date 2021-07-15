// Write a C program to simulate Bankers Algorithm for Deadlock Avoidance and Prevention
// Deadlock Avoidance..

#include<stdio.h>
int main() {
	int i,j,k,p,r; // p -> processes, r -> resources
	
	printf("Enter the Number of Processes : ");
	scanf("%d",&p);
	
	printf("\nEnter the Number of Resources : ");
	scanf("%d",&r);
	
	int allocate[p][r], max[p][r], need[p][r], available[r];
	printf("\nEnter the Allocation Matrix : \n");
	for(i=0;i<p;i++) {
		for(j=0;j<r;j++) {
			scanf("%d",&allocate[i][j]);
		}
	}
	
	printf("\nEnter the Max Matrix : \n");
	for(i=0;i<p;i++) {
		for(j=0;j<r;j++) {
			scanf("%d",&max[i][j]);
		}
	}
	
	printf("\nEnter the Available Resourses : ");
	for(i=0;i<r;i++) {
		scanf("%d",&available[i]);
	}
	
	for(i=0;i<p;i++) {
		for(j=0;j<r;j++) {
			need[i][j] = max[i][j] - allocate[i][j];
		}
	}
	
	int f[p], res[p], index = 0;
	for(i=0;i<p;i++) {
		f[i] = 0;
	}
	int x=0;
	for(k=0;k<p;k++) {
		for(i=0;i<p;i++) {
			if(f[i] == 0) {
				int temp = 0;
				for(j=0;j<r;j++) {
					if(need[i][j] > available[j]) {
						temp = 1;
						break;
					}
				}
				if(temp == 0) {
					res[index++] = i;
					for(x=0;x<r;x++) {
						available[x] = available[x] + allocate[i][x];
					}
					f[i] = 1;
				}
			}
		}
	}
	
	printf("\nSafe sequence : ");
	for(i=0;i<p;i++) {
		printf("p%d, ",res[i]);
	}
	return 0;
}
