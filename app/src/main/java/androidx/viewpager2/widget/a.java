package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimateLayoutChangeDetector.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f4362b;

    /* renamed from: a  reason: collision with root package name */
    private LinearLayoutManager f4363a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimateLayoutChangeDetector.java */
    /* renamed from: androidx.viewpager2.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0080a implements Comparator<int[]> {
        C0080a(a aVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f4362b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(LinearLayoutManager linearLayoutManager) {
        this.f4363a = linearLayoutManager;
    }

    private boolean a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i10;
        int bottom;
        int i11;
        int T = this.f4363a.T();
        if (T == 0) {
            return true;
        }
        boolean z10 = this.f4363a.t2() == 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, T, 2);
        for (int i12 = 0; i12 < T; i12++) {
            View S = this.f4363a.S(i12);
            if (S != null) {
                ViewGroup.LayoutParams layoutParams = S.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f4362b;
                }
                int[] iArr2 = iArr[i12];
                if (z10) {
                    top = S.getLeft();
                    i10 = marginLayoutParams.leftMargin;
                } else {
                    top = S.getTop();
                    i10 = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i10;
                int[] iArr3 = iArr[i12];
                if (z10) {
                    bottom = S.getRight();
                    i11 = marginLayoutParams.rightMargin;
                } else {
                    bottom = S.getBottom();
                    i11 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i11;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new C0080a(this));
        for (int i13 = 1; i13 < T; i13++) {
            if (iArr[i13 - 1][1] != iArr[i13][0]) {
                return false;
            }
        }
        return iArr[0][0] <= 0 && iArr[T - 1][1] >= iArr[0][1] - iArr[0][0];
    }

    private boolean b() {
        int T = this.f4363a.T();
        for (int i10 = 0; i10 < T; i10++) {
            if (c(this.f4363a.S(i10))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (c(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return (!a() || this.f4363a.T() <= 1) && b();
    }
}
