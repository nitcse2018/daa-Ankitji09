Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@Ankitji09 
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


nitcse2018
/
daa-DumbSkull
1
00
 Code
 Issues 0
 Pull requests 0 Actions
 Projects 0
 Wiki
 Security 0
 Insights
daa-DumbSkull/Assignment 4/Assignment4.java /
@DumbSkull DumbSkull Add files via upload
86594e3 8 hours ago
43 lines (37 sloc)  1.33 KB
  
package com.javaAssignments;

public class Assignment4 {

    public static void main(String[] args) {
        final Message box = new Message();

        Thread producerThread = new Thread() {
            @Override
            public void run() {
                System.out.println("Producer thread started...");
                for (int i = 1; i <= 6; ++i) {
                    box.putMessage("message " + i);
                    System.out.println("Put message " + i);
                }
            }
        };

        Thread consumerThread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("Consumer thread 1 started...");
                for (int i = 1; i <= 3; ++i) {
                    System.out.println("Consumer thread 1 Get " + box.getMessage());
                }
            }
        };

        Thread consumerThread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("Consumer thread 2 started...");
                for (int i = 1; i <= 3; ++i) {
                    System.out.println("Consumer thread 2 Get " + box.getMessage());
                }
            }
        };

        consumerThread1.start();
        consumerThread2.start();
        producerThread.start();
    }
}
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
