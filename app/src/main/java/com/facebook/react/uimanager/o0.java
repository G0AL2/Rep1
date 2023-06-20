package com.facebook.react.uimanager;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import java.util.EnumSet;
import java.util.List;

/* compiled from: TouchTargetHelper.java */
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f15914a = new float[2];

    /* renamed from: b  reason: collision with root package name */
    private static final PointF f15915b = new PointF();

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f15916c = new float[2];

    /* renamed from: d  reason: collision with root package name */
    private static final Matrix f15917d = new Matrix();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TouchTargetHelper.java */
    /* loaded from: classes.dex */
    public enum a {
        SELF,
        CHILD
    }

    @SuppressLint({"ResourceType"})
    private static View a(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    public static int b(float f10, float f11, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        View a10;
        UiThreadUtil.assertOnUiThread();
        int id2 = viewGroup.getId();
        fArr[0] = f10;
        fArr[1] = f11;
        View e10 = e(fArr, viewGroup, null);
        if (e10 == null || (a10 = a(e10)) == null) {
            return id2;
        }
        if (iArr != null) {
            iArr[0] = a10.getId();
        }
        return g(a10, fArr[0], fArr[1]);
    }

    public static int c(float f10, float f11, ViewGroup viewGroup) {
        return b(f10, f11, viewGroup, f15914a, null);
    }

    private static View d(float[] fArr, View view, EnumSet<a> enumSet, List<Integer> list) {
        if (enumSet.contains(a.CHILD) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!h(fArr[0], fArr[1], view)) {
                if (view instanceof z) {
                    if (x6.a.a(view.getId()) == 2 && ReactFeatureFlags.doesUseOverflowInset() && !i(fArr[0], fArr[1], view)) {
                        return null;
                    }
                    String overflow = ((z) view).getOverflow();
                    if ("hidden".equals(overflow) || "scroll".equals(overflow)) {
                        return null;
                    }
                }
                if (viewGroup.getClipChildren()) {
                    return null;
                }
            }
            int childCount = viewGroup.getChildCount();
            h0 h0Var = viewGroup instanceof h0 ? (h0) viewGroup : null;
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = viewGroup.getChildAt(h0Var != null ? h0Var.a(i10) : i10);
                PointF pointF = f15915b;
                f(fArr[0], fArr[1], viewGroup, childAt, pointF);
                float f10 = fArr[0];
                float f11 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View e10 = e(fArr, childAt, list);
                if (e10 != null) {
                    return e10;
                }
                fArr[0] = f10;
                fArr[1] = f11;
            }
        }
        if (enumSet.contains(a.SELF) && h(fArr[0], fArr[1], view)) {
            return view;
        }
        return null;
    }

    private static View e(float[] fArr, View view, List<Integer> list) {
        s sVar;
        if (view instanceof a0) {
            sVar = ((a0) view).getPointerEvents();
        } else {
            sVar = s.AUTO;
        }
        if (!view.isEnabled()) {
            if (sVar == s.AUTO) {
                sVar = s.BOX_NONE;
            } else if (sVar == s.BOX_ONLY) {
                sVar = s.NONE;
            }
        }
        if (sVar == s.NONE) {
            return null;
        }
        if (sVar == s.BOX_ONLY) {
            View d10 = d(fArr, view, EnumSet.of(a.SELF), list);
            if (d10 != null && list != null) {
                list.add(Integer.valueOf(view.getId()));
            }
            return d10;
        } else if (sVar == s.BOX_NONE) {
            View d11 = d(fArr, view, EnumSet.of(a.CHILD), list);
            if (d11 != null) {
                if (list != null) {
                    list.add(Integer.valueOf(view.getId()));
                }
                return d11;
            } else if ((view instanceof w) && h(fArr[0], fArr[1], view) && ((w) view).d(fArr[0], fArr[1]) != view.getId()) {
                if (list != null) {
                    list.add(Integer.valueOf(view.getId()));
                }
                return view;
            } else {
                return null;
            }
        } else if (sVar == s.AUTO) {
            if ((view instanceof x) && h(fArr[0], fArr[1], view) && ((x) view).e(fArr[0], fArr[1])) {
                if (list != null) {
                    list.add(Integer.valueOf(view.getId()));
                }
                return view;
            }
            View d12 = d(fArr, view, EnumSet.of(a.SELF, a.CHILD), list);
            if (d12 != null && list != null) {
                list.add(Integer.valueOf(view.getId()));
            }
            return d12;
        } else {
            throw new JSApplicationIllegalArgumentException("Unknown pointer event type: " + sVar.toString());
        }
    }

    private static void f(float f10, float f11, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f10 + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f11 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f15916c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f15917d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f12 = fArr[0];
            scrollY = fArr[1];
            scrollX = f12;
        }
        pointF.set(scrollX, scrollY);
    }

    private static int g(View view, float f10, float f11) {
        if (view instanceof w) {
            return ((w) view).d(f10, f11);
        }
        return view.getId();
    }

    private static boolean h(float f10, float f11, View view) {
        if (view instanceof v6.c) {
            v6.c cVar = (v6.c) view;
            if (cVar.getHitSlopRect() != null) {
                Rect hitSlopRect = cVar.getHitSlopRect();
                return f10 >= ((float) (-hitSlopRect.left)) && f10 < ((float) (view.getWidth() + hitSlopRect.right)) && f11 >= ((float) (-hitSlopRect.top)) && f11 < ((float) (view.getHeight() + hitSlopRect.bottom));
            }
        }
        return f10 >= 0.0f && f10 < ((float) view.getWidth()) && f11 >= 0.0f && f11 < ((float) view.getHeight());
    }

    private static boolean i(float f10, float f11, View view) {
        if (view instanceof z) {
            Rect overflowInset = ((z) view).getOverflowInset();
            return f10 >= ((float) overflowInset.left) && f10 < ((float) (view.getWidth() - overflowInset.right)) && f11 >= ((float) overflowInset.top) && f11 < ((float) (view.getHeight() - overflowInset.bottom));
        }
        return false;
    }
}
