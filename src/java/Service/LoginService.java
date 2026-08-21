package service;

import Model.User;

public class LoginService {

    public boolean login(User user) {

        return "admin".equals(user.getUsername())
                && "123".equals(user.getPassword());
    }
}
