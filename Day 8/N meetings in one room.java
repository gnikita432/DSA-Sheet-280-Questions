// N meetings in one room - https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1

//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends



// --------------------------------Start Here------------------------------------

public class Meetings{
    int start;
    int end;
    
    Meetings(int start , int end){
        this.start = start;
        this.end = end;
    }
}

class MeetingsComparator implements Comparator<Meetings>{
    @Override
    public int compare(Meetings first , Meetings second){
        if(first.end < second.end) return -1;
        else return 1;
    }
}

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        List <Meetings> meet = new ArrayList<>();
        for(int i=0; i<end.length; i++){
            meet.add(new Meetings(start[i] , end[i]));
        }
        
        MeetingsComparator mc = new MeetingsComparator();
        
        Collections.sort(meet, mc);
        
       int count = 1;
       
        int limit = meet.get(0).end; 
        
        for(int i = 1;i<start.length;i++) {
            if(meet.get(i).start > limit) {
                limit = meet.get(i).end; 
               count++;
            }
        }
        
        return count;
    }
}

// Time Complexity : O(N*LogN)
// Auxilliary Space : O(N)
