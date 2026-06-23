public class Solution08 {
    public static void main(String[] args) {
        // 3글자로 된 제품만 파는 매니저, 1 이상 1000 이하까지만 가격 설정 가능
        Manager bananaManager = new Manager("바나나", 1000);
        bananaManager.productName = "사과";
        bananaManager.productPrice = 2000;
//        bananaManager.arr = new int[]{10, 11, 12};
        bananaManager.arr[0] = 100;
        bananaManager.order();
        Manager2 bananaManager2 = new Manager2("바나나", 1000);
//        bananaManager2.productName = "사과";
//        bananaManager2.productPrice = 2000;
//        bananaManager2.arr = new int[]{10, 11, 12};
//        bananaManager2.arr[0] = 100;
        bananaManager2.order();
    }
}

class Manager2 {
    private int[] arr = {1, 2, 3};
    private String productName;
    private int productPrice;

    public Manager2(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void order() {
        System.out.println(productName + "을 " + productPrice + "원에 주문합니다.");
    }
}

class Manager {
    int[] arr = {1, 2, 3};
    String productName;
    int productPrice;

    public Manager(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void order() {
        System.out.println(productName + "을 " + productPrice + "원에 주문합니다.");
    }
}