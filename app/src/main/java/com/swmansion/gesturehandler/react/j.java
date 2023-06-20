package com.swmansion.gesturehandler.react;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.s;
import nd.l;
import nd.p;

/* compiled from: RNViewConfigurationHelper.java */
/* loaded from: classes3.dex */
public class j implements p {

    /* compiled from: RNViewConfigurationHelper.java */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f28444a;

        static {
            int[] iArr = new int[s.values().length];
            f28444a = iArr;
            try {
                iArr[s.BOX_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28444a[s.BOX_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28444a[s.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // nd.p
    public l a(View view) {
        s sVar;
        if (view instanceof a0) {
            sVar = ((a0) view).getPointerEvents();
        } else {
            sVar = s.AUTO;
        }
        if (!view.isEnabled()) {
            if (sVar == s.AUTO) {
                return l.BOX_NONE;
            }
            if (sVar == s.BOX_ONLY) {
                return l.NONE;
            }
        }
        int i10 = a.f28444a[sVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return l.AUTO;
                }
                return l.NONE;
            }
            return l.BOX_NONE;
        }
        return l.BOX_ONLY;
    }

    @Override // nd.p
    public boolean b(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT < 18 || viewGroup.getClipChildren()) {
            return true;
        }
        if (viewGroup instanceof com.facebook.react.views.view.g) {
            return "hidden".equals(((com.facebook.react.views.view.g) viewGroup).getOverflow());
        }
        return false;
    }

    @Override // nd.p
    public View c(ViewGroup viewGroup, int i10) {
        if (viewGroup instanceof com.facebook.react.views.view.g) {
            return viewGroup.getChildAt(((com.facebook.react.views.view.g) viewGroup).a(i10));
        }
        return viewGroup.getChildAt(i10);
    }
}
