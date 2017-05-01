package com.regin.palette.injection.component;

import com.regin.palette.injection.module.AppModule;
import com.regin.palette.ui.palette.PalettePresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    PalettePresenter providePalettePresenter();

}
