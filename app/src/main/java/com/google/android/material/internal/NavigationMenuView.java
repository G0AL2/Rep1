package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class NavigationMenuView extends RecyclerView implements k {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(androidx.appcompat.view.menu.e eVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
