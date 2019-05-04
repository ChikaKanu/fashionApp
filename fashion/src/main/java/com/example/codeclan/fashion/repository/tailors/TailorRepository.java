package com.example.codeclan.fashion.repository.tailors;

import com.example.codeclan.fashion.models.Tailor;
import com.example.codeclan.fashion.projections.TailorProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = TailorProjection.class)
public interface TailorRepository extends JpaRepository<Tailor, Long>, TailorRepositoryCustom {
}
