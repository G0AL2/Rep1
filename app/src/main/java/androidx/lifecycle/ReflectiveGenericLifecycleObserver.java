package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.i;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3341a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a f3342b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3341a = obj;
        this.f3342b = b.f3350c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.m
    public void b(p pVar, i.b bVar) {
        this.f3342b.a(pVar, bVar, this.f3341a);
    }
}
