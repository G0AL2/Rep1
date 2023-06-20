package fe;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
/* loaded from: classes3.dex */
public final class a0 implements Map, Serializable, re.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f30316a = new a0();

    private a0() {
    }

    public boolean a(Void r22) {
        qe.k.f(r22, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return false;
    }

    @Override // java.util.Map
    /* renamed from: c */
    public Void get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return a((Void) obj);
        }
        return false;
    }

    public Set<Map.Entry> d() {
        return b0.f30324a;
    }

    public Set<Object> e() {
        return b0.f30324a;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public int f() {
        return 0;
    }

    public Collection g() {
        return z.f30331a;
    }

    @Override // java.util.Map
    /* renamed from: h */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return e();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return f();
    }

    public String toString() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return g();
    }
}
