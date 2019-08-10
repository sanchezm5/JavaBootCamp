package com.trilogyed.commentqueueconsumer;

import com.trilogyed.commentqueueconsumer.util.feign.CommentClient;
import com.trilogyed.commentqueueconsumer.util.messages.Comment;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

    @Autowired
    private final CommentClient commentClient;

    public MessageListener(CommentClient commentServiceClient) {
        this.commentClient = commentServiceClient;
    }

    @RabbitListener(queues = CommentQueueConsumerApplication.QUEUE_NAME)
    public void receiveMessage(Comment commentMsg) {
        System.out.println("Invoking comment service for " + commentMsg.toString());
        Comment addedComment = commentClient.createComment(commentMsg);
        System.out.println("Comments added " + addedComment.toString());
    }

    private void simulateSlowService() {
        try {
            long time = 1500L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
