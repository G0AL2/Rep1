package com.apm.insight.runtime;

import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.q;
import java.util.Comparator;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<a> f6618a = new Comparator<a>() { // from class: com.apm.insight.runtime.g.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public final int compare(a aVar, a aVar2) {
            int i10 = aVar.f6621b + aVar.f6622c;
            int i11 = aVar2.f6621b + aVar2.f6622c;
            if (i10 != i11) {
                return i10 > i11 ? -1 : 1;
            }
            return 0;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static byte[] f6619b = new byte[4096];

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f6620a = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;

        /* renamed from: b  reason: collision with root package name */
        public int f6621b;

        /* renamed from: c  reason: collision with root package name */
        public int f6622c;

        a() {
        }
    }

    public static long a(int i10) {
        return NativeImpl.c(i10) * q.a.a();
    }
}
