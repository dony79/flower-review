package awslv2flower;

public class ReviewWrited extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String customerName;
    private String phoneNumber;
    private String review;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}