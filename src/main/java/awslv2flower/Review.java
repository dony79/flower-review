package awslv2flower;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Review_table")
public class Review {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long orderId;
    private String customerName;
    private String phoneNumber;
    private String review;

    @PostPersist
    public void onPostPersist(){
        ReviewRequested reviewRequested = new ReviewRequested();
        BeanUtils.copyProperties(this, reviewRequested);
        reviewRequested.publishAfterCommit();


        ReveiwWrited reveiwWrited = new ReveiwWrited();
        BeanUtils.copyProperties(this, reveiwWrited);
        reveiwWrited.publishAfterCommit();


    }


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
