package orderapp.data;


import orderapp.Order;

public interface OrderRepository {

  Order save(Order order);
  
}