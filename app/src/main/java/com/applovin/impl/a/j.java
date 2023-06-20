package com.applovin.impl.a;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private String f6787a;

    /* renamed from: b  reason: collision with root package name */
    private String f6788b;

    /* renamed from: c  reason: collision with root package name */
    private String f6789c;

    /* renamed from: d  reason: collision with root package name */
    private long f6790d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f6791e = -1;

    private j() {
    }

    private static int a(String str, e eVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if ("complete".equalsIgnoreCase(str)) {
            if (eVar != null) {
                return eVar.h();
            }
            return 95;
        }
        return -1;
    }

    public static j a(r rVar, e eVar, com.applovin.impl.sdk.m mVar) {
        List<String> explode;
        int size;
        TimeUnit timeUnit;
        long seconds;
        if (rVar != null) {
            if (mVar != null) {
                try {
                    String c10 = rVar.c();
                    if (!StringUtils.isValidString(c10)) {
                        if (v.a()) {
                            mVar.A().e("VastTracker", "Unable to create tracker. Could not find URL.");
                            return null;
                        }
                        return null;
                    }
                    j jVar = new j();
                    jVar.f6789c = c10;
                    jVar.f6787a = rVar.b().get("id");
                    jVar.f6788b = rVar.b().get("event");
                    jVar.f6791e = a(jVar.a(), eVar);
                    String str = rVar.b().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            jVar.f6791e = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(":") && (size = (explode = CollectionUtils.explode(trim, ":")).size()) > 0) {
                            long j10 = 0;
                            int i10 = size - 1;
                            for (int i11 = i10; i11 >= 0; i11--) {
                                String str2 = explode.get(i11);
                                if (StringUtils.isNumeric(str2)) {
                                    int parseInt = Integer.parseInt(str2);
                                    if (i11 == i10) {
                                        seconds = parseInt;
                                    } else {
                                        if (i11 == size - 2) {
                                            timeUnit = TimeUnit.MINUTES;
                                        } else if (i11 == size - 3) {
                                            timeUnit = TimeUnit.HOURS;
                                        }
                                        seconds = timeUnit.toSeconds(parseInt);
                                    }
                                    j10 += seconds;
                                }
                            }
                            jVar.f6790d = j10;
                            jVar.f6791e = -1;
                        }
                    }
                    return jVar;
                } catch (Throwable th) {
                    if (v.a()) {
                        mVar.A().b("VastTracker", "Error occurred while initializing", th);
                        return null;
                    }
                    return null;
                }
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public String a() {
        return this.f6788b;
    }

    public boolean a(long j10, int i10) {
        long j11 = this.f6790d;
        boolean z10 = j11 >= 0;
        boolean z11 = j10 >= j11;
        int i11 = this.f6791e;
        boolean z12 = i11 >= 0;
        boolean z13 = i10 >= i11;
        if (z10 && z11) {
            return true;
        }
        return z12 && z13;
    }

    public String b() {
        return this.f6789c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f6790d == jVar.f6790d && this.f6791e == jVar.f6791e) {
                String str = this.f6787a;
                if (str == null ? jVar.f6787a == null : str.equals(jVar.f6787a)) {
                    String str2 = this.f6788b;
                    if (str2 == null ? jVar.f6788b == null : str2.equals(jVar.f6788b)) {
                        return this.f6789c.equals(jVar.f6789c);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6787a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6788b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j10 = this.f6790d;
        return ((((((hashCode + hashCode2) * 31) + this.f6789c.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f6791e;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f6787a + "', event='" + this.f6788b + "', uriString='" + this.f6789c + "', offsetSeconds=" + this.f6790d + ", offsetPercent=" + this.f6791e + '}';
    }
}
