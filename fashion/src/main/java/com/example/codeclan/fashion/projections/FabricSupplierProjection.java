package com.example.codeclan.fashion.projections;

import com.example.codeclan.fashion.models.Address;
import com.example.codeclan.fashion.models.Fabric;
import com.example.codeclan.fashion.models.FabricSupplier;
import com.example.codeclan.fashion.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedded", types = FabricSupplier.class)
public interface FabricSupplierProjection {
    String getFirstName();
    String getSurname();
    User getUser();
    Address getAddress();
    String getCompanyName();
    Fabric getFabric();
}
