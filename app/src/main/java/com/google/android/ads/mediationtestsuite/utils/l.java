package com.google.android.ads.mediationtestsuite.utils;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: UIUtils.java */
/* loaded from: classes2.dex */
public class l {
    public static void a(Menu menu, int i10) {
        for (int i11 = 0; i11 < menu.size(); i11++) {
            MenuItem item = menu.getItem(i11);
            Drawable icon = item.getIcon();
            if (icon != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(icon);
                icon.mutate();
                androidx.core.graphics.drawable.a.n(r10, i10);
                item.setIcon(icon);
            }
        }
    }
}
