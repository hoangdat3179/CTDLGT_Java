public class LinkList {

    public static void inNodeSo3(Node currentNode, int k){
      for (int i = 0; i < k; i++) {
                currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
    }

    public static void inRaDanhSach(Node currentNode, int k){
        System.out.println(currentNode.data);
        for (int i = 0; i < k; i++) {
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        }
    }

    public static boolean coPhaiNodeCuoiCungKhong(Node node){
        return node.next == null;
    }

    public static void inHetSach(Node currentNode){
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void inHetSachBangDeQuy(Node currentNode){
        //.1 Dk dung
        if(coPhaiNodeCuoiCungKhong(currentNode)){
            System.out.println(currentNode.data);
            return;
        }
        // 2. CTDQ
        System.out.println(currentNode.data);
        inHetSachBangDeQuy(currentNode.next);
    }

    public static boolean contains(Node currentNode, int x){
        while(currentNode != null){
            if(currentNode.data == x){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public static void nhetVaoCuoi(Node currentNode, Node cuoi){
    }

    public static void nhetVaoGiua(Node currentNode, Node giua, int k){
    }

    public static void nhetVaoDau(Node currentNode, Node dau){
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null);
        Node n2 = new Node(2, null);
        Node n3 = new Node(3, null);
        Node n4 = new Node(4, null);
        Node n5 = new Node(5, null);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(contains(n1, 3));
        System.out.println(contains(n1, 10));
        System.out.println(contains(n3, 1));

        nhetVaoCuoi(n1, n6);
        inHetSach(n1); //1,2,3,4,5,6
        nhetVaoCuoi(n1, n7, 2);
        inHetSach(n1); //1,2,3,7,4,5,6
        
        nhetVaoDau(n1,0);
        inHetSach(n1); //0,1,2,3,7,4,5,6

    }
}
