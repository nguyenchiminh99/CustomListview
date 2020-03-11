package com.ncm.nguyenchiminh.customlistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.ncm.nguyenchiminh.customlistview.R;
import com.ncm.nguyenchiminh.customlistview.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private ArrayList<Contact> Arrcontacts;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.Arrcontacts = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.row_item, parent,false);
            viewHolder = new ViewHolder();
            viewHolder.tvName = convertView.findViewById(R.id.tv_name);
            viewHolder.tvNumber = convertView.findViewById(R.id.tv_number);
            viewHolder.tvColor = convertView.findViewById(R.id.tv_color);
        }else {
             viewHolder = (ViewHolder) convertView.getTag();
        }

        Contact contact = Arrcontacts.get(position);

        viewHolder.tvName.setText(contact.getmName());
        viewHolder.tvColor.setText(String.valueOf(position+1));
        viewHolder.tvColor.setBackgroundColor(contact.getmColor());
        viewHolder.tvNumber.setText(contact.getmNumber());
        return convertView;
    }
    public class ViewHolder{
        TextView tvName;
        TextView tvNumber;
        TextView tvColor;
    }
}
