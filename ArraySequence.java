import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  public ArraySequence(int[] other) {
    currentIndex = 0;
    data = new int[other.length];
    for (int i=0; i<other.length;i++) {
      data[i] = other[i];
    }
  }

  public ArraySequence (IntegerSequence sequence) {
    currentIndex=0;
    data = new int[sequence.length()];
    int i=0;
    sequence.reset();
    while (sequence.hasNext()){
      data[i]=sequence.next();
      i++;
    }
    sequence.reset();
  }
  public void reset() {
    currentIndex = 0;
  }
  public int length(){
    return data.length;
  }
  public boolean hasNext(){
    return currentIndex<data.length;
  }
  public int next(){
    if (! hasNext()) {
     throw new NoSuchElementException();
   }
   else{
     currentIndex=currentIndex+1;
   }
   return data[currentIndex-1];
   }
 }
