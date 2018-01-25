package com.domain.controllers

import com.domain.data.TransactionDO

interface TransactionController {
  fun getTransactionsPerUser(userId: Int): TransactionDO?
  fun getAllTransactions(): List<TransactionDO>
  fun getTransaction(transactionId: Int): TransactionDO?
}