package com.regin.palette.actions.common;

import com.regin.palette.R;

public class ChooseColorAction implements CommonPaletteAction {

    @Override
    public int getTitleRes() {
        return R.string.color;
    }

    @Override
    public int getIconRes() {
        return R.drawable.ic_color;
    }
}