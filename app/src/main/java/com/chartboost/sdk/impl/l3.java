package com.chartboost.sdk.impl;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l3 extends WeakReference<Activity> {

    /* renamed from: a  reason: collision with root package name */
    public final int f14174a;

    public l3(Activity activity) {
        super(activity);
        v2.a("WeakActivity.WeakActivity", activity);
        this.f14174a = activity.hashCode();
    }

    public int hashCode() {
        return this.f14174a;
    }
}
