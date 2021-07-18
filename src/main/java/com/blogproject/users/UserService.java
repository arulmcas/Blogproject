package com.blogproject.users;

import java.util.function.Function;

public class UserService {

    private UserRepository userRepository = new UserRepository();

    public User createUser(UserDTO userDTO) {
        User user = mapUserDTOtoUser.apply(userDTO);
        User user1 = userRepository.createUser(user);
        return user1;
    }

    Function<UserDTO, User> mapUserDTOtoUser = (userdto) -> {
        User user = new User();
        user.setEmail(userdto.getEmail());
        user.setLocation(userdto.getLocation());
        user.setName(userdto.getName());
        return user;
    };
}
