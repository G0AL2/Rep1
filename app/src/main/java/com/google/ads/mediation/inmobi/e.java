package com.google.ads.mediation.inmobi;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: InMobiMemoryCache.java */
/* loaded from: classes2.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Drawable> f20631a = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));

    /* renamed from: b  reason: collision with root package name */
    private long f20632b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long f20633c = 1000000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        e(Runtime.getRuntime().maxMemory() / 4);
    }

    private void a() {
        Log.i("MemoryCache", "cache size=" + this.f20632b + " length=" + this.f20631a.size());
        if (this.f20632b > this.f20633c) {
            Iterator<Map.Entry<String, Drawable>> it = this.f20631a.entrySet().iterator();
            while (it.hasNext()) {
                this.f20632b -= c(((BitmapDrawable) it.next().getValue()).getBitmap());
                it.remove();
                if (this.f20632b <= this.f20633c) {
                    break;
                }
            }
            Log.i("MemoryCache", "Clean cache. New size " + this.f20631a.size());
        }
    }

    private long c(Bitmap bitmap) {
        if (bitmap == null) {
            return 0L;
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    private void e(long j10) {
        this.f20633c = j10;
        Log.i("MemoryCache", "MemoryCache will use up to " + ((this.f20633c / 1024.0d) / 1024.0d) + "MB");
    }

    public Drawable b(String str) {
        try {
            if (this.f20631a.containsKey(str)) {
                return this.f20631a.get(str);
            }
            return null;
        } catch (NullPointerException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str, Drawable drawable) {
        try {
            if (this.f20631a.containsKey(str)) {
                this.f20632b -= c(((BitmapDrawable) this.f20631a.get(str)).getBitmap());
            }
            this.f20631a.put(str, drawable);
            this.f20632b += c(((BitmapDrawable) drawable).getBitmap());
            a();
            Log.d("MemoryCache", "Drawable used from cache");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
