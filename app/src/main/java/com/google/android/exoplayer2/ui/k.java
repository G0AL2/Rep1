package com.google.android.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.recyclerview.widget.RecyclerView;
import r9.b;

/* compiled from: SubtitleViewUtils.java */
/* loaded from: classes2.dex */
final class k {
    public static /* synthetic */ boolean a(Object obj) {
        return c(obj);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return d(obj);
    }

    public static /* synthetic */ boolean c(Object obj) {
        return !(obj instanceof v9.b);
    }

    public static /* synthetic */ boolean d(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void e(b.C0490b c0490b) {
        c0490b.b();
        if (c0490b.e() instanceof Spanned) {
            if (!(c0490b.e() instanceof Spannable)) {
                c0490b.o(SpannableString.valueOf(c0490b.e()));
            }
            g((Spannable) ea.a.e(c0490b.e()), new ib.m() { // from class: com.google.android.exoplayer2.ui.i
                @Override // ib.m
                public final boolean apply(Object obj) {
                    return k.a(obj);
                }
            });
        }
        f(c0490b);
    }

    public static void f(b.C0490b c0490b) {
        c0490b.q(-3.4028235E38f, RecyclerView.UNDEFINED_DURATION);
        if (c0490b.e() instanceof Spanned) {
            if (!(c0490b.e() instanceof Spannable)) {
                c0490b.o(SpannableString.valueOf(c0490b.e()));
            }
            g((Spannable) ea.a.e(c0490b.e()), new ib.m() { // from class: com.google.android.exoplayer2.ui.j
                @Override // ib.m
                public final boolean apply(Object obj) {
                    return k.b(obj);
                }
            });
        }
    }

    private static void g(Spannable spannable, ib.m<Object> mVar) {
        Object[] spans;
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (mVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float h(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else if (i10 != 1) {
            if (i10 != 2) {
                return -3.4028235E38f;
            }
            return f10;
        } else {
            f11 = i11;
        }
        return f10 * f11;
    }
}
