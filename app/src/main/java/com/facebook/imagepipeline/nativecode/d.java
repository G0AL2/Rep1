package com.facebook.imagepipeline.nativecode;

import android.os.Build;

/* compiled from: NativeJpegTranscoderSoLoader.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f14865a;

    public static synchronized void a() {
        synchronized (d.class) {
            if (!f14865a) {
                if (Build.VERSION.SDK_INT <= 16) {
                    try {
                        i7.a.e("fb_jpegturbo", 1);
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                i7.a.d("native-imagetranscoder");
                f14865a = true;
            }
        }
    }
}
