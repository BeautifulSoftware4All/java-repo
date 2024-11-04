package org.beautifulsoftware4all.cafe.service.impl;

import lombok.RequiredArgsConstructor;
import org.beautifulsoftware4all.cafe.dto.MenuDto;
import org.beautifulsoftware4all.cafe.entity.Menu;
import org.beautifulsoftware4all.cafe.mapper.MenuMapper;
import org.beautifulsoftware4all.cafe.repository.MenuRepository;
import org.beautifulsoftware4all.cafe.service.IMenuService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService implements IMenuService {

    private final MenuRepository menuRepository;

    @Override
    public List<MenuDto> fetchMenu() {
        List<Menu> menus = menuRepository.findAll();
        List<MenuDto> menuDtos = new ArrayList<>();
        menus.forEach(m -> {menuDtos.add(MenuMapper.mapToMenuDto(m, new MenuDto()));});
        return menuDtos;
    }
}
