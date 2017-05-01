package com.regin.palette.ui.palette.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.regin.palette.R;
import com.regin.palette.actions.PaletteAction;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActionAdapter extends RecyclerView.Adapter<ActionAdapter.ViewHolder> {

    private final Context mContext;
    private final List<PaletteAction> mActions;

    public ActionAdapter(Context context, List<PaletteAction> actions) {
        mContext = context;
        mActions = actions;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(mContext).inflate(R.layout.item_action, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final PaletteAction action = mActions.get(position);
        holder.bind(action);
    }

    @Override
    public int getItemCount() {
        return mActions.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.name) TextView mName;
        @BindView(R.id.icon) ImageView mIcon;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        private void bind(PaletteAction action) {
            mName.setText(action.getTitleRes());
            mIcon.setImageResource(action.getIconRes());
        }
    }
}
