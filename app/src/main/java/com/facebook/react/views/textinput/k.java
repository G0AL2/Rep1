package com.facebook.react.views.textinput;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* compiled from: ReactTextInputLocalData.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final SpannableStringBuilder f16364a;

    /* renamed from: b  reason: collision with root package name */
    private final float f16365b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16366c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16367d;

    /* renamed from: e  reason: collision with root package name */
    private final int f16368e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16369f;

    /* renamed from: g  reason: collision with root package name */
    private final CharSequence f16370g;

    public k(EditText editText) {
        this.f16364a = new SpannableStringBuilder(editText.getText());
        this.f16365b = editText.getTextSize();
        this.f16368e = editText.getInputType();
        this.f16370g = editText.getHint();
        this.f16366c = editText.getMinLines();
        this.f16367d = editText.getMaxLines();
        if (Build.VERSION.SDK_INT >= 23) {
            this.f16369f = editText.getBreakStrategy();
        } else {
            this.f16369f = 0;
        }
    }

    public void a(EditText editText) {
        editText.setText(this.f16364a);
        editText.setTextSize(0, this.f16365b);
        editText.setMinLines(this.f16366c);
        editText.setMaxLines(this.f16367d);
        editText.setInputType(this.f16368e);
        editText.setHint(this.f16370g);
        if (Build.VERSION.SDK_INT >= 23) {
            editText.setBreakStrategy(this.f16369f);
        }
    }
}
