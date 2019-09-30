package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.User;
import com.example.codeclan.fashion.models.UserDetail;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedded", types= User.class)
public interface UserProjection {
    long getId();
    String getFirstName();
    String getSurname();
    String getEmail();
    String getPassword();
    String getAccessGroup();
    UserDetail getUserDetail();

}
