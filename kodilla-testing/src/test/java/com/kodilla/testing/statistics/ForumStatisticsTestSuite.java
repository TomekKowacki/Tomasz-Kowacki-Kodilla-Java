package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private ForumStatistics forumStatistics;
    private List<String> mockUsers;
    private Statistics statisticsMock;
    private static int testCounter = 0;

    @BeforeEach
    public void beforeEachTest() {
        forumStatistics = new ForumStatistics();
        statisticsMock = mock(Statistics.class);
        mockUsers = new ArrayList<String>();
        for (int n = 1; mockUsers.size() < 250; n++) {
            mockUsers.add("mockUser" + n);
        }
        when(statisticsMock.usersNames()).thenReturn(mockUsers);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(50);
        testCounter++;
        System.out.println("Test #" + testCounter + " starts.");
    }

    @AfterEach
    public void afterEachTest() {
        forumStatistics.showStatistics();
        System.out.println("Test #" + testCounter + " ends.\n");
    }

    @Test
    public void testCalculateAdvStatisticsFor0Posts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(250, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAveragePostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverageCommentsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsFor1000Posts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(250, forumStatistics.getNumberOfUsers());
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(50, forumStatistics.getNumberOfComments());
        assertEquals(4, forumStatistics.getAveragePostsPerUser(), 0.01);
        assertEquals(0.2, forumStatistics.getAverageCommentsPerUser(), 0.01);
        assertEquals(0.05, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsFor0Comments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(250, forumStatistics.getNumberOfUsers());
        assertEquals(20, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(0.08, forumStatistics.getAveragePostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverageCommentsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsFor200Posts100Comments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(250, forumStatistics.getNumberOfUsers());
        assertEquals(20, forumStatistics.getNumberOfPosts());
        assertEquals(10, forumStatistics.getNumberOfComments());
        assertEquals(0.08, forumStatistics.getAveragePostsPerUser(), 0.01);
        assertEquals(0.04, forumStatistics.getAverageCommentsPerUser(), 0.01);
        assertEquals(0.5, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsFor200Posts400Comments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(200);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(250, forumStatistics.getNumberOfUsers());
        assertEquals(20, forumStatistics.getNumberOfPosts());
        assertEquals(200, forumStatistics.getNumberOfComments());
        assertEquals(0.08, forumStatistics.getAveragePostsPerUser(), 0.01);
        assertEquals(0.8, forumStatistics.getAverageCommentsPerUser(), 0.01);
        assertEquals(10, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsFor0Users() {
        //Given
        mockUsers = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(mockUsers);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAveragePostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverageCommentsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsFor100Users() {
        //Given
        for (int n = 250; mockUsers.size() > 100; n--) {
            mockUsers.remove("mockUser" + n);
        }

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(100, forumStatistics.getNumberOfUsers());
            assertEquals(20, forumStatistics.getNumberOfPosts());
            assertEquals(50, forumStatistics.getNumberOfComments());
            assertEquals(0.2, forumStatistics.getAveragePostsPerUser(), 0.01);
            assertEquals(0.5, forumStatistics.getAverageCommentsPerUser(), 0.01);
            assertEquals(2.5, forumStatistics.getAverageCommentsPerPost(), 0.01);
    }

}
