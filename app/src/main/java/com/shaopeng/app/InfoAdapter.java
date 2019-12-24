package com.shaopeng.app;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.shaopeng.app.callback.OnPointDragListener;
import com.shaopeng.app.tools.DragPointAnimType;
import com.shaopeng.app.view.AbsDragPointView;
import com.shaopeng.app.view.DragPointView;

import java.util.ArrayList;
import java.util.List;

public class InfoAdapter extends BaseAdapter implements OnPointDragListener {

    private List<DataBean> objects = new ArrayList<>();

    private Context context;
    private LayoutInflater layoutInflater;
    private AnimationDrawable animationDrawable;

    public InfoAdapter(Context context, List<DataBean> objects) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.objects = objects;

        animationDrawable = DragPointAnimType.getAnimExplode(context, 300, 100, 100);
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public DataBean getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        parent.setClipChildren(false);
        parent.setClipToPadding(false);
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.layout_item, null);
            convertView.setTag(new ViewHolder(convertView));
        }
        initializeViews(getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(DataBean object, ViewHolder holder) {
        Glide.with(context).load(object.getAvatar()).into(holder.avatar);
        holder.message.setText(object.getLastMessage());
        holder.name.setText(object.getNickname());
        holder.time.setText(object.getLastTime());
        holder.pointView.setTag(object);
        holder.pointView.setOnPointDragListener(this);
        holder.pointView.setRemoveAnim(animationDrawable);
        if (object.isRead() || object.getMessageNum() <= 0) {
            holder.pointView.setVisibility(View.GONE);
        } else {
            holder.pointView.setVisibility(View.VISIBLE);
            if (object.getMessageNum() <= 99)
                holder.pointView.setText(object.getMessageNum() + "");
            else
                holder.pointView.setText("99");
        }
    }

    @Override
    public void onPointRemoveStart(AbsDragPointView view) {

    }

    @Override
    public void onPointRemoveEnd(AbsDragPointView view) {
        DataBean entity =
                (DataBean) view.getTag();
        entity.setMessageNum(0);
        entity.setRead(true);
        ((MainActivity)context).updateUnreadCount();
    }

    @Override
    public void onPointRecovery(AbsDragPointView view) {

    }

    protected class ViewHolder {
        private ImageView avatar;
        private TextView name;
        private TextView time;
        private TextView message;
        private DragPointView pointView;

        public ViewHolder(View view) {
            avatar = (ImageView) view.findViewById(R.id.avatar);
            name = (TextView) view.findViewById(R.id.name);
            time = (TextView) view.findViewById(R.id.time);
            message = (TextView) view.findViewById(R.id.message);
            pointView = (DragPointView) view.findViewById(R.id.drag_point_view);
        }
    }
}
