package hmh.android.tools;

import java.io.IOException;

import android.content.Context;
import android.content.Intent;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;

/**
 * Combines android.location.Location and android.location.Address
 * 
 * @author Habeeb Hooshmand
 * 
 */
public class LocationInfo {

    private String Line = null;

    private String country = null;
    private String countryCode = null;
    private String city = null;
    private String attraction = null;
    private String phone = null;
    private String state = null;

    private Double latitude = null;
    private Double longitude = null;
    private Double speed = null;
    private Double accuracy = null;
    private String provider = null;
    private Double bearing = null;

    private Context ct = null;
    private Location loc = null;
    private android.location.Address adr;
    private int idx = 0;

    /**
     * Sets Up the Info Based on Latitude and Longitude
     * 
     * @param l
     * @param ctxt
     * @param Address
     * @author Habeeb Hooshmand
     */
    public LocationInfo(Double Latitude, Double Longitude, Context ctxt,
	    int AddressNumber, boolean gps) {
	ct = ctxt;
	Geocoder gc = new Geocoder(ctxt);
	if (isNet() && gps == false) {
	    loc = new Location(LocationManager.NETWORK_PROVIDER);
	} else {
	    loc = new Location(LocationManager.GPS_PROVIDER);
	}

	loc.setLatitude(latitude);
	loc.setLongitude(longitude);

	idx = AddressNumber;

	if (isNet()) {
	    try {
		adr = gc.getFromLocation(loc.getLatitude(), loc.getLongitude(),
			1).get(idx);
	    } catch (IOException e) {
		e.printStackTrace();
	    }

	    setAll();
	}
    }

    /**
     * Sets up the Info based on Location
     * 
     * @param l
     * @param ctxt
     * @param AddressPossibility
     * @author Habeeb Hooshmand
     */
    public LocationInfo(Location l, Context ctxt, int AddressPossibility) {
	ct = ctxt;
	Geocoder gc = new Geocoder(ctxt);
	loc = l;
	idx = AddressPossibility;

	if (isNet()) {
	    try {
		adr = gc.getFromLocation(loc.getLatitude(), loc.getLongitude(),
			1).get(idx);
	    } catch (IOException e) {
		e.printStackTrace();
	    }

	    setAll();
	}
    }

    /**
     * Sets All values for Address
     * 
     * @author Habeeb Hooshmand
     */
    private void setAll() {

	Line = adr.getAddressLine(idx) + ".";
	country = adr.getCountryName();
	countryCode = adr.getCountryCode();
	city = adr.getLocality();
	attraction = adr.getFeatureName();
	phone = adr.getPhone();
	state = adr.getAdminArea();
	latitude = loc.getLatitude();
	longitude = loc.getLongitude();

    }

    /**
     * Checks for Network Connection
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    private boolean isNet() {
	ConnectivityManager cm = (ConnectivityManager) ct
		.getSystemService(Context.CONNECTIVITY_SERVICE);
	NetworkInfo ni = cm.getActiveNetworkInfo();
	if (ni != null) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public Double getLatitude() {
	if (latitude != null) {
	    return latitude;
	} else if (isNet() == false) {
	    return -2.0;
	} else {
	    return -1.0;
	}
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public Double getLongitude() {
	if (longitude != null) {
	    return longitude;
	} else if (isNet() == false) {
	    return -2.0;
	} else {
	    return -1.0;
	}
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public String getAddress() {

	if (Line != null) {
	    return Line;
	} else if (isNet() == false) {
	    return "Error No Network Connection";
	} else {
	    return "N/A";
	}
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public String getCountry() {
	if (country != null) {
	    return country;
	} else if (isNet() == false) {
	    return "Error No Network Connection";
	} else {
	    return "N/A";
	}
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public String getCountryCode() {
	if (countryCode != null) {
	    return countryCode;
	} else if (isNet() == false) {
	    return "Error No Network Connection";
	} else {
	    return "N/A";
	}
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public String getCity() {
	if (city != null) {
	    return city;
	} else if (isNet() == false) {
	    return "Error No Network Connection";
	} else {
	    return "N/A";
	}
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public String getFeature() {
	if (attraction != null) {
	    return attraction;
	} else if (isNet() == false) {
	    return "Error No Network Connection";
	} else {
	    return "N/A";
	}
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public String getPhone() {
	if (phone != null) {
	    return phone;
	} else if (isNet() == false) {
	    return "Error No Network Connection";
	} else {
	    return "N/A";
	}
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public String getState() {
	if (state != null) {
	    return state;
	} else if (isNet() == false) {
	    return "Error No Network Connection";
	} else {
	    return "N/A";
	}
    }

    /**
     * Gets The location
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public Location getLocation() {
	return loc;
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public Double getSpeed() {
	if (speed != null) {
	    return speed;
	} else if (isNet() == false) {
	    return -2.0;
	} else {
	    return -1.0;
	}
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public Double getAccuracy() {
	if (accuracy != null) {
	    return accuracy;
	} else if (isNet() == false) {
	    return -2.0;
	} else {
	    return -1.0;
	}
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public String getProvider() {
	if (provider != null) {
	    return provider;
	} else if (isNet() == false) {
	    return "Error No network Available";
	} else {
	    return "N/A";
	}
    }

    /**
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public Double getBearing() {
	if (bearing != null) {
	    return bearing;
	} else if (isNet() == false) {
	    return -2.0;
	} else {
	    return -1.0;
	}
    }

    /**
     * Gets Full Address
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public String getFullAddress() {
	if (isNet()) {
	    return getAddress() + " " + getCity() + ", " + getState() + " "
		    + getCountry() + " (" + getCountryCode() + ")";
	} else {
	    return "Error: No Network Connection";
	}
    }

    /**
     * Gets all Adress Components
     * 
     * @author Habeeb Hooshmand
     * @return
     */
    public String getAll() {

	if (isNet()) {
	    return "Address: " + getAddress() + "\nCity: " + getCity()
		    + "\nState: " + getState() + "\nCountry: " + getCountry()
		    + " (" + getCountryCode() + ")\nFeature: " + getFeature()
		    + "\nPhone Number: " + getPhone();
	} else {
	    return "Error: No Network Connection";
	}
    }

    /**
     * Opens up the Location in Google Maps
     * 
     * @author Habeeb Hooshmand
     */
    public void openMap() {
	Uri uri = Uri.parse("geo:" + (loc.getLatitude()) + ","
		+ loc.getLongitude());
	Intent i = new Intent(Intent.ACTION_VIEW, uri);
	ct.startActivity(i);
    }

}