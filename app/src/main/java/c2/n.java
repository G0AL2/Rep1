package c2;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseAnimatableValue.java */
/* loaded from: classes.dex */
public abstract class n<V, O> implements m<V, O> {

    /* renamed from: a  reason: collision with root package name */
    final List<j2.a<V>> f5307a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(List<j2.a<V>> list) {
        this.f5307a = list;
    }

    @Override // c2.m
    public List<j2.a<V>> b() {
        return this.f5307a;
    }

    @Override // c2.m
    public boolean c() {
        return this.f5307a.isEmpty() || (this.f5307a.size() == 1 && this.f5307a.get(0).h());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f5307a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f5307a.toArray()));
        }
        return sb2.toString();
    }
}
