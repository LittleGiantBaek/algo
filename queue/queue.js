/**
 * JavaScript에서 Array를 큐처럼 사용하게 되면 shift() 메서드를 호출할 때마다 내부적으로 배열의 요소들이 앞으로 재정렬되는 과정이 발생
 * 큐의 특성상 많은 shift() 연산이 있을 경우 성능 저하가 발생가능성 존재.
 */
class Queue {
    constructor() {
        this.items = {};
        this.head = 0;
        this.tail = 0;
    }

    add(element) {
        this.items[this.tail] = element;
        this.tail++;
    }

    poll() {
        if (this.isEmpty()) {
            return undefined;
        }

        const item = this.items[this.head];
        delete this.items[this.head];
        this.head++;
        return item;
    }

    isEmpty() {
        return this.tail === this.head;
    }

    size() {
        return this.tail - this.head;
    }

    peek() {
        return this.isEmpty() ? undefined : this.items[this.head];
    }
}
