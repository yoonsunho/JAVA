package ref;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder [] orders = new ProductOrder[3];
        orders[0] = createOrder("두부",1000,2);
        orders[1] = createOrder("김치",3000,1);
        orders[2] = createOrder("콜라",1500,5);

        printOrder(orders);


    }

    static ProductOrder createOrder(String name, int price,int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = name;
        order.price = price;
        order.quantity = quantity;

        return order;

    }


    static void printOrder(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println(order.productName+":"+order.price+":"+order.quantity);
        }
    }
}
