package a8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: LogSourceMetrics.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f105a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f106b;

    /* compiled from: LogSourceMetrics.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f107a = "";

        /* renamed from: b  reason: collision with root package name */
        private List<c> f108b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f107a, Collections.unmodifiableList(this.f108b));
        }

        public a b(List<c> list) {
            this.f108b = list;
            return this;
        }

        public a c(String str) {
            this.f107a = str;
            return this;
        }
    }

    static {
        new a().a();
    }

    d(String str, List<c> list) {
        this.f105a = str;
        this.f106b = list;
    }

    public static a c() {
        return new a();
    }

    @oc.d(tag = 2)
    public List<c> a() {
        return this.f106b;
    }

    @oc.d(tag = 1)
    public String b() {
        return this.f105a;
    }
}
