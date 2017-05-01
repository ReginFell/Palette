package com.regin.palette.actions;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

public interface PaletteAction {

    @StringRes int getTitleRes();

    @DrawableRes int getIconRes();

}
