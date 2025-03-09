import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Dq<Integer> dq = new Dq<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] temp = br.readLine().split(" ");
            Integer ans;
            switch (temp[0]){
                case "push_front":
                    dq.addFirst(Integer.valueOf(temp[1]));
                    break;
                case "push_back":
                    dq.addLast(Integer.valueOf(temp[1]));
                    break;
                case "pop_front":
                    ans = dq.removeFirst();
                    if(ans == null) System.out.println(-1);
                    else System.out.println(ans);
                    break;
                case "pop_back":
                    ans = dq.removeLast();
                    if(ans == null) System.out.println(-1);
                    else System.out.println(ans);
                    break;
                case "size":
                    System.out.println(dq.size());
                    break;
                case "empty":
                    if(dq.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "front":
                    ans = dq.peekFirst();
                    if(ans == null) System.out.println(-1);
                    else System.out.println(ans);
                    break;
                case "back":
                    ans=  dq.peekLast();
                    if(ans == null) System.out.println(-1);
                    else System.out.println(ans);
                default: break;
            }
        }



    }
}
class Dq<T> implements Deque<T> {

    private List<T> arr;
    public Dq(){
        arr = new LinkedList<>();
    }

    @Override
    public void addFirst(T t) {
        arr.add(0, t);
    }

    @Override
    public void addLast(T t) {
        arr.add(t);
    }

    @Override
    public boolean offerFirst(T t) {
        return false;
    }

    @Override
    public boolean offerLast(T t) {
        return false;
    }

    //pop_front
    @Override
    public T removeFirst() {
        if(arr.isEmpty()) return null;
        return arr.remove(0);
    }

    //pop_back
    @Override
    public T removeLast() {
        if(arr.isEmpty())return null;
        return arr.remove(arr.size()-1);
    }

    @Override
    public T pollFirst() {
        return null;
    }

    @Override
    public T pollLast() {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public T peekFirst() {

        if(arr.isEmpty()) return null;
        return arr.get(0);
    }

    @Override
    public T peekLast() {
        if(arr.isEmpty()) return null;
        return arr.get(size()-1);
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean offer(T t) {
        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void push(T t) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public boolean isEmpty() {
        if(arr.isEmpty()) return true;
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public Iterator<T> descendingIterator() {
        return null;
    }
}
