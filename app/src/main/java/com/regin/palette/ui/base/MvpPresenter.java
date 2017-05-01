package com.regin.palette.ui.base;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;

import java.lang.ref.WeakReference;

public abstract class MvpPresenter<V extends MvpView> {

    @Nullable
    private WeakReference<? extends V> view;

    @CallSuper
    protected void onCreate(Bundle savedInstanceState) {

    }

    @CallSuper
    protected void onDestroy() {

    }

    @CallSuper
    protected void attachView(V v) {
        view = new WeakReference<>(v);
    }

    protected void onViewAttached() {

    }

    @Nullable
    protected V getView() {
        return view != null ? view.get() : null;
    }

    protected void i() {

    }
}
