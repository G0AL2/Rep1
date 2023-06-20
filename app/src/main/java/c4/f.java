package c4;

import java.lang.ref.SoftReference;

/* compiled from: OOMSoftReference.java */
/* loaded from: classes.dex */
public class f<T> {

    /* renamed from: a  reason: collision with root package name */
    SoftReference<T> f5316a = null;

    /* renamed from: b  reason: collision with root package name */
    SoftReference<T> f5317b = null;

    /* renamed from: c  reason: collision with root package name */
    SoftReference<T> f5318c = null;

    public void a() {
        SoftReference<T> softReference = this.f5316a;
        if (softReference != null) {
            softReference.clear();
            this.f5316a = null;
        }
        SoftReference<T> softReference2 = this.f5317b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f5317b = null;
        }
        SoftReference<T> softReference3 = this.f5318c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f5318c = null;
        }
    }

    public T b() {
        SoftReference<T> softReference = this.f5316a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(T t10) {
        this.f5316a = new SoftReference<>(t10);
        this.f5317b = new SoftReference<>(t10);
        this.f5318c = new SoftReference<>(t10);
    }
}
