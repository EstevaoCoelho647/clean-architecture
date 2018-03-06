package br.com.thalissonestrela.createaccount.presentation.createaccount

import br.com.thalissonestrela.createaccount.domain.createaccount.CreateAccountContract
import dagger.Module
import dagger.Provides

/**
 * Created by estevao.t0654 on 06/03/2018.
 */
@Module
class CreateAccountModule {

    @Provides
    fun providePresenter(presenter: CreateAccountPresenter): CreateAccountContract.Presenter = presenter

    @Provides
    fun provideView(activity: CreateAccountActivity): CreateAccountContract.View = activity

}