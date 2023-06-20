package com.bytedance.sdk.openadsdk.core.video.d;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.f;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.b.b.b.i;
import com.bytedance.sdk.openadsdk.b.b.b.j;
import com.bytedance.sdk.openadsdk.b.b.b.k;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import l3.c;
import n3.a;
import org.json.JSONObject;

/* compiled from: VideoPreloadFactory.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final n3.a f12857a = new x2.a();

    private static void b(c cVar, n nVar, AdSlot adSlot) {
        if (a(cVar)) {
            com.bytedance.sdk.openadsdk.b.b.a.a.a(new com.bytedance.sdk.openadsdk.b.b.b.a(nVar, u.b(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.b.b.a.a.a(nVar, (String) null, -1, cVar.B()), new k(cVar.z(), cVar.x() ? cVar.v() : cVar.h())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(c cVar, n nVar, AdSlot adSlot) {
        if (a(cVar)) {
            com.bytedance.sdk.openadsdk.b.b.a.a.d(new com.bytedance.sdk.openadsdk.b.b.b.a(nVar, u.b(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.b.b.a.a.a(nVar, (String) null, -1, cVar.B()), new i(cVar.z(), cVar.h())));
        }
    }

    public static void a(final c cVar, final a.InterfaceC0454a interfaceC0454a) {
        AdSlot adSlot;
        if ((cVar.h() > 0 || cVar.x()) && cVar.B() != -2) {
            cVar.o(6000);
            cVar.s(6000);
            cVar.t(6000);
            boolean z10 = false;
            boolean z11 = cVar.r("material_meta") != null && (cVar.r("material_meta") instanceof n);
            if (cVar.r("ad_slot") != null && (cVar.r("ad_slot") instanceof AdSlot)) {
                z10 = true;
            }
            n nVar = null;
            if (z11 && z10) {
                nVar = (n) cVar.r("material_meta");
                adSlot = (AdSlot) cVar.r("ad_slot");
                b(cVar, nVar, adSlot);
            } else {
                adSlot = null;
            }
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final n nVar2 = nVar;
            final AdSlot adSlot2 = adSlot;
            a.InterfaceC0454a interfaceC0454a2 = new a.InterfaceC0454a() { // from class: com.bytedance.sdk.openadsdk.core.video.d.a.1
                @Override // n3.a.InterfaceC0454a
                public void a(c cVar2, int i10) {
                    a.InterfaceC0454a interfaceC0454a3 = a.InterfaceC0454a.this;
                    if (interfaceC0454a3 != null) {
                        interfaceC0454a3.a(cVar2, i10);
                    }
                    if (nVar2 != null && adSlot2 != null) {
                        a.b(cVar, nVar2, adSlot2, SystemClock.elapsedRealtime() - elapsedRealtime);
                    }
                    l.a("VideoPreloadUtils", "onVideoPreloadSuccess: ", cVar.A());
                }

                @Override // n3.a.InterfaceC0454a
                public void b(c cVar2, int i10) {
                    AdSlot adSlot3;
                    a.InterfaceC0454a interfaceC0454a3 = a.InterfaceC0454a.this;
                    if (interfaceC0454a3 != null) {
                        interfaceC0454a3.a(cVar2, i10);
                    }
                    n nVar3 = nVar2;
                    if (nVar3 != null && (adSlot3 = adSlot2) != null) {
                        a.c(cVar, nVar3, adSlot3);
                    }
                    l.a("VideoPreloadUtils", "cancel: ", cVar.A());
                }

                @Override // n3.a.InterfaceC0454a
                public void a(c cVar2, int i10, String str) {
                    a.InterfaceC0454a interfaceC0454a3 = a.InterfaceC0454a.this;
                    if (interfaceC0454a3 != null) {
                        interfaceC0454a3.a(cVar2, i10, str);
                    }
                    if (nVar2 != null && adSlot2 != null) {
                        a.b(cVar, nVar2, adSlot2, SystemClock.elapsedRealtime() - elapsedRealtime, i10, str);
                    }
                    l.a("VideoPreloadUtils", "onVideoPreloadFail: ", cVar.A());
                }
            };
            if (!a(cVar.z())) {
                if (interfaceC0454a != null) {
                    interfaceC0454a.a(cVar, TTAdConstant.DEEPLINK_FALLBACK_CODE, "unexpected url: " + cVar.z());
                }
                b(cVar, nVar, adSlot, SystemClock.elapsedRealtime() - elapsedRealtime, -1, "video url is invalid");
            } else if (cVar.B() == 1) {
            } else {
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        f12857a.a(m.a(), cVar, interfaceC0454a2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                e3.a.a().b(cVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(c cVar, n nVar, AdSlot adSlot, long j10, int i10, String str) {
        if (a(cVar)) {
            String b10 = u.b(adSlot.getDurationSlotType());
            JSONObject a10 = com.bytedance.sdk.openadsdk.b.b.a.a.a(nVar, (String) null, -1, cVar.B());
            j jVar = new j();
            jVar.a(cVar.z());
            jVar.a(cVar.h());
            jVar.b(j10);
            jVar.a(i10);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jVar.b(str);
            jVar.c("");
            com.bytedance.sdk.openadsdk.b.b.a.a.c(new com.bytedance.sdk.openadsdk.b.b.b.a(nVar, b10, a10, jVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(c cVar, n nVar, AdSlot adSlot, long j10) {
        if (a(cVar)) {
            String b10 = u.b(adSlot.getDurationSlotType());
            JSONObject a10 = com.bytedance.sdk.openadsdk.b.b.a.a.a(nVar, (String) null, -1, cVar.B());
            com.bytedance.sdk.openadsdk.b.b.b.l lVar = new com.bytedance.sdk.openadsdk.b.b.b.l();
            lVar.a(cVar.z());
            lVar.a(cVar.h());
            lVar.b(j10);
            if (cVar.F() == 1) {
                lVar.c(1L);
            } else {
                lVar.c(0L);
            }
            com.bytedance.sdk.openadsdk.b.b.a.a.b(new com.bytedance.sdk.openadsdk.b.b.b.a(nVar, b10, a10, lVar));
        }
    }

    private static boolean a(c cVar) {
        return Build.VERSION.SDK_INT >= 23 || cVar.B() != 0;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        return f.c(str) != null;
    }
}
