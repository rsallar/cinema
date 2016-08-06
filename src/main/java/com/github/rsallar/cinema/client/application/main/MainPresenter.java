package com.github.rsallar.cinema.client.application.main;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.proxy.Proxy;
public class MainPresenter extends Presenter<MainPresenter.MyView, MainPresenter.MyProxy>  {
    interface MyView extends View  {
    }
    
    public static final NestedSlot MainSlot = new NestedSlot();

    
    @ProxyStandard
    interface MyProxy extends Proxy<MainPresenter> {
    }

    @Inject
    MainPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
        
    }
    
    
}