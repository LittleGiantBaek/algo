import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        // 최대 힙을 위한 PriorityQueue
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // 요소 추가
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(3);

        // 최대값 추출
        System.out.println(maxHeap.poll()); // 10
        System.out.println(maxHeap.poll()); // 5
        System.out.println(maxHeap.poll()); // 3
    }
}
