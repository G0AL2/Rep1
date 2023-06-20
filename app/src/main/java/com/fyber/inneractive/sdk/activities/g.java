package com.fyber.inneractive.sdk.activities;

import android.view.View;

/* loaded from: classes.dex */
public class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f16699a;

    public g(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f16699a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f16699a.finish();
    }
}
