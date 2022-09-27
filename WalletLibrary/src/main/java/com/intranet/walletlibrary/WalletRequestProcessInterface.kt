package com.intranet.walletlibrary

import com.intranet.walletlibrary.ResponseClass

interface WalletRequestProcessInterface {
    fun response(text: String): String {
        return text
    }

    fun isProcessing(response: ResponseClass)

}