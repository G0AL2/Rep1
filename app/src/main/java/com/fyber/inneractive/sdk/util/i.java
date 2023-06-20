package com.fyber.inneractive.sdk.util;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20287a = false;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f20288b;

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(r3) == 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r3, com.fyber.inneractive.sdk.util.i.a r4) {
        /*
            java.lang.Boolean r0 = com.fyber.inneractive.sdk.util.i.f20288b
            if (r0 != 0) goto L36
            r0 = 1
            int r1 = com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "com.google.android.gms.location.LocationServices"
            java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Lf
            com.fyber.inneractive.sdk.util.i.f20287a = r0     // Catch: java.lang.Throwable -> Lf
            goto L10
        Lf:
        L10:
            boolean r1 = com.fyber.inneractive.sdk.util.i.f20287a
            if (r1 == 0) goto L32
            r1 = 0
            com.google.android.gms.common.GoogleApiAvailability r2 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Throwable -> L20
            int r2 = r2.isGooglePlayServicesAvailable(r3)     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L2a
            goto L2b
        L20:
            r0 = move-exception
            java.lang.String r0 = com.fyber.inneractive.sdk.util.s.a(r0)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.d(r0, r2)
        L2a:
            r0 = 0
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.fyber.inneractive.sdk.util.i.f20288b = r0
            goto L36
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            com.fyber.inneractive.sdk.util.i.f20288b = r0
        L36:
            java.lang.Boolean r0 = com.fyber.inneractive.sdk.util.i.f20288b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5e
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = com.fyber.inneractive.sdk.util.l.b(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.fyber.inneractive.sdk.util.l.b(r0)
            if (r0 == 0) goto L5e
        L4e:
            com.google.android.gms.location.FusedLocationProviderClient r3 = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(r3)     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.tasks.Task r3 = r3.getLastLocation()     // Catch: java.lang.Throwable -> L5e
            com.fyber.inneractive.sdk.util.h r0 = new com.fyber.inneractive.sdk.util.h     // Catch: java.lang.Throwable -> L5e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L5e
            r3.addOnSuccessListener(r0)     // Catch: java.lang.Throwable -> L5e
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.i.a(android.content.Context, com.fyber.inneractive.sdk.util.i$a):void");
    }
}
