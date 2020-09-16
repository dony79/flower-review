package awslv2flower;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ReviewDetail_table")
public class ReviewDetail {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long oderId;
        private String customerName;
        private String review;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public Long getOderId() {
            return oderId;
        }

        public void setOderId(Long oderId) {
            this.oderId = oderId;
        }
        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }
        public String getReview() {
            return review;
        }

        public void setReview(String review) {
            this.review = review;
        }

}
