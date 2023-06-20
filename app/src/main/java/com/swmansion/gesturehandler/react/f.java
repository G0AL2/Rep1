package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;

/* compiled from: RNGestureHandlerRegistry.java */
/* loaded from: classes3.dex */
public class f implements nd.e {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<nd.b> f28429a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<Integer> f28430b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<ArrayList<nd.b>> f28431c = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNGestureHandlerRegistry.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nd.b f28432a;

        a(f fVar, nd.b bVar) {
            this.f28432a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28432a.d();
        }
    }

    private synchronized void c(nd.b bVar) {
        Integer num = this.f28430b.get(bVar.q());
        if (num != null) {
            this.f28430b.remove(bVar.q());
            ArrayList<nd.b> arrayList = this.f28431c.get(num.intValue());
            if (arrayList != null) {
                arrayList.remove(bVar);
                if (arrayList.size() == 0) {
                    this.f28431c.remove(num.intValue());
                }
            }
        }
        if (bVar.r() != null) {
            UiThreadUtil.runOnUiThread(new a(this, bVar));
        }
    }

    private synchronized void i(int i10, nd.b bVar) {
        if (this.f28430b.get(bVar.q()) == null) {
            this.f28430b.put(bVar.q(), Integer.valueOf(i10));
            ArrayList<nd.b> arrayList = this.f28431c.get(i10);
            if (arrayList == null) {
                ArrayList<nd.b> arrayList2 = new ArrayList<>(1);
                arrayList2.add(bVar);
                this.f28431c.put(i10, arrayList2);
            } else {
                arrayList.add(bVar);
            }
        } else {
            throw new IllegalStateException("Handler " + bVar + " already attached");
        }
    }

    @Override // nd.e
    public synchronized ArrayList<nd.b> a(View view) {
        return g(view.getId());
    }

    public synchronized boolean b(int i10, int i11) {
        nd.b bVar = this.f28429a.get(i10);
        if (bVar != null) {
            c(bVar);
            i(i11, bVar);
            return true;
        }
        return false;
    }

    public synchronized void d() {
        this.f28429a.clear();
        this.f28430b.clear();
        this.f28431c.clear();
    }

    public synchronized void e(int i10) {
        nd.b bVar = this.f28429a.get(i10);
        if (bVar != null) {
            c(bVar);
            this.f28429a.remove(i10);
        }
    }

    public synchronized nd.b f(int i10) {
        return this.f28429a.get(i10);
    }

    public synchronized ArrayList<nd.b> g(int i10) {
        return this.f28431c.get(i10);
    }

    public synchronized void h(nd.b bVar) {
        this.f28429a.put(bVar.q(), bVar);
    }
}
