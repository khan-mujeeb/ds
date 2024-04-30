import mpi.MPI;

import java.util.Scanner;

import mpi.*;


class ArrSum {
	public static void main(String args[]) {
		MPI.Init(args);
		
		int rank = MPI.COMM_WORLD.Rank();
		int size = MPI.COMM_WORLD.Size();
		
		int unitsize = 5;
		int root = 0;
		
		int send_buffer[] = new int [unitsize*size];
		int recieve_buffer[] = new int[unitsize];
		int new_recieve_buffer[] = new int[size];
		
		
		if(rank == root) {
			int total_element = unitsize * size;
			System.out.println("Enter " + total_element + " element");
			
			for(int i=0; i<total_element; i++) {
			
				System.out.println("Element " + i + "\t" + i);
				send_buffer[i] = i;
				
				
			}
			
			
		}
		
		
		MPI.COMM_WORLD.Scatter(
		
			send_buffer,
			0, unitsize, MPI.INT,
			recieve_buffer, 0, unitsize, MPI.INT, root
		
		);
		
		for(int i=0; i<unitsize; i++) {
			recieve_buffer[0] += recieve_buffer[i];
		}
		
		System.out.println("intermidiate sum at process " + rank + " is " + recieve_buffer[0]);
		
		
		
		
		
		
		MPI.COMM_WORLD.Gather(
		
			recieve_buffer, 0, 1, MPI.INT,
			new_recieve_buffer, 0, 1, MPI.INT,
			root
		);
		
		
		if(rank==root) {
		
			int sum = 0;
			for(int i=0; i<size; i++) {
				sum+= new_recieve_buffer[i];
			
			}
			System.out.println("final output" + sum);
		}
		
		
		
		MPI.Finalize();		
		
		
	}
}
