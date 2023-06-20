package com.inmobi.media;

import com.google.android.gms.common.api.Api;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* compiled from: AdAsset.java */
/* loaded from: classes3.dex */
public class av {

    /* renamed from: m  reason: collision with root package name */
    private static final String f24626m = "av";

    /* renamed from: b  reason: collision with root package name */
    int f24628b;

    /* renamed from: c  reason: collision with root package name */
    int f24629c;

    /* renamed from: d  reason: collision with root package name */
    public String f24630d;

    /* renamed from: e  reason: collision with root package name */
    public String f24631e;

    /* renamed from: f  reason: collision with root package name */
    long f24632f;

    /* renamed from: g  reason: collision with root package name */
    long f24633g;

    /* renamed from: h  reason: collision with root package name */
    long f24634h;

    /* renamed from: i  reason: collision with root package name */
    long f24635i;

    /* renamed from: l  reason: collision with root package name */
    public byte f24638l;

    /* renamed from: a  reason: collision with root package name */
    long f24627a = 0;

    /* renamed from: j  reason: collision with root package name */
    boolean f24636j = false;

    /* renamed from: k  reason: collision with root package name */
    public String f24637k = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public av(int i10, String str, String str2, int i11, long j10, long j11, long j12, long j13) {
        this.f24628b = i10;
        this.f24630d = str;
        this.f24631e = str2;
        this.f24629c = i11;
        this.f24632f = j10;
        this.f24633g = j11;
        this.f24634h = j12;
        this.f24635i = j13;
    }

    public final boolean a() {
        String str = this.f24631e;
        return (str == null || str.length() == 0 || !new File(this.f24631e).exists()) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f24630d.equals(((av) obj).f24630d);
    }

    public int hashCode() {
        return this.f24630d.hashCode();
    }

    public String toString() {
        return "AdAsset{url='" + this.f24630d + "'}";
    }

    /* compiled from: AdAsset.java */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        int f24640b;

        /* renamed from: c  reason: collision with root package name */
        String f24641c;

        /* renamed from: d  reason: collision with root package name */
        String f24642d;

        /* renamed from: g  reason: collision with root package name */
        long f24645g;

        /* renamed from: h  reason: collision with root package name */
        long f24646h;

        /* renamed from: a  reason: collision with root package name */
        int f24639a = new Random().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: e  reason: collision with root package name */
        long f24643e = System.currentTimeMillis();

        /* renamed from: f  reason: collision with root package name */
        long f24644f = System.currentTimeMillis();

        public final a a(String str, int i10, long j10) {
            this.f24641c = str;
            this.f24640b = i10;
            this.f24645g = System.currentTimeMillis() + j10;
            return this;
        }

        private static long a(String str) {
            try {
                return new SimpleDateFormat("EEE,dd MMM yyyy HH:mm:ss z", Locale.ENGLISH).parse(str).getTime();
            } catch (ParseException e10) {
                gg.a().a(new hg(e10));
                return 0L;
            }
        }

        public final av a() {
            return new av(this.f24639a, this.f24641c, this.f24642d, this.f24640b, this.f24643e, this.f24644f, this.f24645g, this.f24646h);
        }

        public final a a(String str, String str2, gy gyVar, int i10, long j10) {
            boolean z10;
            long j11;
            long j12;
            boolean z11;
            long j13;
            String str3;
            long j14;
            long j15;
            String str4;
            String str5;
            String str6;
            Map<String, List<String>> map = gyVar.f25629c;
            long currentTimeMillis = System.currentTimeMillis();
            List<String> list = map.get("Date");
            long a10 = (list == null || list.size() <= 0 || (str6 = map.get("Date").get(0)) == null) ? 0L : a(str6);
            List<String> list2 = map.get("Cache-Control");
            if (list2 == null || list2.size() <= 0 || (str5 = map.get("Cache-Control").get(0)) == null) {
                z10 = false;
                j11 = 0;
                j12 = 0;
                z11 = false;
            } else {
                j11 = 0;
                j12 = 0;
                z11 = false;
                for (String str7 : str5.split(",")) {
                    String trim = str7.trim();
                    if (!"no-cache".equals(trim) && !"no-store".equals(trim)) {
                        if (trim.startsWith("max-age=")) {
                            try {
                                j11 = Long.parseLong(trim.substring(8));
                            } catch (Exception unused) {
                                String unused2 = av.f24626m;
                            }
                        } else if (trim.startsWith("stale-while-revalidate=")) {
                            try {
                                j12 = Long.parseLong(trim.substring(23));
                            } catch (Exception unused3) {
                                String unused4 = av.f24626m;
                            }
                        } else if ("must-revalidate".equals(trim) || "proxy-revalidate".equals(trim)) {
                            z11 = true;
                        }
                    }
                }
                z10 = true;
            }
            List<String> list3 = map.get("Expires");
            long a11 = (list3 == null || list3.size() <= 0 || (str4 = map.get("Expires").get(0)) == null) ? 0L : a(str4);
            if (z10) {
                j14 = currentTimeMillis + (j11 * 1000);
                if (z11) {
                    j15 = j14;
                } else {
                    Long.signum(j12);
                    j15 = (j12 * 1000) + j14;
                }
                str3 = str;
                j13 = j15;
            } else {
                j13 = 0;
                if (a10 <= 0 || a11 < a10) {
                    str3 = str;
                    j14 = 0;
                } else {
                    j14 = currentTimeMillis + (a11 - a10);
                    str3 = str;
                    j13 = j14;
                }
            }
            this.f24641c = str3;
            this.f24642d = str2;
            this.f24640b = i10;
            long j16 = currentTimeMillis + (j10 * 1000);
            this.f24645g = j16;
            this.f24646h = j14;
            this.f24645g = Math.min(j16, j13);
            return this;
        }
    }
}
