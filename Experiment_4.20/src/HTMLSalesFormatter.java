public class HTMLSalesFormatter implements SalesFormatter{
    private static HTMLSalesFormatter singletonInstance;

    static public HTMLSalesFormatter getSingletonInstance() {
        return singletonInstance;
    }

    private  HTMLSalesFormatter(){
        singletonInstance = new HTMLSalesFormatter();
    }

    public String formatSales(Sales sales) {
        String result = "";

        // 1. 添加 HTML 头部信息
        result += "<html>\n";
        result += "<body>\n";
        result += "<center><h2>Orders</h2></center>\n";

        // 2. 遍历 Sales 对象中的每一个订单 (Order)
        // 假设 Sales 类实现了 Iterable<Order> 或者有相应的迭代方式
        for (Order order : sales) {

            // 3. 每个订单开始处添加水平线
            result += "<hr>\n";

            // 4. 添加订单总成本，使用 h4 标签
            result += String.format("<h4>Total = %.2f</h4>\n", order.getTotalCost());

            // 5. 遍历订单中的每一个商品项 (OrderItem)
            // 假设 Order 类实现了 Iterable<OrderItem>
            for (OrderItem item : order) {

                // 6. 开始段落标签
                result += "<p>\n";

                // 7. 按照图片要求拼接商品详情
                // 注意：这里假设 OrderItem 有 getCode(), getQuantity(), getPrice() 方法
                // 使用 <br> 进行换行，使用 <b> 加粗标签
                result += String.format("<b>code:</b> %s<br>\n", item.getProduct().getCode());
                result += String.format("<b>quantity:</b> %d<br>\n", item.getQuantity());
                result += String.format("<b>price:</b> %.2f\n", item.getProduct().getPrice());

                // 8. 结束段落标签
                result += "</p>\n";
            }
        }

        // 9. 添加 HTML 尾部信息
        result += "</body>\n";
        result += "</html>\n";

        return result;
    }
}
