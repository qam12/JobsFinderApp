package com.ast.jobsonthemapemployer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AST on 11/24/2017.
 */

public class PostAds_customAdapter extends ArrayAdapter<PostAds_class> implements View.OnClickListener{

    private ArrayList<PostAds_class> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView txtName;
        TextView txtType;
        TextView txtVersion;
        ImageView info;
    }

    public PostAds_customAdapter(ArrayList<PostAds_class> data, Context c) {
        super(c, R.layout.postedads_row,data);
        this.dataSet = data;
        this.mContext=c;

    }

    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);
        PostAds_class dataModel=(PostAds_class)object;

        switch (v.getId())
        {
//            case R.id.item_info:
//                Snackbar.make(v, "Release date " +dataModel.getFeature(), Snackbar.LENGTH_LONG)
//                        .setAction("No action", null).show();
//
//                break;
        }
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Get the data item for this position
        PostAds_class dataModel = getItem(position);
        //Check if an existing view is being reused, otherwise inflate the view
        PostAds_customAdapter.ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new PostAds_customAdapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.postedjob_row, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.name);
            //viewHolder.txtType = (TextView) convertView.findViewById(R.id.type);
            viewHolder.txtVersion = (TextView) convertView.findViewById(R.id.version_number);
            //viewHolder.info = (ImageView) convertView.findViewById(R.id.item_info);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (PostAds_customAdapter.ViewHolder) convertView.getTag();
            result=convertView;
        }


        viewHolder.txtName.setText(dataModel.getName());
        //viewHolder.txtType.setText(dataModel.getType());
        viewHolder.txtVersion.setText(dataModel.getVersion_number());
        //viewHolder.info.setOnClickListener(this);
        //viewHolder.info.setTag(position);
        return convertView;
    }

}
