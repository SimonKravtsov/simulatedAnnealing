package simulated.anealing;


/**
 *
 * @author Simon
 */

public class Main {
    public static void main(String[] args){
        //reading dataset file 
        FileReading read=new FileReading();
        read.file("final_test4"); // INPUT THE NAME OF THE FILE THAT NEEDS TO BE RUN
        //data files: 
            //test_set1.txt
            //test_set2.txt
            //test_set3.txt
            //test_set2new.txt
            //test_set3new.txt
            
            
        //starts time of program 
        final double startTime = System.nanoTime();
        Simulation simulation =new Simulation();
        simulation.simulateTravillingProblem();
        final double endTime = System.nanoTime();//end time of program 
        //out time taken for program to compleat 
       System.out.println("Total execution time: " + (endTime - startTime)/1000000000.0 +" Seconds");
       
       
    }
    
}
