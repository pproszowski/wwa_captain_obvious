package wwa.captainobvious.recommendations.persistence.repos;

import wwa.captainobvious.recommendations.web.dtos.CartDto;

public interface CartRepository {

    CartDto get();
}
