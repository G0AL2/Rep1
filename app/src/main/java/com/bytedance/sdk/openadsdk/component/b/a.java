package com.bytedance.sdk.openadsdk.component.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.g;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.ArrayList;
import java.util.List;
import l3.c;

/* compiled from: FeedAdManager.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f11347a;

    /* renamed from: b  reason: collision with root package name */
    private final n f11348b = m.f();

    private a() {
    }

    public static a a() {
        if (f11347a == null) {
            synchronized (a.class) {
                if (f11347a == null) {
                    f11347a = new a();
                }
            }
        }
        return f11347a;
    }

    public void a(final Context context, final AdSlot adSlot, final TTAdNative.FeedAdListener feedAdListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.f11348b.a(adSlot, new o(), 5, new n.a() { // from class: com.bytedance.sdk.openadsdk.component.b.a.1
            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(int i10, String str) {
                feedAdListener.onError(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                if (aVar.b() != null && !aVar.b().isEmpty()) {
                    List<com.bytedance.sdk.openadsdk.core.e.n> b10 = aVar.b();
                    ArrayList arrayList = new ArrayList(b10.size());
                    for (com.bytedance.sdk.openadsdk.core.e.n nVar : b10) {
                        if (com.bytedance.sdk.openadsdk.core.e.n.c(nVar)) {
                            arrayList.add(new b(context, nVar, 5, adSlot));
                        } else if (nVar.ao()) {
                            arrayList.add(new b(context, nVar, 5, adSlot));
                        }
                        if (com.bytedance.sdk.openadsdk.core.e.n.c(nVar) && nVar.J() != null && nVar.J().y() != null) {
                            if (m.h().b(String.valueOf(u.f(nVar))) && m.h().G()) {
                                if (nVar.J() != null) {
                                    nVar.J().s(1);
                                }
                                if (nVar.aF() != null) {
                                    nVar.aF().s(1);
                                }
                                c a10 = com.bytedance.sdk.openadsdk.core.e.n.a(CacheDirFactory.getICacheDir(nVar.aD()).a(), nVar);
                                a10.e("material_meta", nVar);
                                a10.e("ad_slot", adSlot);
                                com.bytedance.sdk.openadsdk.core.video.d.a.a(a10, null);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AdSlot adSlot2 = adSlot;
                        if (adSlot2 != null) {
                            if (!TextUtils.isEmpty(adSlot2.getBidAdm())) {
                                e.a(b10.get(0), "embeded_ad", System.currentTimeMillis() - currentTimeMillis);
                            } else {
                                e.b(context, b10.get(0), u.b(adSlot.getDurationSlotType()), currentTimeMillis);
                            }
                        } else {
                            e.b(context, b10.get(0), u.b(5), currentTimeMillis);
                        }
                        feedAdListener.onFeedAdLoad(arrayList);
                        if (bVar.e() == null || bVar.e().isEmpty()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                        return;
                    }
                    feedAdListener.onError(-4, g.a(-4));
                    bVar.a(-4);
                    com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                    return;
                }
                feedAdListener.onError(-3, g.a(-3));
                bVar.a(-3);
                com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
            }
        });
    }
}
