package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(101,"Nick", 'M', 1991,1,6,14));
        forumUserList.add(new ForumUser(102,"Bloe", 'F', 1994,2,7,26));
        forumUserList.add(new ForumUser(103,"And", 'F', 2002, 3, 8, 24));
        forumUserList.add(new ForumUser(104,"Plas", 'F', 2007,4,9, 34));
        forumUserList.add(new ForumUser(105,"Sam", 'm', 2003, 5, 10, 50));
        forumUserList.add(new ForumUser(106,"Pit", 'M', 1993, 6, 1, 0));
        forumUserList.add(new ForumUser(107,"Tom", 'M', 1988, 5, 2, 6));
        forumUserList.add(new ForumUser(108,"Domi", 'F', 1974, 5, 3, 7));
    }
    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
