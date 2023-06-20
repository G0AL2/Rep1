package q2;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Cache.java */
/* loaded from: classes.dex */
public interface b {

    /* compiled from: Cache.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f35776a;

        /* renamed from: b  reason: collision with root package name */
        public String f35777b;

        /* renamed from: c  reason: collision with root package name */
        public long f35778c;

        /* renamed from: d  reason: collision with root package name */
        public long f35779d;

        /* renamed from: e  reason: collision with root package name */
        public long f35780e;

        /* renamed from: f  reason: collision with root package name */
        public long f35781f;

        /* renamed from: g  reason: collision with root package name */
        public Map<String, String> f35782g = Collections.emptyMap();

        /* renamed from: h  reason: collision with root package name */
        public List<g> f35783h;

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b(long j10) {
            return this.f35780e < j10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c(long j10) {
            return this.f35781f < j10;
        }
    }

    void a(String str, boolean z10);

    void b(String str, a aVar);

    a get(String str);

    void initialize();
}
