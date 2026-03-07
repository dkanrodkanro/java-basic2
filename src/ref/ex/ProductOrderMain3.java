package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderAmount = input.nextInt();
        input.nextLine();

        ProductOrder[] orders = new ProductOrder[orderAmount];

        for (int i = 0; i < orderAmount; i++) {
            System.out.println(i + "번째 주문 정보를 입력하세요");
            System.out.print("상품명: ");
            String name = input.next();

            System.out.print("가격: ");
            int price = input.nextInt();

            System.out.print("수량: ");
            int quantity = input.nextInt();
        }
        createOrder("두부", 2000, 2);
        createOrder("김치", 5000, 1);
        createOrder("콜라", 1500, 2);

        printOrders(orders);
        int totalPrice = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalPrice);
    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    public static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    public static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;

        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
