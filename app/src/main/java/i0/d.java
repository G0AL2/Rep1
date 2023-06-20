package i0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f31509a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final d f31510a;

        a(d dVar) {
            this.f31510a = dVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            i0.c b10 = this.f31510a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.E0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<i0.c> c10 = this.f31510a.c(str, i10);
            if (c10 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c10.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(c10.get(i11).E0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f31510a.f(i10, i11, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    static class b extends a {
        b(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            i0.c d10 = this.f31510a.d(i10);
            if (d10 == null) {
                return null;
            }
            return d10.E0();
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    static class c extends b {
        c(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f31510a.a(i10, i0.c.F0(accessibilityNodeInfo), str, bundle);
        }
    }

    public d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f31509a = new c(this);
        } else if (i10 >= 19) {
            this.f31509a = new b(this);
        } else if (i10 >= 16) {
            this.f31509a = new a(this);
        } else {
            this.f31509a = null;
        }
    }

    public void a(int i10, i0.c cVar, String str, Bundle bundle) {
    }

    public i0.c b(int i10) {
        return null;
    }

    public List<i0.c> c(String str, int i10) {
        return null;
    }

    public i0.c d(int i10) {
        return null;
    }

    public Object e() {
        return this.f31509a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public d(Object obj) {
        this.f31509a = obj;
    }
}
