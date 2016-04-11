package com.limosys.linedisp;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.limosys.ws.obj.displine.Ws_GetLineInfoDispatcherResult;

/**
 * Created by Andrii on 4/7/2016.
 */
public class LineObject extends Ws_GetLineInfoDispatcherResult {

    public BitmapDescriptor getBitmap() {
        return bitmap;
    }

    public void setBitmap(BitmapDescriptor bitmap) {
        this.bitmap = bitmap;
    }

    private BitmapDescriptor bitmap;

    public LatLng getPosition() {
        if(position == null) position = new LatLng(getAddress().getLat(), getAddress().getLon());
        return position;
    }

    private LatLng position;

}
