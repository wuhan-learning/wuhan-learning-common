package com.otr.wuhan.learning.common;

import lombok.Data;

import static com.otr.wuhan.learning.common.Constants.DEFAULT_NAME;
import static com.otr.wuhan.learning.common.Constants.DEFAULT_ROLE;

@Data
public class UserDTO {

    private String id;

    private String name;

    private String role;

    public static UserDTO buildDefaultUserWithId(String id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setName(DEFAULT_NAME);
        userDTO.setRole(DEFAULT_ROLE);
        return userDTO;
    }
}
