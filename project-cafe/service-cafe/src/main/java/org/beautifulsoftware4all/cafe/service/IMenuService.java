package org.beautifulsoftware4all.cafe.service;

import org.beautifulsoftware4all.cafe.dto.MenuDto;

import java.util.List;

public interface IMenuService {
    List<MenuDto> fetchMenu();
}
