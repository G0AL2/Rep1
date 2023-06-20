package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.t0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReactClickableSpan.java */
/* loaded from: classes.dex */
public class g extends ClickableSpan implements j {

    /* renamed from: a  reason: collision with root package name */
    private final int f16196a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16197b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i10, int i11) {
        this.f16196a = i10;
        this.f16197b = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        ReactContext reactContext = (ReactContext) view.getContext();
        com.facebook.react.uimanager.events.d c10 = t0.c(reactContext, this.f16196a);
        if (c10 != null) {
            c10.g(new com.facebook.react.views.view.h(t0.e(reactContext), this.f16196a));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f16197b);
        textPaint.setUnderlineText(false);
    }
}
