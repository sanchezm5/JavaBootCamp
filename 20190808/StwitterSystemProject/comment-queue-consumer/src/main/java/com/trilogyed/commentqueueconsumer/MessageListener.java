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
    public void receiveMessage(Comment comment) {
        System.out.println("Invoking comment service for " + comment.toString());
        Comment addedComment = commentClient.createComment(comment);
        System.out.println("Comments added " + addedComment.toString());
    }

    private void simulateSlowService() {
        try {
            long time = 1000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
