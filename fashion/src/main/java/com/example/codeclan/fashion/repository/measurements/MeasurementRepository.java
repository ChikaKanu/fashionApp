package com.example.codeclan.fashion.repository.measurements;

import com.example.codeclan.fashion.models.Measurement;
import com.example.codeclan.fashion.projections.MeasurementProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = MeasurementProjection.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Long>, MeasurementRepositoryCustom {

}
