package com.example.chattingzalo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class TinNhanFragment extends Fragment {
    ListView listView;
    TinNhanAdapter adapter;
    List<Message> list;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tinnhan, container, false);

        list = new ArrayList<>();
        list.add(new Message(R.drawable.ic_baseline_person_24, "Person1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        list.add(new Message(R.drawable.ic_baseline_person_24, "Person2", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        adapter = new TinNhanAdapter(getActivity(), list);
        listView = view.findViewById(R.id.listviewtinnhan);
        listView.setAdapter(adapter);
        return view;
    }
}
