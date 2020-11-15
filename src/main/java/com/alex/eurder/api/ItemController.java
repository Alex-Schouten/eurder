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
    public ItemDTO updateAnItem(@RequestBody ItemDTO itemDTO, @PathVariable String id) {
        return itemService.updateAnItem(itemDTO);
    }


   @GetMapping(path = "/findByName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
   @ResponseStatus(HttpStatus.OK)
   public List<ItemDTO> getItemByName(@PathVariable String itemName, @PathVariable String name){
       return itemService.getItemByID(itemName);
   }


   @GetMapping(path = "/findByID/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<ItemDTO> itemDTO(@PathVariable String id) {
       return itemService.getItemByID(id);
   }


}
