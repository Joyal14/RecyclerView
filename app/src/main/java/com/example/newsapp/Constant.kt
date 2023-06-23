package com.example.newsapp

object Constant {
    private lateinit var dataList: ArrayList<RvModel>
    fun getData():ArrayList<RvModel>{
        dataList = ArrayList()
        dataList.add(RvModel(R.drawable.newspaper,"My life","this is my hose"))
        dataList.add(RvModel(R.drawable.newspaper,"My life","this is my hose"))
        dataList.add(RvModel(R.drawable.newspaper,"My life","this is my hose"))
        dataList.add(RvModel(R.drawable.newspaper,"My life","this is my hose"))
        dataList.add(RvModel(R.drawable.newspaper,"My life","this is my hose"))
        dataList.add(RvModel(R.drawable.newspaper,"My life","this is my hose"))
        dataList.add(RvModel(R.drawable.newspaper,"My life","this is my hose"))
        dataList.add(RvModel(R.drawable.newspaper,"My life","this is my hose"))
        dataList.add(RvModel(R.drawable.newspaper,"My life","this is my hose"))
        dataList.add(RvModel(R.drawable.newspaper,"My life","this is my hose"))
        dataList.add(RvModel(R.drawable.newspaper,"My life","this is my hose"))
        dataList.add(RvModel(R.drawable.newspaper,"My life","this is my hose"))
        dataList.add(RvModel(R.drawable.newspaper,"My life","this is my hose"))
        return dataList
    }
}