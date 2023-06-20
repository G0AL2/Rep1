package p8;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import z8.h0;

/* compiled from: DefaultExtractorsFactory.java */
/* loaded from: classes2.dex */
public final class g implements n {

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f35655n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: o  reason: collision with root package name */
    private static final a f35656o = new a();

    /* renamed from: b  reason: collision with root package name */
    private boolean f35657b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f35658c;

    /* renamed from: d  reason: collision with root package name */
    private int f35659d;

    /* renamed from: e  reason: collision with root package name */
    private int f35660e;

    /* renamed from: f  reason: collision with root package name */
    private int f35661f;

    /* renamed from: g  reason: collision with root package name */
    private int f35662g;

    /* renamed from: h  reason: collision with root package name */
    private int f35663h;

    /* renamed from: i  reason: collision with root package name */
    private int f35664i;

    /* renamed from: j  reason: collision with root package name */
    private int f35665j;

    /* renamed from: l  reason: collision with root package name */
    private int f35667l;

    /* renamed from: k  reason: collision with root package name */
    private int f35666k = 1;

    /* renamed from: m  reason: collision with root package name */
    private int f35668m = 112800;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultExtractorsFactory.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicBoolean f35669a = new AtomicBoolean(false);

        /* renamed from: b  reason: collision with root package name */
        private Constructor<? extends i> f35670b;

        private Constructor<? extends i> b() {
            synchronized (this.f35669a) {
                if (this.f35669a.get()) {
                    return this.f35670b;
                }
                try {
                    if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                        this.f35670b = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(i.class).getConstructor(Integer.TYPE);
                    }
                } catch (ClassNotFoundException unused) {
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating FLAC extension", e10);
                }
                this.f35669a.set(true);
                return this.f35670b;
            }
        }

        public i a(int i10) {
            Constructor<? extends i> b10 = b();
            if (b10 == null) {
                return null;
            }
            try {
                return b10.newInstance(Integer.valueOf(i10));
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
            }
        }
    }

    private void c(int i10, List<i> list) {
        switch (i10) {
            case 0:
                list.add(new z8.b());
                return;
            case 1:
                list.add(new z8.e());
                return;
            case 2:
                list.add(new z8.h((this.f35658c ? 2 : 0) | this.f35659d | (this.f35657b ? 1 : 0)));
                return;
            case 3:
                list.add(new q8.b((this.f35658c ? 2 : 0) | this.f35660e | (this.f35657b ? 1 : 0)));
                return;
            case 4:
                i a10 = f35656o.a(this.f35661f);
                if (a10 != null) {
                    list.add(a10);
                    return;
                } else {
                    list.add(new r8.d(this.f35661f));
                    return;
                }
            case 5:
                list.add(new s8.c());
                return;
            case 6:
                list.add(new u8.e(this.f35662g));
                return;
            case 7:
                list.add(new v8.f((this.f35658c ? 2 : 0) | this.f35665j | (this.f35657b ? 1 : 0)));
                return;
            case 8:
                list.add(new w8.g(this.f35664i));
                list.add(new w8.k(this.f35663h));
                return;
            case 9:
                list.add(new x8.d());
                return;
            case 10:
                list.add(new z8.a0());
                return;
            case 11:
                list.add(new h0(this.f35666k, this.f35667l, this.f35668m));
                return;
            case 12:
                list.add(new a9.b());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new t8.a());
                return;
        }
    }

    @Override // p8.n
    public synchronized Extractor[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr;
        arrayList = new ArrayList(14);
        int b10 = ea.k.b(map);
        if (b10 != -1) {
            c(b10, arrayList);
        }
        int c10 = ea.k.c(uri);
        if (c10 != -1 && c10 != b10) {
            c(c10, arrayList);
        }
        for (int i10 : f35655n) {
            if (i10 != b10 && i10 != c10) {
                c(i10, arrayList);
            }
        }
        return (i[]) arrayList.toArray(new i[arrayList.size()]);
    }

    @Override // p8.n
    public synchronized i[] b() {
        return a(Uri.EMPTY, new HashMap());
    }
}
