package br.com.thalissonestrela.createaccount.presentation.createaccount

import android.widget.Toast
import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract
import br.com.thalissonestrela.createaccount.domain.createaccount.model.CreateUser
import br.com.thalissonestrela.share.scopes.BaseMvpPresenterImpl

class CreateAccountPresenter : BaseMvpPresenterImpl<CreateAccountContract.View>(), CreateAccountContract.Presenter {

    override fun createAccount(createUser: CreateUser) {
        Toast.makeText(mView?.getContext(), "Welcome ${createUser.firstName}", Toast.LENGTH_SHORT).show()
        mView?.showMessage("oi");
    }

}