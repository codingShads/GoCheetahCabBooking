 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myweb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ThileebanS
 */
public class Util {

    public static List<Vehicle> getVehicle() {
        List<Vehicle> vehicle = new ArrayList<>();

        vehicle.add(new Vehicle("Mustang", "30000", "1993"));
        vehicle.add(new Vehicle("Ford", "10000", "2010"));

        return vehicle;
    }

    public static User authenticate(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User authenticatedUser = Util.authenticate(username, password);
        boolean authenticated = authenticatedUser != null;

        if (authenticated) {
            String sessionid = UUID.randomUUID().toString().toUpperCase().replace("-", "");
            session.setAttribute(sessionid, authenticatedUser);

            Cookie cookie = new Cookie("session-id", sessionid);
            response.addCookie(cookie);

        } else {
            if (request.getCookies() != null) {
                for (Cookie cookie : request.getCookies()) {
                    if (cookie.getName().equals("session-id")) {
                        authenticatedUser = (User) session.getAttribute(cookie.getValue());
                        authenticated = authenticatedUser != null;
                        break;
                    }
                }
            }

            if (!authenticated) {
                response.sendRedirect("login.jsp");
            }
        }
        return authenticatedUser;
    }

    public static User authenticate(String username, String password) {
        if (username != null && password != null) {

            User user = new User("john", "123", "123V", "John", "Smith");
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
