package com.regin.palette.ui.palette;

import com.regin.palette.actions.PaletteAction;
import com.regin.palette.ui.base.MvpView;

import java.util.List;

public interface PaletteView extends MvpView {

    void showActions(List<PaletteAction> actions);

}
