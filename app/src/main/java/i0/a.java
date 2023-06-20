package i0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f31483a;

    /* renamed from: b  reason: collision with root package name */
    private final c f31484b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31485c;

    public a(int i10, c cVar, int i11) {
        this.f31483a = i10;
        this.f31484b = cVar;
        this.f31485c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f31483a);
        this.f31484b.Q(this.f31485c, bundle);
    }
}
