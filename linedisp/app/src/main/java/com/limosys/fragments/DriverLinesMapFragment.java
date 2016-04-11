package com.limosys.fragments;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.limosys.activities.DriverLineActivity;
import com.limosys.linedisp.LineObject;
import com.limosys.linedisp.LinesListAdapter;
import com.limosys.linedisp.R;
import com.limosys.views.MapAndListButtonsPanel;
import com.limosys.ws.obj.Ws_Address;

import java.util.ArrayList;
import java.util.List;
public class DriverLinesMapFragment extends Fragment implements OnMapReadyCallback {

    View rootView;
    private GoogleMap map;
    private MapView mapView;

    List<Marker> listOfMarkers;

    private  FloatingActionButton fab;

    private LayoutInflater inflater;

    private LinesListAdapter listAdapter;

    public DriverLinesMapFragment() {

    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        this.inflater = inflater;

        rootView = inflater.inflate(R.layout.fragment_driver_lines_map, container, false);

        rootView.setBackgroundColor(Color.WHITE);

        ((DriverLineActivity) getActivity()).showToolbar();

        final ListView linesListView = (ListView) rootView.findViewById(R.id.driver_lines_list_view);
        linesListView.setVisibility(View.GONE);

        listAdapter = new LinesListAdapter(getContext(), createDataForTests(true));

        linesListView.setAdapter(listAdapter);

        mapView = (MapView) rootView.findViewById(R.id.driver_map_view);

        mapView.onCreate(savedInstanceState);

        mapView.getMapAsync(this);


        MapAndListButtonsPanel mapAndListButtonPanel = (MapAndListButtonsPanel) rootView.findViewById(R.id.map_and_list_buttons_panel);
        mapAndListButtonPanel.setCallback(new MapAndListButtonsPanel.MapAndListOnClickCallback() {

            @Override
            public void MapAndListOnClick(MapAndListButtonsPanel.MapOrListPanelAction action) {
                if (action == MapAndListButtonsPanel.MapOrListPanelAction.MAP) {
                    mapView.setVisibility(View.VISIBLE);
                    linesListView.setVisibility(View.GONE);
                    fab.setVisibility(View.VISIBLE);

                } else {
                    mapView.setVisibility(View.GONE);
                    linesListView.setVisibility(View.VISIBLE);
                    linesListView.setAdapter(listAdapter);
                    fab.setVisibility(View.GONE);
                }
            }
        });


        fab = (FloatingActionButton) rootView.findViewById(R.id.driver_fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showAllMarkersOnScreen();

            }

        });
        return rootView;
    }

    private void showAllMarkersOnScreen() {

        if (map == null || listOfMarkers == null) return;

        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        for (Marker marker : listOfMarkers) {
            builder.include(marker.getPosition());
        }
        LatLngBounds bounds = builder.build();

        int padding = 220; // offset from edges of the map in pixels
        CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, padding);

        map.animateCamera(cu);

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        if (googleMap == null) return;
        MapsInitializer.initialize(getContext());
        map = googleMap;
        map.getUiSettings().setMyLocationButtonEnabled(false);
        map.getUiSettings().setCompassEnabled(false);
        map.getUiSettings().setAllGesturesEnabled(true);
        map.getUiSettings().setZoomControlsEnabled(false);
        map.getUiSettings().setRotateGesturesEnabled(false);
        map.getUiSettings().setIndoorLevelPickerEnabled(false);
        map.getUiSettings().setZoomGesturesEnabled(true);
        map.setBuildingsEnabled(true);
        map.setIndoorEnabled(false);
        map.setTrafficEnabled(false);

        map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Toast.makeText(getActivity(), "id: " + marker.getId(), Toast.LENGTH_LONG).show();
                marker.remove();
                return true;
            }
        });

        drawLines();

    }

    private List<LineObject> createDataForTests(boolean forList) {
        List<LineObject> lineList = new ArrayList<LineObject>();

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 4; j++) {

                if(i%2 == 1 || j %2 == 1) continue;

                LineObject line1 = new LineObject();
                line1.setId(10);
                line1.setName("Batman's Cave");
                line1.setColorRgb("#abcabc");
                line1.setStatus("H");
                line1.setDesc("Awesome Shit comming here so what to do biatch!!!!");
                line1.setIncentiveAmount(10);
                line1.setReqCarsCounter(15);
                line1.setAddress(new Ws_Address());
                line1.getAddress().setLat(40.7405 + ((double) i) / 30);
                line1.getAddress().setLon(-73.99 + ((double) j) / 30);
                if(!forList)
                     line1.setBitmap(BitmapDescriptorFactory.fromBitmap(createBitmap(line1)));
                lineList.add(line1);
            }
        }
        return lineList;
    }


    private void drawLines() {
        final List<LineObject> tempArray = createDataForTests(false);
                map.clear();
                if (listOfMarkers == null) listOfMarkers = new ArrayList<Marker>();
                for (int i = 0; i < tempArray.size(); i++) {
                    listOfMarkers.add(map.addMarker(new MarkerOptions()
                            .position(tempArray.get(i).getPosition()).icon(tempArray.get(i).getBitmap())));
                }
        showAllMarkersOnScreen();
    }

    private Bitmap createBitmap(LineObject lineObject) {
        View cluster = inflater.inflate(R.layout.info_box_line,
                null);
        LinearLayout mainLayout = (LinearLayout) cluster.findViewById(R.id.line_info_box_layout);
        RelativeLayout carCircleLayout = (RelativeLayout) cluster.findViewById(R.id.car_line_circle);
        RelativeLayout moneyCircleLayout = (RelativeLayout) cluster.findViewById(R.id.money_line_circle);

        TextView titleTV = (TextView) cluster.findViewById(R.id.title_text);
        TextView moneyTV = (TextView) cluster.findViewById(R.id.money_text_view);
        TextView carTV = (TextView) cluster.findViewById(R.id.car_text_view);
        TextView commentText = (TextView) cluster.findViewById(R.id.comment_text);

        TextView etaTextView = (TextView) cluster.findViewById(R.id.info_box_eta_text_view);
        etaTextView.setBackgroundColor(Color.parseColor(lineObject.getColorRgb()));


        GradientDrawable shape = (GradientDrawable) mainLayout.getBackground();
        shape.setColor(Color.parseColor(lineObject.getColorRgb()));


        String lineDescriptionString = "";
        String[] descWordsArray = lineObject.getDesc().split(" ");
        if(descWordsArray.length > 3){
            for(String word : descWordsArray){
                if(lineDescriptionString.length() > 15){
                    lineDescriptionString += "...";
                    break;
                }
                if(!lineDescriptionString.equals("")) lineDescriptionString += " ";
                lineDescriptionString += word;
            }
        }


        if (lineObject.getIncentiveAmount() > 0 && !"C".equals(lineObject.getStatus())) {
            moneyTV.setText("$" + (int) lineObject.getIncentiveAmount());
            moneyTV.setTextColor(Color.parseColor(lineObject.getColorRgb()));
        } else {
            moneyCircleLayout.setVisibility(View.GONE);
        }

        if (lineObject.getReqCarsCounter() > 0 && !"C".equals(lineObject.getStatus())) {
            carTV.setText(String.valueOf(lineObject.getReqCarsCounter()));
            carTV.setTextColor(Color.parseColor(lineObject.getColorRgb()));
        } else {
            carCircleLayout.setVisibility(View.GONE);
        }

        if (lineObject.getDesc() != null) {
            commentText.setAlpha((float) 0.63);
            commentText.setText(lineDescriptionString);
        } else {
            commentText.setVisibility(View.GONE);
        }

        titleTV.setText(lineObject.getName());

        cluster.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
                View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
        cluster.layout(0, 0, cluster.getMeasuredWidth(), cluster.getMeasuredHeight());

        final Bitmap clusterBitmap = Bitmap.createBitmap(cluster.getMeasuredWidth(),
                cluster.getMeasuredHeight(), Bitmap.Config.ARGB_4444);

        Canvas canvas = new Canvas(clusterBitmap);
        cluster.draw(canvas);

        return clusterBitmap;
    }
}
