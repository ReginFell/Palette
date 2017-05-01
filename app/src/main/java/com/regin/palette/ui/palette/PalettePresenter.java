package com.regin.palette.ui.palette;

import com.regin.palette.actions.PaletteAction;
import com.regin.palette.ui.base.MvpPresenter;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class PalettePresenter extends MvpPresenter<PaletteView> {

    private final List<PaletteAction> mActions;

    @Inject
    public PalettePresenter(List<PaletteAction> actions) {
        mActions = actions;
    }

    @Override
    public void onViewAttached() {
        getView().showActions(mActions);
    }
}
