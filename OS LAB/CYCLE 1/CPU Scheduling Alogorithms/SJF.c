/* Write C programs to simulate the following CPU Scheduling algorithms.
b) SJF */

#include<stdio.h>
int main() {
	int n,i,j,bt[20],p[20],wt[20],tat[20],total=0,pos,temp;
	float avg_wt,avg_tat;
	
	printf("Enter the Number of process: ");
	scanf("%d",&n);
	
	printf("\nEnter Burst Time : \n");
	for(i=0;i<n;i++) {
		printf("p%d:",i+1);
		scanf("%d",&bt[i]);
		p[i] = i+1;
	}
	
	//sorting Burst Time
	for(i=0;i<n;i++) {
		pos = i;
		for(j=i+1;j<n;j++) {
			if(bt[j] < bt[pos]) {
				pos = j;
			}
		}
		temp = bt[i];
		bt[i] = bt[pos];
		bt[pos] = temp;
		
		temp = p[i];
		p[i] = p[pos];
		p[pos] = temp;
	}
	
	wt[0]=0; //Waiting time
	
	for(i=0;i<n;i++) {
		wt[i] = 0;
		for(j=0;j<i;j++) {
			wt[i] += bt[j];
		}
		total += wt[i];
	}
	avg_wt = ((float)total)/n;
	total = 0;
	
	printf("\n--------------------------------------------------------\n");
	printf("Process   Burst Time   Waiting Time   Turnaround Time\n");
	printf("--------------------------------------------------------");
	
	for(i=0;i<n;i++) {
		tat[i] = bt[i] + wt[i]; //Turnaround Time
		total += tat[i];
		printf("\np%d\t\t%d\t\t%d\t\t%d",p[i],bt[i],wt[i],tat[i]);
	}
	
	avg_tat = ((float)total)/n;
	printf("\n\nAverage Waiting Time = %f",avg_wt);
	printf("\nAverage Turnaround Time = %f\n",avg_tat);
	return 0;
}
