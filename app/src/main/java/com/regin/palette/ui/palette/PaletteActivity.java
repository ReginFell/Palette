package com.regin.palette.ui.palette;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;

import com.regin.palette.Application;
import com.regin.palette.R;
import com.regin.palette.actions.PaletteAction;
import com.regin.palette.ui.base.MvpActivity;
import com.regin.palette.ui.palette.adapter.ActionAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PaletteActivity extends MvpActivity<PaletteView, PalettePresenter> implements PaletteView {

    @BindView(R.id.actions) RecyclerView mActions;

    @NonNull
    @Override
    public PalettePresenter createPresenter() {
        return Application.getApplication().getAppComponent().providePalettePresenter();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);
        ButterKnife.bind(this);
        initViews();
    }

    @Override
    public void showActions(List<PaletteAction> actions) {
        final ActionAdapter adapter = new ActionAdapter(getContext(), actions);
        mActions.setAdapter(adapter);
    }

    private void initViews() {
        final DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mActions.getContext(), DividerItemDecoration.HORIZONTAL); //TODO
        mActions.addItemDecoration(dividerItemDecoration);
    }
}
