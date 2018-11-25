package com.example.moaathalrajab.chatdemover2.model;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * Created by m_alrajab on 4/5/17.
 */

public class ChatMsgAdapter extends ArrayAdapter<ChatMessage> {
    public ChatMsgAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<ChatMessage> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView==null)
            convertView= ((Activity)getContext()).getLayoutInflater().inflate(
                    R.layout.chat_msg_item,parent,false);

        TextView msgBody=(TextView)convertView.findViewById(R.id.cht_itm_body);
        TextView username=(TextView)convertView.findViewById(R.id.cht_itm_username);
        TextView msgTime=(TextView)convertView.findViewById(R.id.cht_itm_msgtime);
        ImageView msgImg=(ImageView)convertView.findViewById(R.id.cht_itm_image);



        ChatMessage  message=getItem(position);

       if(message.getUri()!=null) {

            Picasso.with(getContext())
                    .load(message.getUri())
                    .resize(300,300)
                    .into(msgImg);


        }
        msgBody.setText(message.getMsg());
        username.setText(message.getUsername());
        msgTime.setText(message.getMsgTime());
        return convertView;
    }
}
