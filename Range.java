import java.util.NoSuchElementException;
import java.lang.IllegalArgumentException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start, int end){
    this.start = start;
    this.end = end;
    this.current = start;
    if (start > end) {
      throw new IllegalArgumentException("Starting value must be less than or equal to end");
    }
  }
  public void reset(){
    current = start;
  }
  public int length(){
    return (end-start+1);
  }
  public boolean hasNext(){
    return current <= end;
  }

  //@throws NoSuchElementException
  public int next(){
    if (! hasNext()) {
      throw new NoSuchElementException();
    }
    else{
      current=current+1;
    }
    return current-1;
  }
}
