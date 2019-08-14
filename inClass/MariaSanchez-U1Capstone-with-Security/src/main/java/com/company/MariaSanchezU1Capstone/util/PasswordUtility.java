package com.company.MariaSanchezU1Capstone.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordUtility {

    public static void main(String[] args) {
        PasswordEncoder enc = new BCryptPasswordEncoder();

        String password = "password";

        String encodedPassword = enc.encode(password);

        System.out.println(encodedPassword);
    }
}

/*
allUsers- can search (READ/GET) for products
        (no password)

plainUser- can search (READ/GET) for products
        (plainPassword: $2a$10$EECo9SqwjbpXHLaUubhQ8.yRCqsWdKOAc0NStG37vsdJPLIVg4Xcy)

staffUser- can update (UPDATE/PUT) and search (READ/GET) products
        (staffPassword: $2a$10$92wQZ5xr8qkUBi1hwHubpudIf48AgjQyC4qYUZ7QQTkS0NkNPEexK)

managerUser- can create (CREATE/POST), update (UPDATE/PUT), and search (READ/GET) products
        (managerPassword: $2a$10$h4qtGhHGSicFJxUR7oV59.7ZOge94LBqtYN0q5q3ZrVxGd.zRMlK6)

adminUser- can delete (DELETE), (CREATE/POST), update(UPDATE/PUT), and search (READ/GET) products
        (adminPassword: $2a$10$sgRRKNU6JQtuhRprMJhd/.8kt7JQOpJ2KEQkGABkhsbb4aUF/i4g6)
 */