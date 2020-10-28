package com.example.setReact

class SampleModel {
    private var name: String = "Sample"

    fun getName(): String{
        return this.name
    }

    fun setName(name: String){
        this.name = name
    }

    companion object{
        @Volatile
        private var INSTANCE: SampleModel? = null
        fun getModel(): SampleModel{
            val tempInstance = INSTANCE
            if(tempInstance != null) return tempInstance
            synchronized(this){
                val instance = SampleModel()
                INSTANCE = instance
                return instance
            }
        }
    }
}