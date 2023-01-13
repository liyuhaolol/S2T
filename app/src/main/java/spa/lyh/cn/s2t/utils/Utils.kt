package spa.lyh.cn.s2t.utils

import com.zqc.opencc.android.lib.ChineseConverter
import com.zqc.opencc.android.lib.ConversionType


object Utils {

    fun S2T(text:String):String{
        return ChineseConverter.convert(text,ConversionType.S2T,ContextProvider.getAppContext())
    }

    fun T2S(text:String):String{
        return ChineseConverter.convert(text,ConversionType.T2S,ContextProvider.getAppContext())
    }
}