

// Write your Checker class here
class Checker implements Comparator<Player>{
    @Override
    public int compare(Player a , Player b) {
        
        if(a.score == b.score){  // if score is equal for both , [then sort according to lexicographically-order]
            int diff = (a.name).compareTo(b.name); // Sorting 2 string on the basis of lexicographically 
            return diff;
        }
        else{ // sort them in decreasing-order of score [which is an integer] 
            int diff = Integer.compare(b.score, a.score);
            return diff;
        }
  }
}
