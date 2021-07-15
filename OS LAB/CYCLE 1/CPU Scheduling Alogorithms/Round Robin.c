/* Write C programs to simulate the following CPU Scheduling algorithms.
c) Round Robin */ 

#include<stdio.h>
int main() {
	int i,n,x,tq,at[10],bt[10],temp[10];
	int total = 0,count = 0,wt = 0,tat = 0;
	float avg_wt,avg_tat;
	
	printf("Enter the Number of process: ");
	scanf("%d",&n);
	x = n;
	
	for(i=0;i<n;i++) {
		printf("\nEnter the Details of the Process%d\n",i+1);
		printf("Arrival Time : ");
		scanf("%d",&at[i]);
		printf("Burst Time : ");
		scanf("%d",&bt[i]);
		temp[i] = bt[i];
	}
	
	printf("\nEnter the Time quantum :");
	scanf("%d",&tq);
	
	printf("\n--------------------------------------------------------\n");
	printf("Process   Burst Time   Waiting Time   Turnaround Time\n");
	printf("--------------------------------------------------------");
	
	for(total = 0,i = 0; x != 0;) {
		if(temp[i] <= tq && temp[i] > 0) {
			total = total + temp[i];
			temp[i] = 0;
			count = 1;
		}
		else if(temp[i] > 0) {
			temp[i] = temp[i] - tq;
			total = total + tq;
		}
		
		if(temp[i] == 0 && count == 1) {
			x--;
			printf("\np%d\t\t%d\t\t%d\t\t%d",i+1,bt[i],total-at[i],total-at[i]-bt[i]);
			wt = wt + total - at[i] - bt[i];
			tat = tat + total - at[i];
			count = 0;
		}
		
		if(i == n - 1) {
			i = 0;
		}
		else if(at[i+1] <= total) {
			i++;
		}
		else {
			i = 0;
		}
	}
	
	avg_wt = ((float)wt)/n;
	avg_tat = ((float)tat)/n;
	printf("\n\nAverage Waiting Time = %f",avg_wt);
	printf("\nAverage Turnaround Time = %f\n",avg_tat);
	
	return 0;
}
