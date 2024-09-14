package com.cristianvillamil.platziwallet.ui.transfer.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TransferDAO {
    @Query(value = "SELECT * FROM transfers")
    fun getAll() : List<TransferEntity>

    @Query(value = "SELECT * FROM transfers WHERE user_name LIKE :userName")
    fun findTransferByUserName(userName: String) : List<TransferEntity>

    @Insert
    fun saveTransfer(transfer: TransferEntity)

    @Delete
    fun delete(transfer: TransferEntity)

}