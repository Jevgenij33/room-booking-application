package prototype;

import com.roombookingapplication.dto.UsersDto;
import com.roombookingapplication.entity.Users;

public class UserPrototype {

    public static Users aUser() {
        Users u = new Users();
        u.setName("test_name");
        u.setLogin("test_login");
        return u;
    }

    public static UsersDto aUserDTO() {
        UsersDto u = new UsersDto();
        u.setName("test_name");
        u.setLogin("test_login");
        return u;
    }
}
