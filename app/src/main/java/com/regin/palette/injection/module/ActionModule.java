package com.regin.palette.injection.module;


import com.regin.palette.actions.PaletteAction;
import com.regin.palette.actions.common.ChooseColorAction;
import com.regin.palette.actions.common.ChooseSymbolAction;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;

@Singleton
@Module
public class ActionModule {

    @Singleton
    public List<PaletteAction> providePaletteActions() {
        final List<PaletteAction> actions = new ArrayList<>();
        actions.add(new ChooseSymbolAction());
        actions.add(new ChooseColorAction());
        return actions;
    }
}
