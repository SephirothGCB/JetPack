package com.sephoe.domain.options

import com.sephoe.data.local.options.OptionsData
import java.util.*

object OptionsMapper {
    fun toView(data: List<OptionsData>): List<OptionsEntity> {
        val result = ArrayList<OptionsEntity>()
        for(it in data) {
            result.add(OptionsEntity(it.name))
        }
        return result
    }
}