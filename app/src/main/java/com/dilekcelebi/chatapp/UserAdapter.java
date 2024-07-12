package com.dilekcelebi.chatapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dilekcelebi.chatapp.databinding.UserRowBinding;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private Context context;
    private ArrayList<String> userList;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(String userEmail);
    }

    public UserAdapter(Context context, ArrayList<String> userList, OnItemClickListener listener) {
        this.context = context;
        this.userList = userList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // ViewBinding kullanarak layout'u inflate et
        UserRowBinding binding = UserRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new UserViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        String userEmail = userList.get(position);
        holder.bind(userEmail, listener);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private UserRowBinding binding;

        public UserViewHolder(@NonNull UserRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(final String userEmail, final OnItemClickListener listener) {
            binding.username.setText(userEmail);
            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(userEmail);
                }
            });
        }
    }
}


