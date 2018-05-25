package com.yangyan.xxp.yangyannew.mvp.model

import android.app.Application

import com.google.gson.Gson
import com.jess.arms.integration.IRepositoryManager
import com.jess.arms.mvp.BaseModel

import com.jess.arms.di.scope.ActivityScope
import com.yangyan.xxp.yangyannew.mvp.contract.GalleryContract

import javax.inject.Inject

import com.yangyan.xxp.yangyannew.mvp.contract.MainContract


@ActivityScope
class GalleryModel @Inject
constructor(repositoryManager: IRepositoryManager) : BaseModel(repositoryManager), GalleryContract.Model {
    @Inject
    lateinit var mGson: Gson
    @Inject
    lateinit var mApplication: Application

    override fun onDestroy() {
        super.onDestroy()
    }
}