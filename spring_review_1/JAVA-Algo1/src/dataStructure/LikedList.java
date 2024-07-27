package dataStructure;

public class LikedList {

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(1);

        node1.next = node2;
        Node head = node1;

        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);
        MyLinkedList.delNode(3);
        MyLinkedList.delNode(20);

        // MyLinkedList.printAll();

        DoubleLinkedList<Integer> MylinkedList2 = new DoubleLinkedList<Integer>();
        MylinkedList2.addNode(2);
        MylinkedList2.addNode(4);
        MylinkedList2.addNode(5);
        MylinkedList2.addNode(6);

        MylinkedList2.printAll();

    }
    public static class Node<T>{
        T data;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public static class SingleLinkedList<T>{
        public Node<T> head = null;

        public class Node<T>{
            T data;
            Node<T> next = null;
            public Node(T data){
                this.data = data;
            }
        }
        public void addNode(T data){
            if(head == null){
                head = new Node<T>(data);
            } else {
                Node<T> node = this.head;
                while(node.next != null){
                    node = node.next;
                }
                node.next = new Node<T>(data);
            }
        }
        public void printAll(){
            if(head != null){
                Node<T> node = this.head;
                System.out.println(node.data);
                while(node.next != null){
                    node = node.next;
                    System.out.println(node.data);
                }
            }
        }
        public Node<T>search(T data){
            if(this.head == null){
                return null;
            } else {
                Node<T> node = this.head;
                while(node != null){
                    if(node.data == data){
                        return node;
                    } else {
                        node = node.next;
                    }
                }
                return null;
            }
        }
        public void addNodeInside(T data, T isData){
            Node<T> searchedNode = this.search(isData);

            if(searchedNode == null){
                this.addNode(data);
            } else {
                Node<T> nextNode = searchedNode.next;
                searchedNode.next = new Node<T>(data);
                searchedNode.next.next = nextNode;

            }
        }
        public Boolean delNode(T isData){
            if(this.head == null){
                return false;
            } else {
                Node<T> node = this.head;
                if(node.data == isData){
                    this.head = this.head.next;
                    return true;
                } else {
                    while(node.next != null){
                        if(node.next.data == isData){
                            node.next = node.next.next;
                            return true;
                        }
                        node = node.next;
                    }

                    return false;
                }
            }
        }
    }
    public static class DoubleLinkedList<T> {
        public Node<T> head = null;
        public Node<T> tail = null;
        public class Node<T> {
            T data;
            Node<T> prev = null;
            Node<T> next = null;
            public Node(T data) {
                this.data = data;
            }
        }

        public void addNode(T data) {
            if (this.head == null) {
                this.head = new Node<T>(data);
                this.tail = this.head;
            } else {
                Node<T> node = this.head;
                while (node.next != null) {
                    node = node.next;
                }

                node.next = new Node<T>(data);
                node.next.prev = node;
                this.tail = node.next;

            }
        }

        public void printAll() {
            if (this.head != null) {
                Node<T> node = this.head;
                System.out.println(node.data);
                while (node.next != null) {
                    node = node.next;
                    System.out.println(node.data);
                }
            }
        }

        public T searchFromHead(T isData) {
            if (this.head == null) {
                return null;
            } else {
                Node<T> node = this.head;
                while (node != null) {
                    if (node.data == isData) {
                        return node.data;
                    } else {
                        node = node.next;
                    }
                }
                return null;
            }
        }


        public T searchFromTail(T isData) {
            if (this.head == null) {
                return null;
            } else {
                Node<T> node = this.tail;
                while(node != null){
                    if(node.data == isData){
                        return node.data;
                    } else {
                        node = node.prev;
                    }
                }
            }
            return null;

        }

        public boolean insertToFront(T existedData, T addData){
            if(this.head == null){
                this.head = new Node<T>(addData);
                this.tail = this.head;
                return true;
            } else if (this.head.data == existedData){
                Node<T> newHead = new Node<T>(addData);
                newHead.next = this.head;
                this.head = newHead;
                return true;
            } else {
                Node<T> node = this.head;
                while (node != null) {
                    if(node.data == existedData){
                        Node<T> nodePrev = node.prev;

                        nodePrev.next = new Node<T>(addData);
                        nodePrev.next.next = node;

                        nodePrev.next.prev = nodePrev;
                        node.prev = nodePrev.next;
                        return true;
                    } else {
                        node = node.next;
                    }
                }
                return false;
            }
        }
    }
}



