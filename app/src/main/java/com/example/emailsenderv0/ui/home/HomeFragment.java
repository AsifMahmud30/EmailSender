package com.example.emailsenderv0.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.emailsenderv0.Adapter;
import com.example.emailsenderv0.R;
//import com.example.emailsenderv0.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    //private FragmentHomeBinding binding;

    RecyclerView recyclerView;
    ArrayList<HomeViewModel> recipientEmailHolder;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        //HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        //binding = FragmentHomeBinding.inflate(inflater, container, false);
        //View root = binding.getRoot();

        View view= inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView= view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recipientEmailHolder= new ArrayList<>();

        HomeViewModel ob1=new HomeViewModel("Email 1", "Hello world");
        recipientEmailHolder.add(ob1);

        HomeViewModel ob2=new HomeViewModel("Email 2", "Hello world");
        recipientEmailHolder.add(ob2);

        HomeViewModel ob3=new HomeViewModel("Email 3", "Hello world");
        recipientEmailHolder.add(ob3);

        HomeViewModel ob4=new HomeViewModel("Email 4", "Hello world");
        recipientEmailHolder.add(ob4);

        HomeViewModel ob5=new HomeViewModel("Email 5", "Hello world");
        recipientEmailHolder.add(ob5);

        HomeViewModel ob6=new HomeViewModel("Email 6", "Hello world");
        recipientEmailHolder.add(ob6);

        HomeViewModel ob7=new HomeViewModel("Email 7", "Hello world");
        recipientEmailHolder.add(ob7);

        HomeViewModel ob8=new HomeViewModel("Email 8", "Hello world");
        recipientEmailHolder.add(ob8);

        HomeViewModel ob9=new HomeViewModel("Email 9", "Hello world");
        recipientEmailHolder.add(ob9);

        HomeViewModel ob10=new HomeViewModel("Email 10", "Hello world");
        recipientEmailHolder.add(ob10);


        recyclerView.setAdapter(new Adapter(recipientEmailHolder));


        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //binding = null;
    }
}