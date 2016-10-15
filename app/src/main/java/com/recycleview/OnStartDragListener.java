package com.recycleview;

import android.support.v7.widget.RecyclerView;

/**
 * Created by chetan on 14/10/16.
 */

public interface OnStartDragListener {
    /**
     * Called when a view is requesting a start of a drag.
     *
     * @param viewHolder The holder of the view to drag.
     */
    void onStartDrag(RecyclerView.ViewHolder viewHolder);
}