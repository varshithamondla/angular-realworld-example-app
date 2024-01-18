// Example microservice using Spring Boot
@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrder(@PathVariable Long orderId) {
        // Implementation to retrieve order details
        Order order = orderService.getOrder(orderId);
        return ResponseEntity.ok(order);
    }

    // Other endpoints and business logic
}

// Example service class
@Service
public class OrderService {
    // Implementation of order-related business logic
    public Order getOrder(Long orderId) {
        // Implementation to retrieve order details from the database
        // ...
    }
}
