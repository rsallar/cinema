package com.github.rsallar.cinema.client.application.tabs;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import gwt.material.design.client.ui.MaterialTabItem;

class TabsView extends ViewImpl implements TabsPresenter.MyView {
    interface Binder extends UiBinder<Widget, TabsView> {
    }

    
    @UiField
    MaterialTabItem tab1, tab2, tab3;

    @Inject
    TabsView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        setInSlot(TabsPresenter.moviesSlot, tab1);
    }
    

}