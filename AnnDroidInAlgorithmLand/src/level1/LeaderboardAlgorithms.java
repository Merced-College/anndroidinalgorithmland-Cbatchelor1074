// Chase Batchelor, Xandra Leal, Matthew Briones
// March 31, 2026
// CPSC-39-12106

package level1;

import java.util.ArrayList;

/**
 * STUDENT TODO FILE
 *
 * You will implement sorting and binary search for the Leaderboard Terminal.
 */
public class LeaderboardAlgorithms {

    /**
     * TODO: Sort the list by score DESCENDING (highest score first).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     * - You may use Collections.sort + Comparator for the first version.
     * - Week 8 challenge/extra credit: replace with merge sort or quicksort.
     */
    public static void sortByScoreDescending(ArrayList<ScoreEntry> list) {
        int n = list.size();
        
        // Iteration
        for (int i = 0; i < n - 1; i++) {
        	int min = i;
        	
        	for (int j = i + 1; j < n; j++) {
        		if (list.get(j).getScore() > list.get(min).getScore()) {
        			// Sets j as new smallest index.
        			min = j;
        		}
        	}
        	
        	// Swaps first value to the value at i to finish sorting
        	ScoreEntry temp = list.get(i);
        	list.set(i,  list.get(min));
        	list.set(min, temp);
        }
    }

    /**
     * TODO: Sort the list by username ASCENDING (A -> Z).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     */
    public static void sortByUsernameAscending(ArrayList<ScoreEntry> list) {
        int n = list.size();
        
        for (int i = 0; i < n - 1; i++) {
        	int minIndex = i;
        	
        	for (int j = i + 1; j < n; j++) {
        		if (list.get(j).getUsername().compareTo(list.get(minIndex).getUsername()) < 0) {
        			minIndex = j;
        		}
        	}
        	
        	ScoreEntry temp = list.get(i);
        	list.set(i, list.get(minIndex));
        	list.set(minIndex, temp);
        }
    }

    /**
     * TODO: Binary search for an EXACT username match.
     *
     * Precondition: list must already be sorted by username ascending!
     *
     * @return index of the matching entry, or -1 if not found
     */
    public static int binarySearchByUsername(ArrayList<ScoreEntry> list, String username) {
        int low = 0;
        int high = list.size() - 1;
        
        while (low <= high) {
        	int mid = (low + high) / 2;
        	String midUsername = list.get(mid).getUsername();
        	
        	int comparison = username.compareTo(midUsername);
        	
        	if (comparison == 0) {
        		return mid;
        	} else if (comparison < 0) {
        		high = mid - 1;
        	} else {
        		low = mid + 1;
        	}
        }
        
        return -1;
    }
    
    
    //EXTRA CREDIT: Quicksort implementation
    public static void quickSortByDescending(ArrayList<ScoreEntry> list, int low, int high) {
    	if (low < high) {
    		int pivotIndex = partition(list, low, high);
    		
    		quickSortByDescending(list, low, pivotIndex - 1);
    		quickSortByDescending(list, pivotIndex + 1; high);
    	}
    }
    
    private static int partition(ArrayList<ScoreEntry> list, int low, int high) {
    	ScoreEntry pivot = list.get(high);
    	int i = low - i;
    	
    	for (int j = low; j < high; j++) {
    		if (list.get(j).getScore() >= pivot.getScore()) {
    			i++;
    			
    			ScoreEntry temp = list.get(i);
    			list.set(i,  list.get(j));
    			list.set(j, temp);
    		}
    	}
    	
    	ScoreEntry temp = list.get(i + 1);
    	list.set(i + 1, list.get(high));
    	list.set(high, temp);
    	
    	return i + 1;
    	
    }
}
