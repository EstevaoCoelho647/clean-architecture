package br.com.thalissonestrela.createaccount.presentation.createaccount

import br.com.thalissonestrela.share.scopes.BaseMvpActivity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import br.com.thalissonestrela.createaccount.R
import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract
import br.com.thalissonestrela.createaccount.domain.createaccount.model.CreateUser
import kotlinx.android.synthetic.main.activity_create_account.*
import javax.inject.Inject

class CreateAccountActivity : BaseMvpActivity<CreateAccountContract.View,
        CreateAccountContract.Presenter>(), CreateAccountContract.View {

    override var presenter: CreateAccountContract.Presenter = CreateAccountPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        createAccount.setOnClickListener {
            presenter.createAccount(getUserForCreate())
        }
    }

    private fun getUserForCreate() = CreateUser(
            firstName = firstName.text.toString(),
            lastName = lastName.text.toString(),
            password = password.text.toString())

    companion object {
        fun newIntent(context: Context): Intent =
                Intent(context, CreateAccountActivity::class.java)
    }

    override fun showSomething() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
