package com.yangyan.xxp.yangyannew.mvp.ui.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.jess.arms.base.BaseHolder
import com.jess.arms.base.DefaultAdapter
import com.yangyan.xxp.yangyannew.R
import com.yangyan.xxp.yangyannew.app.loadImage
import com.yangyan.xxp.yangyannew.mvp.model.entity.ImagesInfo
import org.jetbrains.anko.find

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/5/22
 * Description :
 */
class HomeAdapter
constructor(val mDatas: MutableList<ImagesInfo>) : DefaultAdapter<ImagesInfo>(mDatas) {
    override fun getLayoutId(viewType: Int): Int = R.layout.recycler_home_image

    override fun getHolder(v: View, viewType: Int): BaseHolder<ImagesInfo> =
            HomeHolder(v)

    companion object {
        class HomeHolder(itemView: View) : BaseHolder<ImagesInfo>(itemView) {
            override fun setData(data: ImagesInfo, position: Int) {
                itemView.find<TextView>(R.id.mTvCategory).text = data.category
                itemView.find<TextView>(R.id.mTvTitle).text = data.title
                itemView.find<ImageView>(R.id.mIvImage).loadImage(data.HDImageUrl,R.drawable.bg_loading)
            }

        }
    }
}