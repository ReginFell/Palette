package com.regin.palette.ui.base.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.regin.palette.R;

public class PaletteTextView extends AppCompatTextView {

    private Drawable mThumb;

    public PaletteTextView(Context context) {
        super(context);
        init();
    }

    public PaletteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PaletteTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        mThumb = ContextCompat.getDrawable(getContext(), R.drawable.ic_face);
        mThumb.setBounds(0, 0, mThumb.getIntrinsicWidth(), mThumb.getIntrinsicHeight());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mThumb.draw(canvas);
        //TODO
    }
}
