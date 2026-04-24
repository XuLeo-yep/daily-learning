public class XMLSalesFormatter implements SalesFormatter{
    static private XMLSalesFormatter XMLFormatter;

    public static XMLSalesFormatter getXMLFormatter() {
        if (XMLFormatter == null){
            XMLFormatter = new XMLSalesFormatter();
        }
        return XMLFormatter;
    }

    public XMLSalesFormatter() {

    }

    public String formatSales(Sales sales) {
        String result = "";

        // 1. 字符串必须以 <Sales> 开头
        result += "<Sales>\n";

        // 2. 遍历 Sales 对象中的每一个订单 (Order)
        for (Order order : sales) {
            // 3. 每个订单格式: <Order total="totalCost">
            // 注意：totalCost 应该保留两位小数以符合常规货币格式
            result += String.format("  <Order total=\"%.2f\">\n", order.getTotalCost());

            // 4. 遍历订单中的每一个商品项 (OrderItem)
            for (OrderItem item : order) {
                // 5. 商品项格式: <OrderItem quantity="quantityX" price="priceX">codeX</OrderItem>
                // 假设 item.getQuantity() 返回整数, item.getProduct().getPrice() 返回价格, item.getProduct().getCode() 返回代码
                result += String.format("    <OrderItem quantity=\"%d\" price=\"%.2f\">%s</OrderItem>\n",
                        item.getQuantity(),
                        item.getProduct().getPrice(),
                        item.getProduct().getCode());
            }

            // 6. 订单结束标签
            result += "  </Order>\n";
        }

        // 7. 字符串必须以 </Sales> 结尾
        result += "</Sales>";

        return result;
    }
}
