package com.example.creativedesgin.Views;

import android.content.Context;
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
 * {@link FragmentTabTwo.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentTabTwo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTabTwo extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    ImageView carImage , foodImage ,fristtimeImage,secondtimeImage ,menImage ,womenImage,
            carfazaaImage,foodfazaaImage ,carfazaaNumImage ,foodfazaaNumImage;
    TextView fristRequestText ,secondRequestText ,fristtimeText,secondtimeText,womenText,menText,foodfazaaText
            ,carFazaaText,carFazaaNumText, foodFazaaNumText;
    Button cancelCarRequest,cancelFoodRequest;
    View lineview;


    public FragmentTabTwo() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentTabTwo.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentTabTwo newInstance(String param1, String param2) {
        FragmentTabTwo fragment = new FragmentTabTwo();
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
        View tab2view = inflater.inflate(R.layout.fragment_tab_two, container, false);

        carImage=tab2view.findViewById(R.id.carimageView);
        foodImage=tab2view.findViewById(R.id.cookimageView);
        fristtimeImage=tab2view.findViewById(R.id.time_image);
        secondtimeImage=tab2view.findViewById(R.id.time2_image);
        menImage=tab2view.findViewById(R.id.men_image);
        womenImage=tab2view.findViewById(R.id.women_image);
        carfazaaImage=tab2view.findViewById(R.id.fazaa_car_image);
        foodfazaaImage=tab2view.findViewById(R.id.fazaa_eat_image);
        carfazaaNumImage=tab2view.findViewById(R.id.fazaa_number_image);
        foodfazaaNumImage=tab2view.findViewById(R.id.fazaa_number2_image);
        fristRequestText=tab2view.findViewById(R.id.fristRequestTextView);
        secondRequestText=tab2view.findViewById(R.id.secondRequest_textView);
        fristtimeText=tab2view.findViewById(R.id.time_text);
        secondtimeText=tab2view.findViewById(R.id.time2_text);
        menText=tab2view.findViewById(R.id.men_text);
        womenText=tab2view.findViewById(R.id.women_text);
        carFazaaText=tab2view.findViewById(R.id.fazaa_car_text);
        foodfazaaText=tab2view.findViewById(R.id.fazaa_eat_text);
        carFazaaNumText=tab2view.findViewById(R.id.fazaa_number_text);
        foodFazaaNumText=tab2view.findViewById(R.id.fazaa_number2_text);
        cancelCarRequest=tab2view.findViewById(R.id.end_button);
        cancelFoodRequest=tab2view.findViewById(R.id.end_button2);
        lineview=tab2view.findViewById(R.id.lineview);

        return tab2view ;
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
