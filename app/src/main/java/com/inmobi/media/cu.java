package com.inmobi.media;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.view.OrientationEventListener;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: InMobiActivityOrientationHandler.java */
/* loaded from: classes3.dex */
public class cu extends OrientationEventListener {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<cw> f25023a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f25024b;

    /* renamed from: c  reason: collision with root package name */
    private final String f25025c;

    /* renamed from: d  reason: collision with root package name */
    private df f25026d;

    public cu(Activity activity) {
        super(activity.getApplicationContext());
        this.f25025c = cu.class.getSimpleName();
        this.f25026d = df.a(ic.b());
        this.f25024b = activity;
        this.f25023a = new HashSet<>();
    }

    private static int a(byte b10) {
        return (b10 == 3 || b10 == 4) ? 2 : 1;
    }

    private void b() {
        if (this.f25023a.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }

    private void c() {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f25024b.setRequestedOrientation(13);
        } else {
            this.f25024b.setRequestedOrientation(2);
        }
    }

    public final void a(cw cwVar) {
        this.f25023a.add(cwVar);
        b();
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i10) {
        a();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void a(dd ddVar) {
        if (ddVar == null) {
            return;
        }
        if (!ddVar.f25093a) {
            String str = ddVar.f25094b;
            str.hashCode();
            if (str.equals(DtbDeviceDataRetriever.ORIENTATION_PORTRAIT)) {
                this.f25024b.setRequestedOrientation(7);
                return;
            } else if (!str.equals(DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE)) {
                c();
                return;
            } else {
                this.f25024b.setRequestedOrientation(6);
                return;
            }
        }
        c();
    }

    public final void b(cw cwVar) {
        this.f25023a.remove(cwVar);
        b();
    }

    public final void a() {
        boolean z10 = this.f25024b.getResources().getConfiguration().orientation == a(ic.b());
        df a10 = df.a(ic.b());
        if (!z10 || this.f25026d.f25102e == a10.f25102e) {
            return;
        }
        this.f25026d = a10;
        a(a10);
    }

    private void a(df dfVar) {
        Iterator<cw> it = this.f25023a.iterator();
        while (it.hasNext()) {
            it.next().a(dfVar);
        }
    }
}
