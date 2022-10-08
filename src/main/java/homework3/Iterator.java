package homework3;
public class Iterator implements Iterable<Integer>{
    private int N;

    public Iterator(int n) {
        this.N = n;
    }

    @Override
    public java.util.Iterator<Integer> iterator() {
        return new java.util.Iterator<Integer>() {
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < N;
            }

            @Override
            public Integer next() {
                int a = (int) (Math.random() * 100);
                counter++;
                return a;
            }
        };}

    public static void main(String[] args) {
        Iterator iteratorrandom=new Iterator(10);
        for (Integer integer:iteratorrandom){
            System.out.println(integer);
            
        }

    }
}

//2. Для класса Peroson, рассмотренного на уроке написать миниму три реализации интерфейса Comparable,
// которые будут сортровать набор экземпляров класса Person по разным наборам полей



