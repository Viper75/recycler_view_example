package com.codewithsean.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class NamesAdapter extends RecyclerView.Adapter<NamesAdapter.NamesViewHolder> {
    String[] mDataset;

    public NamesAdapter(String[] mDataset) {
        this.mDataset = mDataset;
    }

    public class NamesViewHolder extends RecyclerView.ViewHolder {
        public TextView mNameTv;
        public CheckBox mListItemCb;
        public ConstraintLayout mListCl;

        public NamesViewHolder(View itemView) {
            super(itemView);

            mNameTv = itemView.findViewById(R.id.list_item_tv);
            mListItemCb = itemView.findViewById(R.id.list_item_cb);
            mListCl = itemView.findViewById(R.id.list_item_cl);

            mListCl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListItemCb.isChecked())
                        mListItemCb.setChecked(false);
                    else
                        mListItemCb.setChecked(true);
                }
            });
        }
    }

    @NonNull
    @Override
    public NamesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        NamesViewHolder namesViewHolder = new NamesViewHolder(view);
        return namesViewHolder;
    }

    @Override
    public void onBindViewHolder(NamesViewHolder holder, int position) {
        holder.mNameTv.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
