package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LocationInfo.java */
/* loaded from: classes3.dex */
public class iu implements LocationListener {

    /* renamed from: c  reason: collision with root package name */
    private static final String f25792c = iu.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f25793e = false;

    /* renamed from: a  reason: collision with root package name */
    LocationManager f25794a;

    /* renamed from: b  reason: collision with root package name */
    GoogleApiClient f25795b;

    /* renamed from: d  reason: collision with root package name */
    private HandlerThread f25796d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocationInfo.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final iu f25799a = new iu((byte) 0);
    }

    /* synthetic */ iu(byte b10) {
        this();
    }

    public static boolean c() {
        try {
            if (!hw.a(ho.c(), "android.permission.ACCESS_FINE_LOCATION")) {
                if (!hw.a(ho.c(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean g() {
        return false;
    }

    private Location h() {
        Location location;
        Location location2;
        try {
        } catch (Exception unused) {
            location = null;
        }
        if (e() && c()) {
            location = f25793e ? i() : null;
            try {
                if (this.f25794a != null && hw.a(ho.c(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    location2 = a(2, 2);
                }
            } catch (Exception unused2) {
            }
            location2 = null;
        } else {
            location = null;
            location2 = null;
        }
        if (location == null && location2 == null) {
            return null;
        }
        if (location == null) {
            location2.getTime();
            return location2;
        } else if (location2 == null) {
            location.getTime();
            return location;
        } else {
            long time = location.getTime() - location2.getTime();
            boolean z10 = time > 120000;
            boolean z11 = time < -120000;
            boolean z12 = time > 0;
            if (z10) {
                location.getTime();
                return location;
            } else if (z11) {
                location2.getTime();
                return location2;
            } else {
                int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
                boolean z13 = accuracy > 0;
                boolean z14 = accuracy < 0;
                boolean z15 = accuracy > 200;
                if (!z14 && (!z12 || (z13 && z15))) {
                    location2.getTime();
                    return location2;
                }
                location.getTime();
                return location;
            }
        }
    }

    private static Location i() {
        try {
            return (Location) LocationServices.getFusedLocationProviderClient(ho.c()).getLastLocation().getResult();
        } catch (Exception unused) {
            return null;
        }
    }

    private Location j() {
        LocationManager locationManager = this.f25794a;
        Location location = null;
        if (locationManager != null) {
            List<String> providers = locationManager.getProviders(true);
            for (int size = providers.size() - 1; size >= 0; size--) {
                String str = providers.get(size);
                try {
                    if (this.f25794a.isProviderEnabled(str)) {
                        try {
                            location = this.f25794a.getLastKnownLocation(str);
                        } catch (SecurityException unused) {
                        }
                        if (location != null) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        return location;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        try {
            if (c() && e()) {
                if (this.f25794a != null) {
                    Criteria criteria = new Criteria();
                    criteria.setBearingAccuracy(2);
                    criteria.setPowerRequirement(2);
                    criteria.setCostAllowed(false);
                    String bestProvider = this.f25794a.getBestProvider(criteria, true);
                    if (bestProvider != null) {
                        this.f25794a.requestSingleUpdate(bestProvider, this, this.f25796d.getLooper());
                    }
                }
                if (!g()) {
                    Context c10 = ho.c();
                    try {
                        GoogleApiClient googleApiClient = this.f25795b;
                        if (googleApiClient == null) {
                            GoogleApiClient build = new GoogleApiClient.Builder(c10).addConnectionCallbacks(new GoogleApiClient.ConnectionCallbacks() { // from class: com.inmobi.media.iu.2
                                @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
                                public final void onConnected(Bundle bundle) {
                                    String unused = iu.f25792c;
                                    boolean unused2 = iu.f25793e = true;
                                }

                                @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
                                public final void onConnectionSuspended(int i10) {
                                    boolean unused = iu.f25793e = false;
                                    String unused2 = iu.f25792c;
                                }
                            }).addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() { // from class: com.inmobi.media.iu.1
                                @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
                                public final void onConnectionFailed(ConnectionResult connectionResult) {
                                    boolean unused = iu.f25793e = false;
                                }
                            }).addApi(LocationServices.API).build();
                            this.f25795b = build;
                            build.connect();
                            return;
                        }
                        googleApiClient.connect();
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    public final synchronized HashMap<String, String> d() {
        HashMap<String, String> hashMap;
        HashMap<String, Object> a10;
        hashMap = new HashMap<>();
        iw.a();
        Location h10 = iw.g() ? h() : null;
        if (h10 != null) {
            a10 = a(h10, true, hw.a(ho.c(), "android.permission.ACCESS_FINE_LOCATION") ? a(1, 3) : null);
        } else {
            a10 = a(ig.c(), false, null);
        }
        for (Map.Entry<String, Object> entry : a10.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005b A[ADDED_TO_REGION] */
    @android.annotation.SuppressLint({"newApi"})
    @android.annotation.TargetApi(19)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r5 = this;
            android.content.Context r0 = com.inmobi.media.ho.c()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            r4 = 1
            if (r2 < r3) goto L1b
            android.location.LocationManager r0 = r5.f25794a
            if (r0 == 0) goto L1a
            boolean r0 = r0.isLocationEnabled()
            if (r0 == 0) goto L1a
            return r4
        L1a:
            return r1
        L1b:
            r3 = 19
            if (r2 < r3) goto L2f
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: android.provider.Settings.SettingNotFoundException -> L2a
            java.lang.String r2 = "location_mode"
            int r0 = android.provider.Settings.Secure.getInt(r0, r2)     // Catch: android.provider.Settings.SettingNotFoundException -> L2a
            goto L2b
        L2a:
            r0 = 0
        L2b:
            if (r0 == 0) goto L2e
            return r4
        L2e:
            return r1
        L2f:
            android.location.LocationManager r2 = r5.f25794a
            if (r2 == 0) goto L60
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r2 = com.inmobi.media.hw.a(r0, r2)     // Catch: java.lang.Exception -> L57
            if (r2 == 0) goto L46
            android.location.LocationManager r0 = r5.f25794a     // Catch: java.lang.Exception -> L57
            java.lang.String r2 = "gps"
            boolean r0 = r0.isProviderEnabled(r2)     // Catch: java.lang.Exception -> L57
            r2 = r0
            r0 = 0
            goto L59
        L46:
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.inmobi.media.hw.a(r0, r2)     // Catch: java.lang.Exception -> L57
            if (r0 == 0) goto L57
            android.location.LocationManager r0 = r5.f25794a     // Catch: java.lang.Exception -> L57
            java.lang.String r2 = "network"
            boolean r0 = r0.isProviderEnabled(r2)     // Catch: java.lang.Exception -> L57
            goto L58
        L57:
            r0 = 0
        L58:
            r2 = 0
        L59:
            if (r0 != 0) goto L5f
            if (r2 == 0) goto L5e
            goto L5f
        L5e:
            return r1
        L5f:
            return r4
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.iu.e():boolean");
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        LocationManager locationManager;
        if (location != null) {
            try {
                location.getTime();
                location.getLatitude();
                location.getLongitude();
                location.getAccuracy();
            } catch (Exception e10) {
                gg.a().a(new hg(e10));
                return;
            }
        }
        if (!c() || (locationManager = this.f25794a) == null) {
            return;
        }
        locationManager.removeUpdates(this);
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i10, Bundle bundle) {
    }

    private iu() {
        HandlerThread handlerThread = new HandlerThread("LThread");
        this.f25796d = handlerThread;
        handlerThread.start();
        Context c10 = ho.c();
        if (c10 != null) {
            this.f25794a = (LocationManager) c10.getSystemService("location");
        }
    }

    public static iu a() {
        return a.f25799a;
    }

    private Location a(int i10, int i11) {
        String bestProvider;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(i10);
        criteria.setPowerRequirement(i11);
        criteria.setCostAllowed(false);
        LocationManager locationManager = this.f25794a;
        Location location = null;
        if (locationManager == null || (bestProvider = locationManager.getBestProvider(criteria, true)) == null) {
            return null;
        }
        try {
            location = this.f25794a.getLastKnownLocation(bestProvider);
        } catch (Exception unused) {
        }
        return (location != null || i10 == 1) ? location : j();
    }

    private HashMap<String, Object> a(Location location, boolean z10, Location location2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        Context c10 = ho.c();
        if (c10 == null) {
            return hashMap;
        }
        if (location != null) {
            if (location.getTime() > 0) {
                hashMap.put("u-ll-ts", Long.valueOf(location.getTime()));
            }
            hashMap.put("u-latlong-accu", a(location));
            hashMap.put("sdk-collected", Integer.valueOf(z10 ? 1 : 0));
        }
        iw.a();
        if (iw.g()) {
            hashMap.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
        }
        if (location2 != null) {
            hashMap.put("u-latlong-accu-fine", a(location2));
            hashMap.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
        }
        if (e() && c()) {
            if (hw.a(c10, "android.permission.ACCESS_COARSE_LOCATION")) {
                hashMap.put("loc-granularity", "coarse");
            }
        } else {
            hashMap.put("loc-granularity", "none");
        }
        return hashMap;
    }

    private static String a(Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy());
    }
}
