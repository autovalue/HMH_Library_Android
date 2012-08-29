package hmh.android.adapter;

import hmh.util.annotation.DevStage;
import hmh.util.annotation.Stage;
import hmh.util.annotation.Working;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;

@DevStage(stage = Stage.RELEASE, working = Working.SOMETIMES)
public class LocationAdapter implements LocationListener {

    public Double lat = null;
    public Double lon = null;
    public Float accur = null;
    public Double alt = null;
    public String prov = null;
    public Float bear = null;
    public Float speed = null;

    @Override
    public void onLocationChanged(Location location) {

	if (location != null) {

	    lat = location.getLatitude();
	    lon = location.getLongitude();
	    accur = location.getAccuracy();
	    alt = location.getAltitude();
	    prov = location.getProvider();
	    bear = location.getBearing();
	    speed = location.getSpeed();
	}

    }

    @Override
    public void onProviderDisabled(String provider) {
	Log.i("PROVIDER", "DISABLED:" + provider);

    }

    @Override
    public void onProviderEnabled(String provider) {
	Log.i("PROVIDER", "ENABLED:" + provider);

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
	Log.i("EXTRAS", "" + extras);
	Log.i("Provider status", "" + status);
    }

}