package org.beautifulsoftware4all.cafe.controller;

import lombok.RequiredArgsConstructor;
import org.beautifulsoftware4all.cafe.dto.MenuDto;
import org.beautifulsoftware4all.cafe.service.IMenuService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class MenuController {

    private final IMenuService iMenuService;

    @GetMapping("/menu")
    public ResponseEntity<List<MenuDto>> fetchMenu() {
        List<MenuDto> menuDtos = iMenuService.fetchMenu();
        return ResponseEntity.status(HttpStatus.OK).body(menuDtos);
    }
}
