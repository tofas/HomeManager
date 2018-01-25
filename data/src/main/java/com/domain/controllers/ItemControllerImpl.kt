package com.domain.controllers

import com.domain.data.ItemDO
import com.domain.data.dao.ItemDao

class ItemControllerImpl(val itemDao: ItemDao) : ItemController {
  override fun getItem(itemId: Int): ItemDO {
    val item = itemDao.getItem(itemId)
    return item.let { ItemDO(item.id, item.name, item.price) }
  }

  override fun getAllItems(): List<ItemDO> {
    val listOfItems = itemDao.getItems()
    return listOfItems
        .map { ItemDO(it.id, it.name, it.price) }
        .toList()
  }
}