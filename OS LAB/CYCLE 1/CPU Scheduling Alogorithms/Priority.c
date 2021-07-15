/* Write C programs to simulate the following CPU Scheduling algorithms.
d) Priority */ 

#include<stdio.h>
int main() {
	int n,i,j,k,bt[20],p[20],wt[20],tat[20],pri[20],total=0,temp;
	float avg_wt,avg_tat;
	
	printf("Enter the Number of process: ");
	scanf("%d",&n);
	
	printf("\nEnter Burst Time : \n");
	for(i=0;i<n;i++) {
		printf("p%d:",i+1);
		scanf("%d",&bt[i]);
		p[i] = i+1;
	}
	
	printf("\nEnter the Priority order : \n");
	for(i=0;i<n;i++) {
		p[i] = i;
		printf("p%d:",i+1);
		scanf("%d",&pri[i]);
	}
	
	for(i=0;i<n;i++) {
		for(k=i+1;k<n;k++) {
			if(pri[i] > pri[k]) {
				temp = p[i];
				p[i] = p[k];
				p[k] = temp;
				
				temp = bt[i];
				bt[i] = bt[k];
				bt[k] = temp;
				
				temp = pri[i];
				pri[i] = pri[k];
				pri[k] = temp;
			}
		}
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

