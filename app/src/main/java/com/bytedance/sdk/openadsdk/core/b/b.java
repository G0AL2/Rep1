package com.bytedance.sdk.openadsdk.core.b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.g;
import com.bytedance.sdk.openadsdk.core.e.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.y;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.inmobi.media.au;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: ClickListener.java */
/* loaded from: classes.dex */
public class b extends c {
    private WeakReference<Activity> F;
    private boolean G;

    /* renamed from: a  reason: collision with root package name */
    private String f11867a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f11868b;

    /* renamed from: c  reason: collision with root package name */
    public j f11869c;

    /* renamed from: d  reason: collision with root package name */
    protected final n f11870d;

    /* renamed from: e  reason: collision with root package name */
    protected final String f11871e;

    /* renamed from: f  reason: collision with root package name */
    protected final int f11872f;

    /* renamed from: g  reason: collision with root package name */
    protected WeakReference<View> f11873g;

    /* renamed from: h  reason: collision with root package name */
    protected WeakReference<View> f11874h;

    /* renamed from: i  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.e.g f11875i;

    /* renamed from: j  reason: collision with root package name */
    protected a f11876j;

    /* renamed from: k  reason: collision with root package name */
    protected TTNativeAd f11877k;

    /* renamed from: l  reason: collision with root package name */
    protected m3.c f11878l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f11879m;

    /* renamed from: n  reason: collision with root package name */
    protected r3.c f11880n;

    /* renamed from: o  reason: collision with root package name */
    protected Map<String, Object> f11881o;

    /* renamed from: p  reason: collision with root package name */
    protected TTNativeExpressAd f11882p;

    /* renamed from: q  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.nativeexpress.a f11883q;

    /* renamed from: r  reason: collision with root package name */
    protected int f11884r;

    /* compiled from: ClickListener.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(View view, int i10);
    }

    public b(Context context, n nVar, String str, int i10) {
        this.f11879m = false;
        this.f11884r = 0;
        this.G = false;
        this.f11868b = context;
        this.f11870d = nVar;
        this.f11871e = str;
        this.f11872f = i10;
    }

    public void a(r3.c cVar) {
        this.f11880n = cVar;
    }

    public void b(View view) {
        if (view == null) {
            return;
        }
        this.f11874h = new WeakReference<>(view);
    }

    public void c(int i10) {
        this.f11898y = i10;
    }

    public void d(boolean z10) {
        this.f11879m = z10;
    }

    public View e() {
        WeakReference<Activity> weakReference = this.F;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.F.get().findViewById(t.e(m.a(), "tt_top_dislike"));
    }

    public String f() {
        return this.f11867a;
    }

    public static boolean c(View view) {
        return t.e(view.getContext(), "tt_reward_ad_download") == view.getId() || t.e(view.getContext(), "tt_reward_ad_download_backup") == view.getId() || t.e(view.getContext(), "tt_bu_download") == view.getId() || t.e(view.getContext(), "btn_native_creative") == view.getId() || t.e(view.getContext(), "tt_full_ad_download") == view.getId() || t.e(view.getContext(), "tt_playable_play") == view.getId();
    }

    public void a(com.bytedance.sdk.openadsdk.core.nativeexpress.a aVar) {
        this.f11883q = aVar;
    }

    public void b(int i10) {
        this.f11899z = i10;
    }

    public View d() {
        WeakReference<Activity> weakReference = this.F;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.F.get().findViewById(16908290);
    }

    public void a(TTNativeAd tTNativeAd) {
        this.f11877k = tTNativeAd;
    }

    public void a(TTNativeExpressAd tTNativeExpressAd) {
        this.f11882p = tTNativeExpressAd;
    }

    public void d(int i10) {
        this.f11884r = i10;
    }

    public void a(m3.c cVar) {
        this.f11878l = cVar;
    }

    public void a(a aVar) {
        this.f11876j = aVar;
    }

    public void a(Activity activity) {
        if (activity == null) {
            return;
        }
        this.F = new WeakReference<>(activity);
    }

    public void a(View view) {
        if (view == null) {
            return;
        }
        this.f11873g = new WeakReference<>(view);
    }

    public b(Context context, n nVar, String str, int i10, boolean z10) {
        this(context, nVar, str, i10);
        this.G = z10;
    }

    public void a(Map<String, Object> map) {
        this.f11881o = map;
    }

    public void a(int i10) {
        this.A = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.b.c
    public void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, boolean z10) {
        JSONObject jSONObject;
        int i10;
        n nVar;
        if (this.f11868b == null) {
            this.f11868b = m.a();
        }
        if ((this.G || !a(view, 1, f10, f11, f12, f13, sparseArray, z10)) && this.f11868b != null) {
            j jVar = this.f11869c;
            if (jVar != null) {
                int i11 = jVar.f12093l;
                jSONObject = jVar.f12094m;
                i10 = i11;
            } else {
                jSONObject = null;
                i10 = -1;
            }
            long j10 = this.f11896w;
            long j11 = this.f11897x;
            WeakReference<View> weakReference = this.f11873g;
            View view2 = weakReference == null ? null : weakReference.get();
            WeakReference<View> weakReference2 = this.f11874h;
            com.bytedance.sdk.openadsdk.core.e.g a10 = a(f10, f11, f12, f13, sparseArray, j10, j11, view2, weakReference2 == null ? null : weakReference2.get(), f(), v.e(this.f11868b), v.g(this.f11868b), v.f(this.f11868b), i10, jSONObject);
            this.f11875i = a10;
            if (this.G) {
                com.bytedance.sdk.openadsdk.b.e.a(this.f11868b, au.CLICK_BEACON, this.f11870d, a10, this.f11871e, true, this.f11881o, z10 ? 1 : 2);
                return;
            }
            a aVar = this.f11876j;
            if (aVar != null) {
                aVar.a(view, -1);
            }
            if (a(view, z10)) {
                boolean a11 = p.a(this.f11870d);
                String a12 = a11 ? this.f11871e : u.a(this.f11872f);
                if (view != null) {
                    try {
                        if (((Boolean) view.getTag(t.e(m.a(), "tt_id_is_video_picture"))).booleanValue()) {
                            y.a(true);
                        }
                    } catch (Exception unused) {
                    }
                }
                boolean a13 = y.a(this.f11868b, this.f11870d, this.f11872f, this.f11877k, this.f11882p, a12, this.f11880n, a11);
                y.a(false);
                if (a13 || (nVar = this.f11870d) == null || nVar.ab() == null || this.f11870d.ab().c() != 2) {
                    n nVar2 = this.f11870d;
                    if (nVar2 != null && !a13 && TextUtils.isEmpty(nVar2.O()) && com.bytedance.sdk.openadsdk.b.b.a(this.f11871e)) {
                        r3.d.a(this.f11868b, this.f11870d, this.f11871e).d();
                    }
                    com.bytedance.sdk.openadsdk.b.e.a(this.f11868b, au.CLICK_BEACON, this.f11870d, this.f11875i, this.f11871e, a13, this.f11881o, z10 ? 1 : 2);
                }
            }
        }
    }

    public boolean a(View view, boolean z10) {
        return a(view, this.f11870d, z10);
    }

    public static boolean a(View view, n nVar, boolean z10) {
        if (view != null && nVar != null) {
            String valueOf = String.valueOf(view.getTag(t.e(m.a(), "tt_id_click_tag")));
            if (view.getTag(t.e(m.a(), "tt_id_click_tag")) != null && !TextUtils.isEmpty(valueOf)) {
                if (au.CLICK_BEACON.equals(valueOf)) {
                    return z10;
                }
                return true;
            } else if (c(view)) {
                if (nVar.i() == 1 && !z10) {
                    return false;
                }
            } else if (nVar.h() == 1 && !z10) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.bytedance.sdk.openadsdk.core.e.g a(float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, long j10, long j11, View view, View view2, String str, float f14, int i10, float f15, int i11, JSONObject jSONObject) {
        return new g.a().f(f10).e(f11).d(f12).c(f13).b(j10).a(j11).b(v.a(view)).a(v.a(view2)).c(v.c(view)).d(v.c(view2)).d(this.f11898y).e(this.f11899z).f(this.A).a(sparseArray).b(h.d().b() ? 1 : 2).a(str).a(f14).c(i10).b(f15).a(i11).a(jSONObject).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, boolean z10) {
        if (this.f11883q != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.f11874h;
            if (weakReference != null) {
                iArr = v.a(weakReference.get());
                iArr2 = v.c(this.f11874h.get());
            }
            this.f11883q.a(view, i10, new j.a().d(f10).c(f11).b(f12).a(f13).b(this.f11896w).a(this.f11897x).c(iArr[0]).d(iArr[1]).e(iArr2[0]).f(iArr2[1]).a(sparseArray).a(z10).a());
            return true;
        }
        return false;
    }

    public void a(String str) {
        this.f11867a = str;
    }
}
