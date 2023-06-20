package com.inmobi.media;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: NativeVideoAsset.java */
/* loaded from: classes3.dex */
public final class cg extends bt {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public Map<String, Object> G;
    private boolean H;

    /* renamed from: z  reason: collision with root package name */
    List<bt> f24925z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeVideoAsset.java */
    /* loaded from: classes3.dex */
    public static class a extends bu {
        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, cc ccVar) {
            super(i10, i11, i12, i13, i14, i15, i16, i17, "none", "straight", "#ff000000", "#00000000", ccVar);
        }
    }

    public cg(String str, String str2, bu buVar, dt dtVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, List<cf> list, JSONObject jSONObject, boolean z15) {
        super(str, str2, "VIDEO", buVar);
        this.f24813e = dtVar;
        this.f24817i = (byte) 2;
        this.A = z10;
        this.B = z11;
        this.C = z12;
        this.D = z13;
        this.f24925z = new ArrayList();
        this.H = z15;
        if (dtVar != null) {
            this.f24826r = dtVar.a();
            List<cf> d10 = dtVar.d();
            Map<String, String> map = null;
            if (list != null) {
                for (cf cfVar : list) {
                    if ("OMID_VIEWABILITY".equals(cfVar.f24922d)) {
                        map = cfVar.f24923e;
                        if (!TextUtils.isEmpty(cfVar.f24920b)) {
                            d10.add(cfVar);
                        }
                    } else {
                        d10.add(cfVar);
                    }
                }
            }
            for (cf cfVar2 : d10) {
                if ("OMID_VIEWABILITY".equals(cfVar2.f24922d)) {
                    cfVar2.f24923e = map;
                }
            }
            if (!d10.isEmpty()) {
                a(d10);
            }
        }
        if (jSONObject != null) {
            this.f24814f = jSONObject;
        }
        this.f24830v.put("placementType", (byte) 0);
        this.f24830v.put("lastVisibleTimestamp", Integer.valueOf((int) RecyclerView.UNDEFINED_DURATION));
        Map<String, Object> map2 = this.f24830v;
        Boolean bool = Boolean.FALSE;
        map2.put("visible", bool);
        this.f24830v.put("seekPosition", 0);
        this.f24830v.put("didStartPlaying", bool);
        this.f24830v.put("didPause", bool);
        this.f24830v.put("didCompleteQ1", bool);
        this.f24830v.put("didCompleteQ2", bool);
        this.f24830v.put("didCompleteQ3", bool);
        this.f24830v.put("didCompleteQ4", bool);
        this.f24830v.put("didRequestFullScreen", bool);
        this.f24830v.put("isFullScreen", bool);
        this.f24830v.put("didImpressionFire", bool);
        this.f24830v.put("mapViewabilityParams", new HashMap());
        this.f24830v.put("didSignalVideoCompleted", bool);
        this.f24830v.put("shouldAutoPlay", Boolean.valueOf(z14));
        this.f24830v.put("lastMediaVolume", 0);
        this.f24830v.put("currentMediaVolume", 0);
        this.f24830v.put("didQ4Fire", bool);
    }

    public final boolean a() {
        if (this.H) {
            return this.A && !ho.e();
        }
        return this.A;
    }

    public final dt b() {
        Object obj = this.f24813e;
        if (obj == null) {
            return null;
        }
        return (dt) obj;
    }

    public final void a(cg cgVar) {
        this.f24830v.putAll(cgVar.f24830v);
        this.G.putAll(cgVar.G);
        this.f24829u = cgVar.f24829u;
    }
}
