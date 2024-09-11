package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.model.HomeInteractor

class HomePresenter : HomeContract.Presenter {
    private val homeInteractor = HomeInteractor()
    override fun retrieveFavoriteTransfers(): List<FavoriteTransfer> {
    }
}