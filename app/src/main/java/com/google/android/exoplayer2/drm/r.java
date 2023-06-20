package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.p;
import da.a0;
import da.l0;
import da.p;
import ea.n0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jb.t;
import n8.u;

/* compiled from: HttpMediaDrmCallback.java */
/* loaded from: classes2.dex */
public final class r implements s {

    /* renamed from: a  reason: collision with root package name */
    private final a0.b f21129a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21130b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f21131c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f21132d;

    public r(String str, a0.b bVar) {
        this(str, false, bVar);
    }

    private static byte[] c(a0.b bVar, String str, byte[] bArr, Map<String, String> map) throws u {
        l0 l0Var = new l0(bVar.a());
        da.p a10 = new p.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        da.p pVar = a10;
        while (true) {
            try {
                da.n nVar = new da.n(l0Var, pVar);
                try {
                    byte[] V0 = n0.V0(nVar);
                    n0.n(nVar);
                    return V0;
                } catch (a0.e e10) {
                    String d10 = d(e10, i10);
                    if (d10 != null) {
                        i10++;
                        pVar = pVar.a().j(d10).a();
                        n0.n(nVar);
                    } else {
                        throw e10;
                    }
                }
            } catch (Exception e11) {
                throw new u(a10, (Uri) ea.a.e(l0Var.r()), l0Var.e(), l0Var.q(), e11);
            }
        }
    }

    private static String d(a0.e eVar, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = eVar.f29120b;
        if (!((i11 == 307 || i11 == 308) && i10 < 5) || (map = eVar.f29121c) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // com.google.android.exoplayer2.drm.s
    public byte[] a(UUID uuid, p.e eVar) throws u {
        String b10 = eVar.b();
        String D = n0.D(eVar.a());
        StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 15 + String.valueOf(D).length());
        sb2.append(b10);
        sb2.append("&signedRequest=");
        sb2.append(D);
        return c(this.f21129a, sb2.toString(), null, Collections.emptyMap());
    }

    @Override // com.google.android.exoplayer2.drm.s
    public byte[] b(UUID uuid, p.b bVar) throws u {
        String str;
        String b10 = bVar.b();
        if (this.f21131c || TextUtils.isEmpty(b10)) {
            b10 = this.f21130b;
        }
        if (!TextUtils.isEmpty(b10)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = j8.h.f32429e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = j8.h.f32427c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f21132d) {
                hashMap.putAll(this.f21132d);
            }
            return c(this.f21129a, b10, bVar.a(), hashMap);
        }
        throw new u(new p.b().i(Uri.EMPTY).a(), Uri.EMPTY, t.k(), 0L, new IllegalStateException("No license URL"));
    }

    public void e(String str, String str2) {
        ea.a.e(str);
        ea.a.e(str2);
        synchronized (this.f21132d) {
            this.f21132d.put(str, str2);
        }
    }

    public r(String str, boolean z10, a0.b bVar) {
        ea.a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f21129a = bVar;
        this.f21130b = str;
        this.f21131c = z10;
        this.f21132d = new HashMap();
    }
}
