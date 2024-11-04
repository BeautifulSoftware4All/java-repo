package org.beautifulsoftware4all.cafe.mapper;

import org.beautifulsoftware4all.cafe.dto.MenuDto;
import org.beautifulsoftware4all.cafe.entity.Menu;

public class MenuMapper {

    public static MenuDto mapToMenuDto(Menu menu, MenuDto menuDto) {
        menuDto.setDescription(menu.getDescription());
        menuDto.setName(menu.getName());

        return menuDto;
    }
}
