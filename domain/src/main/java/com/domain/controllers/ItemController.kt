package com.domain.controllers

import com.domain.data.ItemDO

interface ItemController {
  fun getItem(itemId: Int): ItemDO
  fun getAllItems(): List<ItemDO>
}