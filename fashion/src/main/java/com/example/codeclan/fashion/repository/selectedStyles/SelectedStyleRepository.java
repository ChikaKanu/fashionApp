package com.example.codeclan.fashion.repository.selectedStyles;

import com.example.codeclan.fashion.models.SelectedStyle;
import com.example.codeclan.fashion.projections.SelectedStyleProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = SelectedStyleProjection.class)
public interface SelectedStyleRepository extends JpaRepository<SelectedStyle, Long> {

}
