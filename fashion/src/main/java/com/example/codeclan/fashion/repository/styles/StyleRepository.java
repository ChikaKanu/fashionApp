package com.example.codeclan.fashion.repository.styles;

import com.example.codeclan.fashion.models.Style;
import com.example.codeclan.fashion.projections.StyleProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = StyleProjection.class)
public interface StyleRepository extends JpaRepository<Style, Long>, StyleRepositoryCustom {
//    List<Fabric> findFabricsByStyleId(Long styleId);
//    List<Measurement> findMeasurementsByStyleId(Long styleId);
}
