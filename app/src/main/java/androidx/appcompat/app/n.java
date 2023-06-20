package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: TwilightManager.java */
/* loaded from: classes.dex */
class n {

    /* renamed from: d  reason: collision with root package name */
    private static n f936d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f937a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f938b;

    /* renamed from: c  reason: collision with root package name */
    private final a f939c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TwilightManager.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f940a;

        /* renamed from: b  reason: collision with root package name */
        long f941b;

        a() {
        }
    }

    n(Context context, LocationManager locationManager) {
        this.f937a = context;
        this.f938b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n a(Context context) {
        if (f936d == null) {
            Context applicationContext = context.getApplicationContext();
            f936d = new n(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f936d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location c10 = androidx.core.content.c.b(this.f937a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c11 = androidx.core.content.c.b(this.f937a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c11 == null || c10 == null) ? c11 != null ? c11 : c10 : c11.getTime() > c10.getTime() ? c11 : c10;
    }

    private Location c(String str) {
        try {
            if (this.f938b.isProviderEnabled(str)) {
                return this.f938b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f939c.f941b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f939c;
        long currentTimeMillis = System.currentTimeMillis();
        m b10 = m.b();
        b10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b10.f935c == 1;
        long j11 = b10.f934b;
        long j12 = b10.f933a;
        b10.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = b10.f934b;
        if (j11 == -1 || j12 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j12 ? j13 + 0 : currentTimeMillis > j11 ? j12 + 0 : j11 + 0) + 60000;
        }
        aVar.f940a = z10;
        aVar.f941b = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f939c;
        if (e()) {
            return aVar.f940a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f940a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
