package br.com.thalissonestrela.share.scopes

import android.content.Context
import android.support.annotation.StringRes

/**
 * Created by estevao.t0654 on 06/03/2018.
 */

interface BaseMvpView {

    fun getContext(): Context

    fun showError(error: String?)

    fun showError(@StringRes stringResId: Int)

    fun showMessage(@StringRes srtResId: Int)

    fun showMessage(message: String)

}