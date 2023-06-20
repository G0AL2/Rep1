package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.b.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: InteractionManager.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.e.n f12497a;

    /* renamed from: b  reason: collision with root package name */
    private r3.c f12498b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f12499c;

    /* renamed from: d  reason: collision with root package name */
    private final TTNativeAd f12500d;

    /* renamed from: f  reason: collision with root package name */
    private String f12502f;

    /* renamed from: g  reason: collision with root package name */
    private TTNativeAd.AdInteractionListener f12503g;

    /* renamed from: h  reason: collision with root package name */
    private long f12504h;

    /* renamed from: e  reason: collision with root package name */
    private List<View> f12501e = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private Double f12505i = null;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.b.j f12506j = new com.bytedance.sdk.openadsdk.b.j();

    public l(Context context, TTNativeAd tTNativeAd, com.bytedance.sdk.openadsdk.core.e.n nVar, String str) {
        this.f12502f = com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("el`f``bXim");
        this.f12500d = tTNativeAd;
        this.f12497a = nVar;
        this.f12499c = context;
        this.f12502f = str;
        if (nVar.L() == 4) {
            this.f12498b = r3.d.a(context, nVar, this.f12502f);
        }
    }

    private EmptyView a(ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }

    static /* synthetic */ long c(l lVar) {
        long j10 = lVar.f12504h;
        while (true) {
            char c10 = ']';
            char c11 = ']';
            while (true) {
                switch (c10) {
                    case '\\':
                        switch (c11) {
                        }
                        c10 = '^';
                        c11 = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c11) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c11 = '[';
                            }
                        }
                        c10 = '^';
                        c11 = 'K';
                        break;
                    case '^':
                        if (c11 > 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return j10;
    }

    public com.bytedance.sdk.openadsdk.b.j a() {
        return this.f12506j;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x001d -> B:13:0x001f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x000c -> B:6:0x0010). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0014 -> B:13:0x001f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.View r3, int r4) {
        /*
            r2 = this;
            com.bytedance.sdk.openadsdk.TTNativeAd$AdInteractionListener r4 = r2.f12503g
            r0 = 95
            if (r4 == 0) goto Lc
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = r2.f12500d
            r4.onAdCreativeClick(r3, r1)
            goto L1f
        Lc:
            r3 = 94
            r4 = 125(0x7d, float:1.75E-43)
        L10:
            switch(r3) {
                case 94: goto L1b;
                case 95: goto L14;
                case 96: goto L17;
                default: goto L13;
            }
        L13:
            goto Lc
        L14:
            switch(r4) {
                case 94: goto L1f;
                case 95: goto Lc;
                case 96: goto L1f;
                default: goto L17;
            }
        L17:
            switch(r4) {
                case 55: goto L24;
                case 56: goto Lc;
                case 57: goto L24;
                default: goto L1a;
            }
        L1a:
            goto L24
        L1b:
            r3 = 39
            if (r4 != r3) goto L24
        L1f:
            r3 = 95
            r4 = 95
            goto L10
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.l.a(android.view.View, int):void");
    }

    public void a(final ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final TTNativeAd.AdInteractionListener adInteractionListener) {
        this.f12503g = adInteractionListener;
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.l.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                l.this.f12506j.a(System.currentTimeMillis(), x.a(viewGroup));
            }
        });
        this.f12501e = list;
        com.bytedance.sdk.openadsdk.b.e.a(this.f12497a);
        EmptyView a10 = a(viewGroup);
        if (a10 == null) {
            a10 = new EmptyView(this.f12499c, viewGroup);
            viewGroup.addView(a10);
        }
        a10.a();
        a10.setRefClickViews(list2);
        if (list != null) {
            for (View view2 : this.f12501e) {
                if (view2 != null) {
                    view2.setTag(com.bytedance.sdk.component.utils.t.e(m.a(), com.bytedance.sdk.component.e.c.a.a1657027613243dc("tu]j`ZotW\u007fcoibQ\u007fyrfffp")), Boolean.TRUE);
                }
            }
            list3.addAll(list);
        }
        a10.setRefCreativeViews(list3);
        HashMap hashMap = new HashMap();
        hashMap.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("cmk`oZudmgin"), 1);
        Context context = this.f12499c;
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f12497a;
        String str = this.f12502f;
        com.bytedance.sdk.openadsdk.core.b.b bVar = new com.bytedance.sdk.openadsdk.core.b.b(context, nVar, str, com.bytedance.sdk.openadsdk.utils.u.a(str));
        bVar.a(viewGroup);
        bVar.b(view);
        bVar.a(this.f12498b);
        bVar.a(this.f12500d);
        bVar.a(hashMap);
        bVar.a(new b.a() { // from class: com.bytedance.sdk.openadsdk.core.l.2
            @Override // com.bytedance.sdk.openadsdk.core.b.b.a
            public void a(View view3, int i10) {
                TTNativeAd.AdInteractionListener adInteractionListener2 = adInteractionListener;
                if (adInteractionListener2 != null) {
                    adInteractionListener2.onAdClicked(view3, l.this.f12500d);
                }
            }
        });
        Context context2 = this.f12499c;
        com.bytedance.sdk.openadsdk.core.e.n nVar2 = this.f12497a;
        String str2 = this.f12502f;
        com.bytedance.sdk.openadsdk.core.b.a aVar = new com.bytedance.sdk.openadsdk.core.b.a(context2, nVar2, str2, com.bytedance.sdk.openadsdk.utils.u.a(str2));
        aVar.a(viewGroup);
        aVar.b(view);
        aVar.a(this.f12498b);
        aVar.a(this.f12500d);
        aVar.a(hashMap);
        aVar.a(new b.a() { // from class: com.bytedance.sdk.openadsdk.core.l.3
            @Override // com.bytedance.sdk.openadsdk.core.b.b.a
            public void a(View view3, int i10) {
                TTNativeAd.AdInteractionListener adInteractionListener2 = adInteractionListener;
                if (adInteractionListener2 != null) {
                    adInteractionListener2.onAdCreativeClick(view3, l.this.f12500d);
                }
            }
        });
        a10.a(list2, bVar);
        a10.a(list3, aVar);
        a10.setCallback(new EmptyView.a() { // from class: com.bytedance.sdk.openadsdk.core.l.4
            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.a
            public void a() {
                l.this.f12506j.a(System.currentTimeMillis(), x.a(viewGroup));
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.a
            @Keep
            @JProtect
            public void a(View view3) {
                l.this.f12506j.a(System.currentTimeMillis(), x.a(viewGroup));
                l.this.f12504h = System.currentTimeMillis();
                HashMap hashMap2 = new HashMap();
                if (l.this.f12501e != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (View view4 : l.this.f12501e) {
                        if (view4 != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("whfwl"), view4.getWidth());
                                jSONObject.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("hdkdlq"), view4.getHeight());
                                jSONObject.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("amrke"), view4.getAlpha());
                            } catch (Throwable unused) {
                            }
                            jSONArray.put(jSONObject);
                        }
                    }
                    hashMap2.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("ilcdaZpnm~"), jSONArray.toString());
                }
                if (viewGroup != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("whfwl"), viewGroup.getWidth());
                        jSONObject2.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("hdkdlq"), viewGroup.getHeight());
                        jSONObject2.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("amrke"), viewGroup.getAlpha());
                    } catch (Throwable unused2) {
                    }
                    hashMap2.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("rnmw[sob\u007f"), jSONObject2.toString());
                }
                com.bytedance.sdk.openadsdk.b.e.a(l.this.f12499c, l.this.f12497a, l.this.f12502f, hashMap2, l.this.f12505i);
                TTNativeAd.AdInteractionListener adInteractionListener2 = adInteractionListener;
                if (adInteractionListener2 != null) {
                    adInteractionListener2.onAdShow(l.this.f12500d);
                }
                if (l.this.f12497a.ai()) {
                    com.bytedance.sdk.openadsdk.utils.u.a(l.this.f12497a, view3);
                }
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0076 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:12:0x007c A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0078 A[LOOP:0: B:8:0x0078->B:13:0x0078, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0076 -> B:8:0x0078). Please submit an issue!!! */
            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void a(boolean r7) {
                /*
                    r6 = this;
                    if (r7 != 0) goto L5a
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.l.this
                    long r0 = com.bytedance.sdk.openadsdk.core.l.c(r7)
                    r2 = 0
                    int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r7 <= 0) goto L5a
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    long r0 = java.lang.System.currentTimeMillis()
                    com.bytedance.sdk.openadsdk.core.l r4 = com.bytedance.sdk.openadsdk.core.l.this
                    long r4 = com.bytedance.sdk.openadsdk.core.l.c(r4)
                    long r0 = r0 - r4
                    r7.append(r0)
                    java.lang.String r0 = ""
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    com.bytedance.sdk.openadsdk.core.l r0 = com.bytedance.sdk.openadsdk.core.l.this
                    com.bytedance.sdk.openadsdk.b.j r0 = com.bytedance.sdk.openadsdk.core.l.a(r0)
                    long r4 = java.lang.System.currentTimeMillis()
                    android.view.ViewGroup r1 = r2
                    float r1 = com.bytedance.sdk.openadsdk.core.x.a(r1)
                    r0.a(r4, r1)
                    com.bytedance.sdk.openadsdk.core.l r0 = com.bytedance.sdk.openadsdk.core.l.this
                    com.bytedance.sdk.openadsdk.core.e.n r0 = com.bytedance.sdk.openadsdk.core.l.d(r0)
                    com.bytedance.sdk.openadsdk.core.l r1 = com.bytedance.sdk.openadsdk.core.l.this
                    java.lang.String r1 = com.bytedance.sdk.openadsdk.core.l.e(r1)
                    com.bytedance.sdk.openadsdk.core.l r4 = com.bytedance.sdk.openadsdk.core.l.this
                    com.bytedance.sdk.openadsdk.b.j r4 = com.bytedance.sdk.openadsdk.core.l.a(r4)
                    com.bytedance.sdk.openadsdk.b.e.a(r7, r0, r1, r4)
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.l.this
                    com.bytedance.sdk.openadsdk.core.l.a(r7, r2)
                    r7 = 64
                    goto L78
                L5a:
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.l.this
                    com.bytedance.sdk.openadsdk.b.j r7 = com.bytedance.sdk.openadsdk.core.l.a(r7)
                    long r0 = java.lang.System.currentTimeMillis()
                    android.view.ViewGroup r2 = r2
                    float r2 = com.bytedance.sdk.openadsdk.core.x.a(r2)
                    r7.a(r0, r2)
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.l.this
                    long r0 = java.lang.System.currentTimeMillis()
                    com.bytedance.sdk.openadsdk.core.l.a(r7, r0)
                L76:
                    r7 = 66
                L78:
                    switch(r7) {
                        case 64: goto L7c;
                        case 65: goto L76;
                        case 66: goto L7c;
                        default: goto L7b;
                    }
                L7b:
                    goto L78
                L7c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.l.AnonymousClass4.a(boolean):void");
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.a
            public void b() {
                if (l.c(l.this) > 0) {
                    com.bytedance.sdk.openadsdk.b.e.a((System.currentTimeMillis() - l.c(l.this)) + "", l.this.f12497a, l.this.f12502f, l.this.f12506j);
                    l.this.f12504h = 0L;
                }
            }
        });
        a10.setNeedCheckingShow(true);
    }

    public void a(Double d10) {
        this.f12505i = d10;
    }
}
