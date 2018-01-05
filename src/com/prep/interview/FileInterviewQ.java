package com.prep.interview;

import java.util.PriorityQueue;

/**
 * Given a list of files arrange the lines in chronological order
 * 
 * @author tnaqvi
 * @date Dec 8, 2017
 */
public class FileInterviewQ {
    /**
     * 16:12 Coding
     * S: Question for file
     * T:Can i create a buffer and use it ?
     * S:No space is limited (Actually this should be the hint to move to PQ..right there but missed it )
     * T:I can use recusrion to compare the 2 files and move the pointer?
     * S: The timestamps are sorted so in File 1: 12:00 ,12:05 File 2: 11:00,2:00
     * T: If they are sorted , I can still use recusrion comapre the firstline of f1 and discard if its less than f2 than f2 and f3 ...n
     * S:No these files have all pointers pointing at them and there is a getLine method that returns a line and advances the pointer
     * T: I can keep it in a PriorityQueue 
     * S: No response
     * T:Starts writing code using File I/O .
     * S: The getLine() method id already doing that , assume there is a init call that handles all this
     * T:Class Implements Iterator
     * S:You can use the hasMoreLines() to advnace the pointer
     * T: I am getting thrown off by the File fact since I am imagining it to be a huge dataset
     * Mumbles and thinks using LinkedList as the pointers , but then stumbles upon a Sorted file with min heap solution
     * S: Agrees as an accepted solution
     * T: Still not sure what to write 
     * S: Write init method
     * T: Not sure yet. Will haunt me
     * S: Are you out of gas or want to continue .
     * T: yes continue 
     * T: asks Question about working style and ends the call
     * 
     */
    
   
    
    
    /**
     * function foo(items) {
  var i;
  for (i = 0; i < items.length; i++) {
    alert("Welcome To HireOn " + items[i]);
  }
}


interface LogIterator {
    boolean hasMoreLines();
    LogLine getNextLine();
}


class LogIteratorImpl implements LogIterator{
   init() {
       List<File> files;
       for (File file : files ) {
        //read first line from file
        // add line to heap
       }
       heapify();
   }

    LogLine getNextLine() {
        // get first thing from heap
    }
    
    boolean hasMoreLines(){
        //f.getLine()==-1
    }
    
//Init the PriorityQueue pq = new PQ();

pq.add(file.getLine());
heapify()
return q.getElement(0);
    
    LogLine getNextLine(){
        Queue q = new LinkedList();
        q.add(file.getLine());
        if(file2.getLine()<q.poll()){
            q.remove();
            q.add(file2.getLine());
            
        }
    }
}
}

File 1
12:00 - abc
12:05 - xyq

file 2
11:00 - gef
2:00 - fqn

file 3

file 4...

// this would be the "system call" to grab a line from a file
// assume this returns a LogLine that can be compared with other LogLines
file.getLine() // this returns the line and also advances the filehandle
     * 
     * 
     * 
     */

}
