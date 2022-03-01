package com.jamaya.applaudo.beans;

import com.jamaya.applaudo.entity.Item;
import com.jamaya.applaudo.exception.BadRequestException;
import com.jamaya.applaudo.exception.NotFoundException;
import com.jamaya.applaudo.utilities.Status;

import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ItemEJBImpl implements ItemEJB{

    @Resource
    private SessionContext context;

    private List<Item> items = new ArrayList<>();
    private static Integer id = 1;

    public ItemEJBImpl() {
        Item item = new Item();
        item.setItemId(1);
        item.setItemName("Item de prueba");
        item.setItemEnteredDate(LocalDateTime.now());
        item.setItemStatus(Status.AVAILABLE);
        item.setItemLastModifiedDate(LocalDateTime.now());

        items.add(item);
    }

    @Override
    public Item getById(Integer itemId) throws NotFoundException {
        System.out.println("Item Id: " + itemId);
        return items.stream().filter(item -> item.getItemId().equals(itemId)).findFirst().orElseThrow(NotFoundException::new);
    }

    @Override
    public Item save(Item item) throws BadRequestException {
        try {
            getById(item.getItemId());
            throw new BadRequestException();
        } catch (NotFoundException e) {
        }
        item.setItemId(++id);
        items.add(item);
        return item;
    }

    @Override
    public List<Item> getByNameAndStatus(String itemName, Status itemStatus) throws NotFoundException {
        return null;
    }
}
