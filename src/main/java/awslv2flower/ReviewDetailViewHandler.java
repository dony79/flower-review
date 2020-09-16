package awslv2flower;

import awslv2flower.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewDetailViewHandler {


    @Autowired
    private ReviewDetailRepository reviewDetailRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenReveiwWrited_then_CREATE_1 (@Payload ReveiwWrited reveiwWrited) {
        try {
            if (reveiwWrited.isMe()) {
                // view 객체 생성
                ReviewDetail reviewDetail = new ReviewDetail();
                // view 객체에 이벤트의 Value 를 set 함
                reviewDetail.setOderId(reveiwWrited.getOrderId());
                reviewDetail.setCustomerName(reveiwWrited.getCustomerName());
                reviewDetail.setReview(reveiwWrited.getReview());
                // view 레파지 토리에 save
                reviewDetailRepository.save(reviewDetail);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}