package tech.studio.rest.cargotracker.domain.model.location;

import java.util.List;

public interface LocationRepository {

  Location find(UnLocode unLocode);

  List<Location> findAll();
}
