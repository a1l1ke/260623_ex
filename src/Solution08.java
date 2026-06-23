import java.util.Arrays;

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
        System.out.println("bananaManager2.arr = " + bananaManager2.getArr());
        bananaManager2.getArr()[0] = 100; // Arrays.copyOf를 통해 사본을 제공받았기 때문에 원본 영향 X.
        bananaManager2.setProductName("체리");
        bananaManager2.setProductPrice(10000);
        bananaManager2.order();
    }
}

class Manager2 {
    private int[] arr = {1, 2, 3};
    private String productName;
    private int productPrice;
    private int count = 0;

    // 값에 변경이 있을 때 무언가 직접 값을 넣는게 아니라 단계별 변화, 상태의 변화를 가지는 경우 on/off, level...

    public void incrementCount() {
        count++; // getter는 만들고...
    }

    private boolean flag = false;

    public void toggleFlag() {
        flag = !flag;
    }

    public Manager2(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void order() {
        System.out.println(productName + "을 " + productPrice + "원에 주문합니다.");
    }

    public int[] getArr() {
//        return arr;
        return Arrays.copyOf(arr, arr.length);
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    // String, 원시(기본) 타입은 어차피 복사본이나 문자열의 경우에는 immutable하기 때문에 상관 X.
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName.length() != 3) {
            return; // 검증 (verification)
        } // 좀 더 엄밀하게 하고 싶으면 throw
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        if (productPrice < 1 || productPrice > 1000) {
            return;
        }
        this.productPrice = productPrice;
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