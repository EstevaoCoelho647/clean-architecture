package br.com.thalissonestrela.createaccount.domain.createaccount
import br.com.thalissonestrela.share.scopes.BaseMvpView
import br.com.thalissonestrela.share.scopes.BaseMvpPresenter
import br.com.thalissonestrela.createaccount.domain.createaccount.model.CreateUser

/**
 * Created by estevao.t0654 on 06/03/2018.
 */
class CreateAccountContract {

    interface View : BaseMvpView {
        fun showSomething()
    }

    interface Presenter : BaseMvpPresenter<View> {
        fun createAccount(createUser: CreateUser)
    }


}