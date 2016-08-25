package com.github.rsallar.cinema.client.application.tabs;

import com.github.rsallar.cinema.client.place.NameTokens;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
public class TabsPresenter extends Presenter<TabsPresenter.MyView, TabsPresenter.MyProxy>  {
    interface MyView extends View  {
    }
 
    
    public static final NestedSlot moviesSlot = new NestedSlot();

    
    @NameToken(NameTokens.tabs)
    @ProxyStandard
    interface MyProxy extends ProxyPlace<TabsPresenter> {
    }

    @Inject
    TabsPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
        
    }
    
    
}