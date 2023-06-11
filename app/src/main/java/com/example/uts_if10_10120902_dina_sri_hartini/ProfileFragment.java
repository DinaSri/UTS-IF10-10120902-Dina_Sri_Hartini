package com.example.uts_if10_10120902_dina_sri_hartini;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;



/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // TODO: Rename and change types of parameters
            getArguments().getString(ARG_PARAM1);
            getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);



        TextView whatsapp = view.findViewById(R.id.text_whatsapp);
        TextView facebook = view.findViewById(R.id.text_facebook);
        TextView instagram = view.findViewById(R.id.text_instagram);
        TextView email = view.findViewById(R.id.text_email);
        TextView find_me = view.findViewById(R.id.text_find_me);
        TextView about_apps = view.findViewById(R.id.text_about_apps);

        // whatsapp
        whatsapp.setOnClickListener(view1 -> myWhatsapp());
        // facebook
        facebook.setOnClickListener(view1 -> myFacebook());
        // instagram
        instagram.setOnClickListener(view1 -> myInstagram());
        // email
        email.setOnClickListener(view1 -> myEmail());
        // find me
        find_me.setOnClickListener(view1 -> myLocation());
        // about apps
        about_apps.setOnClickListener(view1 -> alert());

        return view;
    }


    //my instagram
    private void myWhatsapp() {
        String url = "https://wa.me/6281316114140";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    //my instagram
    private void myFacebook() {
        String url = "https://www.facebook.com/profile.php?id=100007025054761";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    //my instagram
    private void myInstagram() {
        String url = "https://www.instagram.com/mn_kholiq11/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    //my email
    private void myEmail() {
        String url = "mailto:nurkholiq.10119902@mahasiswa.unikom.ac.id";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    //my location
    private void myLocation() {
        String url = "https://goo.gl/maps/mP5bGGknNyrMMon96";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    // costum dialog
    private void alert() {
        final Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.activity_profile_dialog);


        TextView textTitle = dialog.findViewById(R.id.txtWarningDialogTitle);
        TextView text = dialog.findViewById(R.id.txtWarningDialogDesc);
        Button dialogButton = dialog.findViewById(R.id.btnWarningDialogOk);



        dialogButton.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }
}
