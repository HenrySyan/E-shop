package am.itspace.eshop.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;


public class CurrentUser extends User {

    private am.itspace.eshop.model.User user;

    public CurrentUser(am.itspace.eshop.model.User user) {
        super(user.getEmail(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getType().name()));
        this.user = user;
    }

    public am.itspace.eshop.model.User getUser() {
        return user;
    }

    public int getId() {
        return user.getId();
    }
}
