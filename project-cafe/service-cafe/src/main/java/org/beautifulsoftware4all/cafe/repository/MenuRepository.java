package org.beautifulsoftware4all.cafe.repository;

import org.beautifulsoftware4all.cafe.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
