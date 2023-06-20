package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: RNGestureHandlerInteractionManager.java */
/* loaded from: classes3.dex */
public class d implements nd.c {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray<int[]> f28427a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private SparseArray<int[]> f28428b = new SparseArray<>();

    private int[] f(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = array.getInt(i10);
        }
        return iArr;
    }

    @Override // nd.c
    public boolean a(nd.b bVar, nd.b bVar2) {
        int[] iArr = this.f28428b.get(bVar.q());
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == bVar2.q()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // nd.c
    public boolean b(nd.b bVar, nd.b bVar2) {
        return false;
    }

    @Override // nd.c
    public boolean c(nd.b bVar, nd.b bVar2) {
        int[] iArr = this.f28427a.get(bVar.q());
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == bVar2.q()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // nd.c
    public boolean d(nd.b bVar, nd.b bVar2) {
        return false;
    }

    public void e(nd.b bVar, ReadableMap readableMap) {
        bVar.J(this);
        if (readableMap.hasKey("waitFor")) {
            this.f28427a.put(bVar.q(), f(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.f28428b.put(bVar.q(), f(readableMap, "simultaneousHandlers"));
        }
    }

    public void g(int i10) {
        this.f28427a.remove(i10);
        this.f28428b.remove(i10);
    }

    public void h() {
        this.f28427a.clear();
        this.f28428b.clear();
    }
}
