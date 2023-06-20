package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: MemoryPressureRouter.java */
/* loaded from: classes.dex */
public class d implements ComponentCallbacks2 {

    /* renamed from: a  reason: collision with root package name */
    private final Set<MemoryPressureListener> f15361a = Collections.synchronizedSet(new LinkedHashSet());

    public d(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    private void c(int i10) {
        Set<MemoryPressureListener> set = this.f15361a;
        for (MemoryPressureListener memoryPressureListener : (MemoryPressureListener[]) set.toArray(new MemoryPressureListener[set.size()])) {
            memoryPressureListener.handleMemoryPressure(i10);
        }
    }

    public void a(MemoryPressureListener memoryPressureListener) {
        this.f15361a.add(memoryPressureListener);
    }

    public void b(Context context) {
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    public void d(MemoryPressureListener memoryPressureListener) {
        this.f15361a.remove(memoryPressureListener);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        c(i10);
    }
}
