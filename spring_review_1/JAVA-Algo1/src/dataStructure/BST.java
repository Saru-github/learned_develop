package dataStructure;

public class BST {

    public static void main(String[] args) {
        NodeMgmt myTree = new NodeMgmt();
        myTree.insertNode(2);
        myTree.insertNode(3);
        myTree.insertNode(4);
        myTree.insertNode(5);


    }

    public static class NodeMgmt {
        Node head = null;

        public class Node {
            Node left;
            Node right;
            int value;

            public Node(int data) {
                this.value = data;
                this.left = null;
                this.right = null;
            }
        }

        public boolean insertNode(int data) {
            // CASE1: Node가 하나도 없을 때
            if (this.head == null) {
                this.head = new Node(data);
            } else {
                // CASE2: Node 가 하나이상 들어가 있을때
                Node findNode = this.head;
                while (true) {
                    //CASE2-1: 현재 Node의 왼쪽에 Node 가 들어가야 할 때
                    if (data < findNode.value) {
                        if (findNode.left != null) {
                            findNode = findNode.left;
                        } else {
                            findNode.left = new Node(data);
                            break;
                        }
                        //CASE2-2: 현재 Node의 오른쪽에 Node가 들어가야 할 때
                    } else {
                        if (findNode.right != null) {
                            findNode = findNode.right;
                        } else {
                            findNode.right = new Node(data);
                            break;
                        }
                    }
                }

            }
            return true;
        }

        public Node Search(int data) {
            // CASE : Node 가 하나도 없을 때
            if (this.head == null) {
                return null;
                // CASE2 : Node 가 하나 이상 있을 때
            } else {
                Node findNode = this.head;
                while (findNode != null) {
                    if (findNode.value == data) {
                        return findNode;
                    } else if (data < findNode.value) {
                        findNode = findNode.left;
                    } else {
                        findNode = findNode.right;
                    }
                }

                return null;
            }

        }

        public boolean delete(int value) {
            boolean searched = false;

            Node currParentNode = this.head;
            Node currNode = this.head;

            // 코너 케이스1: Node가 하나도 없을 때
            if (this.head == null) {
                return false;

                // 코너 케이스2: Node가 단지 하나만 있고, 해당 Node 가 삭제할 Node 일 때
            } else {
                if (this.head.value == value && this.head.left == null && this.head.right == null) {
                    this.head = null;
                    return true;
                }
            }

            while (currNode != null) {
                if (currNode.value == value) {
                    searched = true;
                    break;
                } else if (value < currNode.value) {
                    currParentNode = currNode;
                    currNode = currNode.left;
                } else {
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }

            if (searched == false) {
                return false;
            }

            //여기까지 실행되면,
            // currNode 에는 해당 데이터를 가지고 있는 Node,
            // currParentNode 에는 해당 데이터를 가지고 있는  Node 의 부모 Node

            // Case1: 삭제할 Node 가 leaf Node인 경우
            if (currNode.left == null && currNode.right == null) {
                if (value < currParentNode.value) {
                    currParentNode.left = null;
                    currNode = null;
                } else {
                    currParentNode.right = null;
                    currNode = null;
                }
                // Case2-1: 삭제할 Node가 Child Node를 한개 가지고 있을경우 (왼쪽)
            } else if (currNode.left != null && currNode.right == null) {
                if (value < currParentNode.value) {
                    currParentNode.left = currNode.left;
                    currNode = null;
                } else {
                    currParentNode.right = currNode.left;
                    currNode = null;
                }
                return true;

                // Case2-2: 삭제할 Node가 Child Node를 한개 가지고 있을경우 (오른쪽)
            } else if (currNode.left == null && currNode.right != null) {
                if (value < currParentNode.value) {
                    currParentNode.left = currNode.right;
                    currNode = null;
                } else {
                    currParentNode.right = currNode.right;
                    currNode = null;
                }
                return true;
                //Case3-1 : 삭제할 Node 가 Child Node 를 두개 가지고 있고,(
            } else {
                //삭제할 Node가 부모 Node의 왼쪽에 있을때
                if (value < currParentNode.value) {

                    Node changeNode = currNode.right;
                    Node changeParentNode = currNode.right;
                    while (changeNode.left != null) {
                        changeParentNode = changeNode;
                        changeNode = changeNode.left;
                    }
                    // 여기까지 실행되면, changeNode 에는 삭제할 Node의 오른쪽 Node 중에서,
                    // 가장 작은 값을 가진 Node 가 들어있음

                    if (changeNode.right != null) {
                        // Case 3-1-1: changeNode 의 오른쪽 Child Node가 있을 때
                        changeParentNode.left = changeNode.right;

                    } else {
                        // Case 3-1-2 : changeNode의 Child node가 없을때
                        changeParentNode.left = null;
                    }

                    // currParentNode 의 왼쪽 Child Node 에, 삭제할 Node의 오른쪽 자식 중
                    // 가장 작은 값을 가진 changeNode 를 연결
                    currParentNode.left = changeNode;

                    // parentNode 의 왼쪽 Child Node 가 현재, changeNode 이고
                    // changeNode 의 왼쪽/오른쪽 Child Node 를 모두, 삭제할 currNode 의
                    // 기존 왼쪽/오른쪽 Node 로 변경

                    changeNode.right = currNode.right;
                    changeNode.left = currNode.left;

                    currNode = null;

                    //삭제할 Node가 부모 Node의 왼쪽에 있을때
                } else {
                    Node changeNode = currNode.right;
                    Node changeParentNode = currNode.right;
                    while (changeNode.left != null) {
                        changeParentNode = changeNode;
                        changeNode = changeNode.left;
                    }
                    // 여기까지 실행되면, changeNode 에는 삭제할 Node의 오른쪽 Node 중에서,
                    // 가장 작은 값을 가진 Node 가 들어있음

                    if (changeNode.right != null) {
                        // Case 3-1-1: changeNode 의 오른쪽 Child Node가 있을 때
                        changeParentNode.left = changeNode.right;

                    } else {
                        // Case 3-1-2 : changeNode의 Child node가 없을때
                        changeParentNode.left = null;
                    }
                    // currParentNode 의 오른쪽 Child Node 에, 삭제할 Node의 오른쪽 자식 중
                    // 가장 작은 값을 가진 changeNode 를 연결
                    currParentNode.right = changeNode;

                    // parentNode 의 왼쪽 Child Node 가 현재, changeNode 이고
                    // changeNode 의 왼쪽/오른쪽 Child Node 를 모두, 삭제할 currNode 의
                    // 기존 왼쪽/오른쪽 Node 로 변경

                    changeNode.right = currNode.right;
                    changeNode.left = currNode.left;

                    currNode = null;
                }
                return true;
            }
            return true;
        }
    }

}
