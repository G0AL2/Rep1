package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.z;
import com.google.android.material.transformation.FabTransformationBehavior;
import ha.a;
import ia.h;
import ia.j;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    private Map<View, Integer> f22757i;

    public FabTransformationSheetBehavior() {
    }

    private void g0(View view, boolean z10) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z10) {
                this.f22757i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z11) {
                    if (!z10) {
                        Map<View, Integer> map = this.f22757i;
                        if (map != null && map.containsKey(childAt)) {
                            z.A0(childAt, this.f22757i.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f22757i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        z.A0(childAt, 4);
                    }
                }
            }
            if (z10) {
                return;
            }
            this.f22757i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean H(View view, View view2, boolean z10, boolean z11) {
        g0(view2, z10);
        return super.H(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.e e0(Context context, boolean z10) {
        int i10;
        if (z10) {
            i10 = a.f31129d;
        } else {
            i10 = a.f31128c;
        }
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f22751a = h.c(context, i10);
        eVar.f22752b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
