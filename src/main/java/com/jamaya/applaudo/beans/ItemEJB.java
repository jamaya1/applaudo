package com.jamaya.applaudo.beans;

import com.jamaya.applaudo.entity.Item;
import com.jamaya.applaudo.exception.BadRequestException;
import com.jamaya.applaudo.exception.NotFoundException;
import com.jamaya.applaudo.utilities.Status;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface ItemEJB {
    Item getById(Integer itemId) throws NotFoundException;
    Item save(Item item) throws BadRequestException;
    List<Item> getByNameAndStatus(String itemName, Status itemStatus) throws NotFoundException;
}
