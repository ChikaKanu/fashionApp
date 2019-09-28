package com.example.codeclan.fashion.repository.userDetails;

import com.example.codeclan.fashion.models.UserDetail;
import com.example.codeclan.fashion.projections.UserDetailProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = UserDetailProjection.class)
public interface UserDetailRepository extends JpaRepository<UserDetail, Long>, UserDetailRepositoryCustom {
//    UserDetail findByUserFirstName(String firstname);
}
