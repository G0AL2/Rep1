package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;

/* compiled from: LogBoxDialog.java */
/* loaded from: classes.dex */
public class e extends Dialog {
    public e(Activity activity, View view) {
        super(activity, com.facebook.react.i.f15432a);
        requestWindowFeature(1);
        setContentView(view);
    }
}
