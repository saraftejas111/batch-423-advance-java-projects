package com.tka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<IgUser, Long> {

	public IgUser findByfirstName(String fisrtName);

}
