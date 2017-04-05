package net.vatri.inventory.libraries;
import net.vatri.inventory.models.*;

import java.util.List;
import java.util.Map;

public interface InventoryDao{

    public User getUserByEmail(String email);

    // todo: offset?!
    public List<Product> getProducts();
    public Product getProduct(String id);
    public boolean saveProduct(Product product);

    // Todo: offset + limit
    public List<ProductGroup> getGroups();
    public ProductGroup getGroup(String id);
    public boolean saveGroup(ProductGroup group);

    public List<Order> getOrders();
    public List<Order> getOrders(Map<String,String> params);
    public Order getOrder(String id);
    public boolean saveOrder(Order order);
    public List<OrderItem> getOrderItems(String orderId);

    public List<GroupVariant> getVariantsByGroup(String groupId);
    public List<GroupVariant> getVariants();
    public GroupVariant getVariant(String id);
    public boolean saveVariant(GroupVariant variant);

    public List<Map<String,String>> getStock();

    public Map<String,String> getStats();

}