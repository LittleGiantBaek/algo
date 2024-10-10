import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        // 기본적으로 PriorityQueue는 최소 힙으로 동작
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // 요소 추가
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(3);

        // 최소값 추출
        System.out.println(minHeap.poll()); // 3
        System.out.println(minHeap.poll()); // 5
        System.out.println(minHeap.poll()); // 10
    }
}
