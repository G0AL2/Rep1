package io.invertase.firebase.app;

import android.content.Context;
import android.util.Log;

/* compiled from: ReactNativeFirebaseApp.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f31992a;

    public static Context a() {
        return f31992a;
    }

    public static void b(Context context) {
        Log.d("ReactNativeFirebaseApp", "received application context.");
        f31992a = context;
    }
}
