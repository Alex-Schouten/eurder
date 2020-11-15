package com.alex.eurder.api;

import com.alex.eurder.service.ItemService;
import com.alex.eurder.service.dto.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(path = "/items")
public class ItemController {
   private ItemService itemService;

   @Autowired
    public ItemController(ItemService itemService){
       this.itemService = itemService;
   }

    @PostMapping(path = "/admin", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ItemDTO addAnItem(@RequestBody ItemDTO itemDTO) {
        return itemService.addAnItem(itemDTO);
    }

    @PutMapping(path = "/admin/{id}", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ItemDTO updateAnItem(@PathVariable long id, @RequestBody ItemDTO itemDTO) {
        return itemService.updateAnItem(id, itemDTO);
    }


}
