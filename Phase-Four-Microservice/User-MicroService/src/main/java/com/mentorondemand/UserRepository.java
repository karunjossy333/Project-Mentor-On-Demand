package com.mentorondemand;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDetailsEntity, Integer> {
}
