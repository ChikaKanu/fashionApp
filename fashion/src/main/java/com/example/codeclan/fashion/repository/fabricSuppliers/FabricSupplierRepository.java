package com.example.codeclan.fashion.repository.fabricSuppliers;

import com.example.codeclan.fashion.models.FabricSupplier;
import com.example.codeclan.fashion.projections.FabricSupplierProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = FabricSupplierProjection.class)
public interface FabricSupplierRepository extends JpaRepository<FabricSupplier, Long>  {
}
