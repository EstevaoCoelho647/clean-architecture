package br.com.thalissonestrela.share.scopes

/**
 * Created by estevao.t0654 on 06/03/2018.
 */
interface BaseMvpPresenter<in V : BaseMvpView> {

    fun attachView(view: V)

    fun detachView()
}