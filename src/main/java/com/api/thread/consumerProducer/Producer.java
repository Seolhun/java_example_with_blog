package com.api.thread.consumerProducer;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<Tasks<Message>> tasksQueue;

    public Producer(BlockingQueue<Tasks<Message>> tasksQueue) {
        this.tasksQueue = tasksQueue;
    }

    public void run() {
        System.out.println("Producer Thread Run");
        int i = 0;
        while(true) {
            i++;
            Queue<Message> messageQueue = new LinkedBlockingQueue<>();
            for (int j = 0; j < 10000; j++) {
                messageQueue.add(new Message(j, i + " Hello Message "+j));
            }
            Tasks<Message> tasks = new Tasks<>(messageQueue);

            try {
                tasksQueue.put(tasks);
                System.out.println("================================");
                System.out.println("Tasks is put By Producer " + i);
                System.out.println("================================");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
