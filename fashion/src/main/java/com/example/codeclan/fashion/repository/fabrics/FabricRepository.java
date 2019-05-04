package com.example.codeclan.fashion.repository.fabrics;

import com.example.codeclan.fashion.models.Fabric;
import com.example.codeclan.fashion.projections.FabricProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = FabricProjection.class)
public interface FabricRepository extends JpaRepository<Fabric, Long>, FabricRepositoryCustom {

}
