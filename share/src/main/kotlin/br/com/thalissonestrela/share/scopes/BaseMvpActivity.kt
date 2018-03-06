package br.com.thalissonestrela.share.scopes

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

/**
 * Created by estevao.t0654 on 06/03/2018.
 */

abstract class BaseMvpActivity<in V : BaseMvpView, T : BaseMvpPresenter<V>>
    : DaggerAppCompatActivity(), BaseMvpView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.attachView(this as V)
    }

    override fun getContext(): Context = this

    abstract var presenter: T

    override fun showError(error: String?) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show()
    }

    override fun showError(stringResId: Int) {
        Toast.makeText(this, stringResId, Toast.LENGTH_LONG).show()
    }

    override fun showMessage(srtResId: Int) {
        Toast.makeText(this, srtResId, Toast.LENGTH_LONG).show()
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}