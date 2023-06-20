package com.inmobi.media;

import android.os.SystemClock;
import android.text.TextUtils;
import com.inmobi.media.fq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: VastResponse.java */
/* loaded from: classes3.dex */
public final class ds implements dt {

    /* renamed from: a  reason: collision with root package name */
    List<dn> f25168a;

    /* renamed from: b  reason: collision with root package name */
    public String f25169b;

    /* renamed from: c  reason: collision with root package name */
    public String f25170c;

    /* renamed from: d  reason: collision with root package name */
    public List<cf> f25171d;

    /* renamed from: e  reason: collision with root package name */
    public List<dm> f25172e;

    /* renamed from: f  reason: collision with root package name */
    public int f25173f;

    /* renamed from: g  reason: collision with root package name */
    private String f25174g;

    /* renamed from: h  reason: collision with root package name */
    private dm f25175h;

    /* renamed from: i  reason: collision with root package name */
    private fq.k f25176i;

    /* renamed from: j  reason: collision with root package name */
    private dn f25177j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ds(fq.k kVar) {
        this.f25177j = null;
        this.f25168a = new ArrayList();
        this.f25171d = new ArrayList();
        this.f25172e = new ArrayList();
        this.f25176i = kVar;
        this.f25173f = 0;
    }

    private static boolean a(double d10, double d11, double d12) {
        return d12 > d10 && d12 <= d11;
    }

    @Override // com.inmobi.media.dt
    public final String a() {
        return this.f25170c;
    }

    @Override // com.inmobi.media.dt
    public final String b() {
        dn dnVar;
        int i10;
        String str = this.f25174g;
        if (str != null) {
            return str;
        }
        be.a();
        List<String> f10 = be.f();
        dn dnVar2 = null;
        if (!f10.isEmpty()) {
            Iterator<dn> it = this.f25168a.iterator();
            while (it.hasNext()) {
                dnVar = it.next();
                if (f10.contains(dnVar.f25131a)) {
                    break;
                }
            }
        }
        dnVar = null;
        if (dnVar != null) {
            this.f25177j = dnVar;
            String str2 = dnVar.f25131a;
            this.f25174g = str2;
            return str2;
        }
        fq.k kVar = this.f25176i;
        double d10 = (kVar.optimalVastVideoSize * 2.0d) / 1048576.0d;
        double d11 = 1.0d;
        double d12 = (kVar.vastMaxAssetSize * 1.0d) / 1048576.0d;
        for (dn dnVar3 : this.f25168a) {
            String[] split = this.f25169b.split(":");
            try {
                i10 = (Integer.parseInt(split[1]) * 60) + Integer.parseInt(split[2]);
            } catch (ArrayIndexOutOfBoundsException e10) {
                i10 = 0;
                gg.a().a(new hg(e10));
            }
            double d13 = ((dnVar3.f25132b * d11) * i10) / 8192.0d;
            dnVar3.f25133c = d13;
            if (a(0.0d, d10, d13)) {
                dnVar = a(dnVar, dnVar3, d13);
            } else if (a(d10, d12, d13)) {
                dnVar2 = b(dnVar2, dnVar3, d13);
            }
            d11 = 1.0d;
        }
        a(dnVar, dnVar2);
        if (TextUtils.isEmpty(this.f25174g)) {
            fq.c cVar = this.f25176i.bitRate;
            if (!cVar.bitrate_mandatory && this.f25168a.size() != 0) {
                CountDownLatch countDownLatch = new CountDownLatch(this.f25168a.size());
                try {
                    try {
                        a(cVar, countDownLatch);
                        countDownLatch.await(cVar.headerTimeout, TimeUnit.MILLISECONDS);
                        for (dn dnVar4 : this.f25168a) {
                            double d14 = dnVar4.f25133c;
                            if (a(0.0d, d10, d14)) {
                                dnVar = a(dnVar, dnVar4, d14);
                            } else if (a(d10, d12, d14)) {
                                dnVar2 = b(dnVar2, dnVar4, d14);
                            }
                        }
                    } catch (Exception e11) {
                        gg.a().a(new hg(e11));
                        for (dn dnVar5 : this.f25168a) {
                            double d15 = dnVar5.f25133c;
                            if (a(0.0d, d10, d15)) {
                                dnVar = a(dnVar, dnVar5, d15);
                            } else if (a(d10, d12, d15)) {
                                dnVar2 = b(dnVar2, dnVar5, d15);
                            }
                        }
                    }
                    a(dnVar, dnVar2);
                } catch (Throwable th) {
                    for (dn dnVar6 : this.f25168a) {
                        double d16 = dnVar6.f25133c;
                        if (a(0.0d, d10, d16)) {
                            dnVar = a(dnVar, dnVar6, d16);
                        } else if (a(d10, d12, d16)) {
                            dnVar2 = b(dnVar2, dnVar6, d16);
                        }
                    }
                    a(dnVar, dnVar2);
                    throw th;
                }
            } else {
                return this.f25174g;
            }
        }
        return this.f25174g;
    }

    @Override // com.inmobi.media.dt
    public final List<dn> c() {
        return this.f25168a;
    }

    @Override // com.inmobi.media.dt
    public final List<cf> d() {
        return this.f25171d;
    }

    @Override // com.inmobi.media.dt
    public final List<dm> e() {
        return this.f25172e;
    }

    @Override // com.inmobi.media.dt
    public final dm f() {
        return this.f25175h;
    }

    private void a(fq.c cVar, CountDownLatch countDownLatch) {
        for (dn dnVar : this.f25168a) {
            final Cdo cdo = new Cdo(dnVar, cVar.headerTimeout, countDownLatch);
            cdo.f25145c = SystemClock.elapsedRealtime();
            Cdo.f25136d.execute(new Runnable() { // from class: com.inmobi.media.do.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        gy a10 = new hb(cdo.f25143a).a();
                        if (a10 != null) {
                            if (a10.a()) {
                                cdo.a(a10);
                                return;
                            }
                            Cdo cdo2 = cdo;
                            try {
                                iv.a().a(cdo2.f25143a.g());
                                iv.a().b(a10.d());
                                iv.a().c(SystemClock.elapsedRealtime() - cdo2.f25145c);
                                if (cdo2.f25144b.get() != null) {
                                    cdo2.f25144b.get().f25133c = (a10.f25628b * 1.0d) / 1048576.0d;
                                }
                                cdo2.a();
                            } catch (Exception e10) {
                                gg.a().a(new hg(e10));
                                cdo2.a();
                            }
                        }
                    } catch (Exception unused) {
                        String unused2 = Cdo.f25137e;
                        gw gwVar = new gw(-1, "Network request failed with unknown error");
                        gy gyVar = new gy();
                        gyVar.f25627a = gwVar;
                        cdo.a(gyVar);
                    }
                }
            });
        }
    }

    private ds(List<cf> list, fq.k kVar) {
        this(kVar);
        if (list.size() != 0) {
            this.f25171d = new ArrayList(list);
        }
    }

    private void a(dn dnVar, dn dnVar2) {
        if (dnVar != null) {
            this.f25177j = dnVar;
            this.f25174g = dnVar.f25131a;
        } else if (dnVar2 != null) {
            this.f25177j = dnVar2;
            this.f25174g = dnVar2.f25131a;
        }
    }

    public ds(String str, String str2, String str3, List<cf> list, List<dm> list2, fq.k kVar) {
        this(list, kVar);
        if (list2.size() != 0) {
            this.f25172e = new ArrayList(list2);
        }
        this.f25174g = str;
        this.f25168a.add(new dn(str));
        this.f25169b = str2;
        this.f25170c = str3;
    }

    @Override // com.inmobi.media.dt
    public final void a(dm dmVar) {
        this.f25175h = dmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(cf cfVar) {
        this.f25171d.add(cfVar);
    }

    private static dn a(dn dnVar, dn dnVar2, double d10) {
        return (dnVar != null && d10 <= dnVar.f25133c) ? dnVar : dnVar2;
    }

    private static dn b(dn dnVar, dn dnVar2, double d10) {
        return (dnVar != null && d10 >= dnVar.f25133c) ? dnVar : dnVar2;
    }
}
