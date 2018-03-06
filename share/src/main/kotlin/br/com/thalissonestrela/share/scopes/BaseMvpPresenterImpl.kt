package br.com.thalissonestrela.share.scopes

/**
 * Created by estevao.t0654 on 06/03/2018.
 */

open class BaseMvpPresenterImpl<V : BaseMvpView> : BaseMvpPresenter<V> {

    protected var mView: V? = null

    override fun attachView(view: V) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }
}