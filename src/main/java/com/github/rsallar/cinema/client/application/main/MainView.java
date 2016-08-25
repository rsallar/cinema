package com.github.rsallar.cinema.client.application.main;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import gwt.material.design.client.ui.MaterialContainer;

class MainView extends ViewImpl implements MainPresenter.MyView {
    interface Binder extends UiBinder<Widget, MainView> {
    }

    @UiField
    MaterialContainer main;

    @Inject
    MainView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        bindSlot(MainPresenter.MainSlot,  main);
    }
    
  
}