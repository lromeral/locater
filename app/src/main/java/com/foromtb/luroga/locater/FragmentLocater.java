package com.foromtb.luroga.locater;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * Created by LuisR on 09/07/2017.
 */

public class FragmentLocater extends Fragment {

    private ImageView mImagen;


    public static FragmentLocater newInstance() {
        
        Bundle args = new Bundle();
        
        FragmentLocater fragment = new FragmentLocater();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_locater,container,false);

        mImagen= (ImageView)v.findViewById(R.id.imagen);
        setHasOptionsMenu(true);
        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.fragment_locater_menu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuItem_buscar:

            default:
                return super.onOptionsItemSelected(item);

        }

    }
}
