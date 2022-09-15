package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfComments;
    private int numberOfPosts;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics (Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {
            averagePostsPerUser = (double) numberOfPosts / numberOfUsers;
            averageCommentsPerUser = (double) numberOfComments / numberOfUsers;
        } else {
            numberOfPosts = 0;
            numberOfComments = 0;
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
            averageCommentsPerPost = 0;
        }

        if (numberOfPosts > 0) {
            averageCommentsPerPost = (double) numberOfComments / numberOfPosts;
        } else {
            averageCommentsPerPost = 0;
            averageCommentsPerUser = 0;
            numberOfComments = 0;
        }
    }
    public void showStatistics() {
        System.out.println("Number of users:" + numberOfUsers + "\nNumber of posts:"
                + numberOfPosts + "\nNumber of comments:" + numberOfComments);
        System.out.println("Average posts per user:" + averagePostsPerUser + "\nAverage comments per user:"
                + averageCommentsPerUser + "\nAverage comments per post:" + averageCommentsPerPost);
    }
}
