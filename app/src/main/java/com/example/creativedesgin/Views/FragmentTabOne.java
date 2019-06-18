package com.example.creativedesgin.Views;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.creativedesgin.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentTabOne.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentTabOne#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTabOne extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    ImageView carImage , foodImage ,fristtimeImage,secondtimeImage ,menImage ,womenImage,cicleImage,
            carfazaaImage,foodfazaaImage ,carfazaaNumImage ,foodfazaaNumImage;
    TextView fristRequestText ,secondRequestText ,fristtimeText,secondtimeText,womenText,menText,foodfazaaText
            ,carFazaaText,carFazaaNumText, foodFazaaNumText;
    Button cancelCarRequest,cancelFoodRequest;

    View lineview;

    public FragmentTabOne() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentTabOne.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentTabOne newInstance(String param1, String param2) {
        FragmentTabOne fragment = new FragmentTabOne();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View tabview = inflater.inflate(R.layout.fragment_tab_one, container, false);
           carImage=tabview.findViewById(R.id.carimageView);
           foodImage=tabview.findViewById(R.id.cookimageView);
           fristtimeImage=tabview.findViewById(R.id.time_image);
           secondtimeImage=tabview.findViewById(R.id.time2_image);
           menImage=tabview.findViewById(R.id.men_image);
           womenImage=tabview.findViewById(R.id.women_image);
           carfazaaImage=tabview.findViewById(R.id.fazaa_car_image);
           foodfazaaImage=tabview.findViewById(R.id.fazaa_eat_image);
           carfazaaNumImage=tabview.findViewById(R.id.fazaa_number_image);
           foodfazaaNumImage=tabview.findViewById(R.id.fazaa_number2_image);
           fristRequestText=tabview.findViewById(R.id.fristRequestTextView);
           secondRequestText=tabview.findViewById(R.id.secondRequest_textView);
           fristtimeText=tabview.findViewById(R.id.time_text);
           secondtimeText=tabview.findViewById(R.id.time2_text);
           menText=tabview.findViewById(R.id.men_text);
           womenText=tabview.findViewById(R.id.women_text);
           carFazaaText=tabview.findViewById(R.id.fazaa_car_text);
           foodfazaaText=tabview.findViewById(R.id.fazaa_eat_text);
           carFazaaNumText=tabview.findViewById(R.id.fazaa_number_text);
           foodFazaaNumText=tabview.findViewById(R.id.fazaa_number2_text);
           cancelCarRequest=tabview.findViewById(R.id.end_button);
           cancelFoodRequest=tabview.findViewById(R.id.end_button2);
           lineview=tabview.findViewById(R.id.lineview);
           cicleImage=tabview.findViewById(R.id.yourCircularImageView);


        return tabview;


    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
