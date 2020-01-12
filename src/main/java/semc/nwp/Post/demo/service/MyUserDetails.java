package semc.nwp.Post.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import semc.nwp.Post.demo.model.User;
import semc.nwp.Post.demo.repository.UserSecRepo;

import java.util.Arrays;
import java.util.Collection;

public class MyUserDetails implements org.springframework.security.core.userdetails.UserDetails {


    private final User user;

    @Autowired
    UserSecRepo usr;

    public MyUserDetails(final String username, final String password) {
        this.user = usr.findByusernameAndpassword(username, password);
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority(user.getUserRole()));
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
