package com.donggua.test.testproject06.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain {

    public static void main(String[] args) {

        User user1 = new User(1, "name1");
        User user2 = new User(3, "name3");
        User user3 = new User(2, "name2");
        User user4 = new User(1, "name4");

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        Map<Integer, List<User>> userMap = userList.stream().collect(Collectors.groupingBy(User::getId));

        userMap.forEach((id, list) -> System.out.println("id:" + id + ",listCount:" + list.size()));


    }

}
