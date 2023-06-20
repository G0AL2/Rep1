package com.bytedance.sdk.openadsdk.component.a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.b.b;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.HashMap;
import r3.c;
import r3.d;

/* compiled from: TTAppOpenAdClickManager.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f11335a = "open_ad";

    /* renamed from: b  reason: collision with root package name */
    private int f11336b = 4;

    /* renamed from: c  reason: collision with root package name */
    private a f11337c;

    /* renamed from: d  reason: collision with root package name */
    private c f11338d;

    public b(n nVar, Activity activity) {
        a aVar = new a(activity.getApplicationContext(), nVar, this.f11335a, this.f11336b);
        this.f11337c = aVar;
        aVar.a(activity.findViewById(16908290));
        this.f11337c.b(activity.findViewById(t.e(m.a(), "tt_top_dislike")));
        HashMap hashMap = new HashMap();
        hashMap.put("click_area", Integer.valueOf(nVar.c()));
        hashMap.put("openad_creative_type", n.c(nVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("click_scence", Integer.valueOf(p.i(nVar) ? 3 : 1));
        this.f11337c.a(hashMap);
        a(activity.getApplicationContext(), nVar);
    }

    private void a(Context context, n nVar) {
        if (a(nVar) == 4) {
            c a10 = d.a(context, nVar, "open_ad");
            this.f11338d = a10;
            this.f11337c.a(a10);
        }
    }

    public int a(n nVar) {
        if (nVar == null) {
            return -1;
        }
        return nVar.L();
    }

    public void a(b.a aVar) {
        a aVar2 = this.f11337c;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    public a a() {
        return this.f11337c;
    }
}
